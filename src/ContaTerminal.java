
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        String nomeCliente, agencia;
        int numero;
        double saldo;

        try(Scanner scanner = new Scanner(System.in).useLocale(Locale.US)){

            System.out.println("Digite o seu nome");
            nomeCliente = scanner.next();

            System.out.println("Digite o numero da conta");
            numero = scanner.nextInt();

            System.out.println("Digite a agencia da conta");
            agencia = scanner.next();

            System.out.println("Digite o saldo da conta");
            saldo = scanner.nextDouble();
        }

        Conta conta = new Conta(numero, saldo, agencia, nomeCliente);

        System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", conta.getNomeCliente(), conta.getAgencia(), conta.getNumero(), conta.getSaldo()));
    }
}
