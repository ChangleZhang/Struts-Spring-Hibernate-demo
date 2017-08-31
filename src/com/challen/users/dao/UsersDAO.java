package com.challen.users.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;

import com.challen.database.*;
import com.challen.users.action.Users;

public class UsersDAO {
	private Connection con;
	private PreparedStatement pt;
	private ResultSet rs;
	public boolean findUsers(String username){
		boolean flag = false;
		con=DataBaseDAO.getConnection();
		try{
			pt=con.prepareStatement("select * from users where username=?");
			pt.setString(1,username);
			rs=pt.executeQuery();
			if(rs.next())
				flag=true;
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			DataBaseDAO.closeRs(rs);
			DataBaseDAO.closePt(pt);
			DataBaseDAO.closeCon(con);
		}
		return flag;
	}
	
	public int save(Users users) throws SQLException{
		int i=0;
		con = DataBaseDAO.getConnection();
		try{
			pt = con.prepareStatement("insert into users(username,password,"+"name,nic,sex,age,email,phone,selfshow)values(?,?,?,?,?,?,?)");
			
			pt.setString(1, users.getUsername());
			pt.setString(2, users.getPassword());
			pt.setString(3, users.getName());
			pt.setString(4, users.getNic());
			pt.setString(5, users.getSex());
			pt.setInt(6, users.getAge());
			pt.setString(7, users.getEmail());
			pt.setString(8, users.getPhone());
			pt.setString(9, users.getSelfShow());
			i=pt.executeUpdate();
		}catch(SQLDataException e){
			e.printStackTrace();
		}finally{
			DataBaseDAO.closePt(pt);
			DataBaseDAO.closeCon(con);
		}
		
		return i;
	}
	
	public boolean login(Users users){
		boolean flag = false;
		con = DataBaseDAO.getConnection();
		try{
			pt=con.prepareStatement("select * from users where username=? and password=?");
			pt.setString(1, users.getName());
			pt.setString(2,users.getPassword());
			rs = pt.executeQuery();
			if(rs.next()){
				flag = true;
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			DataBaseDAO.closeRs(rs);
			DataBaseDAO.closePt(pt);
			DataBaseDAO.closeCon(con);
		}
		return flag;
	}
}
