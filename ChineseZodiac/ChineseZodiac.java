//This program prompts the user to enter a year and displays the animal for the year.
import java.util.Scanner;

public class ChineseZodiac {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a year, like 2010: ");
    int year = input.nextInt();
    
    // Use a switch structure to display the animal name for the year. 
    // Animal order: Monkey, rooster, dog, pig, rat, ox, tiger, rabbit, dragon, snake, horse, sheep.  
    switch ( year % 12 ) {
      case 0: System.out.printf("The year %d is a monkey year .\n", year); break; 
      case 1: System.out.printf("The year %d is a rooster year .\n", year); break; 
      case 2: System.out.printf("The year %d is a dog year .\n", year); break; 
      case 3: System.out.printf("The year %d is a pig year .\n", year); break; 
      case 4: System.out.printf("The year %d is a rat year .\n", year); break; 
      case 5: System.out.printf("The year %d is a ox year .\n", year); break; 
      case 6: System.out.printf("The year %d is a tiger year .\n", year); break; 
      case 7: System.out.printf("The year %d is a rabbit year .\n", year); break; 
      case 8: System.out.printf("The year %d is a dragon year .\n", year); break; 
      case 9: System.out.printf("The year %d is a snake year .\n", year); break; 
      case 10: System.out.printf("The year %d is a horse year .\n", year); break; 
      case 11: System.out.printf("The year %d is a sheep year .\n", year);
    }
    
  }
}