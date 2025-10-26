import java.util.Calendar;

public class EmployeeInfoPractice {
    // Instance variables
    private String idE;
    private String nameEMP;
    private String phoneEMP;
    private String positionEMP;
    private int clockInHour;
    private int clockInMinute;
    private int clockOutHour;
    private int clockOutMinute;
    private boolean isWorking;
    private int totalBreakMinutes;

    // Constructors
    public EmployeeInfoPractice() {
    }

    public EmployeeInfoPractice(String id, String nameE, String phoneE, String positionE) {
        idE = id;
        nameEMP = nameE;
        phoneEMP = phoneE;
        positionEMP = positionE;
        isWorking = false;
        totalBreakMinutes = 0;
    }

    // Set Methods
    public void setClockIn(int hour, int minute) {
        clockInHour = hour;
        clockInMinute = minute;
        isWorking = true;
    }

    public void setClockOut(int hour, int minute) {
        clockOutHour = hour;
        clockOutMinute = minute;
        isWorking = false;
    }

    public void addBreakTime(int minutes) {
        totalBreakMinutes += minutes;
    }

    // Get Methods
    public String getID() {
        return idE;
    }

    public String getName() {
        return nameEMP;
    }

    public boolean isWorking() {
        return isWorking;
    }

    // Calculate total worked minutes
    public int calculateWorkedMinutes() {
        int clockInMinutes = clockInHour * 60 + clockInMinute;
        int clockOutMinutes = clockOutHour * 60 + clockOutMinute;
        return clockOutMinutes - clockInMinutes - totalBreakMinutes;
    }

    // Display method
    public void displayMessage() {
        System.out.printf("Thank you for using our time tracking system. See you soon %s.%n", nameEMP);
    }
}
