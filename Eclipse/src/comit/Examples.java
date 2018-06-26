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
	 * 18 - Write a program in Java that reads two numbers on the keyboard and say which is the largest and which is the smallest.
	 */
	public static void printLargestOfTwo() {
		Scanner input = new Scanner( System.in );
		int valueA = 0;
		int valueB = 0;

		input.reset();
		
		System.out.println("Insert number A: ");
		valueA = input.nextInt();
		System.out.println("Insert number B: ");
		valueB = input.nextInt();

		if(valueA == valueB)
			System.out.println("They are equal");
		else if (valueA > valueB)
			System.out.println("Number A: " + valueA + " is the largest. Number B: " + valueB + " is the smallest.");
		else
			System.out.println("Number A: " + valueA + " is the smallest. Number B: " + valueB + " is the largest.");
		
		//input.close();
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
	
		//input.close();
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
	
	
	/**
	 * 19 - Write a Java program that does the following: 
	 * declare a variable N of type int, 
	 * a variable A of type double and 
	 * a variable C of type char 
	 * and assign to each one a value. 
	 * The following screen displays: The value of each variable. The sum of N + A. And A - N
	 */
	public static void example0619() {
		int n = 5;
		double a = 5.5;
		char c = 'u';
		
		System.out.println(n + " " + a + " " + c);
		System.out.println(n + a);
		System.out.println(n - a);
	}
	
	/*
	 * 20 - Write a java program that declares an integer variable B and assign it a value. 
	 * It then displays a message indicating whether the value of B is positive or negative. 
	 * We will consider 0 as positive.
	 * If for example B = 1 the output will be 1 is positive. 
	 * If for example B = -1 the output will be: -1 is negative.
	 */
	public static void example0620(int value) {
		if(value < 0)
			System.out.println(value + " value is negative.");
		else
			System.out.println(value + " value is positive.");
	}
	
	/**
	 * 21 - Make a program in JAVA such that given as data the enrollment and 5 grades of a student; 
	 * Print the enrollment, the average and the word "approved" if the student has an average 
	 * greater than or equal to 6, and the word "not approved" otherwise. 
	 * Data: MAT, CAL1, CAL2, CAL3, CAL4, CAL5 Where: 
	 * MAT is an integer variable that represents the student's enrollment. 
	 * CAL1, CAL2, CAL3, CAL4 and CAL5 are real-type variables 
	 * representing the student's 5 grades.
	 */
	public static void exampleStudentGrade(int mat, int cal1, int cal2, int cal3, int cal4, int cal5) {
		double avg = (cal1 + cal2 + cal3 + cal4 + cal5) / 5;
		String msg = "Student: " + mat + " , ";
		
		if(avg >= 6)
			msg += "Approved";
		else
			msg += "Not approved";
		
		System.out.println(msg);
	}
	
	/**
	 * 22 - Make the program in JAVA such that given as a worker's salary, 
	 * apply a 15% increase if your salary is less than $ 1000 and 12% otherwise. 
	 * Print the new salary of the worker. Fact: SUE (variable of real type that 
	 * represents the salary of the worker).
	 */
	public static float exampleWorkerSalary(float salary) {
		float result = 0;
		
		if(salary < 1000)
			result = salary * 1.15F;
		else
			result = salary * 1.12F;
		
		return result;
	}
	
	/**
	 * 23 - Make a program that prints the 10 multiplication tables.
	 */
	public static void exampleMultiplicationTables() {
		for (int i = 1; i <= 10; i++) {
			multiplicationTable(i);			
		}
	}
	
	public static void multiplicationTable(int value) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(value + " x " + i + " = " + (value * i));
		}
	}
	
	/**
	 * 24 - Make a calculator.
	 */
	public static void exampleCalculator() {
		int valueA = 0;
		int valueB = 0;
		char operation;		
		int result;
		String msg = "";
		Scanner input = new Scanner( System.in );

		System.out.println("CALCULATOR");
		System.out.println("Insert number A: ");
		valueA = input.nextInt();
		System.out.println("Insert number B: ");
		valueB = input.nextInt();
		System.out.println("Select Operation ( + , - , * , / ): ");
		operation = input.next().charAt(0);

		switch (operation) {
		case '+':
			result = valueA + valueB;
			msg = " + ";
			break;
		case '-':
			result = valueA - valueB;
			msg = " - ";
			break;
		case '*':
			result = valueA * valueB;
			msg = " * ";
			break;
		case '/':
			result = valueA / valueB;
			msg = " / ";
			break;

		default:
			result = 0;
			msg = " (" + operation + " : Invalid operation) ";
			break;
		}

		System.out.println(valueA + msg + valueB + " = " + result);
	}
	
	
	/**
	 * 25 - Calculate the salary increase for a group of employees of a company considering the following criteria: 
	 * If the salary is less than $ 1,000.00: 
	 * - Increase 15% 
	 * If the salary is greater than or equal to $ 1,000.00: 
	 * - Increase 12% 
	 * The program must do The following: 
	 * - Save the new salaries in the arrangement 
	 * - Calculate the payroll 
	 * - Print the salaries from the settlement
	 */
	/* exampleWorkerSalary() */
	
	
	/**
	 * 26 - Make a program that asks for the salary of N workers (first you must ask how many workers there are) 
	 * and print the one with the highest salary.
	 */
	public static void exampleBestSalaryWorkers() {
		int result = Integer.MIN_VALUE;
		int counter = 1;
		int n = 0;
		int salary = 0;
		Scanner input = new Scanner( System.in );		
		
		System.out.println("How many workers there are: ");
		n = input.nextInt();
		
		while (counter <= n) {
			System.out.println("Worker " + counter + " salary : ");
			salary = input.nextInt();
			
			if(result < salary)
				result = salary;
			
			counter++;
		}
		
		System.out.println("The biggest salary is: " + result);		
	}
	
	/**
	 * 27 - Write an algorithm that calls another, and the call prints a value.
	 */
	/* Already done in the others exercises */
	
	/**
	 * 28 - Write an algorithm that calls another name "add", which receives 2 numbers. 
	 * The summation algorithm must add its parameters. 
	 * The algorithm you invoke must receive that value and display it on the screen.
	 */
	
	public static void example0628() {
		String result = "adding two numbers. 2 + 3 = ";
		System.out.println(result + addNumbers(2,3));
	}
	
	public static int addNumbers(int value1, int value2) {
		int result = value1 + value2;
		return 	result;
	}
	
	
	/**
	 * 29 - Write an algorithm and a sub-algorithm. 
	 * Write two variables with the same name and the compiler does not show error.
	 */
	/* Already done in the exercise 29 */
	
	/**
	 * 30 - Write a program that asks for a numerical password and allows three attempts. 
	 * If the user enters the correct password, it shows "Correct!" And run any program, after the message. 
	 * Otherwise the program should display "Wrong password". Then finish the program immediately.
	 */
	public static boolean examplePassword(String password, int maxAttempts) {
		Scanner input = new Scanner( System.in );		
		boolean result = false;
		String userPassword;
		
		for (int i = 0; i < maxAttempts && !result; i++) {
			System.out.println("Enter Password: ");
			userPassword = input.nextLine();
			
			if(password.compareTo(userPassword) == 0)
			{
				result = true;
				System.out.println("Correct!");
			}
			else
			{
				System.out.println("Wrong password");
			}
		}
		
		return result;		
	}
}
