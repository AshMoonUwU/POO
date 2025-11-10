public class Mamifero extends Animal {
    protected String tipoPelo;
    protected double temperaturaCorporal;

    public Mamifero(String nombre, int edad, double peso, String habitat, String tipoPelo, double temperaturaCorporal) {
        super(nombre, edad, peso, habitat);
        this.tipoPelo = tipoPelo;
        this.temperaturaCorporal = temperaturaCorporal;
    }

    public void amamantar() {
        System.out.println(nombre + " está amamantando a sus crías.");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo de pelo: " + tipoPelo);
        System.out.println("Temperatura corporal: " + temperaturaCorporal + "°C");
    }
}
