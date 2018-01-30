package simp.le.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import simp.le.common.DBCon;
import simp.le.vo.User;

@Repository

public class UserDAO {
	@Autowired
	private DBCon dbc;
	@Autowired
	private User user;
	@Autowired
	private List<User> userList;
	@Autowired
	private BasicDataSource bds;
	
	public User selectUser() {
		System.out.println(dbc.getConnection());
		user.setAge(20);
		user.setName("김길동");
		return user;
	}
	
	public List<User> selectUserList() {
		try {
			Connection con = bds.getConnection();
			String sql = "select * from user_info";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
		
			while(rs.next()) {
				User user = new User();
				user.setCino(rs.getInt("cino"));
				user.setAddress(rs.getString("address"));
				user.setUiid(rs.getString("uiid"));
				user.setUino(rs.getInt("uino"));
				user.setUipwd(rs.getString("uipwd"));
				user.setUiregdate(rs.getString("uiregdate"));
				user.setAge(rs.getInt("uiage"));
				user.setName(rs.getString("uiname"));
				userList.add(user);
			}
			return userList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
