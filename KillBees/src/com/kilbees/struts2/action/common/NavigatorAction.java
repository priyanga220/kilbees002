package com.kilbees.struts2.action.common;

import java.util.Properties;

import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueSender;
import javax.jms.QueueSession;
import javax.jms.TextMessage;
import javax.naming.Context;
import javax.naming.InitialContext;

import com.kilbees.struts2.action.AbstractAction;

public class NavigatorAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String send = "Send Message";
	
	public String sendMsgToTestMDB()
	{
		try
		{
			/*String java_naming_provider_url = "jnp://127.0.0.1:1299";
			String java_naming_provider_url = "remote://127.0.0.1:14447";
			
			properties.put("java.naming.factory.initial", "org.jnp.interfaces.NamingContextFactory");
			properties.put("java.naming.factory.initial", "org.jboss.naming.remote.client.InitialContextFactory");
			// server name
			properties.put("java.naming.provider.url", java_naming_provider_url);
			properties.put("java.naming.factory.url.pkgs", "org.jboss.naming:org.jnp.interfaces");*/
			
			//
			Properties properties = new Properties();
			properties.put(Context.INITIAL_CONTEXT_FACTORY, org.jboss.naming.remote.client.InitialContextFactory.class.getName());
			properties.put(Context.PROVIDER_URL, "remote://localhost:14447");
			
			//Same Server
			//properties.put(Context.PROVIDER_URL, "jnp://localhost:4447");
			
			properties.put(Context.SECURITY_PRINCIPAL, "ejb");
			// password
			properties.put(Context.SECURITY_CREDENTIALS, "ejbadmin");
			
			//

		    
		     

		        
		        //
			InitialContext iniCtx = new InitialContext(properties);
			ConnectionFactory cf = (ConnectionFactory) iniCtx.lookup("jms/RemoteConnectionFactory");
			Destination destination = (Destination) iniCtx.lookup("jms/queue/KilbeesIssueQueue");
			
			/*Object tmp = iniCtx.lookup("QueueConnectionFactory");
			QueueConnectionFactory qcf = (QueueConnectionFactory) tmp;
			QueueConnection conn = qcf.createQueueConnection();
			Queue que = (Queue) iniCtx.lookup("queue/KilbeesIssueQueue");
			QueueSession session_ = conn.createQueueSession(false, QueueSession.AUTO_ACKNOWLEDGE);
			
			*/
			Queue que = (Queue) destination;
			QueueConnection conn = (QueueConnection)cf.createConnection();
			QueueSession session_ = conn.createQueueSession(false, QueueSession.AUTO_ACKNOWLEDGE);
			
			// Send a text msg
			QueueSender senddd = session_.createSender(que);
			TextMessage tm = session_.createTextMessage("Message"+"");
			senddd.send(tm);
			
			senddd.close();
			conn.close();
			iniCtx.close();
			session_.close();
			} 
			catch (Exception e)
			{
				System.out.println("Error Occured  "+e.getMessage());
				String message = e.getMessage();
				if(message==null)
				{
					System.out.println("Error Occured  "+e.getMessage());
				}
			}
		status = STATUS.SUCCESS;
		return SUCCESS;
		
	}
	
	public String getSend() {
		return send;
	}
	
	public void setSend(String send) 
	{
		this.send = send;
		
	}
	
	public String gotomenupage()
	{
		return SUCCESS;
	}

}
