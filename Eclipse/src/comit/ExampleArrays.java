package comit;

import java.util.Scanner;

public class ExampleArrays {
	
	/*
	 * Creates an array called “grades” with 5 integers that will store students’ grades
	 * Declare an integer array “grades”
	 * Construct a 5 element array on the previous variable.
	 * Store 5 different values in the array
	 * Try using the index, and then try declaring the values in-line.
	 * Add the 5 different grades together 
	 * Calculate the average grade
	 */
	public static void arrayGrades() {
		int numGrades;
		int[] grades;
		int sum = 0;
		int avg = 0;		
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Please enter the number of grades:");
		numGrades = myScanner.nextInt();
		grades = new int[numGrades];
				
		for (int i = 0; i < grades.length; i++) {
			System.out.println("Please enter the grade (" + (i+1) + "):");
			grades[i] = myScanner.nextInt();
			sum += grades[i];
		}
		
		avg = sum / grades.length;
		
		System.out.println("The average grade is :" + avg);
	}
	
	
	/* 
	 * Create an application that has a two dimensional array of students and their grades.
	 * 
	 * There are 5 students in the class, and each student has 3 grades for the assignments in their class.
	 * 
	 * Calculate and print the average grade for each student.
	 * 
	 * Calculate and print the average grade for all the students combined.
	 * 
	 */
	public static void arrayTwoDimensionsGrades() {		
		Scanner myScanner = new Scanner(System.in);
		int[][] grades;
		int numberStudents;
		int numberGrades;
		int totalAvg = 0;
		int sum;
		int avg;
		
		System.out.println("Please enter the number of students:");
		numberStudents = myScanner.nextInt();
		System.out.println("Please enter the number of grades:");
		numberGrades = myScanner.nextInt();
		
		grades = new int[numberStudents][numberGrades];
		
		for (int i = 0; i < grades.length; i++) {
			for (int j = 0; j < grades[i].length; j++) {
				System.out.println("Please enter the grade (" + (j+1) + ") for student " + (i+1) + " :");
				grades[i][j] = myScanner.nextInt();
			}
		}
		
		for (int i = 0; i < grades.length; i++) {
			sum = 0;
			for (int j = 0; j < grades[i].length; j++) {
				sum += grades[i][j];
			}
			avg = sum / grades[i].length;
			System.out.println("The average grade for student " + (i+1) + " is " + avg);
			totalAvg += avg;
		}
		
		totalAvg /= grades.length;
		
		System.out.println("The average grade for all the students is " + totalAvg);
	}
	
	
	public static void showAsciiOfAString() {
		Scanner myScanner = new Scanner(System.in);
		String myString;
		
		System.out.println("Enter the string: ");
		myString = myScanner.nextLine();
		
		for (int idxChar = 0; idxChar < myString.length(); idxChar++) {
			System.out.print((int)myString.charAt(idxChar));
			if(idxChar < (myString.length()-1))
			{
				System.out.print(", ");
			}
		}
	}
	

}
