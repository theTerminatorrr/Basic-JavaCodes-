import java.util.Scanner;

public class FunctionAddNumber
{
    public static int addNumber(int num1, int num2)
    {
        int sum = num1 + num2;
        return sum;
    }

    public static int prodNumber(int num1, int num2)
    {
        int prod = num1 * num2;
        return prod;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 1st number : ");
        int number_1 = sc.nextInt();

        System.out.print("Enter the 2nd number : ");
        int number_2 = sc.nextInt();

        int result = addNumber(number_1, number_2);
        int result1 = prodNumber(number_1, number_2);

        System.out.println("The result is : " + result);
        System.out.println("The result is : " + result1);
    }
}
