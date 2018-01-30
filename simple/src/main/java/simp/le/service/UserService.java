package simp.le.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import simp.le.dao.UserDAO;
import simp.le.vo.User;

@Service
public class UserService {
	@Autowired
	private UserDAO udao;
	
	public User getUser() {
		return udao.selectUser();
	}
	public List<User> getUserList() {
		return udao.selectUserList();
	}
}
