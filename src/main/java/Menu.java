import ar.edu.unahur.obj2.*;
import PapasFritas.*;
public class Menu {
    private double gaseosa = 40;
    public Hamburguesa h1;
    public PapasFritas p1;

    public Menu(Hamburguesa h1, PapasFritas p1) {
        this.h1 = h1;
        this.p1 = p1;
    }

    private double descuento(){
    return (h1.CalculateCost() + p1.calcularCosto())*0.20;
}
    public double TotalCosto(){return (h1.CalculateCost() + p1.calcularCosto() + gaseosa) - descuento();}
}
