public class MyCalculator
{
    public static void main(String[] args)
    {
        MyCalculator c1 = new MyCalculator();
        System.out.println(c1.add(4, 5));
        System.out.println(c1.add(4, 5, 11));
    }

    public int add (int n1, int n2)
    {
        System.out.println("2 int ");
        return n1+n2;
    }
    public int add (int n1, int n2, int n3)
    {
        System.out.println("3 int ");
        return n1+n2+n3;
    }
}
