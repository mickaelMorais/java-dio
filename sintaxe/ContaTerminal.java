import java.util.Scanner;;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("digite seu nome: ");
        String nome = scan.nextLine();

        System.out.print("digite o numero da conta: ");
        int numero = scan.nextInt();

        scan.nextLine();
        System.out.print("digite o numero de agencia: ");
        String agencia = scan.nextLine();

        System.out.print("digite seu saldo: ");
        double saldo = scan.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nome, agencia, numero, saldo);
    }
}
