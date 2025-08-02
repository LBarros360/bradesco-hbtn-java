public class Departamento {

    private double valorMeta;
    private double valorAtingidoMeta;

    public Departamento (double valorMeta, double valorAtingidoMeta) {
        this.valorMeta = valorMeta;
        this.valorAtingidoMeta = valorAtingidoMeta;
    }

    public boolean alcancouMeta () {
        if (valorAtingidoMeta >= valorMeta) {
            return true;
        } else {
            return false;
        }
    }

    public double getValorMeta() {
        return this.valorMeta;
    }

    public double getValorAtingidoMeta () {
        return this.valorAtingidoMeta;
    }
}

