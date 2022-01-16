package dao;

import bean.User;

public interface UserDAO {
	public User getUserByEmailAndPassword(String email, String password);
}
