package com.bsc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bean.ClassBean;

import dbconnection.DbConnection;

public class CRUD {
	public static int insert(SubjectBean b) throws ClassNotFoundException, SQLException {
		Connection con=DbConnection.dbcon();
		String sql="insert into bsc values(?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, b.getId());
		ps.setString(2, b.getSubject());
		ps.setString(3, b.getTeacher());
		return ps.executeUpdate();	
		}
	public static int delete(SubjectBean b) throws ClassNotFoundException, SQLException {
		Connection con=DbConnection.dbcon();
		String sql="delete from bsc where sbid=?";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, b.getId());
		return ps.executeUpdate();	
		}
}
