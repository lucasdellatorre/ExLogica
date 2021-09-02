
/**
 * Write a description of class Ex3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ex3
{
    private int[] vetor;
    public Ex3()
    {
        
    }
    public void inicializar(int a, int b)
    {
        int aux;
        if (a>b)
        {
            aux = a;
            a = b;
            b = aux;
        }
        
        int limite = (b-a)/2;
        vetor = new int[limite];
        int k = 0;
        for(int i = a; i<vetor.length*2; i++) // nao pode estar incluso o a nem o b
        {
            if (i%2==0) 
            {
                vetor[k] = i;  
                k++;
            }  
        }
        
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
