package w23assignment2;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
/**
   Part I: Implement a class Clock whose getHours, getMinutes and
   getTime methods return the current time at your location.
   Return the time as a string.

   Here is how to retrieve the current time as a String:
    With Java 8, you can use 3 classes in the java.time package:
      Instant, LocalDateTime and ZoneId. Here's how you do it:
      String timeString = LocalDateTime.ofInstant(Instant.now(),
                              ZoneId.systemDefault()).toString()

   you'll need to extract the hours and minutes as a substring.
*/
public class Clock
{
   // Your work goes here
   . . .











}
