abstract class Book
{
	String name;
	int year;

	public Book(String bname,int byear)
	{
		name = bname;
		year = byear;
	}

	abstract void show();
}

class phbook extends Book
{
	String loc,type;
		phbook(String name,int year,String l,String t)
		{
			super(name,year);
			loc = l;
			type =  t;
		}

		void show()
		{
			System.out.println("name = "+name);
			System.out.println("year  = "+year);
			System.out.println("location  = "+loc);
			System.out.println("type = "+type);
		}
}

class novel extends Book
{
	String lang,author;
		public novel(String bname,int byear,String la,String au)
		{
			super(bname,byear);
			lang = la;
			author = au;
		}

		void show()
		{
			System.out.println("language = "+lang);
			System.out.println("author = "+author);
		}
}

class p3
{
	public static void main(String args[])
	{
		phbook p = new phbook("aarya",1989,"kpop","business");
		p.show();

		novel n = new novel("yellow",1967,"hello","fantasy");
		n.show();
		
	}
}