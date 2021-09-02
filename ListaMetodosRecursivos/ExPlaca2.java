import java.util.Scanner;
/**
 * (AAA0A00). 

 */
public class ExPlaca2
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe a placa do carro");
        String placa = in.nextLine();
        
    }
    public static boolean Validaplaca(String placa)
    {
        int i;
        if (placa.length() != 7) return false;
        for (i = 0; i<3; i++)
        {
            if (Character.isLetter(placa.charAt(i)) == false) return false;
        }
        for (i = 3; i<4; i++)
        {
            if (Character.isDigit(placa.charAt(i)) == false) return false;
        }
        for (i=4; i<5; i++)
        {
            if (Character.isLetter(placa.charAt(i)) == false) return false;
        }
        for(i=5;i<7; i++)
        {
            if (Character.isDigit(placa.charAt(i)) == false) return false;
        }
        return true;
        
        
    }
}
