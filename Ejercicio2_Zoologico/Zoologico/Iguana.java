public class Iguana extends Reptil {
    private String colorPiel;

    public Iguana(String nombre, int edad, double peso, String habitat, String tipoEscamas, boolean esVenenoso, String colorPiel) {
        super(nombre, edad, peso, habitat, tipoEscamas, esVenenoso);
        this.colorPiel = colorPiel;
    }

    public void tomarSol() {
        System.out.println(nombre + " está tomando el sol para calentarse.");
    }

    @Override
    public void emitirSonido() {
        System.out.println(nombre + " hace un suave chillido.");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Color de piel: " + colorPiel);
    }
}
