package com.be;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bsc.SubjectBean;

import dbconnection.DbConnection;

public class CRUDBE {
	public static ResultSet display() throws ClassNotFoundException, SQLException {
		Connection con=DbConnection.dbcon();
		String sql="select * from btech";
		PreparedStatement ps=con.prepareStatement(sql);
		return ps.executeQuery();
		}
	
	public static int insert(SubjectBeanBe b) throws ClassNotFoundException, SQLException {
	Connection con=DbConnection.dbcon();
	String sql="insert into btech values(?,?,?)";
	PreparedStatement ps=con.prepareStatement(sql);
	ps.setInt(1, b.getId());
	ps.setString(2, b.getSubject());
	ps.setString(3, b.getTeacher());
	return ps.executeUpdate();	
	}
	
public static int delete(SubjectBeanBe b) throws ClassNotFoundException, SQLException {
	Connection con=DbConnection.dbcon();
	String sql="delete from btech where sbid=?";
	PreparedStatement ps=con.prepareStatement(sql);
	ps.setInt(1, b.getId());
	return ps.executeUpdate();	
	}
}
