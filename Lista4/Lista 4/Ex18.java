import java.util.Scanner;
/**
 * Write a description of class Ex18 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ex18
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe um nome: ");
        String nome = in.nextLine();
        System.out.print("Seu numero místico: " + numerologia(nome));
    }
    public static int numerologia(String nome)
    {
        nome.toLowerCase();
        int limite = nome.length()-1;
        int valor = 0, resultado = 0, resto;
        int soma = 0;
        for(int cont = 0;cont <= limite;cont++)
        {
                if (nome.charAt(cont) == 'a' || nome.charAt(cont) == 'j' || nome.charAt(cont) == 's')  valor = 1;  
                else 
                    if (nome.charAt(cont) == 'b' || nome.charAt(cont) == 'k' || nome.charAt(cont) == 't')  valor = 2;    
                    else
                        if (nome.charAt(cont) == 'c' || nome.charAt(cont) == 'l' || nome.charAt(cont) == 'u')  valor = 3;   
                        else
                            if (nome.charAt(cont) == 'd' || nome.charAt(cont) == 'm' || nome.charAt(cont) == 'v')  valor = 4;    
                            else
                                if (nome.charAt(cont) == 'e' || nome.charAt(cont) == 'w' || nome.charAt(cont) == 'n')  valor = 5;    
                                else
                                    if (nome.charAt(cont) == 'f' || nome.charAt(cont) == 'o' || nome.charAt(cont) == 'x')  valor = 6;    
                                    else    
                                        if (nome.charAt(cont) == 'g' || nome.charAt(cont) == 'p' || nome.charAt(cont) == 'y')  valor = 7;    
                                        else
                                            if (nome.charAt(cont) == 'h' || nome.charAt(cont) == 'q' || nome.charAt(cont) == 'z')  valor = 8;   
                                            else
                                                if (nome.charAt(cont) == 'i' || nome.charAt(cont) == 'r' )  valor = 9;  
                soma = soma + valor;
        }
        if (soma>9)
        {
            if (soma == 11 || soma == 22) return soma;
            while (soma > 0)
            {
                resto = soma % 10;
                soma = (soma - resto)/10;
                resultado = resultado + resto;
            }
            return resultado;
        }
        else return soma;
        
    }
}
