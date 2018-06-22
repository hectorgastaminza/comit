package comit;

import java.util.Scanner;

public class Examples {

	/**
	 * 0601to15 Class06 examples ".
	 * 1 - Write a program in Java that prints the phrase "Hi, I already print sentences".
	 * 2 - Write a program in Java that prints an int number, for example 273, or 597.
	 * 3 - Write a program in Java that prints a float number, for example the 5.3, or the 7.5.
	 * 4 - Write a program in Java that prints on the screen the sum of 1234 and 532.
	 * 5 - Write a program in Java that prints the subtraction of 1234 and 532.
	 * 6 - Write a program in Java that prints the multiplication of 1234 and 532 on screen.
	 * 7 - Write a program in Java that prints the division of 1234 between 532.
	 * 8 - Write a program in Java that prints the numbers 1 to 3 on the screen.
	 * 9 - Write a program in Java that prints the numbers 1 to 9 on the screen.
	 * 10 - Write a program in Java that prints on the screen the numbers from 1 to 10,000.
	 * 11 - Write a program in Java that prints the numbers from 5 to 10 on the screen.
	 * 12 - Write a program in Java that prints the numbers from 5 to 15 on the screen.
	 * 13 - Write a program in Java that prints on the screen the numbers from 5 to 15,000.
	 * 14 - Write a program in Java that prints 200 times the word "hello". Note: in the source code that you write you must only enter once the word "hello".
	 * 15 - Exercise: Write a program in Java that prints the squares of the first 30 natural numbers on the screen.
	 */
	public static void examplePrintValues() {
		System.out.println("Hi, I already print sentences");	
		System.out.println(597);
		System.out.println(5.3);
		System.out.println(1234+532);
		System.out.println(1234*532);
		System.out.println(1234/532);
		printSequence(1,3);
		printSequence(1,9);
		printSequence(1,10000);
		printSequence(5,10);
		printSequence(5,15);
		printSequence(5,15000);
		printMessage("hello", 200);
		printSquares(1,30);
	}

	/**
	 * Prints a sequence of numbers from a to b
	 * @param from a 
	 * @param to b
	 */
	public static void printSequence(int from, int to) {
		for (int i = from; i <= to; i++) {
			System.out.println(i);
		}
	}

	/**
	 * Prints a message N times
	 * @param msg
	 * @param times N
	 */
	public static void printMessage(String msg, int times) {
		for (int i = 0; i < times; i++) {
			System.out.println(msg);
		}
	}

	/**
	 * Prints the square of numbers from a to b
	 * @param from a
	 * @param to b
	 */
	public static void printSquares(int from, int to) {
		for (int i = from; i <= to; i++) {
			System.out.println(i + " x " + i + " = " + i*i);
		}
	}

	/**
	 * Write a program in Java that reads an integer from the keyboard 
	 * and makes the sum of the next 100 numbers, showing the result on screen.
	 * @param value
	 */
	public static void printSumConsecutives() {
		Scanner input = new Scanner( System.in );
		int value = 0;
		final int consecutives = 100;

		System.out.println("Insert number: ");
		value = input.nextInt();

		System.out.println("The sum from " + value + " to " + (value+consecutives) + " is " + sumConsecutives(value,consecutives));
	
		input.close();
	}

	/**
	 * Sum of the next n consecutives numbers from value a
	 * @param value a
	 * @param consecutives n
	 */
	public static int sumConsecutives(int value, int consecutives) {
		int max = value + consecutives;
		int sum = 0;

		for (int i = value; i <= max; i++) {
			sum += i;
		}

		return sum;
	}
}
