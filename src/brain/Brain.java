package src.brain;

import java.util.Scanner;

public class Brain {
	public void Brain() {
		Scanner com = new Scanner(System.in);
		String input = com.nextLine();

		if(input.equals("Hello")) {
			System.out.println("Hello Master");
		}
	}
}