package ar.edu.unahur.obj2;

public class HamburguesaQuesoAzul extends Hamburguesa{
    public Hamburguesa h1;
    public HamburguesaQuesoAzul(Hamburguesa h1){
    this.h1=h1;
    }
    @Override
    public double CalculateCost() {
        return 20 + h1.CalculateCost();
    }
}
