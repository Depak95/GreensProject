package org.greens;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataConnection {

	public static void main(String[] args) throws SQLException {
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		   con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","admin");
		   String querry = "select * from demoqa ";
		   PreparedStatement ps = con.prepareStatement(querry);
	  	   ResultSet rs = ps.executeQuery();
		    while (rs.next()) {
				String fname = rs.getString("first_name");
				String lname = rs.getString("last_name");
				String add = rs.getString("address");
				String mail = rs.getString("email");
				 long phone = rs.getLong("phone");
				 String gen = rs.getString("gender");
				 String hob = rs.getString("hobbies");
				 String lang = rs.getString("language");		    
				 String skills = rs.getString("skills");
				 String country = rs.getString("country");
				 String dob = rs.getString("dob");
				 String pass = rs.getString("password");
				 String resume = rs.getString("resume");
				 
				 System.out.println(fname);
				 System.out.println(lname);
				 System.out.println(add);
				 System.out.println(mail);
				 System.out.println(phone);
				 System.out.println(gen);
				 System.out.println(hob);
				 System.out.println(lang);
				 System.out.println(skills);
				 System.out.println(country);
				 System.out.println(dob);
				 System.out.println(pass);
				 System.out.println(resume);
		    }
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			con.close();
		}

	}

}
