import java.util.*;
import java.text.*;


public class DateDemo2 {


   public static void main(String args[]) {
      Date dNow = new Date( );
      SimpleDateFormat ft = new SimpleDateFormat ("yyyy.MMM.dd 'at' hh:mm");


      System.out.println("Current Date: " + ft.format(dNow));
   }
}
