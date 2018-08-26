import java.util.Scanner;
import java.util.Scanner;
class Print
{
    public void print()
    {
        System.out.println("NULL argument");
    }
    public void print(int x)
    {
        System.out.println("Integer :"+ x);
    }
    public void print(float x)
    {
        System.out.println("float :"+x);
    }
}
class overloadprint
{
    public static void main(String args[])
    {
        Print a = new Print();
        Print b = new Print();
        Print c = new Print();
        a.print();
        b.print(10);
        c.print(10.5f);
    }
}