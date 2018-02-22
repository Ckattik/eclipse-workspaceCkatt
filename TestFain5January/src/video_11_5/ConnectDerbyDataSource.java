package video_11_5;


import java.sql.*;
import javax.sql.*;
import javax.ejb.*;
import javax.naming.*;

public class ConnectDerbyDataSource implements SessionBean {

	    private DataSource ds = null;
	    private Context ctx = null;

	public void ejbCreate() throws CreateException {

		        ctx = new InitialContext();
		        ds = (DataSource)ctx.lookup("jdbc/distCoffeesDB");
		    }

		    public void updateTotal(int incr, String cofName, String username,
		                            String password)
		        throws SQLException {

		        Connection con;
		        PreparedStatement pstmt;

		        try {
		            con = ds.getConnection(username, password);
		            pstmt = con.prepareStatement("UPDATE COFFEES " +
		                        "SET TOTAL = TOTAL + ? " +
		                        "WHERE COF_NAME = ?");
		            pstmt.setInt(1, incr);
		            pstmt.setString(2, cofName);
		            pstmt.executeUpdate();
		            stmt.close();
		        } finally {
		            if (con != null) con.close();
		        }
		    }

		  		}
		
		
		
		
	}


