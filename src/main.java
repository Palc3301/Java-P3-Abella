import conta.Conta;
import exception.SaldoInsuficienteException;
import exception.ValorInvalidoException;

public class main {
    public static void main(String[] args) throws SaldoInsuficienteException {
        Conta conta = new Conta("Pedro", 1000);

        try {
            conta.sacar(2000);
        } catch (SaldoInsuficienteException e) {
            throw new SaldoInsuficienteException();
        }

        try {
            conta.depositar(0);
        }catch (ValorInvalidoException e) {
            System.out.println("Valor para deposito invalido, tente novamente");
        } catch (Exception e){
            System.out.println("Erro não reconhecido, entre em contato com os administradores");
        }

        System.out.println();
    }
}
