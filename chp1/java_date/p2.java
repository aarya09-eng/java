import java.util.*;
import java.text.*;

class p2
{
	public static void main()
	{
		Date dnow = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

		System.out.println("Current date = "+ ft.format(dnow));
	}
}