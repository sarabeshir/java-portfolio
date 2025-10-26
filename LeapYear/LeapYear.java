//This program first prompts the user to enter a year as an int value and checks if it is a leap year. 
import java.util.Scanner; 

public class LeapYear {
   public static void main(String[] args) {
      // Create a Scanner
      Scanner input = new Scanner(System.in);
    
      // Use enters the year
      System.out.print("Enter a year, like 1989: ");
      int year = input.nextInt();

      // Determine if the year is a leap year
      boolean isLeapYear;
      
      isLeapYear = (year % 4 == 0) && !(year % 100 == 0) || (year % 400 == 0);
      
      
      // Display the result in a message dialog box
      System.out.println(year + " is a leap year? " + isLeapYear);   
  } 
}