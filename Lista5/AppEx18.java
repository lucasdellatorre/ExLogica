
/**
 * Write a description of class AppEx18 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.Arrays;
public class AppEx18
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        Ex18 ex = new Ex18(20);
        int op = 0;
        ex.gerador();
        do{
            System.out.println("0 - Encerrar programa");
            System.out.println("1 - Exibir vetores");
            System.out.println("2 - Exibir Uniao");
            System.out.println("3 - Exibir Interseccao");
            System.out.println("4 - Exibir Diferenca");
            System.out.println("5 - Gerar novos numeros");
            op = in.nextInt();
            switch(op)
            {
                case 1:
                    System.out.println(ex.toString());
                    break;
                case 2:
                    int[] uniao = ex.uniao();
                    if (uniao == null) System.out.println("Nao ha uniao na lista");
                    else System.out.println(Arrays.toString(uniao));
                    break;
                case 3:
                    int[] inter = ex.interseccao();
                    if (inter == null) System.out.println("Nao ha interseccao na lista");
                    else System.out.println(Arrays.toString(inter));
                    break;
                case 4:
                    int[] dif = ex.diferenca();
                    if (dif == null) System.out.println("Nao ha uniao na lista");
                    else System.out.println(Arrays.toString(dif));
                    break;
                case 5:
                    ex.gerador();
                    System.out.println(ex.toString());
                    break;
            }
        }while(op!=0);
        
    }
}
