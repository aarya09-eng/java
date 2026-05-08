import java.util.StringJoiner;

public class p20
{
	public static void main(String args[])
	{

		StringJoiner s = new StringJoiner(",");
		s.add("hello");
		s.add("world");
		System.out.println(s.toString());
	}
}