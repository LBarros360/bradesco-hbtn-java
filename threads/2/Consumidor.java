import java.util.Random;

public class Produtor extends Thread {


    private Fila fila;
    private int id;

    public Produtor(Fila fila, int id) {
        this.fila = fila;
        this.id = id;
    }

    @Override
    public void run() {
        while(true){
            Random random = new Random();
            int produto = random.nextInt(101);
            fila.adicionar(produto);
            System.out.println("Produtor " + id + " produziu: " + produto);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
