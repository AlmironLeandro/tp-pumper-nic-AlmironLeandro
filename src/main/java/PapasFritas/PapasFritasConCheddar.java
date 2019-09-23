package PapasFritas;

public class PapasFritasConCheddar extends PapasFritas {
   public PapasFritas p1;
public PapasFritasConCheddar(PapasFritas p1){
    this.p1=p1;
}
    @Override
    public double calcularCosto() {
        return 30 + p1.calcularCosto();
    }
}
