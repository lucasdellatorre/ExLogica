import java.util.Scanner;
/**
 * Faça um programa que leia uma string e a escreva na ordem inversa. Crie
um método que recebe a string como parâmetro e a devolve invertida.
 */
public class Ex34
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("\fInforme uma frase: ");
        String f = in.nextLine();
        System.out.println(inverteStr(f));
    }
    
    /** public static String inv(String x)
    {
        String frase, soma = "";
        int cont = 0;
        int nc = x.length(); //nc = número de caracteres
        int acumulador = 1;
        
        
        while(cont<nc)
        {
            frase = Character.toString(x.charAt(nc - acumulador));
            soma = soma + frase;
            acumulador++;
            cont++;
        }
        return soma;
    }*/
     public static String inverteStr(String palavras){
        String strInvertida = "";
        for(int i = palavras.length() - 1; i >= 0 ; i--){
            strInvertida += palavras.charAt(i);
        }
        return strInvertida;
    }
}
