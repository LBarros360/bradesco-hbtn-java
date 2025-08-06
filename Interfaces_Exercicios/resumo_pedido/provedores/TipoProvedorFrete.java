package provedores;

public enum TipoProvedorFrete {

    SEDEX("SEDEX"),
    JADLOG("JADLOG"),
    LOGGI("LOGGI");

    private String tipoProvedorFrete;

    TipoProvedorFrete(String tipoProvedorFrete) {
        this.tipoProvedorFrete = tipoProvedorFrete;
    }

    public String getTipoProvedorFrete() {
        return this.tipoProvedorFrete;
    }
}

