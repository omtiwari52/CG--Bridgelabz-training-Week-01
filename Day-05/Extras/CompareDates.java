import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
public class CompareDates {
    
    //method to compare dates
    public static void compareDates(LocalDate date1, LocalDate date2) {
        if (date1.isBefore(date2)) {
            System.out.println(date1 + " is before " + date2);
        } else if (date1.isAfter(date2)) {
            System.out.println(date1 + " is after " + date2);
        } else {
            System.out.println(date1 + " is equal to " + date2);
        }
    }
    public static void main(String[] args) {

        //create an instance of Scanner class
        Scanner input = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        boolean validInput = false;
        LocalDate date1 = null;
        LocalDate date2 = null;

        while (!validInput) {
            try {
                // Prompt user to enter the first date
                System.out.print("Enter the first date (dd-MM-yyyy): ");
                String inputDate1 = input.nextLine();
                date1 = LocalDate.parse(inputDate1, formatter);

                // Prompt user to enter the second date
                System.out.print("Enter the second date (dd-MM-yyyy): ");
                String inputDate2 = input.nextLine();
                date2 = LocalDate.parse(inputDate2, formatter);

                validInput = true;
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date format. Please enter dates in the format dd-MM-yyyy.");
            }
        }
        //call the method to compare the dates
        compareDates(date1, date2);

        //close scanner
        input.close();
       
    }
}
