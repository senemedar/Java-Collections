package Zadanie22;

public class User {
	private String email;
	private String password;
	private int points;
	private UserRole role;
	
	public User(String email, String password, int points, UserRole role) {
		this.email = email;
		this.password = password;
		this.points = points;
		this.role = role;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public UserRole getRole() {
		return role;
	}
	
	public int getPoints() {
		return points;
	}
	
	public void addPoints(int points) {
		this.points += points;
	}
	
	@Override
	public String toString() {
		return "User{" +
				"email='" + email + '\'' +
				", password='" + password + '\'' +
				", points=" + points +
				", role=" + role +
				'}';
	}
}
