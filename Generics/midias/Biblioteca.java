import java.util.ArrayList;
import java.util.List;

public class Biblioteca<T> {

    private List<Midia> lista;

    public Biblioteca() {
        this.lista = new ArrayList<>();
    }



    public List<Midia> obterListaMidias() {
        return this.lista;
    }

    public void adicionarMidia(Midia item) {
        this.lista.add(item);
    }
}

