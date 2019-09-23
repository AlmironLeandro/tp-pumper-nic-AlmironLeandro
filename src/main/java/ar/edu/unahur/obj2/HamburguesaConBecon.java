package ar.edu.unahur.obj2;

public class HamburguesaConBecon extends Hamburguesa {
    public Hamburguesa h1;
    public HamburguesaConBecon(Hamburguesa h1){
        this.h1=h1;
    }
    @Override
    public double CalculateCost() {
        return 50 + h1.CalculateCost();
    }
}
