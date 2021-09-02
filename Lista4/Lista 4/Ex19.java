import java.util.Scanner;
/**
 * Write a description of class Ex19 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ex19
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int menu;
        double saldoAtual = 0,deposito = 0,saque = 0;
        do
        {
            System.out.println("1 - Ver saldo atual");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Encerrar operação");
            menu = in.nextInt();
            if (menu == 4) break;
            switch(menu)
            {
                case 1: 
                    System.out.println("\fSaldo atual é de: " + deposito);
                    break;
                case 2: 
                    System.out.println("Informe um valor para depósito: ");
                    deposito = in.nextDouble();
                    System.out.println(depositar(deposito, saldoAtual));
                    break;
                case 3: 
                    System.out.println("Informe um valor para Saque: ");
                    saque = in.nextDouble();
                    System.out.println(sacar(saque, saldoAtual));
                    break;
                default: System.out.println("Erro, usuário digitou um valor inválido");
            }
        }while(menu!=4);
    }
    
    public static double depositar(double depositar, double saldoAtual)
    {
        return depositar + saldoAtual;
    }
    public static double sacar(double saque, double saldoAtual)
    {
        return saldoAtual - saque;        
    }
}