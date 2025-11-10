public class Registrador extends Usuario {
    private String areaEncargada;

    public Registrador(String nombre, int id, String clave, String areaEncargada) {
        super(nombre, id, clave);
        this.areaEncargada = areaEncargada;
    }

    public void registrarAnimal(Animal a) {
        System.out.println(nombre + " registró un nuevo animal: " + a.nombre);
    }

    public void editarAnimal(Animal a) {
        System.out.println(nombre + " editó la información del animal: " + a.nombre);
    }

    public void eliminarAnimal(Animal a) {
        System.out.println(nombre + " eliminó el registro del animal: " + a.nombre);
    }

    public void listarAnimales() {
        System.out.println(nombre + " está viendo la lista de animales del área " + areaEncargada);
    }

    @Override
    public void verInfo() {
        super.verInfo();
        System.out.println("Área encargada: " + areaEncargada);
    }
}
