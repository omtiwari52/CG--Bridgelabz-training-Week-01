import java.time.ZoneId;
import java.time.ZonedDateTime;
public class ZoneDateTime {
    public static void main(String[] args) {
        // Get the current date and time in different time zones
        ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime ist = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime pst = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
    
        // Print the current date and time in different time zones
        System.out.println("Current time in GMT: " + gmt);
        System.out.println("Current time in IST: " + ist);
        System.out.println("Current time in PST: " + pst);
    }
    
}
