import java.util.Scanner;

public class WhileLoop
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Value of N : ");
        int n = scanner.nextInt();

        for(int x = 1; x <= n; ++x)
        {
            System.out.println("" + x + ".Good To See You Honey!");
        }
    }
}
