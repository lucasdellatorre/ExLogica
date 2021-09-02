
/**
 * Write a description of class Ex14 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.Random;
public class Ex14
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        Random gerador = new Random();
        int capacidade = 20;
        int[] a = new int[capacidade];
        int[] f = new int[capacidade];
        String msg;
        for(int i = 0; i<a.length; i++)
        {
            a[i] = gerador.nextInt(8);
            f[i] = recursao(a[i]);
            a[i] = f[i];
        }
        for(int i = 0; i<a.length; i++)
        {
            System.out.println("valor de " + (i+1) + " : " + a[i]);        
        }
    }
    public static int recursao(int n)
    {
        if (n<=1) return 1;
        return n*recursao(n-1);
    }
}
