import java.util.Scanner;

public class Array
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[4];
        int leng = array.length;

        for(int i = 0; i < leng; ++i)
        {
            System.out.print("Enter your number: ");
            array[i] = sc.nextInt();
        }

        for(int i = 0; i < leng; ++i)
        {
            System.out.println("" + i + ": " + array[i]);
        }
    }
}
