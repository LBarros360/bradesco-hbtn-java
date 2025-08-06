package provedores;

public class Frete {

    private double valor;
    private TipoProvedorFrete tipoProvedor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public TipoProvedorFrete getTipoProvedorFrete() {
        return tipoProvedor;
    }

    public void setTipoProvedor(TipoProvedorFrete tipoProvedor) {
        this.tipoProvedor = tipoProvedor;
    }
}

