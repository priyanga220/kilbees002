package com.habuma.spitter;

import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

import com.kilbees.bussiness.model.DrugCategory;

public class JdbcSpitterDAO implements ISpitterDAO 
{
	private SimpleJdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(SimpleJdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate=jdbcTemplate;
	}
	
	@Override
	public void addCategory(DrugCategory cat) 
	{
		/*jdbcTemplate.update(SQL_INSERT_SPITTER,
				spitter.getUsername(),
				spitter.getPassword(),
				spitter.getFullName(),
				spitter.getEmail(),
				spitter.isUpdateByEmail());
				spitter.setId(queryForIdentity());
				
				Just because you don’t see a lot of boilerplate code, that doesn’t mean it’s not
there. It’s cleverly hidden inside of the JDBC template class. When the update()
method is called, SimpleJdbcTemplate will get a connection, create a statement, and
execute the insert SQL.
What you also don’t see is how the SQLException is handled. Internally, Simple-
JdbcTemplate will catch any SQLExceptions that are thrown. It’ll then translate the
generic SQLException into one of the more specific data access exceptions from
table 5.1 and rethrow it. Because Spring’s data access exceptions are all runtime
exceptions, we didn’t have to catch it in the addSpitter() method.
		*/
		

		//Using Named Queries
		
		final String SQL_INSERT_SPITTER= "insertintospitter(username,password,fullname)"+ "values(:username,:password,:fullname)";
		
		/*public voidaddSpitter(Spitterspitter){
			Map<String,Object>params=newHashMap<String,Object>();
			params.put("username",spitter.getUsername());
			params.put("password",spitter.getPassword());
			params.put("fullname",spitter.getFullName());
			jdbcTemplate.update(SQL_INSERT_SPITTER,params);
			spitter.setId(queryForIdentity());
			}*/
	}
	
	public void getCategoryByID(int id)
	{
		String SQL = "SELECT * from DrugCategory where CATEGORY_NO = ?";
		
		/*return jdbcTemplate.queryForObject(
				SQL_SELECT_SPITTER_BY_ID,
				newParameterizedRowMapper<Spitter>(){
				public SpittermapRow(ResultSetrs,introwNum)
				throws SQLException{
				Spitter spitter=newSpitter();
				spitter.setId(rs.getLong(1));
				spitter.setUsername(rs.getString(2));
				spitter.setPassword(rs.getString(3));
				spitter.setFullName(rs.getString(4));
				return spitter;
				}
				},
				id
				);*/
	}
	
}
