
/**
 * Write a description of class ACMEAuto here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class ACMEAuto
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String placa, nome;
        double valor;
        System.out.println("Informe a placa do carro: ");
        numeroPlaca = in.nextLine();
        System.out.println("Informe o nome do cliente: ");
        nomeCliente = in.nextLine();
        System.out.println("Informe o valor da conta: ");
        valorConta = in.nextDouble();
        Carro carro;
        Cliente cliente;
        Venda venda;
        carro = new Carro(numeroPlaca);
        cliente = new Cliente(nomeCliente);
        venda = new Venda(valorConta, cliente, carro);
    }
}
