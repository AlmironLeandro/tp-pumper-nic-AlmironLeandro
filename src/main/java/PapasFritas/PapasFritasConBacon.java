package PapasFritas;

public class PapasFritasConBacon extends PapasFritas {
    public PapasFritas p1;
    public PapasFritasConBacon(PapasFritas p1){
        this.p1=p1;
    }
    @Override
    public double calcularCosto() {
        return 45 + p1.calcularCosto();
    }
}
