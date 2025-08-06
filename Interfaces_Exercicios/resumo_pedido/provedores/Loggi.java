package provedores;

public class Loggi implements ProvedorFrete {

    private Frete frete = new Frete();

    //valor do frete é 7% do valor total do pedido, se peso passar de 2kg, senão o valor é 4,5% do valor do pedido.
    @Override
    public Frete calcularFrete(double peso, double valor) {
        this.frete.setTipoProvedor(obterTipoProvedorFrete());

        if (peso > 5000) {
            this.frete.setValor(valor *0.12);
        } else {
            this.frete.setValor(valor *0.04);
        }

        return this.frete;
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.LOGGI;
    }
}

