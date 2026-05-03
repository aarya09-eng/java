import java.util.Scanner;

class p13
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        String stream;

        System.out.print("Enter the stream = ");
        stream = s.next();

        switch(stream)
        {
            case "science":
                System.out.println("Subjects:");
                System.out.println("1. Maths");
                System.out.println("2. Physics");
                System.out.println("3. Chemistry");
                System.out.println("4. Biology");
                break;

            case "commerce":
                System.out.println("Subjects:");
                System.out.println("1. Accounts");
                System.out.println("2. Economics");
                System.out.println("3. Business Studies");
                System.out.println("4. Mathematics");
                break;

            case "arts":
                System.out.println("Subjects:");
                System.out.println("1. English");
                System.out.println("2. Hindi");
                System.out.println("3. History");
                System.out.println("4. Geography");
                break;

            default:
                System.out.println("Invalid Stream");
        }
    }
}