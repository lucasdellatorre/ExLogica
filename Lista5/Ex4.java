
/**
 * 
 */
import java.util.Scanner;
public class Ex4
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        double soma = 0;
        System.out.println("Informe n: ");
        int n = in.nextInt();
        double[] vetor = new double[n];
        for(int i = 0, j = 1, k= 1; i < vetor.length; i++, j+=3, k+=2)
        {
            vetor[i] = (double)j/k;
            soma = soma + vetor[i]; 
            System.out.println(vetor[i]);
        }
        System.out.println(soma);
    }
}
