public class Conta {
    // Declaração dos atributos da classe
    int Numero;
    String Agencia;
    String NomeCliente;
    double Saldo;

    // Construtor da classe Conta
    public Conta(int Numero, String Agencia, String NomeCliente, double Saldo) {
        // Inicialização dos atributos com os valores passados como parâmetros
        this.Numero = Numero;
        this.Agencia = Agencia;
        this.NomeCliente = NomeCliente;
        this.Saldo = Saldo;
    }

    // Método para exibir as informações da conta
    public void exibirInformacoes() {
        System.out.println("Número: " + Numero);
        System.out.println("Agência: " + Agencia);
        System.out.println("Nome do Cliente: " + NomeCliente);
        System.out.println("Saldo: " + Saldo);
        System.out.println("Olá "+ NomeCliente +"obrigado por criar uma conta em nosso banco, sua agência é "+Agencia+", conta "+Numero+" e seu saldo "+Saldo+" já está disponível para saque.");
    }
}
