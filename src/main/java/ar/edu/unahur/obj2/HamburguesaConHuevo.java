package ar.edu.unahur.obj2;

public class HamburguesaConHuevo extends Hamburguesa{
    public Hamburguesa h1;
    public HamburguesaConHuevo(Hamburguesa h1){
        this.h1=h1;
    }
    @Override
    public double CalculateCost() {
        return 10 + h1.CalculateCost();
    }
}
