import java.util.Scanner;
/**
 * Write a description of class Ex8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ex8
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o valor de x: ");
        int x = in.nextInt();
        System.out.println("Informe o valor de y: ");
        int y = in.nextInt();
        System.out.println(pow(x,y));
        //2^2 = 2^1 * 2
        //2^3 = 2^2 * 2
        //2^3 = 2^3 * 2
        //a^b = a^(b-1) * a
    }
    public static int pow(int a, int b)
    {
        if (b == 0) return 1;
        return a*pow(a, b-1);
    }
}
