package comit;

import java.util.Scanner;

/**
 * Class09
 * 
 * 3 - (Poll.java) A survey was carried out to 15 students in a University where the following information was requested: 
 * Photo ID #, SEX, SALARY, JOB.
 * 
 * • PHOTO ID # (It's an integer)
 * • SEX (1 - Male 2 - Female)
 * • JOB (1 - If you work 2 - Do not work)
 * • SALARY (An integer value)
 * 
 * Write the algorithm that allows reading and storing the requested data in vectors, then calculate and print:
 * • Percentage of men in the university
 * • Percentage of women in the university
 * • Percentage of men who work and average salary
 * • Percentage of working women and average salary
 */
public class Poll {
	private final static byte IDX_PHOTO = 0;
	private final static byte IDX_SEX = 1;
	private final static byte IDX_JOB = 2;
	private final static byte IDX_SALARY = 3;
	
	private final static byte SEX_MALE = 1;
	private final static byte SEX_FEMALE = 2;

	private final static byte JOB_YES = 1;
	private final static byte JOB_NO = 2;
	
	public static void example() {
		int[][] students = new int[15][4];
		
		pollReadData(students);
		
		showGenderAverages(students, SEX_MALE);
		showGenderAverages(students, SEX_FEMALE);
	}
	
	private static void pollReadData(int[][] data) {
		Scanner myScanner = new Scanner(System.in);
		
		for (int i = 0; i < data.length; i++) {
			System.out.println("\nSTUDENT " + (i+1) + ":");
			System.out.println("Enter photo ID number: ");
			data[i][IDX_PHOTO] = myScanner.nextInt();
			System.out.println("Enter gender (1: Male, 2: Female): ");
			data[i][IDX_SEX] = myScanner.nextInt();
			System.out.println("Does he/she have a job? (1: Yes, 2: No): ");
			data[i][IDX_JOB] = myScanner.nextInt();	
			System.out.println("Enter salary or just enter zero: ");
			data[i][IDX_SALARY] = myScanner.nextInt();				
		}		
	}
	
	private static void showGenderAverages(int[][] data, int gender) {
		int genderCount = 0;
		int workingCount = 0;
		int salaryAverage = 0;
		
		
		for (int i = 0; i < data.length; i++) {
			if(data[i][IDX_SEX] == gender)
			{
				genderCount++;
				if(data[i][IDX_JOB] == JOB_YES)
				{
					workingCount++;
					salaryAverage += data[i][IDX_SALARY];
				}
			}
		}
		
		System.out.println("\nPOLL RESULTS:");
		System.out.println("Percentage of " + getStringGender(gender) + " in the university: " + getStringPercentage(genderCount,data.length));
		System.out.println("Percentage of " + getStringGender(gender) + " who work: " + getStringPercentage(workingCount,genderCount));
		System.out.println(getStringGender(gender) + " average salary: " + salaryAverage);
	}
	
	private static String getStringGender(int gender) {
		String strGender = "Unknown";
		
		switch (gender) {
		case SEX_MALE:
			strGender = "Male";
			break;
		case SEX_FEMALE:
			strGender = "Female";
			break;
		default:
			break;
		}
		
		return strGender;
	}
	
	private static String getStringPercentage(int count, int total)
	{
		String strPercentage = "0";
		
		if(total >0)
		{
			strPercentage = String.valueOf((count*100)/total);
		}
		
		return (strPercentage + "%");
	}
}
