import java.util.Scanner;
/**
 * Faça um programa que leia a altura e o sexo de uma pessoa (1 para
masculino e 2 para feminino), calcule e escreva o seu peso ideal, utilizando
as fórmulas abaixo. Implemente um método para calcular o peso ideal.
• para homens: (72.7 × altura) − 58
• para mulheres: (62.1 × altura) − 44.7
 */
public class Ex10
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        double a;
        int s;
        
        do{
            System.out.println("Informe a sua altura: ");
            a = in.nextDouble();
            System.out.println("Informe seu sexo (1 - masculino, 2 - feminino): ");
            s = in.nextInt();
        }while(a < 0 || (s != 1 && s != 2)); 
        
        if(s == 1) System.out.println("Peso ideal: " + pesom(a));
        else System.out.println("Peso ideal: " + pesow(a));
        
    }
    public static double pesom(double x)
    {
        double p = (72.7 * x) - 58;
        return p;
    }
    public static double pesow(double x)
    {
        double p = (62.1 * x) - 44.7;
        return p;
        
    }
}
