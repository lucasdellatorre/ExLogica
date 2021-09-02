import java.util.Scanner;
/**
 * Faça um programa que leia um valor n qualquer (inteiro e positivo). 
 * O programa deve escrever o n-ésimo termo da série de Fibonacci. 
 * Os termos desse série são 1,1,2,3,5,8,13,21,... 
 * O n-ésimo termo deve ser calculado por um método recursivo.
 */
public class Ex6
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n,f1,f, aux;
        do{
            System.out.println("Informe o n-ésimo termo da sequência de Fibonacci: ");
            n = in.nextInt();
        }while(n<0);
        f = 1;
        f1 = 1;
        
        /**while(true)
        {
            aux = f;
            f = f + f1;
            f1 = aux;
            System.out.println(f);
            if(f == n) break;
        }*/
        // f1 = 1
        // f2 = 1
        // f3 = 1+1 = 2
        // f4 = 2+1 = 3
        // f5 = 2+3 = 5
        // f6 = 5+3 = 8
        // aux = f
        // f= f + fa
        // fa = aux
        //
    }
    public static int fibonacci2(int n)
    {
        if(n<=2) return 1;
        int aux;
        int f = 1;
        int f1 = 1;
        int cont = 3;
        while(cont<=n)
        {
            aux = f;
            f = f + f1;
            f1 = aux;
            System.out.println(f);
            cont++;
        }
        return f;
        
        
    }
    public static int fibonacci(int f)
    {
        int aux, fa = 1;
        if(f == 1) return 1;
        aux = f;
        f = f + fa;
        fa = aux;
        return fibonacci(f-1) + fibonacci(f-2);
        //f = fa + fibonacci(f);
         
        
        
    }
}
