import java.util.Scanner;

public class Time2Seconds
{
   public static void main( String args[] )
   {
      Scanner input = new Scanner( System.in );

      int days;
      int hours;
      int minutes;
      int seconds;
      int time;

      System.out.print( "Enter days: " );
      days = input.nextInt();

      System.out.print( "Enter hours: " );
      hours = input.nextInt();

      System.out.print( "Enter minutes: " );
      minutes = input.nextInt();

      System.out.print( "Enter seconds: " );
      seconds = input.nextInt();

      time = seconds;
      time += minutes * 60;
      time += hours * 60 * 60;
      time += days * 60 * 60 * 24;

      System.out.printf( "The time expressed in seconds is %d\n", time);
   }
}
