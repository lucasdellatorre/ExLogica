
/**
 * Write a description of class Ex18 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Random;
public class Ex18
{
    private int[] a;
    private int[] b;
    public Ex18(int dimensao)
    {
        if (dimensao<20) dimensao = 20;
        a = new int[dimensao];
        b = new int[dimensao];
    }
    public void gerador()
    {
        Random gerador = new Random();
        for(int i = 0; i<a.length; i++)
        {
            a[i] = gerador.nextInt(51);
            b[i] = gerador.nextInt(51);
        }
    }
    public int[] uniao()
    {
        int[] uniao = new int[a.length*2];
        for(int i =0, j = uniao.length-1; i<uniao.length/2; i++, j--)
        {
            uniao[i] = a[i];
            uniao[j] = b[i];
        }
        return uniao;
    }
    public int[] interseccao()
    {
        int cont = 0, j = 0;
        for(int i = 0; i<a.length; i++)
        {
            if (a[i] == b[i])
            {
                cont++;
            }
        }
        int[] inter = new int[cont];
        for(int i = 0; i<a.length; i++)
        {
            if (a[i] == b[i])
            {
                inter[j] = a[i];
                j++;
            }
        }
        return inter;
    }
    public int[] diferenca()
    {
        int j = 0;
        int cont = 0;
        for(int i = 0; i<a.length; i++)
        {
            if (a[i] != b[i]) 
            {
                j++;
            }
        }
        int[] dif = new int[j];
        for(int i = 0; i<a.length; i++)
        {
            if (a[i] != b[i]) 
            {
                dif[cont] = a[i];
                cont++;
            }
        }
        return dif;
    }
    public String toString()
    {
        String msg = "";
        for(int i = 0; i<a.length;i++)
        {
            msg = msg + 
            "\nvalor " + (i+1) + " de a: " + a[i] + 
            "\nvalor " + (i+1) + " de b: " + b[i];
        }
        return msg;
    }
}
