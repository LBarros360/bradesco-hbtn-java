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
            int randon = (int)(Math.random() * 100);
            fila.adicionar(randon);
            System.out.println("Produtor " + id + " produziu: " + randon);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
