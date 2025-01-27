package ejer02;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleInput {
	
	private Scanner keyboard;
	
	public ConsoleInput(Scanner keyboard) {
		this.keyboard = keyboard;
	}
	
	
	//Métodos
	private void cleanInput() {
		keyboard.nextLine();
	}
	
	public int readInt() {
		boolean valid;
		int num = 0;
		
		do {
			valid = true;
			try {
				num = keyboard.nextInt();
			} catch (InputMismatchException e) {
				System.err.println("Número inválido");
				valid = false;
			} finally {
				cleanInput();
			}
		} while (!valid);
		return num;
	}
	
	public int readIntLessThan(int upperBound) {
		boolean valid;
		int num = 0;
		
		do {
			valid = true;
			num = readInt();
			if (num >= upperBound) {
				valid = false;
				System.err.printf("El número tiene que ser menor que %d\n", upperBound);
			}
		} while (!valid);
		return num;
	}
	
	public int readIntLessOrEqualThan(int upperBound) {
		boolean valid;
		int num = 0;
		
		do {
			valid = true;
			num = readInt();
			if (num > upperBound) {
				valid = false;
				System.err.printf("El número tiene que ser menor o igual que %d\n", upperBound);
			}
		} while (!valid);
		return num;
	}
	
	public int readIntGreaterThan(int lowerBound) {
		boolean valid;
		int num = 0;
		
		do {
			valid = true;
			num = readInt();
			if (num <= lowerBound) {
				valid = false;
				System.err.printf("El número tiene que ser mayor que %d\n", lowerBound);
			}
		} while (!valid);
		return num;
	}
	
	public int readIntGreaterOrEqualThan(int lowerBound) {
		boolean valid;
		int num = 0;
		
		do {
			valid = true;
			num = readInt();
			if (num < lowerBound) {
				valid = false;
				System.err.printf("El número tiene que ser mayor o igual que %d\n", lowerBound);
			}
		} while (!valid);
		return num;
	}
	
	public int readIntInRange(int lowerBound, int upperBound) {
		boolean valid;
		int num = 0;
		
		if(lowerBound > upperBound) {
			throw new IllegalArgumentException("lowerBound y upperBound incorrectos");
		}
		
		do {
			valid = true;
			num = readInt();
			if (num < lowerBound || num > upperBound) {
				valid = false;
				System.err.printf("El número tiene que estar entre %d y %d\n", lowerBound, upperBound);
			}
		} while (!valid);
		return num;
	}
	
	public char readChar() {
		String input;
		
		do {
			input = keyboard.nextLine();
			if (input.length() > 1 || input.isEmpty()) {
				System.err.println("Caracter incorrecto");
			}
		} while (input.length() > 1 || input.isEmpty());
		return input.charAt(0);
	}
	
	public String readString() {
		return keyboard.nextLine();
	}
	
	public String readString(int maxLength) {
		String input;
		
		if (maxLength <= 0) {
			throw new IllegalArgumentException("Parámetro inválido");
		}
		
		do {
			input = readString();
			if (input.length() > maxLength) {
				System.err.printf("La longitud de la cadena no debe de sobrepasar %d\n", maxLength);
			} 
		} while (input.length() > maxLength);
		return input;
	}
	
	public boolean readBooleanUsingChar(char affirmativeValue, char negativeValue) {
		boolean answer = false;
		char input;
		
		affirmativeValue = Character.toLowerCase(affirmativeValue);
		negativeValue = Character.toLowerCase(negativeValue);
		
		if(affirmativeValue == negativeValue) {
			throw new IllegalArgumentException("El afirmativo y negativo no deben de ser iguales");
		}
		
		do {
			input = readChar();
			input = Character.toLowerCase(input);
			if (input == affirmativeValue) {
				answer = true;
			} 
			else if (input == negativeValue) {
				answer = false;
			}
			else {
				System.err.println("Elección inválida");
			}
		} while (input != affirmativeValue && input != negativeValue);
		return answer;
	}
}
