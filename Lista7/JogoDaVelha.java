
/**
 * Escreva a descrição da classe JogoDaVelha aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.util.Random;
import java.util.Scanner;
public class JogoDaVelha
{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        Random gera = new Random();
        Tabuleiro jogo = new Tabuleiro();
        char usuario = 'X', computador = '0';
        System.out.println("Escolhendo entre X e O...");
        int op = gera.nextInt(2);
        if(op == 0)
        {
            computador = 'X';
            usuario = '0';
        }
        System.out.println("Iniciando o jogo. ");
        System.out.println("Computador: " + computador);
        System.out.println("Usuario: " + usuario);
        System.out.println("Vez do usuario");
        System.out.println(jogo);
        jogador1(jogo, usuario);
        for(int t = 1; t<=4; t++)
        {
            System.out.println("Vez do Computador");
            System.out.println(jogo);
            jogador1(jogo, usuario);
            if(jogo.verificaVencedor(computador))
            {
                System.out.println("Computador venceu"); 
                break;
            }
            System.out.println(jogo);
            jogador2(jogo, computador);
            if(jogo.verificaVencedor(usuario))
            {
                System.out.println("Usuario venceu"); 
                break;
            }
        }
        //tratar a velha+
        System.out.println(jogo);

    }
    public static void jogador1(Tabuleiro jogo, char letra)
    {
        Scanner in = new Scanner(System.in);
        int lin, col;
        System.out.println("Informe a linha desejada");
        lin = in.nextInt();
        System.out.println("Informe a coluna");
        col = in.nextInt();
        while(jogo.celulaLivre(lin,col) == false)
        {
            System.out.println("Erro: Coordenadas Incorretas ou celula ocupada");
            System.out.println("Informe a linha desejada");
            lin = in.nextInt();
            System.out.println("Informe a coluna");
            col = in.nextInt();
        }
    }
    public static void jogador2(Tabuleiro jogo, char letra)
    {
        Random gera = new Random();
        int lin, col;
        do{
            lin = gera.nextInt(3);
            col = gera.nextInt(3);
        }while(jogo.alteraCelula(lin, col, letra));
    }
}
