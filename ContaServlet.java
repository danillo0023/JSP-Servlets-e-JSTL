package jsp_servlets_jstl;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
public class ContaServlet extends HttpServlet{
    private ContaBancaria contaPoupanca;
    private ContaBancaria contaEspecial;

    public void init() {
        contaPoupanca = new ContaPoupanca("Cliente1", 123, 1000.0f, 15);
        contaEspecial = new ContaEspecial("Cliente2", 456, 500.0f, 200.0f);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String acao = request.getParameter("acao");
        float valor = Float.parseFloat(request.getParameter("valor"));

        switch (acao) {
            case "sacarPoupanca":
                contaPoupanca.sacar(valor);
                break;
            case "sacarEspecial":
                contaEspecial.sacar(valor);
                break;
            case "depositarPoupanca":
                contaPoupanca.depositar(valor);
                break;
            case "depositarEspecial":
                contaEspecial.depositar(valor);
                break;
            case "calcularRendimento":
                if (contaPoupanca instanceof ContaPoupanca) {
                    ((ContaPoupanca) contaPoupanca).calcularNovoSaldo(0.02f);
                }
                break;
        }

        response.sendRedirect("resultado.jsp");
    }
}
