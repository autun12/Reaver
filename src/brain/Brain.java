package src.brain;

import java.util.Random;
import java.util.Scanner;

import src.brain.Learning;

public class Brain {
	Scanner com = new Scanner(System.in);
	String input = com.nextLine();
	Random answer = new Random();
	int randomFeeling = answer.nextInt(4) + 1;
	String feelings;

	Learning learn = new Learning();

	public void Response() {
		if(input.equals("Hello")) {
			System.out.println("Hello.");
		}

		if(input.equals("how are you")) {
			switch(randomFeeling) {
				case 1: feelings = "good.";
					break;
				case 2: feelings = "bad.";
					break;
				case 3: feelings = "ehhh.";
					break;
				case 4: feelings = "great.";
					break;
				default: feelings = "error";
					break;
			}
			System.out.println(feelings);
			System.out.println("How are you?");
		}

		if(input.equals("print your wordlist")) {
			learn.Learning();
		}

		if(input.equals("calculate")) {
			learn.Learning();
			System.out.println("What Algorithm should I use?");
		}
	}
}