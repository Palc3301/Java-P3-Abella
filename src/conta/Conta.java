package conta;

import exception.SaldoInsuficienteException;
import exception.ValorInvalidoException;

public class Conta {

    private String name;
    private double saldo;

    public Conta() {
    }

    public Conta(String name, double saldo) {
        this.name = name;
        this.saldo = saldo;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException();
        } else if (valor <= 0) {
            throw new ValorInvalidoException();
        }
        saldo -= valor;
    }

    public void depositar(double valor) throws ValorInvalidoException {
        if (valor <= 0){
            throw new ValorInvalidoException();
        }
        saldo += valor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
