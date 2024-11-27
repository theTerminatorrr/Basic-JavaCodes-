import java.util.Scanner;

public class Index_Searching
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);

        int arr1[] = {10,200,180,50,0,189,2,99,60};
        int Search_number;
        Search_number = sc.nextInt();

        for(int i=0; i<=arr1.length; i++)
        {
            if(arr1[i] == Search_number)
            {
                System.out.println(i);
                break;
            }
        }
    }
}


