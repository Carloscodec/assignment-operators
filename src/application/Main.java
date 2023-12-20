package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int minutes = input.nextInt();
		
		double account = 50.0;
		
		if (minutes > 100) {
			account += (minutes - 100) * 2.0;
		}
		
		System.out.printf("Account value = R$ %.2f%n", account);
		
		input.close();
		
		/* Assignment operator: int x = 4; // Assigns the value 4 to the variable x
		 * Addition Assignment operator:
		 * x += 3; // equivalent to x = x + 3; // int x = 7
		 * Subtraction Assignment Operator:
		 * x -= 2; // equivalent to x = x - 2; // int x = 5
		 * Multiplication Assignment Operator:
		 * x *= 5; // equivalent to x = x * 5; // int x = 25
		 * Division Assignment Operator
		 * x /= 5; equivalent to x = x / 5; // int x = 5
		 * Modulus Assignment Operator (remainder)
		 * x %= 2; equivalent to x = x % 2; // int x = 1;
		 */ 
	}

}
