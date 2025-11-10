public class Administrador extends Usuario{
    private String horarioTrabajo;

    public Administrador(String nombre, int id, String clave, String horarioTrabajo) {
        super(nombre, id, clave);
        this.horarioTrabajo = horarioTrabajo;
    }

    public void modificarNota() {
        System.out.println(nombre + " modificó una nota.");
    }

    public void eliminarNota() {
        System.out.println(nombre + " eliminó una nota.");
    }

    public void asignarPermisos() {
        System.out.println(nombre + " asignó permisos a un usuario.");
    }

    public void agregarUsuario() {
        System.out.println(nombre + " agregó un nuevo usuario.");
    }

    public void eliminarUsuario() {
        System.out.println(nombre + " eliminó un usuario del sistema.");
    }

    public void crearNota() {
        System.out.println(nombre + " creó una nueva nota.");
    }

    public void verListaUsuarios() {
        System.out.println(nombre + " está viendo la lista de usuarios.");
    }

    @Override
    public void verInfo() {
        super.verInfo();
        System.out.println("Horario de trabajo: " + horarioTrabajo);
    }
}
