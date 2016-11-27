package main.java.com.shkliarenko.chat.dao;

public class User {
	private long id;
	private String login;
	private String passHash;
	private String email;
	
	public User(){
		
	}
	
	public User(long id, String login, String passHash){
		this.id = id;
		this.login = login;
		this.passHash = passHash;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getPassHash() {
		return passHash;
	}
	
	public void setPassHash(String passHash) {
		this.passHash = passHash;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
