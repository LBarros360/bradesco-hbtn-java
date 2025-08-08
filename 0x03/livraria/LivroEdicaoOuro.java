import exceptions.AutorInvalidoException;
import exceptions.LivroInvalidoException;

public class LivroEdicaoOuro extends Livro {

    public LivroEdicaoOuro(String titulo, String autor, double preco) throws AutorInvalidoException, LivroInvalidoException {
        super();
        super.setTitulo(titulo);
        super.setAutor(autor);
        super.setPreco(preco);
    }

    @Override
    public double getPreco() {
        return super.getPreco() * 0.3;
    }
}

