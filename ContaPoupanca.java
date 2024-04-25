package jsp_servlets_jstl;

public class ContaPoupanca {

    private int diaRendimento;

    public ContaPoupanca(String cliente, int numConta, float saldo, int diaRendimento) {

        this.diaRendimento = diaRendimento;
    }

    public void calcularNovoSaldo(float taxaRendimento) {
        saldo += saldo * taxaRendimento;
    }
}

