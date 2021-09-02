
/**
 * Write a description of class Ex2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Ex2
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n;
        do{
            System.out.println("Informe um número inteiro e não negativo: ");
            n = in.nextInt();
        }while(n<0);
        System.out.println("Somatório: " + somatorio(n));
    }
    public static int somatorio(int x)
    {
         //if(x==1) return 1;
         if(x==0) return 0;
         return x + somatorio(x-1);   
    }
}
