package ar.edu.unahur.obj2;

public class HamburguesaConCebollaCaramelizada  extends Hamburguesa{
    public Hamburguesa h1;
    public HamburguesaConCebollaCaramelizada(Hamburguesa h1){
        this.h1=h1;
    }
    @Override
    public double CalculateCost() {
        return 60 + h1.CalculateCost();
    }
}
