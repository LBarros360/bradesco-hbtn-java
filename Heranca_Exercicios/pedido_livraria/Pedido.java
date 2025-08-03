public class Pedido {

    private double percentualDesconto;
    private ItemPedido[] itens;

    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        if (percentualDesconto != 0)
            this.percentualDesconto = percentualDesconto / 100;
        else
            this.percentualDesconto = 0;
        this.itens = itens;
    }

    public double calcularTotal () {
        double total = 0;

        for (ItemPedido i : this.itens) {
            total = total + (i.getProduto().obterPrecoLiquido() * i.getQuantidade());
        }

        return total - (total * percentualDesconto);
    }

    public double getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    public ItemPedido[] getItens() {
        return itens;
    }

    public void setItens(ItemPedido[] itens) {
        this.itens = itens;
    }
}

