import exceptions.OperacaoInvalidaException;

public class ContaBancariaBasica {

    private String numeracao;
    private double saldo;
    private double taxaJurosAnual;

    public ContaBancariaBasica(String numeracao, double taxaJurosAnual) {
        this.numeracao = numeracao;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public void depositar (double valor) throws OperacaoInvalidaException {
        if (valor <= 0) {
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
        } else {
            this.saldo = this.saldo + valor;
        }
    }

    public void sacar(double valor) throws OperacaoInvalidaException {
        if (valor <= 0) {
            throw new OperacaoInvalidaException("Valor de saque deve ser maior que 0");
        } else if (this.getSaldo() < valor) {
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
        } else {
            this.saldo = this.saldo - valor;
        }
    }

    public double calcularTarifaMensal() {
        double tarifaPercentual = this.saldo * 0.1;

        if (tarifaPercentual < 10) {
            return tarifaPercentual;
        } else {
            return 10.0;
        }
    }

    public double calcularJurosMensal() {
        if (this.saldo >= 0) {
            return this.getSaldo() * ((this.getTaxaJurosAnual() / 12) / 100);
        } else {
            return 0;
        }
    }

    public void aplicarAtualizacaoMensal() {
        this.saldo = this.saldo - this.calcularTarifaMensal() + this.calcularJurosMensal();
    }

    public String getNumeracao() {
        return numeracao;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }
}

