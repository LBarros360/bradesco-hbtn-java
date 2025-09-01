import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto {

    private String nome;
    private Double preco;
    private Double percentualMarkup;
    public Supplier<Double> precoComMarkup = () -> preco * (1 + percentualMarkup / 100);
    public Consumer<Double> atualizarMarkup = novoPreco -> this.percentualMarkup = novoPreco;

    public Produto(Double preco, String nome) {
        this.preco = preco;
        this.nome = nome;
        this.percentualMarkup = 10.0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Double getPercentualMarkup() {
        return percentualMarkup;
    }

    public void setPercentualMarkup(Double percentualMarkup) {
        this.percentualMarkup = percentualMarkup;
    }
}

