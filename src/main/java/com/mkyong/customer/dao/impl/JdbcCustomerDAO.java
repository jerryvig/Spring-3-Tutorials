package com.mkyong.customer.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;

import com.mkyong.customer.dao.CustomerDAO;
import com.mkyong.customer.model.Customer;

public class JdbcCustomerDAO implements CustomerDAO {
   private DataSource dataSource;
  
   public void setDataSource( DataSource dataSource ) {
       this.dataSource = dataSource;
   } 

    public void insert( Customer customer ) {
	String sql = "INSERT INTO CUSTOMER (cust_id,name,age) VALUES (?,?,?)";
        Connection conn = null;
        
        try {
	   conn = dataSource.getConnection();
           PreparedStatement ps = conn.prepareStatement(sql);
           ps.setInt(1,customer.getCustId());
           ps.setString(2, customer.getName());
           ps.setInt(3, customer.getAge());
          
           ps.executeUpdate();
        } catch ( SQLException sqle ) { throw new RuntimeException(sqle); }
    }
    
    public Customer findByCustomerId( int custId ) {
	return null;
    }
}