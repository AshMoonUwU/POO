public class Elefante extends Mamifero {
    private int tamañoColmillos;

    public Elefante(String nombre, int edad, double peso, String habitat, String tipoPelo, double temperaturaCorporal, int tamañoColmillos) {
        super(nombre, edad, peso, habitat, tipoPelo, temperaturaCorporal);
        this.tamañoColmillos = tamañoColmillos;
    }

    public void barritar() {
        System.out.println(nombre + " barrita: ¡Pawoo!");
    }

    @Override
    public void emitirSonido() {
        System.out.println(nombre + " barrita fuertemente.");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tamaño de colmillos: " + tamañoColmillos + " cm");
    }
}
