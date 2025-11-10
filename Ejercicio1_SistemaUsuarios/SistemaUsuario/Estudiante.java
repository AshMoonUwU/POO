public class Estudiante extends Usuario {
    private String horarioClase;
    private String grupo;

    public Estudiante(String nombre, int id, String clave, String horarioClase, String grupo) {
        super(nombre, id, clave);
        this.horarioClase = horarioClase;
        this.grupo = grupo;
    }

    public void subirTrabajo() {
        System.out.println(nombre + " subió un nuevo trabajo.");
    }

    public void actualizarInformacion() {
        System.out.println(nombre + " actualizó su información personal.");
    }

    @Override
    public void verInfo() {
        super.verInfo();
        System.out.println("Horario de clase: " + horarioClase);
        System.out.println("Grupo: " + grupo);
    }
}
