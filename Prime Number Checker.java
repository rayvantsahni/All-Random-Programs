/*
The programs check whether a certain number is prime or not!
The program return 'true' if it is a Prime,
And 'false' if it is NOT a Prime
Its complexity is O(sqrt(n)/2)
*/

import java.util.Scanner;
import java.lang.Math;

public class Main
{
    static boolean prime;

    public static boolean isPrime(int n)
    {
        if (n == 1) return !prime;

        else if (n == 2) return prime;

        else if (n % 2 == 0) return !prime;

        else
        {
            for (int i = 3; i <= Math.sqrt(n); i += 2)
            {
                if (n % i == 0) return !prime;
            }
            return prime;
        }
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        prime = true;

        System.out.println("Enter the number");
        int N = scan.nextInt();

        System.out.println(isPrime(N));
    }
}
