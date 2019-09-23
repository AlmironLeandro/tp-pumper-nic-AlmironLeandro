package ar.edu.unahur.obj2;

public abstract class Hamburguesa {
        public abstract double CalculateCost();
        private int MedallonesExtras;

    public int getMedallonesExtras() {
        return MedallonesExtras * 50;
    }

    public void setMedallonesExtras(int medallonesExtras) {
        MedallonesExtras = medallonesExtras;
    }

    public void agregarUnMedallonMas(){
            if(MedallonesExtras <4){
                MedallonesExtras++;
            }
            else {
                throw new RuntimeException("No se pueden agregar mas medallones extras");
            }
        }
}
