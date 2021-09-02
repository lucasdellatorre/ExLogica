
/**
 * Write a description of class AppListaDeAlocacoes here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class AppListaDeAlocacoes
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        ListaDeLocacoes l1 = new ListaDeLocacoes(10);
        int op;
        do{
            System.out.println("0 - Encerrar o programa");
            System.out.println("1 - Cadastrar um livro");
            System.out.println("2 - Busca por codigo");
            System.out.println("3 - Busca por autor");
            System.out.println("4 - Exclui livro por cod");
            System.out.println("5 - Exibir");
            System.out.println("6 - Alterar autor");
            op = in.nextInt();
            switch(op)
            {
                case 0: System.out.println("Fim do programa!"); break;
                case 1: cadastraLivro(l1); break;
                case 2: buscaCod(l1);break;
                case 3: buscaAutor(l1);break; 
                case 4: excluiLivro(l1); break;
                case 5: System.out.println(l1.toString()); break;
                case 6: alteraAutor(l1); break;
            }
        }while(op != 0);
    }
    private static void alteraAutor(ListaDeLocacoes l1)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o nome do autor: ");
        String autor = in.nextLine();
        System.out.println("Informe o codigo da alocacao: ");
        int cod = in.nextInt();
        if(null != l1.buscaPorMatricula(cod)) l1.buscaPorMatricula(cod).setAutor(autor);
        else System.out.println("autor n existe");
    }
    private static void buscaCod(ListaDeLocacoes l1)
    {
        Scanner in = new Scanner(System.in);    
        System.out.println("Informe o cod");
        int cod = in.nextInt();
        if(null != l1.buscaPorMatricula(cod)) System.out.println(l1.buscaPorMatricula(cod).toString());
        else System.out.println("Alocacao nao encontrada");
    }
    private static void buscaAutor(ListaDeLocacoes l1)
    {
        Scanner in = new Scanner(System.in);    
        System.out.println("Informe o aut");
        String cod = in.nextLine();
        if(null != l1.buscaPorAutor(cod)) System.out.println(l1.buscaPorAutor(cod).toString());
        else System.out.println("Alocacao nao encontrada");
    }
    private static void excluiLivro(ListaDeLocacoes l1)
    {
        Scanner in = new Scanner(System.in);    
        System.out.println("Informe o cod da alocacao para excluir: ");
        int cod = in.nextInt();
        if(l1.excluiAlocacao(cod)) System.out.println("Alocacao excluida com sucesso");
        else System.out.println("Erro ao excluir alocacao");
    }
    private static void cadastraLivro(ListaDeLocacoes l1)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o nome do livro: ");
        String nomeLivro = in.nextLine();
        if(l1.emprestimo(nomeLivro)) System.out.println("Livro cadastrado com sucesso");
        else System.out.println("Erro ao alocar livro");
    }
}
