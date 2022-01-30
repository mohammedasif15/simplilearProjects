package com.report;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dbconnection.DbConnection;

public class DisplayDetails {
	public static ResultSet displaybco() throws ClassNotFoundException, SQLException {
		Connection con=DbConnection.dbcon();
		String sql="select * from bcom";
		PreparedStatement ps=con.prepareStatement(sql);
		return ps.executeQuery();
		}
	public static ResultSet displaybcostd() throws ClassNotFoundException, SQLException {
		Connection con=DbConnection.dbcon();
		String sql="select * from student where class='bcom'";
		PreparedStatement ps=con.prepareStatement(sql);
		return ps.executeQuery();
		}
	public static ResultSet displaybtech() throws ClassNotFoundException, SQLException {
		Connection con=DbConnection.dbcon();
		String sql="select * from btech";
		PreparedStatement ps=con.prepareStatement(sql);
		return ps.executeQuery();
		}
	public static ResultSet displaybtechtd() throws ClassNotFoundException, SQLException {
		Connection con=DbConnection.dbcon();
		String sql="select * from student where class='btech'";
		PreparedStatement ps=con.prepareStatement(sql);
		return ps.executeQuery();
		}



	public static ResultSet displaybsc() throws ClassNotFoundException, SQLException {
		Connection con=DbConnection.dbcon();
		String sql="select * from bsc";
		PreparedStatement ps=con.prepareStatement(sql);
		return ps.executeQuery();
		}
	public static ResultSet displaybsctd() throws ClassNotFoundException, SQLException {
		Connection con=DbConnection.dbcon();
		String sql="select * from student where class='bsc.cs'";
		PreparedStatement ps=con.prepareStatement(sql);
		return ps.executeQuery();
		}







}

