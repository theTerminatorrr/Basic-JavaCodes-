import java.util.Scanner;

public class Input
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Your entered Number is : " + num);
    }
}
