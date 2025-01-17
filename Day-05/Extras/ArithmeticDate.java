import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
public class ArithmeticDate {
    public static void main(String[] args) {

        //create an instance of Scanner class
        Scanner input = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.println("Enter a date (yyyy-MM-dd): ");
        String userInput = input.nextLine();

        try {
            LocalDate date = LocalDate.parse(userInput, formatter);
            LocalDate result = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);

            System.out.println("Result: " + result.format(formatter));
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format. Please use yyyy-MM-dd.");
        }

        //close scanner
        input.close();
    }
}