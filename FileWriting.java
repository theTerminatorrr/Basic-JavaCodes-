import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

class FileWriting
{
    public static void main(String[] args) throws IOException
    {
        String location = "C:\\Users\\Walton\\Desktop\\Java\\Java Basics\\CONET.txt";
        FileWriter fr = new FileWriter(location);
        BufferedWriter br = new BufferedWriter(fr);

        String arr [] = {"Hi","Hello","How are You?","Carry on"};
        for(int i=0; i< arr.length; i++)
        {
            br.write((i+1)+": " +arr[i]+"\n");
        }

        br.write("Welcome to CONET.\n");
        br.write("Hope you are well.\n");
        br.write("Start your Journey.\n");
        br.write("Stay Blessed...\n");

        br.close();
        fr.close();
    }
}
