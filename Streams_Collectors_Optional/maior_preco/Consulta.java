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
}

