import java.util.Scanner;

public class Scan
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an Integer ");
        int num = scanner.nextInt();

        System.out.print("Enter a Decimal Number : ");
        double decimal = scanner.nextDouble();

        System.out.print("Enter a Word : ");
        String word = scanner.next();
        scanner.nextLine();

        System.out.print("Enter a Full line of Text  : ");
        String line = scanner.nextLine();

        System.out.println("You Entered Integer : " + num);
        System.out.println("Your Test output for adding Something :  " + num + " BYE " + decimal);
        System.out.println("You Entered Decimal : " + decimal);
        System.out.println("You Entered Word : " + word);
        System.out.println("You Entered Line : " + line);
    }
}
