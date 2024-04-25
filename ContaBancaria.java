package jsp_servlets_jstl;

public class ContaBancaria {
    protected String cliente;
    protected int numConta;
    protected float saldo;

    public ContaBancaria(String cliente, int numConta, float saldo) {
        this.cliente = cliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public void sacar(float valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void depositar(float valor) {
        saldo += valor;
    }

    public float getSaldo() {
        return saldo;
    }
}
