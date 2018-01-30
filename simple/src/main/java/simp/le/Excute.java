package simp.le;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import simp.le.dao.UserDAO;
import simp.le.service.UserService;
import simp.le.vo.User;


public class Excute {
	public static void main(String[] args) throws SQLException {
		ApplicationContext ac = new ClassPathXmlApplicationContext("ioc.xml");
		UserService us = (UserService) ac.getBean("userService");
		System.out.println(us.getUserList());

		
		
/*		UserService us = (UserService) ac.getBean("userService");
		System.out.println(us.getUser());
		System.out.println(us.getUserList());*/
	}
}
