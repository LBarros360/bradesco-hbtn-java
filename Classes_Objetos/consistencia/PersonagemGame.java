public class PersonagemGame {

    private int saudeAtual;
    private String nome;
    private String status;

    public PersonagemGame (int saude, String nome ) {
        this.setSaudeAtual(saude);
        this.nome = nome;
    }

    public void tomarDano(int quantidadeDeDano) {

        this.setSaudeAtual(this.saudeAtual - quantidadeDeDano);

    }

    public void receberCura(int quantidadeDeCura) {
        this.setSaudeAtual(this.saudeAtual + quantidadeDeCura);
    }

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public void setSaudeAtual (int saudeAtual) {

        this.saudeAtual = saudeAtual;

        if (this.saudeAtual > 100) {
            this.saudeAtual = 100;
        }

        if (this.saudeAtual < 0) {
            this.saudeAtual = 0;
        }

        if (this.saudeAtual > 0) {
            this.status = "vivo";
        } else {
            this.status = "morto";
        }

    }

    public String getNome () {

        return nome;
    }

    public void setNome (String nome) {

        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        }
    }

    public String getStatus (){
        return status;
    }
}

