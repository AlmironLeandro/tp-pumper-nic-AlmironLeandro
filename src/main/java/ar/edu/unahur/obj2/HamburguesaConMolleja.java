package ar.edu.unahur.obj2;

public class HamburguesaConMolleja  extends  Hamburguesa{
    public Hamburguesa h1;
    public HamburguesaConMolleja(Hamburguesa h1){
        this.h1=h1;
    }
    @Override
    public double CalculateCost() {
        return 80 + h1.CalculateCost();
    }
}
