public class PessoasArray {
    private String[] nomes;

    public PessoasArray() {
        nomes =new String[]{"Amanda", "Beatriz", "Carlos","Daniela","Eduardo",
                "Fabio","Gustavo", "Hingrid","Isabela","Joao","Leise","Maria",
                "Norberto","Otavio","Paulo", "Quirino","Renata","Sabata",
                "Tais","Umberto","Vanessa","Xavier"};
    }

    public String[] getNomes() {
        return nomes;
    }

    public void setNomes(String[] nomes) {
        this.nomes = nomes;
    }

    // implementar o método de buscaBinaria
    public void buscaBinaria(String nome){
        boolean encontrado = false;
        System.out.println("Procurando o nome: \"" + nome + "\"");

        int baixo = 0;
        int alto = nomes.length - 1;

        while (baixo <= alto) {

            int meio = (baixo + alto) / 2;
            System.out.println("Passando pelo indice:" + meio);
            int comparacao = nome.compareTo(nomes[meio]);

            if (comparacao == 0) {
                encontrado = true;
                System.out.println("Nome " + nome + " encontrado na posição " + meio);
                break;
            } else if (comparacao < 0) {
                alto = meio - 1; // Busca na metade esquerda
            } else {
                baixo = meio + 1; // Busca na metade direita
            }
        }

        if (!encontrado) {
            throw new IllegalArgumentException("O nome " + nome + " não se encontra no array de nomes");
        }

    }
}
