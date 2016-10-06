// Peter Breissinger
// Period C
// Lab08st.java
// The "Palindrome" Program

import java.util.Scanner;

public class Lab08st
{
    public static void main (String args[])
    {
        System.out.println("\nLab08v80\n");
      Scanner input = new Scanner(System.in);
        boolean notFinished = false;
        do
        {
            System.out.print("Enter a string  ===>>  ");
            String str = input.nextLine();
            System.out.println();
            System.out.println("Entered String:     " + str);
            System.out.println("Palindrome:         " + Palindrome.isPal(str));
            System.out.println("Almost Palindrome:  " + Palindrome.almostPal(str));   // used only for the 100 point version
            System.out.print("Do you wish to repeat this program [Y/N]?  ===>>  ");
            String repeat = input.nextLine();
            notFinished = (repeat.equals("Y")) || (repeat.equals("y"));
            System.out.println();
        }
        while (notFinished);
    }
}

class Palindrome
{
    static boolean isPal;
    public static boolean isPal(String s)
    {
      String reverse = new StringBuffer(s).reverse().toString();
      
      if (reverse.equalsIgnoreCase(s))
         return true;
      else
         return false;
    }  
     
    static boolean isLetter;
    private static boolean isLetter(String letter)
    {
      String s = " ", purge;
      String substr = " ", regex = "0123456789";
      purge = s.replaceAll(regex, substr);
      if (purge.equalsIgnoreCase(s))
        return true;
      else
        return false;
    }
    
    static String purge;
    public static String purge(String s)
    {
      s = s.replaceAll("[^a-zA-Z]", "");
      return s;
    }
    
    public static boolean almostPal(String s)
    {
        String opposite = new StringBuffer(s).reverse().toString();
         
        if (s.equalsIgnoreCase(opposite))
         { 
             return false;
         }
        
        s = purge(s);
        opposite = purge(opposite);
         
        if(s.equalsIgnoreCase(opposite))
         {
             return true;
         }
    
        return false;
    }

}