package com.challen.database;

import java.sql.*;

public class DataBaseDAO {
	private static Connection con;
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL ="jdbc:mysql://localhost:3306/reg";
	private static final String NAME ="root";
	private static final String PASSWORD = "admin";
	static{
		try{
			Class.forName(DRIVER);//��������
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	public static Connection getConnection(){
		try{
			con = DriverManager.getConnection(URL,NAME,PASSWORD);
		}catch(SQLException e){e.printStackTrace();}
		return con;
	}
	
	public static void closeCon(Connection con){
		try{
			if(con!=null) con.close();
		}catch(SQLException e){e.printStackTrace();}
	}
	
	public static void closePt(PreparedStatement pt){
		try{
			if(pt!=null) pt.close();
		}catch(SQLException e){e.printStackTrace();}
	}
	
	public static void closeRs(ResultSet rs){
		try{
			if(rs!=null) rs.close();
		}catch(SQLException e){e.printStackTrace();}
	}
}
