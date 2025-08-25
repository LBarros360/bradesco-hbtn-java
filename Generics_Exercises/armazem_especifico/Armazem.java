import java.util.HashMap;
import java.util.Map;

public abstract class Armazem<T> implements Armazenavel<T>{

    protected Map<String,T> map = new HashMap<>();

    @Override
    public void adicionarAoInventario(String nome, T valor) {
        this.map.put(nome, valor);
    }

    @Override
    public T obterDoInventario(String nome) {
        return this.map.get(nome);
    }
}

