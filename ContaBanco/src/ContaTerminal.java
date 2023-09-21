import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta.");
        numero = sc.nextInt();

        System.out.println("Por favor, digite o número da Agência.");
        agencia = sc.next();

        System.out.println("Por favor, digite o nome do titular da conta.");
		sc.nextLine();
        nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o saldo inicial da conta.");
        saldo = sc.nextDouble();


        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + ", e seu saldo " + saldo + " já está disponível para saque.");

    }
}
