
public class User {
	private int userId;
	private String username;
	private String email;
	private int phoneNumber;

	// Constructor
	public User(int userId, String username, String email, int phoneNumber) {
		this.userId = userId;
		this.username = username;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	/*
	public String toString() {


				
	}
	*/
}

