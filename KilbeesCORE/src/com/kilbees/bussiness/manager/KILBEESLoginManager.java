package com.kilbees.bussiness.manager;



import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.kilbees.application.utils.AuthenticatedUser;
import com.kilbees.application.utils.AuthenticatedUser.UserRole;
import com.kilbees.application.utils.Constants;
import com.kilbees.application.utils.Utils;
import com.kilbees.bussiness.exception.KilbeesLoginException;
import com.kilbees.bussiness.imanager.IKILBEESLoginManager;
import com.kilbees.bussiness.model.SystemLogin;
import com.kilbees.bussiness.model.SystemUserFunctions;
import com.kilbees.hibernate.idao.ISysLoginDAO;


@Service("loginManager")
@Transactional(readOnly = true)
public class KILBEESLoginManager implements IKILBEESLoginManager
{
	public KILBEESLoginManager()
	{
		
	}
	
	private SessionFactory sessionFactory;
	private String username;
	private String password;
	
	@Autowired
	private ISysLoginDAO sysLoginDAO;
	
	/*@Override
	public void getList()
	{
		try
		{
		System.out.print("load pikcup by ref pickup info  000000000000000");
		System.out.print("Open Con count  "+sessionFactory.getStatistics().getSessionOpenCount());
		Query query = sessionFactory.getCurrentSession().createQuery(	"from DrugCategory dc");
		query.setCacheable(true); 
		List<DrugCategory> list = query.list();
		
		Collections.sort(list, new Comparator<DrugCategory>(){

			@Override
			public int compare(DrugCategory o1, DrugCategory o2) {
				if(o1.getCategoryNo()==null && o2.getCategoryNo() == null)
				{
					return 0;
				}
				return (o1.getCategoryNo()).compareTo(o2.getCategoryNo());
			}});
		
		System.out.print("load pikcup by ref pickup info");
		if (list.size() > 0) {
			System.out.println("load pikcup by ref pickup info   "+list.get(0).getCategoryName());
			System.out.println("load pikcup by ref pickup info   "+list.get(1).getCategoryName());
			System.out.println("load pikcup by ref pickup info   "+list.get(2).getCategoryName());
			if(password.equals("11"))
			{
				throw new Exception();
			}
			System.out.println("load pikcup by ref pickup info   "+list.get(3).getCategoryName());
			System.out.println("load pikcup by ref pickup info   "+list.get(4).getCategoryName());
			System.out.print("Successfully Loaded Details : ^^^^^^^^^^^^^^^^^^^^^ ");
		}
		}
		catch(Exception ex)
		{
			System.out.println("Exception Occued "+ex.getMessage());
		}

	}
	
	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false , isolation = Isolation.DEFAULT, rollbackFor = KilbeesRollbackException.class) 
	public DrugCategory getCategory() throws KilbeesRollbackException
	{
		System.out.print("Open Con count  "+sessionFactory.getStatistics().getSessionOpenCount());
		DrugCategory cat = null;

		Session ses =  sessionFactory.getCurrentSession();
		System.out.println("Flushmode   : "+ses.getFlushMode().toString());
		System.out.print("Checking Lay Loading");
		Query query = ses.createQuery(	"from DrugCategory dc where dc.categoryNo=10");
		query.setCacheable(true); 
		cat = (DrugCategory)query.uniqueResult();
		if (cat != null) {
			System.out.println("load DrugCategory 10  "+cat.getCategoryName());
			cat.setCategoryName(username);
			if(password.equals("11223344"))
			{
				throw new RuntimeException();// KilbeesRollbackException("Bussines Rule RL000001 Violated");
			}
		}
		return cat;
	}*/
	
	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false , isolation = Isolation.DEFAULT, rollbackFor = KilbeesLoginException.class)
	public AuthenticatedUser authenticateUser() throws KilbeesLoginException
	{
		AuthenticatedUser authenticatedUser = null;
			
			/*Session hSession =  sessionFactory.getCurrentSession();
			Query query = hSession.createQuery(	"from SystemLogin sl where sl.userName= ?").setParameter(0, username);
			query.setCacheable(true);
			List<SystemLogin> slL =  query.list();*/
		
			SystemLogin slu = sysLoginDAO.retrieveUserBy(username);
			if(slu == null)
			{
				throw new KilbeesLoginException(Constants.USERNAME_NOT_VALID);
			}
			else
			{
					String realPW = this.getEncryptedPW();
					if(realPW!=null)
					{
						if(slu.getAccessId().equals(realPW))
						{
							List<SystemUserFunctions> funcs = new ArrayList<>();
							funcs.addAll(slu.getSystemUserFunctionses());
							
							authenticatedUser = new AuthenticatedUser();
							authenticatedUser.setUserName(slu.getUserName());
							authenticatedUser.setRole(UserRole.ADMIN);
							
							for(SystemUserFunctions suf :slu.getSystemUserFunctionses() )
							{
								switch(suf.getSystemFunctions().getFunctionCategory())
								{
									case DASHBOARDUTILS :
									{
										authenticatedUser.getDashBoardFuncList().add(suf);
										break;
									}
									case BUSSINESSRULES:
									{
										authenticatedUser.getBussinessRulesFuncList().add(suf);
										break;
									}
									case SALESUTILS:
									{
										authenticatedUser.getSalesFuncList().add(suf);
										break;
									}
									case INVENTRYCONTROL:
									{
										authenticatedUser.getInventryFuncList().add(suf);
										break;
									}
									case REPORTUTILS:
									{
										authenticatedUser.getReportFuncList().add(suf);
										break;
									}
									case MISCUTILS:
									{
										authenticatedUser.getMiscFuncList().add(suf);
										break;
									}
									default:
									{
										
									}
								}
							}
							
							authenticatedUser.setUserFuncList(funcs);
							slu.setSecurityCode(this.generateSecurityCode(25));
							return authenticatedUser;
						}
						else
						{
							throw new KilbeesLoginException(Constants.PASSWORD_WRONG);
						}
					}
					else
					{
						throw new KilbeesLoginException(Constants.PASSWORD_ERROR);
					}

			}
	}

	
	private String getEncryptedPW()
	{
		String result = null;
		try
		{
			
			MessageDigest md = MessageDigest.getInstance("SHA1");
			byte dataBytes[] = password.getBytes();
			md.update(dataBytes);
			byte digest1[] = md.digest();
			result = Utils.toHex(digest1);
	        System.out.println("Encrypted value Is For Entered "+password);
	        
		}
		catch(NoSuchAlgorithmException ex)
		{
			
		}
		return result;
                    
	}
	
	private String generateSecurityCode(int length) 
	{
        char[] buf = new char[length];
        String chars = "abcdefghijklmonpqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random r = new Random();
        for (int i = 0; i < buf.length; i++)
        {
            buf[i] = chars.charAt(r.nextInt(chars.length()));
        }
        return new String(buf);
    }
	
	public String getUsername() {
		return username;
	}

	@Override
	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String getPassword() { 
		return password;
	}
	
	@Override
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	/*@Autowired
	@Qualifier("sessionFactory")
	public void setSessionFactory(SessionFactory sessionFactory) {
		System.out.println("I am Going to set the sessionFactory");
		this.sessionFactory = sessionFactory;
		Query query = sessionFactory.openSession().createQuery(	"from DrugCategory dc");
		query.setCacheable(true);
		List<DrugCategory> list = query.list();
		System.out.print("load pikcup by ref pickup info From setSessionFactory");
		if (list.size() > 0) {
			System.out.println("load pikcup by ref pickup info   "+list.get(0).getCategoryName());
			System.out.println("load pikcup by ref pickup info   "+list.get(1).getCategoryName());
			System.out.println("load pikcup by ref pickup info   "+list.get(2).getCategoryName());
			System.out.println("load pikcup by ref pickup info   "+list.get(3).getCategoryName());
			System.out.println("load pikcup by ref pickup info   "+list.get(4).getCategoryName());
		}


	}*/
	
}
