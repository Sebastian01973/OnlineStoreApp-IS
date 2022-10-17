package DAO;

import java.sql.*;

public class Conexion {
    private static final String JDBC_URL = "jdbc:mysql://containers-us-west-106.railway.app:5772/railway";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASS = "YCADLE4WJ9hSXdUxLWYs";
    
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
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

