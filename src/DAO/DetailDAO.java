package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import models.Invoice;

public class DetailDAO {
	
	private static final String SQL_INSERT = "INSERT INTO detail(id, date, id_user, number_invoice) VALUES(?, ?, ?, ?)";
	
	
	public int insertInvoice(Invoice invoice) {
		Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
        	conn = Conexion.getConnection();
        	stmt = conn.prepareStatement(SQL_INSERT);
        	stmt.setString(1, null);
        	stmt.setDate(2, invoice.getDate());
        	stmt.setInt(3, invoice.getId_user());
        	stmt.setString(4, invoice.getNumberInvoice());
        	rows = stmt.executeUpdate();
        }catch (SQLException e) {
        	e.printStackTrace();
		}finally {
			   Conexion.close(stmt);
	           Conexion.close(conn);
		}
        return rows;
	}

}
