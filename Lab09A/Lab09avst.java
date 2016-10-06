//Peter Breissinger
//Period C
// Lab09avst.java 
// The Rational Class Program I 

import java.util.Scanner;

public class Lab09avst 
{
    private static int num, den;   // numerator and denominator of the rational number
    
    public static void main (String[] args) 
    {
       enterData(); 
       Rational r = new Rational(num,den); 
       r.displayData();
    }

    public static void enterData() 
    {
        Scanner input = new Scanner(System.in); 
        System.out.print("\nEnter the numerator ----> "); 
        num = input.nextInt(); 
        System.out.print("\nEnter the denominator --> "); 
        den = input.nextInt();
    }
}

class Rational
{
     private int reduceNum, reduceDen, gcf, firstNum, firstDen;
     public Rational (int n, int d)
     {
        firstDen = d;
        firstNum = n;       
     }
  
     public String getOriginal()
     {
        double num = firstNum;
        double denom = firstDen;
        String original = String.format(num + "/" + denom);
        return original;
     }
    
     public void displayData() 
     { 
         System.out.println();
         System.out.println(getOriginal() +" equals " + getDecimal());
         System.out.println();
         System.out.println ("and reduces to " + getReduced());
         System.out.println();
     }
     
     public double getNum()
     {
         return firstNum;
     }
     
     public double getDen()
     {
         return firstDen;
     }
     
     public double getDecimal()
     {
         double d = firstNum;
         double answer = d / firstDen;
         return answer;
     }
     
     public String getReduced ()
     {
         double gcf = getGCF(firstNum, firstDen);
         double reduceNum = (firstNum/gcf);
         double reduceDem = (firstDen/gcf);
         String simple = new String (reduceNum + " / " + reduceDem);
         return simple;
     }
     
     public int getGCF(int n1,int n2) 
     {
        int rem = 0; 
        do 
        {
           rem = n1 % n2; 
           if (rem == 0) 
               gcf = n2; 
           else 
           { 
               n1 = n2; 
               n2 = rem; 
           }
        }
        while (rem != 0);
        return gcf;
     }
}


