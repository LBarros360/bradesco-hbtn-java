public class Gerente extends Empregado {

    public Gerente(double salarioFixo) {
        super(salarioFixo);
    }

    @Override
    public double calcularBonus (Departamento departamento){
        double bonus =  (departamento.getValorAtingidoMeta() - departamento.getValorMeta()) * 0.01; ;
        if (departamento.alcancouMeta()) {
            return (this.getSalarioFixo() * 0.20) + bonus;
        } else {
            return 0;
        }

    }

}

