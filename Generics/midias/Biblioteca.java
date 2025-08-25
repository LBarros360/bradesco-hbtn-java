import java.util.ArrayList;
import java.util.List;

public class Biblioteca<T extends Midia> {

    private List<T> lista;

    public Biblioteca() {
        this.lista = new ArrayList<>();
    }


    public List<T> obterListaMidias() {
        return this.lista;
    }

    public void adicionarMidia(T item) {
        this.lista.add(item);
    }
}


