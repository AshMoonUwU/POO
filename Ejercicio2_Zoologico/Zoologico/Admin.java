public class Admin extends Usuario {
    private String horarioTrabajo;

    public Admin(String nombre, int id, String clave, String horarioTrabajo) {
        super(nombre, id, clave);
        this.horarioTrabajo = horarioTrabajo;
    }

    public void asignarPermisos(Usuario u) {
        System.out.println(nombre + " asignó permisos a " + u.nombre);
    }

    public void agregarUsuario(Usuario u) {
        System.out.println(nombre + " agregó al usuario " + u.nombre);
    }

    public void eliminarUsuario(Usuario u) {
        System.out.println(nombre + " eliminó al usuario " + u.nombre);
    }

    public void crearNota() {
        System.out.println(nombre + " creó una nueva nota de registro.");
    }

    public void modificarNota() {
        System.out.println(nombre + " modificó una nota.");
    }

    public void eliminarNota() {
        System.out.println(nombre + " eliminó una nota.");
    }

    public void verListaUsuarios() {
        System.out.println(nombre + " está viendo la lista de usuarios registrados.");
    }

    @Override
    public void verInfo() {
        super.verInfo();
        System.out.println("Horario de trabajo: " + horarioTrabajo);
    }
}
