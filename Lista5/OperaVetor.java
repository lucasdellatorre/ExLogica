
/**
 * Ex 16
 * for(int i = 0; i < vetor.length; i++)
        {
            if(vetor[i] == -1) 
            {
                vetor[i] = num; 
                return true;
            }
        }
 */
import java.util.Random;
public class OperaVetor
{
    private int[] vetor;
    
    public OperaVetor()
    {
        vetor = new int[30]; //dimensao;
    }
    public void gerador()
    {
        Random gerador = new Random();
        for(int i = 0; i < vetor.length; i++)
        {
            vetor[i] = gerador.nextInt(30);
        }
    }
    public int pesquisar(int p)
    {
        if (p < 0 ) return -1;
        return vetor[p];    
    }
    public boolean substituir(int p, int num)
    {
        if (p < 0 || num < 0) return false;
        vetor[p] = num; 
        return true;
    }
    public boolean inserir(int num)
    {
        if (num < 0) return false;
        for(int i = vetor.length-1; i >= 0; i--)
        {
            if(vetor[i] != -1) 
            {
                vetor[i+1] = num; 
                return true;
            }
        }
        return false;
    }
    public boolean remover(int num)
    {
       int indice = -1;
       for(int i = 0; i<vetor.length; i++)
       {
           if (vetor[i] == num) indice = i;
       }
       if (indice == -1) return false;
       for(int j = indice; j<vetor.length-1; j++)
       {
           vetor[j] = vetor[j+1];
       }
       vetor[vetor.length-1] = -1;
       return true;
    }
    public String toString()
    {
        String msg = "";
        for(int i = 0; i<vetor.length;i++)
        {
            msg = msg +  "\nVetor[" + i + "]: " + vetor[i];
        }
        return msg;
    }
}
