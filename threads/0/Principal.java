public class Principal {

    public static void main(String[] args) {

        Contador contador = new Contador();

        ThreadContador t1 = new ThreadContador(contador);
        ThreadContador t2 = new ThreadContador(contador);

        t1.run();
        t2.run();

        System.out.println("Valor final do contador: " + contador.getContagem());
    }

}

