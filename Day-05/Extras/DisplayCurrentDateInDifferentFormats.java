import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DisplayCurrentDateInDifferentFormats {
    public static void main(String[] args) {

        // Get the current date and time
        LocalDateTime currentDate = LocalDateTime.now();

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        System.out.println("Current Date in dd/MM/yyyy format: " + formatter1.format(currentDate));
        System.out.println("Current Date in yyyy-MM-dd format: " + formatter2.format(currentDate));
        System.out.println("Current Date in EEE, MMM dd, yyyy format: " + formatter3.format(currentDate));
    }
}
