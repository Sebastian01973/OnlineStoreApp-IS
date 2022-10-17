package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import models.User;

public class DAOUser {
	
	private static final String SQL_SELECT_USER = "SELECT password FROM user WHERE nick=?";
	
    private static final String SQL_INSERT = "INSERT INTO user(id,name,nick,password,address) VALUES (?, ?, ?, ?, ?)";
    
    private static final String SQL_UPDATE = "UPDATE user SET name=?, nick=?, password=?, address=? WHERE id=?";
    
    private static final String SQL_DELETE = "DELETE FROM user WHERE id=?";
    
    
    public User selectUser(String nick) {
    	Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        User user = null;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT_USER);
            stmt.setString(1, nick);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                String password = rs.getString("password"); 
                user = new User(nick, password);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
        	Conexion.close(rs);
        	Conexion.close(stmt);
        	Conexion.close(conn);
        }
        return user;
        
    }
    
    public int insert(User user){
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setInt(1, user.getUs_id());
            stmt.setString(2, user.getUs_name());
            stmt.setString(3, user.getUs_nick());
            stmt.setString(4, user.getUs_password());
            stmt.setString(5, user.getUs_address());
            
            System.out.println("ejecutando query:" + SQL_INSERT);
            rows = stmt.executeUpdate();
            System.out.println("Registros afectados:" + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
        	Conexion.close(stmt);
        	Conexion.close(conn);
        }
        
        return rows;
    }
    
    public int update(User user){
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            System.out.println("ejecutando query: " + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, user.getUs_name());
            stmt.setString(2, user.getUs_nick());
            stmt.setString(3, user.getUs_password());
            stmt.setString(4, user.getUs_address());
            stmt.setInt(55, user.getUs_id());
            
            rows = stmt.executeUpdate();
            System.out.println("Registros actualizado:" + rows);
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
        	Conexion.close(stmt);
        	Conexion.close(conn);
        }
        
        return rows;
    }
    
    public int delete(User user){
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        
        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, user.getUs_id());
            rows = stmt.executeUpdate();
            System.out.println("Registros eliminados:" + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
        	Conexion.close(stmt);
        	Conexion.close(conn);
        }
        
        return rows;
    }

}
