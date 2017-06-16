package homework.one;

import java.util.Scanner;

public class TaskThree {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter first number: ");
		int firstNumber = sc.nextInt();
		System.out.println("Please Enter second number: ");
		int secondNumber = sc.nextInt();

		int result = firstNumber + secondNumber;
		System.out.println("Result is : " + result);
		if (result > 0) {
			System.out.println(result + " is positive number");
		} else {
			System.out.println(result + " is not positive number");
		}
		sc.close();
	}
}