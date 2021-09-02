import java.util.Scanner;
/**
 * Faça um programa que leia um valor n qualquer (inteiro e positivo). O programa deve escrever a soma dos n  termos 1 + 1/2 + 1/3 + ... 1/n. 
 * A soma deve ser calculada por um método recursivo.
 */
public class Ex7
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe um valor n qualquer: ");
        double n = in.nextDouble();
        System.out.println(soma(n));

        
    }
    public static double soma(double x)
    {
        if (x==1) return 1;
        return 1/x + soma(x-1);
    }
}
