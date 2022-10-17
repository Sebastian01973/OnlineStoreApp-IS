package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conection {
	
	private static String urlDB = "mysql://root:YCADLE4WJ9hSXdUxLWYs@containers-us-west-106.railway.app:5772/railway";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASS = "YCADLE4WJ9hSXdUxLWYs";
    
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:"+urlDB);
    }
    
    public static void close(ResultSet rs){
        try {
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void close(PreparedStatement stmt){
        try {
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void close(Connection conn){
        try {
            conn.close();
        } catch (SQLException ex) {
           ex.printStackTrace(System.out);
        }
    }
    
}
