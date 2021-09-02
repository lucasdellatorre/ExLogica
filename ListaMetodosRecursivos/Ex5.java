import java.util.Scanner;
/**
 * Faça um programa que leia uma string qualquer e escreve a quantidade de letras A que a mesma possui. 
 * Para isso, crie um método recursivo que receba uma string qualquer e devolve a quantidade de letras A que ela possui.
 */
public class Ex5
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe uma String: ");
        String frase = in.nextLine();
        System.out.println(ValidaFrase(frase));
    
        
    }
    public static int ValidaFrase(String frase)
    {
        frase = frase.toLowerCase();
        return QtdA(frase, frase.length()-1);
        
        
    }
    public static int QtdA(String frase, int i)
    {
        if(i<0) return 0;
        if(frase.charAt(i) == 'a') return 1 + QtdA(frase, i-1);
        return QtdA(frase, i-1);
        
        
        
    }
}

