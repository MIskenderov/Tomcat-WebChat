package main.java.com.shkliarenko.chat.dao;

public interface UserDao {
	public boolean checkUser(String login);
	public boolean newUser(User u);
}
