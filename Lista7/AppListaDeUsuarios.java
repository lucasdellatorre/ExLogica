
/**
 * Write a description of class AppListaDeUsuarios here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class AppListaDeUsuarios
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in); 
        ListaDeUsuarios listaU1 = new ListaDeUsuarios(6);
        int op;
        System.out.println("\f 📖 Lista de Usuarios 📖 \n");
        do
        {
            System.out.println("0 - Parar programa");
            System.out.println("1 - Cadastrar usuario");
            System.out.println("2 - Buscar por matricula");
            System.out.println("3 - Buscar por nome");
            System.out.println("4 - Excluir usuario por matricula");
            System.out.println("5 - Listar usuarios");
            op = in.nextInt();
            switch(op)
            {
                case 0: 
                    System.out.println("Fim do programa");
                    break;
                case 1: cadastro(listaU1);
                    break;
                case 2: busca(listaU1);
                    
                    break;  
                case 3: buscaPorNome(listaU1);
                    
                   break;
                case 4: exclui(listaU1) ;         
                    break;
                case 5:
                    System.out.println(listaU1.toString());
                    break;             
            }
        }while(op!=0);
    }
    
    private static void cadastro(ListaDeUsuarios listaU1){
        Scanner in = new Scanner(System.in); 
        System.out.println("Informe o nome para cadastro: ");
        String nome = in.nextLine();
        if (listaU1.cadastrar(nome)) System.out.println("Cadastro realizado com sucesso 😀😀😀");
        else System.out.println("Erro ao cadastrar 😭");
    
    }
    
    private static void busca(ListaDeUsuarios listaU1){
        Scanner in = new Scanner(System.in); 
        System.out.println("Informe o numero da matricula para buscar");
        int matricula = in.nextInt();
        Usuario temp = listaU1.buscarMatricula(matricula);
        if(temp == null) System.out.println("Numero de matricula nao existe");
        else System.out.println(temp.toString());
    }
    private static void buscaPorNome(ListaDeUsuarios listaU1){
        Scanner in = new Scanner(System.in); 
        System.out.println("Informe o nome do usuario para buscar");
        String nome = in.nextLine();
        Usuario temp = listaU1.buscarNome(nome);
        if(temp == null) System.out.println("Nome de usuario nao existe");
        else System.out.println(temp.toString());
    }
     private static void exclui(ListaDeUsuarios listaU1){
        Scanner in = new Scanner(System.in); 
        System.out.println("Informe a matricula da conta a ser excluida");
        int matricula = in.nextInt();
       if (listaU1.excluir(matricula)) System.out.println("Conta excluida com sucesso!");
       else System.out.println("Erro ao excluir a conta");
    }
}
