import java.util.Scanner;

public class LowerCaseCount
{
    public static int function_name(String wrd)
    {
        int leng = wrd.length();
        System.out.println("The length of String is : " + leng);
        int lower_count = 0;

        for(int index = 0; index < leng; ++index)
        {
            char ch = wrd.charAt(index);
            int convert = ch;
            if (convert >= 'a' && convert <= 'z')
            {
                ++lower_count;
            }
        }

        return lower_count;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Words : ");
        String words = sc.nextLine();

        int result = function_name(words);
        System.out.println("The amount of Lowercase Characters is : " + result);
    }
}
