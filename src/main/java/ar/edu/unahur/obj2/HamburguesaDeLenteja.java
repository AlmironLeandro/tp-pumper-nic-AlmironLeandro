package ar.edu.unahur.obj2;

public class HamburguesaDeLenteja extends Hamburguesa {

    @Override
    public double CalculateCost() {
        return 220 + getMedallonesExtras();
    }
}
