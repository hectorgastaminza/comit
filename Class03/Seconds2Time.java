import java.util.Scanner;

public class Seconds2Time
{
   public static void main( String args[] )
   {
      Scanner input = new Scanner( System.in );

      int days;
      int hours;
      int minutes;
      int seconds;
      int time;

      final int MINUTE = 60;
      final int HOUR = 60 * MINUTE;
      final int DAY = 24 * HOUR;

      System.out.print( "Enter time in seconds: " );
      time = input.nextInt();

      days = time / DAY;

      time = time % DAY;
      hours = time / HOUR;

      time = time % HOUR;
      minutes = time / MINUTE;

      seconds = time % MINUTE;

      System.out.printf( "The time expressed in seconds is \n");
      System.out.printf( "%d days\n", days);
      System.out.printf( "%d hours\n", hours);
      System.out.printf( "%d minutes\n", minutes);
      System.out.printf( "%d seconds\n", seconds);
   }
}
