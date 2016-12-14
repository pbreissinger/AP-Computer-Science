// Peter Breissinger 
// Period C
// Lab11avst.java
// The "Sieve of Eratosthenes" Program
// This is the student, starting version of the Lab11a assignment.


import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab11avst
{
    public static void main(String[] args)
    {
        // This main method needs additions for the 100 point version.
        Scanner input = new Scanner(System.in);
        System.out.print ("Enter the primes upper bound ===>>  ");
        final int MAX = input.nextInt ();
        boolean primes[] = new boolean[MAX];
        computePrimes(primes);
        displayPrimes(primes);
    }

    public static void computePrimes(boolean primes[])
    {
        System.out.println("\nCOMPUTING PRIME NUMBERS");
        for (int k = 2; k < primes.length; k++)
            primes[k] = true;
            
        for (int p = 2; p < primes.length; p++)
            for (int q = p * p; q < primes.length; q += p)
               primes [q] = false;
    }

    public static void displayPrimes(boolean primes[])
    {
        System.out.println("\n\nPRIMES BETWEEN 1 AND "+ primes.length);
        System.out.println();
        boolean prime = true;
        int x = 0;
        int y = 0;
        for (int number = 0; number < primes.length; number++)
        {
            if (y % 15 == 0 && prime != false)
            {
                System.out.println();
                prime = false;
            }
            
            if (primes[number] == true)
            {
                x = number;
                DecimalFormat dformat = new DecimalFormat("0000");
                String Formatted = dformat.format(x);
                System.out.print(Formatted + " ");
                y++;
                prime = true;
            }
        }
    }
}
