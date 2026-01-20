import java.util.Scanner;

public class DoWhileLoop
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();
        int x = 1;

        do
        {
            System.out.println("" + x + ".Hello Object Oriented Programming.");
            ++x;
        }
        while(x <= n);
    }
}
