package com.challen.users.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
	
	public List findAllUsers(){
		List list = new ArrayList();
		con=DataBaseDAO.getConnection();
		try{
			pt = con.prepareStatement("select * from users");
			rs = pt.executeQuery();
			while(rs.next()){
				Users users = new Users();
				users.setId(rs.getInt(1));
				users.setUsername(rs.getString(2));
				users.setPassword(rs.getString(3));
				users.setName(rs.getString(4));
				users.setNic(rs.getString(5));
				users.setSex(rs.getString(6));
				users.setAge(rs.getInt(7));
				users.setEmail(rs.getString(8));
				users.setPhone(rs.getString(9));
				users.setSelfShow(rs.getString(10));
				list.add(users);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			DataBaseDAO.closeRs(rs);
			DataBaseDAO.closePt(pt);
			DataBaseDAO.closeCon(con);
		}
		return list;
	}
	
	public Users selectInfo(String username){
		Users users = new Users();
		con = DataBaseDAO.getConnection();
		try{
			pt = con.prepareStatement("select * from users where username=?");
			pt.setString(1, username);
			rs = pt.executeQuery();
			if(rs.next()){
				users.setId(rs.getInt(1));
				users.setUsername(rs.getString(2));
				users.setPassword(rs.getString(3));
				users.setName(rs.getString(4));
				users.setNic(rs.getString(5));
				users.setSex(rs.getString(6));
				users.setAge(rs.getInt(7));
				users.setEmail(rs.getString(8));
				users.setPhone(rs.getString(9));
				users.setSelfShow(rs.getString(10));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			DataBaseDAO.closeRs(rs);
			DataBaseDAO.closePt(pt);
			DataBaseDAO.closeCon(con);
		}
		return users;
	}
	
	public int update(Users users){
		int i=0;
		con=DataBaseDAO.getConnection();
		try{
			pt=con.prepareStatement("update users set password=?,name=?,"+"nic=?,sex=?,age=?,email=?,phone=?,selfshow=? where username=? and id=?");
			
			pt.setString(1, users.getPassword());
			pt.setString(2, users.getName());
			pt.setString(3, users.getNic());
			pt.setString(4, users.getSex());
			pt.setInt(5, users.getAge());
			pt.setString(6, users.getEmail());
			pt.setString(7, users.getPhone());
			pt.setString(8, users.getSelfShow());
			pt.setString(9, users.getUsername());
			pt.setInt(10, users.getId());
			i = pt.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			DataBaseDAO.closeRs(rs);
			DataBaseDAO.closePt(pt);
			DataBaseDAO.closeCon(con);
		}
		return i;
	}
}
