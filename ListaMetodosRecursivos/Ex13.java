    import java.util.Scanner;
/**
 * Faça um programa que leia uma string e substitua as vogais acentuadas pela vogais correspondentes sem acento. 
 * Crie um método recursivo para fazer essa substituição. Para simplificar sua implementação 
 * considere apenas o acento agudo. Exemplo: "ótimo" deve se tornar "otimo".
 */
public class Ex13
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe uma String: ");
        String frase = in.nextLine();
        System.out.println(ValidacaoVogais(frase));
        
        
    }
    public static String ValidacaoVogais(String frase)
    {
        frase = frase.toLowerCase();
        return Vogais(frase, frase.length()-1);
    }
    public static String Vogais(String frase, int i)
    {
        if (i<0) return "";
        if (frase.charAt(i) == 'á') return  Vogais(frase, i-1) + 'a'  ;
        else 
            if (frase.charAt(i) == 'é') return Vogais(frase, i-1) + 'e' ;
            else 
                if (frase.charAt(i) == 'í') return Vogais(frase, i-1) + 'i' ;
                else
                    if (frase.charAt(i) == 'ó') return Vogais(frase, i-1) + 'o';
                    else
                        if (frase.charAt(i) == 'ú') return Vogais(frase, i-1) + 'u' ;
        return Vogais(frase, i-1) + frase.charAt(i) ;
        
    }
}
