import java.util.Scanner;

public class Break
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String name = sc.nextLine();
        int counter = 0;

        for(int count = 1; count <= 3; ++count)
        {
            System.out.print("Enter your Password : ");
            int password = sc.nextInt();
            if (password == 57355)
            {
                System.out.println("Welcome " + name + "!!! Carry on...");
                break;
            }

            ++counter;
            System.out.println("Wrong Password!!! Tried " + counter + " Times...");
        }
    }
}

