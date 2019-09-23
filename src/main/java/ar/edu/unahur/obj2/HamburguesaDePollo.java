package ar.edu.unahur.obj2;

public class HamburguesaDePollo extends Hamburguesa {
    @Override
    public double CalculateCost() {
        return 150 + getMedallonesExtras();
    }
}
