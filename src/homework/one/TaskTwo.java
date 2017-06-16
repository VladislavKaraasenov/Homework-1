package homework.one;

public class TaskTwo {

	public static void main(String[] args) {

		byte humanYears = 25;
		short months = 300;
		int days = 9131;
		int hours = 219144;
		int minutes = 13148640;
		long seconds = 788918400;

		System.out.println(humanYears + " human years are " + months + " months, or " + days + " days, or " + hours
				+ " hours, or " + minutes + " minutes, or " + seconds + " seconds.");

		float firstFloat = 10;
		float secondFloat = 3;
		float resultFloat = firstFloat / secondFloat;
		System.out.println(resultFloat);

		double firstDouble = 10;
		double secondDouble = 3;
		double resultDouble = firstDouble / secondDouble;
		System.out.println(resultDouble);

		char ch = 'v';
		char ch1 = '6';
		char ch2 = 'f';
		char ch3 = '\u0040';
		System.out.println(ch);
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);

		int a = 10;
		int b = 5;
		boolean c = a > b;
		System.out.println(c);

	}
}