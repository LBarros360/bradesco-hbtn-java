import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private ArrayList<PedidoCookie> cookies;

    public Pedido() {
        this.cookies = new ArrayList<>();
    }

    public void adicionarPedidoCookie(PedidoCookie pedido) {

        this.cookies.add(pedido);
    }

    public int obterTotalCaixas() {
        int total = 0;

        for (PedidoCookie c : this.cookies) {
            total += c.getQuantidadeCaixas();
        }

        return total;
    }

    public int removerSabor(String sabor) {
        int total = 0;

        for (int i = 0; i < this.cookies.size(); i++) {
            if (this.cookies.get(i).getSabor().equals(sabor)) {
                total += this.cookies.get(i).getQuantidadeCaixas();
                this.cookies.remove(i);
            }
        }
        return total;
    }
}

