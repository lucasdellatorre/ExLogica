import java.util.Scanner;
/**
 * Faça um programa que leia um número inteiro de 4 dígitos e o escreva
invertido. Exemplo: 1234 -> 4321 . A inversão do valor deve ser feita por
um método. Só podem ser usados valores inteiros. O valor de entrada não
pode ser lido digito a dígito.
 */
public class Ex8
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n;
        do{
            System.out.println("Informe um número inteiro de 4 digítos: ");
            n = in.nextInt();
        }while(n<0);
        
        System.out.println(n + " --> " + inv(n));
    }
    public static String inv(int x)
    {
        String s, f, nd1, nd2, nd3, nd4;
        char d1, d2, d3, d4;
        s = Integer.toString(x);
        d1 = s.charAt(0);
        d2 = s.charAt(1);
        d3 = s.charAt(2);
        d4 = s.charAt(3);
        nd1 = Character.toString(d1);
        nd2 = Character.toString(d2);
        nd3 = Character.toString(d3);
        nd4 = Character.toString(d4);
        
        f = nd4 + nd3 + nd2 + nd1;
        
        return f;
        
        
        
        
        
    }
}
