package Zadanie22;

import java.util.*;

public class UserRepository {
	private Map<String, User> usersMap = new HashMap<>();
	
	public void addUser(User user) {
		usersMap.put(user.getEmail(), user);
	}
	
	public void addUser(String email, String password) {
		User user = new User(email, password, 0, UserRole.CLIENT);
		addUser(user);
	}
	
	public int countUsers() {
//		int count = 0;
//		for (String s : usersMap.keySet()) {
//			count++;
//		}
		return usersMap.size();
	}
	
	public boolean containsMail(String email) {
		return usersMap.containsKey(email);
	}
	
	public User getUser(String mail) {
		return usersMap.get(mail);
	}
	
	public User login(String email, String password) {
		for (User user : usersMap.values()) {
			if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
				return user;
			}
		}
		throw new WrongLoginException();
	}
	
	public void removeUser(String email) {
		usersMap.remove(email);
	}
	
	public boolean containsAdmin() {
		for (User user : usersMap.values()) {
			if (user.getRole() == UserRole.ADMIN)
				return true;
		}
		return false;
	}
	
	public void addPoints(int points) {
		for (User user : usersMap.values()) {
			user.addPoints(points);
		}
	}
	
	public List<User> sortUsersByPoints() {
		List<User> userList = new ArrayList<>(usersMap.values());
		
		userList.sort(Comparator.comparingInt(User::getPoints));
		return userList;
	}
	
	@Override
	public String toString() {
		return "UserRepository{" +
				"usersMap=" + usersMap +
				'}';
	}
}
