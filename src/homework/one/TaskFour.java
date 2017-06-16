package homework.one;

import java.util.Scanner;

public class TaskFour {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter sum:");
		double sum = sc.nextDouble();
		System.out.println("Are you healthy? Reply with true or false: ");
		boolean amIhealthy = sc.nextBoolean();
		if (amIhealthy == false) {
			System.out.println("I will not go out.");
			if (sum > 0) {
				System.out.println("I have " + sum + "$" + " i will buy medicine.");
			} else {
				System.out.println("I will stay home and drink tea.");
			}
		} else {
			System.out.println("I am healthy.");
			if (sum >= 1 && sum <= 10) {
				System.out.println("I have " + sum + "$" + " i will go out for coffee.");
			} else if (sum > 10) {
				System.out.println("I have " + sum + "$" + " i will go party.");
			} else if (sum < 1) {
				System.out.println("I will stay home and play games.");
				sc.close();
			}
		}
	}
}
