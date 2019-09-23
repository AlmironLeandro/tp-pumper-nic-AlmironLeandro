package ar.edu.unahur.obj2;

public class HamburguesaDeCarne extends Hamburguesa{

    @Override
    public double CalculateCost() {
        return 200 + getMedallonesExtras();
    }
}
