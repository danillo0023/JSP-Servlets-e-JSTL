package jsp_servlets_jstl;

public class ContaEspecial {
    private float limite;

    public ContaEspecial(String cliente, int numConta, float saldo, float limite) {
        super();
        this.limite = limite;
    }

    @Override
    public void sacar(float valor) {
        if (valor <= saldo + limite) {
            saldo -= valor;
        } else {
            System.out.println("Saldo e limite insuficientes.");
        }
    }
}
