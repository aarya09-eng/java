import  java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p1
{
	public static void main(String args[])
	{
		String line = "i love programming in java and is my favaoroutie programming language 1101";
		String pattern = "\\d+";

		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(line);

		if(m.find())	
		{
			System.out.println("found value =  "+m.group(0));
		}
		else 
		{
			System.out.println("NO MATCH!");
		}
	}
}