public class Cocodrilo extends Reptil {
    private double longitudCola;

    public Cocodrilo(String nombre, int edad, double peso, String habitat, String tipoEscamas, boolean esVenenoso, double longitudCola) {
        super(nombre, edad, peso, habitat, tipoEscamas, esVenenoso);
        this.longitudCola = longitudCola;
    }

    public void nadar() {
        System.out.println(nombre + " está nadando en el río.");
    }

    @Override
    public void emitirSonido() {
        System.out.println(nombre + " gruñe: ¡Grrr!");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Longitud de cola: " + longitudCola + " metros");
    }
}
