package com.product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CRUD {
	public static ResultSet select(Product p) throws ClassNotFoundException, SQLException {
		String sql="select * from Product where pid=?";
		Connection con=DbConnection.dbcon();
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, p.getPid());
		return ps.executeQuery();
		
	}

}
