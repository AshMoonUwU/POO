public class Reptil extends Animal {
    protected String tipoEscamas;
    protected boolean esVenenoso;

    public Reptil(String nombre, int edad, double peso, String habitat, String tipoEscamas, boolean esVenenoso) {
        super(nombre, edad, peso, habitat);
        this.tipoEscamas = tipoEscamas;
        this.esVenenoso = esVenenoso;
    }

    public void mudarPiel() {
        System.out.println(nombre + " está mudando de piel.");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo de escamas: " + tipoEscamas);
        System.out.println("¿Es venenoso?: " + (esVenenoso ? "Sí" : "No"));
    }
}
