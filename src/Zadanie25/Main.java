package Zadanie25;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Tree> forest = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			forest.add(new Tree());
		}
		
		forest.add(new Tree(){
			@Override
			public void Display() {
				System.out.println("Jestem magicznym drzewem! Lalalalal!!");
			}
		});
		
		Collections.shuffle(forest);
		
		for (Tree tree : forest) {
			tree.Display();
		}
	}
}
