package pedido.acao;

import pedido.AcaoAposGerarPedido;
import pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido {

    public void executarAcao(Pedido pedido) {

        System.out.println("Enviando email com dados do pedido");

    }
}
