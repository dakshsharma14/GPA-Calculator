import java.util.Scanner;
/**
 * Description: Grade Point Average Calculator
 *
 * @see Main
 */

public class Main {
    /**
     * The main class will help me calculate my GPA. We used do while loop, to get
     * user input until they say no more class to add. Also use of try statement will help
     * to catch an error and the catch statement will again prompt the question to the user.
     * In the end of the program, the console will show the total Hours and total point achieved
     * by an individual.
     *
     * @param args a ray of string that fetch data from the terminal
     */

    //Initialising the scanner
    private static Scanner inputUser = new Scanner(System.in);

    public static void main(String[] args) {

        double totalPoints = 0;
        double totalHours = 0;

        boolean moreClasses = false;

        do {

            Integer hours = 0;
            boolean validHours = true;
            do {
                validHours = true;
                //get input from the user
                System.out.println("Enter number of hours: ");
                String hoursString = inputUser.nextLine();


                //here the parseInt is converting the String of credit to the
                //int value.
                try {
                    hours = Integer.parseInt(hoursString);
                } catch (NumberFormatException nfe) {
                    System.out.println("Please enter a valid integer");
                    validHours = false;
                }
            } while (validHours == false);


            boolean validGrade = true;
            String grade = "";

            double gradeValue = 0;
            do {
                validGrade = true;

                System.out.println("Enter the grade: ");
                grade = inputUser.nextLine();

                if (grade.equalsIgnoreCase("A+")) {
                    gradeValue = 4;
                } else if (grade.equalsIgnoreCase("A")) {
                    gradeValue = 3.8;
                } else if (grade.equalsIgnoreCase("A-")) {
                    gradeValue = 3.6;
                } else if (grade.equalsIgnoreCase("B+")) {
                    gradeValue = 3.3;
                } else if (grade.equalsIgnoreCase("B")) {
                    gradeValue = 3.0;
                } else if (grade.equalsIgnoreCase("B-")) {
                    gradeValue = 2.7;
                } else if (grade.equalsIgnoreCase("C+")) {
                    gradeValue = 2.3;
                } else if (grade.equalsIgnoreCase("C")) {
                    gradeValue = 2.0;
                } else if (grade.equalsIgnoreCase("C-")) {
                    gradeValue = 1.7;
                } else if (grade.equalsIgnoreCase("D+")) {
                    gradeValue = 1.4;
                } else if (grade.equalsIgnoreCase("D")) {
                    gradeValue = 1.2;
                } else if (grade.equalsIgnoreCase("D-")) {
                    gradeValue = 1.0;
                } else if (grade.equalsIgnoreCase("F")) {
                    gradeValue = 0;
                } else {
                    System.out.println("You didn't enter valid grade :(");
                    validGrade = false;
                }
            }
            while (!validHours);
            double points = gradeValue * hours;

            totalPoints += points;
            totalHours += hours;

            System.out.println("Would you like to enter another class (Y/N): ");
            String moreClassesString = inputUser.nextLine();

            moreClasses = moreClassesString.equalsIgnoreCase("Y");
        }
        while (moreClasses);

        double gpa = totalPoints / totalHours;

        System.out.println("Credit: " + totalHours);
        System.out.println("Points: " + totalPoints);
        System.out.printf("GPA: %.2f %n", gpa);

    }
}