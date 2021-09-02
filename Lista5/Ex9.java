
/**
 * Write a description of class Ex9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.Random;
public class Ex9
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int[] vetor = new int[20];
        Random gerador = new Random();
        int soma = 0, cont = 0;
        int maior = -1;
        String msg = "";
        for(int i = 0; i < vetor.length; i++)
        {
            vetor[i] = 2 + gerador.nextInt(10);
            soma = soma + vetor[i];
            if(vetor[i] % 2 == 0) cont++;
            if(vetor[i] > maior) maior = vetor[i]; 
            msg = msg + vetor[i] + " | ";
        }
        System.out.println(msg);
        System.out.println("Maior: " + maior);
        System.out.println("Qtd de pares: " + cont);
    }
}
