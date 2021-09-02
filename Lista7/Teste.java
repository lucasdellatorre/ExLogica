
/**
 * Write a description of class Teste here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.Random;
public class Teste
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        Random gera = new Random();
        int[][] matriz = new int[4][5];
        int[] vetor = new int[10];
        System.out.println(matriz.length);
        int k = 0;
        int temp;
        for(int lin = 0; lin<4; lin++)
        {
            for(int col = 0; col<5; col++)
            {
                matriz[lin][col] = gera.nextInt(10);    
            }
        }
        System.out.println("Ultimo elemento: " + matriz[3][4]);
         for(int lin = 0; lin<4; lin++)
        {
            for(int col = 0; col < 5; col++)
            {
                System.out.println(matriz[lin][col] + " ");
            }
            System.out.println();
        }
        
        int DAYS_IN_A_ROW = 5;
        for(int i =0; i < vetor.length; i++)
        {
            vetor[i] = gera.nextInt(20);
        }
        for(int i = 0; i < vetor.length - k - 1; i++)
        {
            for(k = 0; k < vetor.length - 1; k++)
            {
                if(vetor[i] > vetor[i+1])
                {
                    temp = vetor[i];
                    vetor[i] = vetor[i+1];
                    vetor[i+1] = temp;
                }
            }
        }
        for(int i = 0; i < vetor.length; i++)
        {
            System.out.print(vetor[i] + " ");
        }
        int r = 1;
        String s = "s";
        System.out.printf("Lucas Legal %s%s%s%s", r, s, r, s);
    }
}
