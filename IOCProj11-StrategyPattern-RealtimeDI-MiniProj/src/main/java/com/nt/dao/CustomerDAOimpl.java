package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.nt.bo.CustomerBO;

public final class CustomerDAOimpl implements ICustomerDAO {
	private static final String CUSTOMER_INSERT_QUERY="INSERT INTO REALTIMEDI_CUSTOMER VALUES(CUST_NO_SEQ.NEXTVAL(?,?,?,?))";
	private DataSource ds;
	
	public CustomerDAOimpl(DataSource ds) {
		System.out.println("CustomerDAOimpl:1-param constructor");
		this.ds = ds;
	}

	@Override
	public int insert(CustomerBO custBO) throws Exception {
		int count=0;
		System.out.println("CustomerDAOimpl.insert()");
		try(Connection con=ds.getConnection();PreparedStatement ps=con.prepareStatement(CUSTOMER_INSERT_QUERY);){
			//set values to query param by collecting the data from BO class obj
			if(ps!=null) {
				ps.setString(1, custBO.getCname());
				ps.setString(2, custBO.getCadd());
				ps.setDouble(3,custBO.getPamt());
				ps.setDouble(4, custBO.getIntramt());
				
				//execute the query
				count=ps.executeUpdate();
			}//if
			
			}//try
		   catch(SQLException se) {
				se.printStackTrace();
				throw se;
		   }
		   catch(Exception e){
			e.printStackTrace();
			throw e;
		}
		return 0;
	}

}
