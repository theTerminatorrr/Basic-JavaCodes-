import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FileReading
{
    public static void main(String[] args) throws IOException
    {
        String location = "C:\\Users\\Walton\\Desktop\\Java\\Java Basics\\KONAMI.txt";
        FileReader fr = new FileReader(location);
        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine();
        int i = 1;

        while(line != null)
        {
            System.out.println(i + ":" +line);
            i++;
            line = br.readLine();
        }
        /* String first_line = br.readLine();
        String second_line = br.readLine();
        String third_line = br.readLine();
        String forth_line = br.readLine();

        System.out.println(first_line);
        System.out.println(second_line);
        System.out.println(third_line);
        System.out.println(forth_line); */

        fr.close();
        br.close();
    }
}
