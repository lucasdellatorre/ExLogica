
/**
 * Write a description of class App here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class App
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        ListaDeLivros l1 = new ListaDeLivros(1000);
        int op, cod;
        do{
            System.out.println("Sair do programa - 0");
            System.out.println("1 - cadastra livro");
            System.out.println("2 - busca livro por codigo");
            System.out.println("3 - busca livro por autor");
            System.out.println("4 - exclui livro por codigo");
            System.out.println("5 - altera autor");
            System.out.println("6 - exibe livros");
            op = in.nextInt();
            switch(op)
            {
                case 0: 
                    break;
                case 1: 
                    if(l1.cadastraLivro()) System.out.println("Livro cadastrado com sucesso");
                    else System.out.println("Erro ao cadastrar livro");
                    break;
                case 2: 
                    System.out.println("Informe o codigo a ser buscado: ");
                    cod = in.nextInt();
                    System.out.println(l1.buscaLivroCodigo(cod));
                    break;
                case 3:
                    metodoDivertido(l1);
                    break;
                case 4: 
                    System.out.println("Digite o codigo do livro a ser excluido: ");
                    cod = in.nextInt();
                    if(l1.excluiLivro(cod)) System.out.println("Livro excluido com sucesso");
                    else System.out.println("Erro ao excluir livro");
                    break;
                case 5:
                    metodoLegal(l1);
                    break;
                    
                case 6: System.out.println(l1.toString()); break;
            }
        }while(op != 0);
        
    }
    public static void metodoDivertido(ListaDeLivros l1)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o autor a ser buscado: ");
        String autor = in.nextLine();
        System.out.println(l1.buscaLivroAutor(autor));
    }
    public static void metodoLegal(ListaDeLivros l1)
    {
        Scanner in = new Scanner(System.in);
        String[] vetorLegal = new String[2];
        for(int i = 0; i < 2; i++)
        {
            System.out.println("Informe o nome dos autores");
            String autor = in.nextLine();
            vetorLegal[i] = autor;
        }
        
        System.out.println("Informe o codigo rsrs");
        int cod = in.nextInt();
        l1.buscaLivroCodigo(cod).setAutor(vetorLegal);
    
        
    }
}
