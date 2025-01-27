package ejer02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		ConsoleInput consoleInput = new ConsoleInput(keyboard);
		System.out.println(consoleInput.readBooleanUsingChar('O', 's'));
	}

}
