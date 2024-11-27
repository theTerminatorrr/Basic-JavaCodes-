public class StringUpperCaseShifting
{
    public static void main(String[] args)
    {
        String word = "CoMpUtEr sCiEncE aNd EnGiNeEriNG.";
        String new_word = "";
        int leng = word.length();

        for(int index = 0; index < leng; ++index)
        {
            char ch = word.charAt(index);
            int convert = ch;
            if (convert >= 'a' && convert <= 'z')
            {
                int ascii = convert - 32;
                new_word = new_word + (char)ascii;
            }
            else
            {
                new_word = new_word + ch;
            }
        }

        System.out.println(new_word);
    }
}
