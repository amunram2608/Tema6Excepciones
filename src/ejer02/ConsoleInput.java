package ejer02;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleInput {
	
	private Scanner keyboard;
	
	public ConsoleInput(Scanner keyboard) {
		this.keyboard = keyboard;
	}
	
	void cleanInput() {
		keyboard.nextLine();
	}
	
	int readInt() {
		boolean valid;
		int num = 0;
		
		do {
			try {
				num = keyboard.nextInt();
				valid = true;
			} catch (InputMismatchException e) {
				System.err.println("Número inválido");
				valid = false;
			} finally {
				cleanInput();
			}
		} while (!valid);
		return num;
	}
}
