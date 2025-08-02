public class Empregado {

    private double salarioFixo;

    public Empregado () {
        super();
    }

    public Empregado(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public double calcularBonus(Departamento departamento) {
       if (departamento.alcancouMeta()) {
           return this.getSalarioFixo() * 0.10;
       } else {
           return 0;
       }
    }

    public double calcularSalarioTotal(Departamento departamento) {
        if (departamento.alcancouMeta()) {
            return this.getSalarioFixo() + this.calcularBonus(departamento);
        } else {
            return this.getSalarioFixo();
        }
    }

    public double getSalarioFixo() {
        return this.salarioFixo;
    }
}

