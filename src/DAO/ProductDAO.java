package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import models.Product;

public class ProductDAO {
	public ArrayList<Product> getProducts(){
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<Product> list = new ArrayList();
		try {
			conn = Conexion.getConnection();
			stmt = conn.prepareStatement("SELECT id, name, measure, unit_price, units FROM product");
			rs = stmt.executeQuery();
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String measure = rs.getString(3);
				double unitPrice = rs.getDouble(4);
				int units = rs.getInt(5);
				
				list.add(new Product(id,name,measure,unitPrice,units));
				
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
}
