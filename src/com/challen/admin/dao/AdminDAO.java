package com.challen.admin.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.challen.database.DataBaseDAO;

public class AdminDAO {
	private Connection con;
	private PreparedStatement pt;
	private ResultSet rs;
	public boolean login(Admin admin){
		boolean flag = false;
		con = DataBaseDAO.getConnection();
		try{
			pt=con.prepareStatement("select * from admin where username=? and password=?");
			pt.setString(1, admin.getUserName());
			pt.setString(2, admin.getPassWord());
			rs = pt.executeQuery();
			if(rs.next()){
				flag = true;
				admin.setQx(rs.getInt(5));
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
	public boolean deleteAdmin(int id){
		boolean flag = false;
		con=DataBaseDAO.getConnection();
		try{
			pt=con.prepareStatement("delete from admin where id=?");
			pt.setInt(1, id);
			int i=pt.executeUpdate();
			if(i>0){
				flag=true;
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
	public boolean deleteUsers(int id){
		boolean flag = false;
		con=DataBaseDAO.getConnection();
		try{
			pt=con.prepareStatement("delete from users where id=?");
			pt.setInt(1, id);
			int i=pt.executeUpdate();
			if(i>0){
				flag=true;
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
