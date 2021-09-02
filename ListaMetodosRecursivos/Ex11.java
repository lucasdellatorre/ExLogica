import java.util.Scanner;
/**
 * Escreva um programa que lê um valor n inteiro e positivo, calcula e exibe a seguinte soma: S = 1 + 2/3 + 3/5 + 4/7... 
 * O cálculo de S deve ser feito por meio de um método recursivo.
 */
public class Ex11
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("\fInforme o valor de n: ");
        double n = in.nextDouble();
        System.out.println("Soma recursiva: " + somaRecursiva(n));
        System.out.println("Soma Iterativa: " + somaIterativa(n));
    }
    public static double somaIterativa(double x)
    {
        int cont;
        double denominador, resultado = 0;
        for(cont = 1, denominador = 1; cont<=x;denominador+=2, cont++)
        {
            resultado = resultado + cont/denominador;
        }
        return resultado;
    }
    public static double somaRecursiva(double x)
    {
        if (x<=1) return 1;
        return x/(x+x-1) + somaRecursiva(x-1);
    }
}
