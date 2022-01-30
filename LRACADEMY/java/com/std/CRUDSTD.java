package com.std;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import dbconnection.DbConnection;

public class CRUDSTD {
public static ResultSet display() throws ClassNotFoundException, SQLException {
	Connection con=DbConnection.dbcon();
	String sql="select * from student";
	PreparedStatement ps=con.prepareStatement(sql);
	return ps.executeQuery();	
}

public static int insert( StudentBean b) throws ClassNotFoundException, SQLException {
Connection con=DbConnection.dbcon();
String sql="insert into student values(?,?,?,?,?,?,?)";
PreparedStatement ps=con.prepareStatement(sql);
ps.setInt(1, b.getSid());
ps.setString(2, b.getFname());
ps.setString(3, b.getLname());
ps.setDate(4,new java.sql.Date(b.getDob().getTime()));
ps.setString(5,b.getAddress());
ps.setString(6, b.getPhone());
ps.setString(7,b.getClasss());
return ps.executeUpdate();	
}
public static int update( StudentBean b) throws ClassNotFoundException, SQLException {
Connection con=DbConnection.dbcon();
String sql="update student set firstname=?, lastname=?, dob=?, address=?, phone=?, class=? where sid=?" ;
PreparedStatement ps=con.prepareStatement(sql);

ps.setString(1, b.getFname());
ps.setString(2, b.getLname());
ps.setDate(3,new java.sql.Date(b.getDob().getTime()));
ps.setString(4,b.getAddress());
ps.setString(5, b.getPhone());
ps.setString(6,b.getClasss());
ps.setInt(7, b.getSid());
return ps.executeUpdate();	
}
public static int delete( StudentBean b) throws ClassNotFoundException, SQLException {
Connection con=DbConnection.dbcon();
String sql="delete from student  where sid=?" ;
PreparedStatement ps=con.prepareStatement(sql);
ps.setInt(1, b.getSid());
return ps.executeUpdate();	
}
}