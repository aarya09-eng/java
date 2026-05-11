import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegexMatches {


   public static void main( String args[] ) {
      // String to be scanned to find the pattern.
      String line = "This order was placed for QT3000! OK? 9922565938";
      String p = "\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d";


      // Create a Pattern object
      Pattern r = Pattern.compile(p);


      // Now create matcher object.
      Matcher m = r.matcher(line);
      if (m.find( )) {
         System.out.println("Found value: " + m.group(0) );

      }else {
         System.out.println("NO MATCH");
      }
   }
}
