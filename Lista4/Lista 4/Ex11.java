import java.util.Scanner;
/**
 * Um banco concederá um crédito especial aos seus clientes, variável com
o saldo médio no último ano. Faça um programa que leia o saldo médio
de um cliente e calcule o valor do crédito de acordo com a tabela abaixo.
Mostre uma mensagem informando o saldo médio e o valor do crédito.
Implemente um método para calcular o valor do crédito.
 */
public class Ex11
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);   
        double s;
        System.out.println("\fInforme o saldo médio: ");
        s = in.nextDouble();
        System.out.println("Seu saldo médio é: " + s + " e " + "\nSeu valor de crédito é: " + credito(s));
    }
    public static double credito(double x)
    {
        double c;
        if(x<=500) c = x;
        else 
            if(x<=1500) c = x * 0.10;
            else
                if(x<=2500) c = x * 0.15;
                else
                    if(x<=4000) c = x * 0.20;
                    else c = x * 0.25;
        return c;
    }
}
