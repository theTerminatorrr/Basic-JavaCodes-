import java.util.Scanner;

public class TwoDimentionalArray
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows in the array: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns in the array: ");
        int columns = scanner.nextInt();

        int[][] arr = new int[rows][columns];
        System.out.println("Enter the elements of the array (row by row):");

        int i;
        int j;
        for(i = 0; i < rows; ++i)
        {
            for(j = 0; j < columns; ++j)
            {
                System.out.print("Enter element at arr[" + i + "][" + j + "]: ");
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nThe array you entered is:");

        for(i = 0; i < rows; ++i)
        {
            for(j = 0; j < columns; ++j)
            {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }
}
