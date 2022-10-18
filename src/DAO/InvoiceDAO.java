package DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;

import models.Invoice;
import models.Product;
import models.User;


public class InvoiceDAO {
	
	private static final String SQL_INSERT = "INSERT INTO invoice(id, date, id_user, number_invoice) VALUES(?, ?, ?, ?)";

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
	
	public ArrayList<Invoice> getInvoices(){
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<Invoice> list = new ArrayList<Invoice>();
		try {
			conn = Conexion.getConnection();
			stmt = conn.prepareStatement("SELECT id_user, number_invoice, date FROM invoice");
			rs = stmt.executeQuery();
			while(rs.next()) {
				int id_user = rs.getInt(1);
				String number_invoice = rs.getString(2);
				Date date = rs.getDate(4);
				list.add(new Invoice(id_user, number_invoice,date ));
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		finally {
			Conexion.close(rs);
			Conexion.close(stmt);
			Conexion.close(conn);
		}
		return list;
	}
	
	public Invoice getInvoice(String num_invoice){
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Invoice invoice = null;
		try {
			conn = Conexion.getConnection();
			stmt = conn.prepareStatement("SELECT id,id_user, number_invoice, date FROM invoice WHERE number_invoice=?");
			rs = stmt.executeQuery();
			stmt.setString(1,num_invoice);
			while(rs.next()) {
				int id = rs.getInt(1);
				int id_user = rs.getInt(2);
				String number_invoice = rs.getString(3);
				Date date = rs.getDate(4);
				invoice = new Invoice(id,id_user, number_invoice,date );
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		finally {
			Conexion.close(rs);
			Conexion.close(stmt);
			Conexion.close(conn);
		}
		return invoice;
	}
	
	
}
