import java.util.Scanner;

class p11
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        int a[] = new int[5];
        int i;

        System.out.print("Enter array elements: ");

        for(i = 0; i < 5; i++)
        {
            a[i] = s.nextInt();
        }

        // print number and its square
        for(i = 0; i < 5; i++)
        {
            System.out.print(a[i] + " " + (a[i]*a[i]) + " ");
        }
    }
}