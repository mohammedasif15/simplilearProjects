package com.bsc;
import dbconnection.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;

public class SubTea {
	public static ResultSet display() throws ClassNotFoundException, SQLException {
		Connection con=DbConnection.dbcon();
		String sql="select * from bsc";
		PreparedStatement ps=con.prepareStatement(sql);
		return ps.executeQuery();
		}
}
