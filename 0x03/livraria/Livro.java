import exceptions.AutorInvalidoException;
import exceptions.LivroInvalidoException;

public class Livro {

    private String titulo;
    private String autor;
    private double preco;

    public Livro(String titulo, String autor, double preco) throws AutorInvalidoException, LivroInvalidoException {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setPreco(preco);
    }

    public Livro() {

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) throws AutorInvalidoException {
        if (titulo.length() < 3) {
            throw new AutorInvalidoException("Titulo de livro invalido");
        } else {
            this.titulo = titulo;
        }

    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) throws LivroInvalidoException {
        if (!autor.contains(" ")) {
            throw  new LivroInvalidoException("Nome de autor invalido");
        } else {
            this.autor = autor;
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) throws LivroInvalidoException{
        if (preco <= 0) {
            throw  new LivroInvalidoException("Preco de livro invalido");
        } else {
            this.preco = preco;
        }
    }
}

