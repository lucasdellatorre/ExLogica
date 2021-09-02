
/**
 * Write a description of class AppEstacionamento here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class AppEstacionamento
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        Estacionamento pklot = new Estacionamento("Estacionamento PERNA LONGA");
        int op;
        pklot.inicializar();
        System.out.println("\f**BEM VINDO AO " + pklot.getNomeDoEstacionamento().toUpperCase() + "**");
        do{
            System.out.println("0 - Parar programa");
            System.out.println("1 - Inserir carro");
            System.out.println("2 - Manobra carro pela placa");
            System.out.println("3 - Manobra carro pela posicao");
            System.out.println("4 - Informa a saida de um carro pela placa");
            System.out.println("5 - Informe a saida de um carro pela posicao"); 
            System.out.println("6 - Listar carros do estacionamento");
            System.out.println("7 - Ver especificacoes do carro pela vaga");
            System.out.println("Digite uma opcao: ");
            op = in.nextInt();
            switch(op)
            {
                case 0:
                    System.out.println("Fim do programa");
                    break;
                case 1:
                    inserirCarro(pklot);
                    break;
                case 2:
                    manobraPlaca(pklot);
                    break;
                case 3:
                    manobraPosicao(pklot);
                    break;
                case 4:
                    saidaPlaca(pklot);
                    break;
                case 5:
                    saidaPosicao(pklot);
                    break;
                case 6:
                    System.out.println(pklot.toString());
                    break;
                case 7:
                    //especificacoes(pklot);
                    break;
            }
        }while(op!=0);
    }
    private static void inserirCarro(Estacionamento pklot)
    {
        Scanner in = new Scanner(System.in); 
        System.out.println("Informe a placa do carro: ");
        String placa = in.nextLine();
        System.out.println("Informe a vaga para estacionar: ");
        int vaga = in.nextInt();
        if (pklot.inserir(placa.toUpperCase(),vaga)) System.out.println("Carro cadastrado com sucesso");
        else System.out.println("Erro ao cadastrar carro");
    }
    private static void manobraPlaca(Estacionamento pklot)
    {
        Scanner in = new Scanner(System.in);    
        System.out.println("Informe a placa do carro a ser manobrado" );
        String placa = in.nextLine();
        System.out.println("Informe a posicao final para ser manobrado");
        int posFinal = in.nextInt();
        if (pklot.manobrarCarroPelaPlaca(placa.toUpperCase(), posFinal)) System.out.println("Carro manobrado com sucesso");
        else System.out.println("Erro ao manobrar o carro");
    }
    private static void manobraPosicao(Estacionamento pklot)
    {
        Scanner in = new Scanner(System.in);    
        System.out.println("Informe a posicao inicial do carro a ser manobrado");
        int posInicial = in.nextInt();
        System.out.println("Informe a posicao final para ser manobrado");
        int posFinal = in.nextInt();
        if (pklot.manobrarCarroPelaPosicao(posInicial, posFinal)) System.out.println("Carro manobrado com sucesso");
        else System.out.println("Erro ao manobrar o carro");
    }
    private static void saidaPlaca(Estacionamento pklot)
    {
        Scanner in = new Scanner(System.in);  
        System.out.println("Informe a placa do carro a ser removido" );
        String placa = in.nextLine();
        if (pklot.saidaDeCarroPelaPlaca(placa.toUpperCase())) System.out.println("Carro removido com sucesso");
        else System.out.println("Erro ao remover carro");
    }
    private static void saidaPosicao(Estacionamento pklot)
    {
        Scanner in = new Scanner(System.in);    
        System.out.println("Informe a posicao do carro a ser removido" );
        int pos = in.nextInt();
        if (pklot.saidaDeCarroPelaPosicao(pos)) System.out.println("Carro removido com sucesso");
        else System.out.println("Erro ao remover carro");
    }
    private static void especificacoes(Estacionamento pklot) //fazer no futuro
    {
        Scanner in = new Scanner(System.in);      
    }
}
