package Zadanie22;

public class Main {
	public static void main(String[] args) {
		UserRepository repository = new UserRepository();
		repository.addUser(new User("mr.cheesewick@gmail.com", "password", 10000, UserRole.SUPER_USER));
		repository.addUser(new User("ala112@gmail.com", "12dsaw21", 14, UserRole.CLIENT));
		repository.addUser(new User("ala113@gmail.com", "12ddhfw21", 320, UserRole.ADMIN));
		repository.addUser("woda1234@onet.pl", "qwrewtry");
		
		System.out.println(repository.countUsers());
		System.out.println(repository.containsMail("ala112@gmail.com"));
		System.out.println(repository.containsMail("ala2@gmail.com"));
		System.out.println(repository.getUser("mr.cheesewick@gmail.com"));
		
		System.out.println(repository.login("mr.cheesewick@gmail.com", "password"));
		System.out.println(repository.containsAdmin());
		
		repository.addPoints(150);
		System.out.println(repository.getUser("mr.cheesewick@gmail.com"));
		
		System.out.println(repository.sortUsersByPoints());

//		System.out.println(repository);
	}
}
