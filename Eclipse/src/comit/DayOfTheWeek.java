package comit;

import java.util.Scanner;

public class DayOfTheWeek {
	
	public static void evaluateDayOfTheWeekIF() {
		Scanner myScanner = new Scanner(System.in);
		String dayOfTheWeek;
		
		System.out.println("What day is today? : ");
		dayOfTheWeek = myScanner.nextLine();
		
		if((dayOfTheWeek.equals("monday")) || (dayOfTheWeek.equals("tuesday")) || (dayOfTheWeek.equals("wednesday")))
		{
			System.out.println("You have class today");
		}
		else if ((dayOfTheWeek.equals("thursday")) || (dayOfTheWeek.equals("friday")))
		{
			System.out.println("You do not have class today");
		}
		else if ((dayOfTheWeek.equals("saturday")) ||  (dayOfTheWeek.equals("sunday")))
		{
			System.out.println("It is the weekend");
		}
		else
		{
			System.out.println("Wrong data");
		}
	}
	
	public static void evaluateDayOfTheWeekSWITCH() {
		Scanner myScanner = new Scanner(System.in);
		String dayOfTheWeek;
		
		System.out.println("What day is today? : ");
		dayOfTheWeek = myScanner.nextLine();
		
		switch (dayOfTheWeek) {
		case "monday":
		case "tuesday":
		case "wednesday":
			System.out.println("You have class today");
			break;
		case "thursday":
		case "friday":
			System.out.println("You do not have class today");
			break;
		case "saturday":
		case "sunday":
			System.out.println("It is the weekend");
			break;
		default:
			System.out.println("Wrong data");
			break;
		}
	}
	
	public static void evaluateDayOfTheWeekFOR() {
		Scanner myScanner = new Scanner(System.in);
		String dayOfTheWeek;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("What day is today? : ");
			dayOfTheWeek = myScanner.nextLine();
			
			switch (dayOfTheWeek) {
			case "monday":
			case "tuesday":
			case "wednesday":
				System.out.println("You have class today");
				break;
			case "thursday":
			case "friday":
				System.out.println("You do not have class today");
				break;
			case "saturday":
			case "sunday":
				System.out.println("It is the weekend");
				break;
			default:
				System.out.println("Wrong data");
				break;
			}
		}
	}

	public static void evaluateDayOfTheWeekWHILE() {
		Scanner myScanner = new Scanner(System.in);
		String dayOfTheWeek = "";

		while (!dayOfTheWeek.contentEquals("exit")) {
			System.out.println("What day is today? : ");
			dayOfTheWeek = myScanner.nextLine();

			switch (dayOfTheWeek) {
			case "monday":
			case "tuesday":
			case "wednesday":
				System.out.println("You have class today");
				break;
			case "thursday":
			case "friday":
				System.out.println("You do not have class today");
				break;
			case "saturday":
			case "sunday":
				System.out.println("It is the weekend");
				break;
			case "exit":
				System.out.println("Thanks for using the application");
				break;
			default:
				System.out.println("Wrong data");
				break;
			}
		}
	}

}
