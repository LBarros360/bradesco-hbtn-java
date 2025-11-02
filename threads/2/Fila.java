import java.util.LinkedList;

public class Fila {

    private final int CAPACIDADE;

    private LinkedList<Integer> fila;

    public Fila(int capacidade) {
        CAPACIDADE = capacidade;
        fila = new LinkedList<>();
    }

    public synchronized void adicionar(int item) {
        if(fila.size() == CAPACIDADE) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        fila.add(item);
        notifyAll();
    }

    public synchronized int retirar() throws InterruptedException {
        while (fila.isEmpty()) {
            wait();
        }

        int removido = fila.removeFirst();
        notifyAll();
        return  removido;
    }
}

