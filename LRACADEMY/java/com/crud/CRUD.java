package com.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bean.ClassBean;

import dbconnection.DbConnection;

public class CRUD {
	public static ResultSet select() throws ClassNotFoundException, SQLException {
		Connection con=DbConnection.dbcon();
		String sql="select * from classes";
		PreparedStatement ps=con.prepareStatement(sql);
		return ps.executeQuery();
		
	}

	
	public static int update(ClassBean b) throws ClassNotFoundException, SQLException {
		Connection con=DbConnection.dbcon();
		String sql="update classes set cname=? where cid=?";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, b.getCname());
		ps.setInt(2,b.getCid());
		return ps.executeUpdate();
		
		
	}
	public static int insert(ClassBean b) throws ClassNotFoundException, SQLException {
		Connection con=DbConnection.dbcon();
		String sql="insert into classes values(?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, b.getCid());
		ps.setString(2, b.getCname());
		return ps.executeUpdate();	}
	
	
	public static int delete(ClassBean b) throws SQLException, ClassNotFoundException {
		Connection con=DbConnection.dbcon();
		String sql="delete from classes where cid=?";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, b.getCid());
		return ps.executeUpdate();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
