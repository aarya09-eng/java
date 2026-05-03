import java.util.Scanner;

class p14
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        String choice;
        int num;

        System.out.println("Enter your choice:");
        System.out.println("1. Positive or Negative");
        System.out.println("2. Odd or Even");
        choice = s.next();

        System.out.print("Enter the number = ");
        num = s.nextInt();

        switch(choice)
        {
            case "1":
            case "positive":
                if(num > 0)
                    System.out.println("Number is Positive");
                else if(num < 0)
                    System.out.println("Number is Negative");
                else
                    System.out.println("Number is Zero");
                break;

            case "2":
            case "odd":
                if(num % 2 == 0)
                    System.out.println("Number is Even");
                else
                    System.out.println("Number is Odd");
             
        }
    }
}