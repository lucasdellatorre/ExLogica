import java.util.Scanner;
/**
 * Faça um programa que leia dois valores x e y quaisquer (inteiros e positivos). 
 * O programa deve escrever o produto de x por y. 
 * O produto deve ser encontrado a partir de um método recursivo. Não pode usar o operador de multiplicação.
 */
public class Ex9
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o valor de x: ");
        int x = in.nextInt();
        System.out.println("Informe o valor de y: ");
        int y = in.nextInt();
        
        System.out.println(prod(x, y));
        
    }
    public static int prod(int a, int b)
    {
         if (b == 0) return 0;
         return a + prod(a, b-1);
    }
}
