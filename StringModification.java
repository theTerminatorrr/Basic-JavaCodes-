import java.util.Scanner;

public class StringModification
{
    public static String function_name(String sen, int pos)
    {
        String first_str = "" + sen.charAt(0);
        String last_str = "";

        for(int index = 0; index < sen.length(); ++index) {
            if (index % pos != 0) {
                first_str = first_str + sen.charAt(index);
            } else {
                last_str = last_str + sen.charAt(index);
            }
        }

        String add = first_str + last_str;
        return add;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter your String : ");
        String sentence = sc.nextLine();

        System.out.print("Enter the Position : ");
        int position = sc.nextInt();

        System.out.println(function_name(sentence, position));
    }
}
