
/**
 * Write a description of class Matrizes here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.Random;
public class Matrizes
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        Random gera = new Random();
        int[][] matriz = new int[4][5];
        matriz[0][0] = 1;
        matriz[3][4] = 5;
        System.out.println("\fPrimeiro elemento: " + matriz[0][0]);
        System.out.println("Segundo elemento: " + matriz[0][1]);
        System.out.println("Ultimo elemento: " + matriz[3][4]);
        System.out.println("Escrevendo toda matriz");
        for(int lin = 0; lin < 4; lin++)
        {
            for(int col = 0; col < 5; col++)
            {
                System.out.println(matriz[lin][col] + " ");
            }
            System.out.println();
        }
        //Inicializacao
        for(int lin = 0; lin<4; lin++)
        {
            for(int col = 0; col<5; col++)
            {
                matriz[lin][col] = gera.nextInt(10);    
            }
        }
        System.out.println("Escrevendo toda matriz apos inicializacao aleatoria");
        for(int lin = 0; lin<4; lin++)
        {
            for(int col = 0; col < 5; col++)
            {
                System.out.println(matriz[lin][col] + " ");
            }
            System.out.println();
        }
        int soma = 0, cont = 0;
        for(int lin = 0; lin < 4; lin++)
        {
            for(int col = 0; col < 5; col++)
            {
                soma = soma + matriz[lin][col];
                cont++;
            }
        }
        for(int lin = 0; lin<matriz.length; lin++)
        {
            for(int col = 0; col<matriz[lin].length; col++)
            {
                soma = soma + matriz[lin][col];
                cont++;
            }
        }
        System.out.println("Soma: " + soma);
        System.out.println("Media: " + soma/(double)cont);
        //Achando o maior
        int maior = matriz[0][0];
        int linMaior = 0, colMaior = 0;
        for(int lin = 0; lin<matriz.length; lin++)
        {
            for(int col = 0; col<matriz[lin].length; col++)
            {
                if (matriz[lin][col] > maior)
                {
                    maior = matriz[lin][col];
                    linMaior = lin;
                    colMaior = col;
                }
            }
        }
        System.out.println("Maior: " + maior);
        System.out.println("Lin: " + linMaior + " Col: " + colMaior);
        //Total por linha
        for(int lin = 0; lin<matriz.length; lin++)
        {
            soma = 0;
            for(int col = 0; col<matriz[lin].length; col++)
            {
                soma = soma + matriz[lin][col];
            }
            System.out.println("Soma da linha: " + lin + ": " + soma);
        }
        //Total por coluna
        for(int col = 0; col<matriz[0].length; col++)
        {
            soma = 0;
            for(int lin = 0; lin<matriz.length; lin++)
            {
                soma = soma + matriz[lin][col];
            }
            System.out.println("Soma da col " + col + ":" + soma);
        }
    }
}
