package provedores;

public class JadLog  implements ProvedorFrete {

    private Frete frete = new Frete();
    //valor do frete é 12% do valor total do pedido, se peso passar de 5kg, senão o valor é 4% do valor do pedido.

    @Override
    public Frete calcularFrete(double peso, double valor) {
        this.frete.setTipoProvedor(obterTipoProvedorFrete());

        if (peso > 2000) {
            this.frete.setValor(valor *0.07);
        } else {
            this.frete.setValor(valor *0.045);
        }

        return this.frete;
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.JADLOG;
    }

}

