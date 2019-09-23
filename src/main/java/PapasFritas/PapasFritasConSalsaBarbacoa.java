package PapasFritas;

public class PapasFritasConSalsaBarbacoa extends PapasFritas {
    public PapasFritas p1;
    public PapasFritasConSalsaBarbacoa(PapasFritas p1){
        this.p1=p1;
    }
    @Override
    public double calcularCosto() {
        return 20 + p1.calcularCosto();
    }
}
