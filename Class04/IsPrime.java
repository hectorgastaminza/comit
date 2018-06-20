public class IsPrime
{
  public static void main(String[] args) {

        for (int i = 0; i < 30; i++) {
            if (IsPrime(i)) {
                System.out.println("The number " + i + " prime number evaluation is " + true);
            }

        }
    }

    public static boolean IsPrime(int value)
    {
        boolean retval = false;
        int divisor = 2;

        while ((divisor < value) && (value % divisor != 0))
        {
            divisor++;
        }

        if(divisor == value || value == 1)
            retval = true;

        return retval;
    }
  }
