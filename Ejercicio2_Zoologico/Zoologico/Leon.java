public class Leon extends Mamifero {
    private boolean melena;

    public Leon(String nombre, int edad, double peso, String habitat, String tipoPelo, double temperaturaCorporal, boolean melena) {
        super(nombre, edad, peso, habitat, tipoPelo, temperaturaCorporal);
        this.melena = melena;
    }

    public void rugir() {
        System.out.println(nombre + " ruge fuertemente.");
    }

    @Override
    public void emitirSonido() {
        System.out.println(nombre + " ruge: ¡Grrrr!");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("¿Tiene melena?: " + (melena ? "Sí" : "No"));
    }
}
