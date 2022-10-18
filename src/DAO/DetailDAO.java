package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import models.Product;

public class DetailDAO {
	
	private static final String SQL_INSERT = "INSERT INTO invoice_detail (id_invoice,id_product, quantity,price) VALUES(?, ?, ?, ?)";
	
	
	public int insertInvoice(int id_invoice,Product product) {
		Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
        	conn = Conexion.getConnection();
        	stmt = conn.prepareStatement(SQL_INSERT);
        	stmt.setInt(1, id_invoice);
        	stmt.setInt(2, product.getPro_id());
        	stmt.setInt(3, product.getPro_units());
        	stmt.setDouble(4, product.getPro_price());
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
