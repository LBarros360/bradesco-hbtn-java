package provedores;

public class Sedex implements ProvedorFrete {

    //Valor do frete é 10% do valor total do pedido, se peso passar de 1kg, senão o valor é 5% do valor do pedido.

    private Frete frete = new Frete();

    @Override
    public Frete calcularFrete(double peso, double valor) {

        this.frete.setTipoProvedor(obterTipoProvedorFrete());
        if (peso > 1000) {
            this.frete.setValor(valor *0.10);
        } else {
            this.frete.setValor(valor *0.05);
        }

        return this.frete;

    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.SEDEX;
    }
}

