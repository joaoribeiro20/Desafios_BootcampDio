import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = ler.nextLine();

        System.out.println("Digite sua agência:");
        String agencia = ler.nextLine();

        System.out.println("Digite seu número:");
        int numero = Integer.parseInt(ler.nextLine());

        System.out.println("Digite seu saldo:");
        double saldo = Double.parseDouble(ler.nextLine());

        Conta newConta = new Conta(numero, agencia, nome, saldo);

        // Exibindo informações da nova conta criada
        newConta.exibirInformacoes();
    }
}