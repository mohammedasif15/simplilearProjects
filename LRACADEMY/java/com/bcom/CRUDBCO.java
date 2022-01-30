package com.bcom;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.bcom.*;


import dbconnection.DbConnection;

public class CRUDBCO {
	public static ResultSet display() throws ClassNotFoundException, SQLException {
		Connection con=DbConnection.dbcon();
		String sql="select * from bcom";
		PreparedStatement ps=con.prepareStatement(sql);
		return ps.executeQuery();
		}
	
	public static int insert(SubjectBeanBco b) throws ClassNotFoundException, SQLException {
	Connection con=DbConnection.dbcon();
	String sql="insert into bcom values(?,?,?)";
	PreparedStatement ps=con.prepareStatement(sql);
	ps.setInt(1, b.getId());
	ps.setString(2, b.getSubject());
	ps.setString(3, b.getTeacher());
	return ps.executeUpdate();	
	}
	
public static int delete(SubjectBeanBco b) throws ClassNotFoundException, SQLException {
	Connection con=DbConnection.dbcon();
	String sql="delete from bcom where sbid=?";
	PreparedStatement ps=con.prepareStatement(sql);
	ps.setInt(1, b.getId());
	return ps.executeUpdate();	
	}
}
