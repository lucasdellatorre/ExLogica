import java.util.Scanner;
/**
 * Crie um programa que lê o tempo atual em hora, minuto e segundo, e o
escreve em segundos quanto tempo se passou desde que o dia começou.
Essa conversão deve ser calculada por um método.
 */
public class Ex4
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int h, m, s;
        do{
            System.out.println("\fInforme a hora atual: ");
            h = in.nextInt();
            System.out.println("\fInforme o minuto atual: ");
            m = in.nextInt();
            System.out.println("\fInforme o segundo atual: ");
            s = in.nextInt();
        }while((h < 0 || h > 23)||( m < 0 || m > 59) || (s < 0 || s > 59));
        
        System.out.println("Quanto tempo do dia se passou em segundos: " + (conversaoh(24) - (conversaoh(h) + conversaom(m) + s)));
        
        
    }
    
    public static int conversaoh(int v)
    {
        int c;
        c = v *3600;
        return c;
            
    }
    
    public static int conversaom(int v)
    {
        int c;
        c = v * 60;
        return c;
            
    }
}
