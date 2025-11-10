public class Usuario {
    protected String nombre;
    protected int id;
    protected String clave;

    public Usuario(String nombre, int id, String clave) {
        this.nombre = nombre;
        this.id = id;
        this.clave = clave;
    }

    public void login() {
        System.out.println(nombre + " ha iniciado sesión en el sistema del zoológico.");
    }

    public void verInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + id);
    }
}
