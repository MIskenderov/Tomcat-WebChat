package main.java.com.shkliarenko.chat.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoLocal implements UserDao {

	@Override
	public boolean checkUser(String login) {
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "test1230");
				ResultSet rs = connection
						.prepareStatement("SELECT * FROM users").executeQuery()){
			if (rs.next()) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean newUser(User u) {
		
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "test1230");
				PreparedStatement preparedStatement = connection
						.prepareStatement("INSERT INTO users (login, pass, mail) VALUES (?,?,?)")){
			preparedStatement.setString(1, u.getLogin());
			preparedStatement.setString(2, u.getPassHash());
			preparedStatement.setString(3, u.getEmail());
			
			ResultSet rs = preparedStatement.executeQuery();
			//Затестить и написать это
			//SQL ERROR?

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
