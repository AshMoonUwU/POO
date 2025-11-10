public class Animal {
    protected String nombre;
    protected int edad;
    protected double peso;
    protected String habitat;

    public Animal(String nombre, int edad, double peso, String habitat) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.habitat = habitat;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Hábitat: " + habitat);
    }

    public void emitirSonido() {
        System.out.println(nombre + " hace un sonido.");
    }
}
