public class ContaBancariaControlada extends ContaBancariaBasica {

    private double saldoMinimo;
    private double valorPenalidade;

    public ContaBancariaControlada(String numeracao, double taxaJurosAnual, double saldoMinimo, double valorPenalidade) {
        super(numeracao, taxaJurosAnual);
        this.saldoMinimo = saldoMinimo;
        this.valorPenalidade = valorPenalidade;
    }

    @Override
    public void aplicarAtualizacaoMensal() {
        double saldo = this.getSaldo() - this.calcularTarifaMensal() + this.calcularJurosMensal();

        if (saldo < saldoMinimo) {
            super.setSaldo(saldo - this.valorPenalidade);
        }

    }
}

