import produtos.Livro;

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

    public void apresentarResumoPedido() {
        double totalProdutos = 0;
        System.out.println("------- RESUMO PEDIDO -------");
        for (ItemPedido i : this.itens) {
            if (i.getProduto() instanceof Livro) {
                System.out.println(String.format("Tipo: Livro  Titulo: %s  Preco: %.2f  Quant: %s  Total: %.2f",  i.getProduto().getTitulo(), i.getProduto().obterPrecoLiquido(), i.getQuantidade(), i.getProduto().obterPrecoLiquido() * i.getQuantidade()));
            } else {
                System.out.println(String.format("Tipo: Dvd  Titulo: %s  Preco: %.2f  Quant: %s  Total: %.2f", i.getProduto().getTitulo(), i.getProduto().obterPrecoLiquido(), i.getQuantidade(), i.getProduto().obterPrecoLiquido() * i.getQuantidade()));
            }

            totalProdutos = totalProdutos + i.getProduto().obterPrecoLiquido() * i.getQuantidade();
        }
        System.out.println("----------------------------");
        System.out.println(String.format("DESCONTO: %.2f",totalProdutos * percentualDesconto));
        System.out.println(String.format("TOTAL PRODUTOS: %.2f", totalProdutos));
        System.out.println("----------------------------");
        System.out.println(String.format("TOTAL PEDIDO: %.2f", calcularTotal()));
        System.out.println("----------------------------");

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

