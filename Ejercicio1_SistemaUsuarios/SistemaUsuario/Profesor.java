public class Profesor extends Usuario{
    private String materiaAsignada;
    private String horarioClase;

    public Profesor(String nombre, int id, String clave, String materiaAsignada, String horarioClase) {
        super(nombre, id, clave);
        this.materiaAsignada = materiaAsignada;
        this.horarioClase = horarioClase;
    }

    public void editarNotas() {
        System.out.println(nombre + " editó las notas de sus estudiantes.");
    }

    public void administrarNotas() {
        System.out.println(nombre + " administró las notas de la materia " + materiaAsignada);
    }

    public void crearNota() {
        System.out.println(nombre + " creó una nueva nota.");
    }

    public void borrarNota() {
        System.out.println(nombre + " borró una nota.");
    }

    @Override
    public void verInfo() {
        super.verInfo();
        System.out.println("Materia asignada: " + materiaAsignada);
        System.out.println("Horario de clase: " + horarioClase);
    }
}
