package video_11_4;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectDerbyDriverManager {
	
	// Class EmployeeList displays Employees from the table EMP 
	// using JDBC drivers of type 4



	  public static void main(String argv[]) {
	   
	   String sqlQuery = "SELECT * from Employee"; 

	   // Open autocloseable Connection, Statement and get the result set
	   try (Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/sample");
			Statement stmt = conn.createStatement(); 
			ResultSet rs = stmt.executeQuery(sqlQuery); ) {  

	      // Process the result set - print Employees
	      while (rs.next()){ 
	    	 int empNo = rs.getInt("ID_STREET");
	       	 String eName = rs.getString("ENAME");
//	         String job = rs.getString("JOB_TITLE");
		     System.out.println(""+ empNo + ", " + eName); 
	      }
	   } catch(SQLException se ) {
	      System.out.println ("SQLError: " + se.getMessage ()
	           + " code: " + se.getErrorCode ());

	   } catch( Exception e ) {
	      System.out.println(e.getMessage()); 
	   } 
	}
	}

	
	
	


