import java.util.Scanner;
/**
 *Faça um programa que leia uma string e verifique se ela é palíndrome. 
 *Palíndrome são aquelas palavras podem ser lidas tanto da esquerda para direita ou da direita para esquerda. 
 *Exemplo: arara. Crie um método recursivo para verificar se a string é palíndrome.
 */
public class Ex12
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);   
        System.out.println("Informe uma String: ");
        String frase = in.nextLine();
        if (EhPalindrome(frase) == false) System.out.println("Não é palindrome");
        else System.out.println("é palindrome");
        
        
    }
    public static boolean EhPalindrome(String frase)
    {
        frase = frase.toLowerCase();
        if (frase.length() == 0) return false;
        int metade = frase.length()/2;
        return Palindrome(frase, 0, frase.length()-1);
        
        
        
    }
    private static boolean Palindrome(String frase, int i, int j)
    {
        if (i>=j) return true;
        if (frase.charAt(i)!=frase.charAt(j)) return false;
        return Palindrome(frase, i+1, j-1);
    
        
        
    }
}
