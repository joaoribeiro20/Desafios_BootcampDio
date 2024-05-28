public class ParametrosInvalidosException extends Exception {
    // Adicionando uma mensagem à exceção
    public ParametrosInvalidosException() {
        super("Os parâmetros são inválidos: o segundo parâmetro deve ser maior que o primeiro.");
    }
}
