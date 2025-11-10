public class Guia extends Usuario {
    private String rutaAsignada;

    public Guia(String nombre, int id, String clave, String rutaAsignada) {
        super(nombre, id, clave);
        this.rutaAsignada = rutaAsignada;
    }

    public void guiarVisita() {
        System.out.println(nombre + " está guiando una visita en la ruta " + rutaAsignada);
    }

    public void mostrarInformacion(Animal a) {
        System.out.println(nombre + " está explicando información sobre el " + a.nombre);
        a.mostrarInfo();
    }

    public void controlarAcceso() {
        System.out.println(nombre + " controla el acceso del público en la ruta " + rutaAsignada);
    }

    @Override
    public void verInfo() {
        super.verInfo();
        System.out.println("Ruta asignada: " + rutaAsignada);
    }
}
