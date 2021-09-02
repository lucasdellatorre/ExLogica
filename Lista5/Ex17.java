
/**
 * Write a description of class Ex17 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ex17
{
    private int[] vetor;
    public Ex17()
    {
        vetor = new int[20];
    }
    public void bubble()
    {
        int aux = 0;
        for(int i = 0; i<vetor.length-1; i++)
        {
            for(int k = 0; k<vetor.length-1-i; k++)
            {
                if (vetor[k] > vetor [k+1])
                {
                    aux = vetor[k];
                    vetor[k] = vetor[k+1];
                    vetor [k+1] = aux;
                }
            }
        }
    }
}
