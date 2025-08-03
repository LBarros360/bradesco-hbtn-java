package produtos;

public class Livro extends Produto {

    private int paginas;
    private String autor;
    private int edicao;

    public Livro(String titulo, int ano, String pais, double precoBruto, int paginas, String autor, int edicao) {
        super(titulo, ano, pais, precoBruto);
        this.paginas = paginas;
        this.autor = autor;
        this.edicao = edicao;
    }

    @Override
    public double obterPrecoLIquido() {
        return this.getPrecoBruto() + (this.getPrecoBruto() * 0.15);
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public String toString () {
        return String.format("[Livro] Titulo: %s, Ano: %s, Pais: %s, Preço Bruto %.2f, Páginas: %s, Autor: %s, Edição: %s, Preço Liquido: %.2f", getTitulo(), getAno(), getPais(), getPrecoBruto(), this.paginas, this.autor, this.edicao, this.obterPrecoLIquido());
    }
}

