import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Consulta {

    public static List<Produto> obterLivrosDoPedido (Pedido pedido) {

        Stream<Produto> s = pedido.getProdutos().stream();
        return s.filter(produto -> produto.getCategoria().equals(CategoriaProduto.LIVRO)).toList();
    }

    public static Produto obterProdutoMaiorPreco(List<Produto> lista) {

        Optional<Produto> p =lista.stream().max(Comparator.comparing(Produto::getPreco));
        Produto produto = p.get();
        return produto;
    }

    public static List<Produto> obterProdutosPorPrecoMinimo(List<Produto> lista, double precoMinimo) {

        return lista.stream().filter(produto -> produto.getPreco() >= precoMinimo).collect(Collectors.toList());

    }

    public  static List<Pedido>  obterPedidosComEletronicos(List<Pedido> pedido) {

        return pedido.stream()
                .filter(p -> p.getProdutos().stream()
                        .anyMatch(produto -> produto.getCategoria() == CategoriaProduto.ELETRONICO))
                .collect(Collectors.toList());
    }
}

