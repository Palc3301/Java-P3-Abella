package exception;

public class SaldoInsuficienteException extends Throwable {

    public SaldoInsuficienteException() {
    }

    public SaldoInsuficienteException(String message) {
        super(message);
    }
}
