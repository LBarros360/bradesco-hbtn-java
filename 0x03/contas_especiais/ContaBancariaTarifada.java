import exceptions.OperacaoInvalidaException;

public class ContaBancariaTarifada extends ContaBancariaBasica {

    private int quantidadeTransacoes = 0;


    public ContaBancariaTarifada(String numeracao, double taxaJurosAnual) {
        super(numeracao, taxaJurosAnual);
    }

    @Override
    public void depositar (double valor) throws OperacaoInvalidaException {
        super.depositar(valor);
        this.setSaldo(this.getSaldo() - 0.1);
        this.setQuantidadeTransacoes(this.getQuantidadeTransacoes() + 1);
    }

    @Override
    public void sacar(double valor) throws OperacaoInvalidaException {
        super.sacar(valor);
        this.setSaldo(this.getSaldo() - this.quantidadeTransacoes * 0.1);
        this.setQuantidadeTransacoes(this.getQuantidadeTransacoes() + 1);
    }

    public int getQuantidadeTransacoes() {
        return quantidadeTransacoes;
    }

    public void setQuantidadeTransacoes(int quantidadeTransacoes) {
        this.quantidadeTransacoes = quantidadeTransacoes;
    }
}

