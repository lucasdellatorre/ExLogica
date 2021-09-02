import java.util.Scanner;
/**
 * Faça um programa que leia um valor x e um valor n. O valor n deve ser inteiro e positivo. 
 * O programa deve calcular e escrever a soma dos n primeiros termos da série:  
 * S = x + x2/2 + x3/3 + ... O cálculo de S deve ser feito por um método recursivo. 
 */
public class Ex14
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        double x, n;
        do{
            System.out.println("Informe o valor de x: ");
            x = in.nextDouble();
        }while(x<0);
        do{
            System.out.println("Informe o valor de n: ");
            n = in.nextDouble();
        }while(n<0);
        System.out.println(Soma(x, n));
        
        
        
        
    }
    public static double Soma(double x, double n)
    {
        if (n==1) return x;
        return Math.pow(x, n)/n + Soma(x, n-1);
        
    }
}
