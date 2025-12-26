import java.time.ZonedDateTime;
import java.time.ZoneId;

public class TimeZone{
    public static void main(String[]args) {
    
       ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));
       System.out.println("Current Time in Gmt: "  + gmtTime);

       ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of ("Asia/Kolkata"));
       System.out.println("Current Time in ist: " + istTime);

       ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of ("America/Los_Angeles"));
       System.out.println("Current Time in pst: " + pstTime);
   }
}
