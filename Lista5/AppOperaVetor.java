/**
 * Write a description of class AppEx18 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.Arrays;
public class AppOperaVetor
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        OperaVetor vetor = new OperaVetor();
        int op = -1;
        vetor.gerador();
        System.out.println("\f");
        do{
            System.out.println("0 - Encerrar programa");
            System.out.println("1 - Remover");
            System.out.println("2 - Inserir");
            System.out.println("3 - Substituir");
            System.out.println("4 - Informar posicao");
            System.out.println("5 - Exibir");
            op = in.nextInt();
            switch(op)
            {
                case 0: 
                    System.out.println("Fim do programa");
                    break;
                case 1:
                    System.out.println("Informe o valor para ser removido: ");
                    int n = in.nextInt();
                    if (vetor.remover(n)) System.out.println("Valor excluido com sucesso"); 
                    else System.out.println("Valor invalido");
                    System.out.println(vetor.toString());
                    break;
                case 2:
                    System.out.println("Informe o valor para ser inserido: ");
                    n = in.nextInt();
                    if(vetor.inserir(n)) System.out.println("Valor inserido com sucesso");
                    else System.out.println("valor invalido");
                    System.out.println(vetor.toString());
                    break;
                case 3:
                    System.out.println("Informe a posicao a ser subsituida");
                    int p = in.nextInt();
                    System.out.println("Informe o valor a ser inserido na posicao");
                    n = in.nextInt();
                    if (vetor.substituir(p, n)) System.out.println("Substituido com sucesso");
                    else System.out.println("Erro na substituicao");
                    System.out.println(vetor.toString());
                    break;
                case 4:
                    
                    System.out.println("Informe a posicao a ser pesquisada");
                    p = in.nextInt();
                    if (vetor.pesquisar(p) != -1) System.out.println(vetor.pesquisar(p));
                    else System.out.println("Falha ao pesquisar");
                    break;
                case 5:
                    System.out.println(vetor.toString());
                    break;
            }
        }while(op!=0);
    }
}