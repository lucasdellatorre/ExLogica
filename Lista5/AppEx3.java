import java.util.Scanner;
import java.util.Arrays;
public class AppEx3
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int op = -1;
        Ex3 ex = new Ex3();
        System.out.println("Informe 'a': ");
        int a = in.nextInt();
        System.out.println("Informe 'b': ");
        int b = in.nextInt();
        ex.inicializar(a,b);
        System.out.println(ex.toString());
    }
}