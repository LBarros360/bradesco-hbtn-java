public enum TipoMensagem {

    AVISO("AVISO"),
    ERRO("ERRO"),
    LOG("LOG");

    private String tipoMensagem;

    TipoMensagem(String tipoMensagem) {
        this.tipoMensagem = tipoMensagem;
    }

    public String getTipoMensagem() {
        return tipoMensagem;
    }
}

