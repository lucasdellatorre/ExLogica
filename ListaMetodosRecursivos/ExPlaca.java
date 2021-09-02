import java.util.Scanner;
/**
 * Write a description of class ExPlaca here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ExPlaca
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);    
        
    }
    public static boolean validaPlaca(String placa)
    {
        if(placa.length()!=7) return false;
        for(int i = 0; i<3; i++)
        {
            if(Character.isLetter(placa.charAt(i))==false) return false;    
        }
        for(int i = 3; i<7; i++)
        {
            if(Character.isDigit(placa.charAt(i))==false) return false;    
        }
        return true;
        
    }
    public static String removeVogais(String palavra)
    {
        palavra = palavra.toLowerCase();
        String nova = "";
        for(int i= 0; i<=palavra.length(); i++)
        {
            if(palavra.charAt(i)!='a' && palavra.charAt(i)!='e' && palavra.charAt(i)!='i' && palavra.charAt(i)!='o' && palavra.charAt(i)!='u')
            {
                nova = nova + palavra.charAt(i);    
            }
        }
        return nova;        
    }
}
