import java.util.Scanner;
/**
 * Faça um programa que leia 3 valores e determine o maior deles. Use um
método para encontrar o maior valor.
 */
public class Ex2
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe 3 valores");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        
        System.out.println(omaior(n1, n2, n3));
    }

    private static double omaior(int v1, int v2, int v3)
    {
        int maior = Integer.MIN_VALUE;;
        
        if(v1>maior) maior = v1;      
        if(v2>v1) maior = v2;
        if(v3>v2) maior = v3;
            
        return maior;
    }
}
