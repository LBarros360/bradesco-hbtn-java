public class Retangulo extends FormaGeometrica {

    protected double largura;
    protected double altura;

    public double getLargura() {
        return largura;
    }

    @Override
    public double area () {
        return this.altura * this.largura;
    }

    public String toString() {
        return String.format("[Retangulo] %.2f / %.2f", largura, altura);
    }

    public void setLargura (double largura) {

        if (largura < 0) {
            throw new java.lang.IllegalArgumentException("Largura deve ser igual ou maior que 0");
        } else {
            this.largura = largura;
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura (double altura) {
        if (altura < 0) {
            throw new IllegalArgumentException("Altura deve ser maior ou igual a 0");
        } else {
            this.altura = altura;
        }
    }
}

