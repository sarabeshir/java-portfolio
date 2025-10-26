import java.util.Scanner;
import java.util.Calendar;

public class ClockInOutPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calendar now = Calendar.getInstance();

        // Create new objects and assign to each element of array
        EmployeeInfoPractice[] infoE = new EmployeeInfoPractice[4];

        infoE[0] = new EmployeeInfoPractice("1111", "Daniela Alcocer Rojas", "1111111111", "server");
        infoE[1] = new EmployeeInfoPractice("2222", "Tony Atiyeh", "2222222222", "server");
        infoE[2] = new EmployeeInfoPractice("3333", "Sara Beshir", "3333333333", "server");
        infoE[3] = new EmployeeInfoPractice("4444", "Lucie Li", "4444444444", "supervisor");

        // Display welcome message
        System.out.println("Welcome to the Employee Time Tracking System!");

        // Employee verification - Search function by student id number
        System.out.print("Please, enter your ID number: ");
        int rIndex = searchByid(input.nextLine(), infoE);
        if (rIndex != -1) {
            System.out.printf("Access Granted! Welcome %s.%n", infoE[rIndex].getName());
            System.out.println("Welcome to your dashboard!\n1. Clock In.\n2. Break Time.\n3. Clock Out.\n4. Report.");
            System.out.print("Please select an option (enter the number of your selection): ");
            int setOpt = input.nextInt();
            input.nextLine();  // Consume newline

            switch (setOpt) {
                case 1:
                    System.out.printf("Your Clock In time is: %tT%n", now);
                    infoE[rIndex].setClockIn(now.get(Calendar.HOUR_OF_DAY), now.get(Calendar.MINUTE));
                    System.out.println("Your work status is: " + (infoE[rIndex].isWorking() ? "ON" : "OFF"));
                    break;

                case 2:
                    System.out.print("Are you approved to request break time? (Y/N): ");
                    char answer = input.next().charAt(0);
                    if (answer == 'Y' || answer == 'y') {
                        System.out.print("Enter break time in minutes: ");
                        int breakMinutes = input.nextInt();
                        input.nextLine();  // Consume newline
                        infoE[rIndex].addBreakTime(breakMinutes);
                        System.out.printf("Your break time of %d minutes has been recorded.%n", breakMinutes);
                    } else {
                        System.out.println("Sorry, but your selection cannot be accepted.");
                    }
                    break;

                case 3:
                    if (infoE[rIndex].isWorking()) {
                        System.out.printf("Your Clock Out time is: %tT%n", now);
                        infoE[rIndex].setClockOut(now.get(Calendar.HOUR_OF_DAY), now.get(Calendar.MINUTE));
                    } else {
                        System.out.println("Sorry, but your selection cannot be accepted. Your work status is OFF.");
                    }
                    break;

                case 4:
                    System.out.printf("You have worked for %d minutes today.%n", infoE[rIndex].calculateWorkedMinutes());
                    break;

                default:
                    System.out.println("Invalid selection.");
            }

            // Display goodbye message
            infoE[rIndex].displayMessage();
        } else {
            System.out.println("Access denied. Cannot find employee.");
        }
    }

    public static int searchByid(String iD, EmployeeInfoPractice[] e) {
        for (int i = 0; i < e.length; i++) {
            if (e[i].getID().equals(iD))
                return i;
        }
        return -1;
    }
}
