public class ConstructorPostreCasero implements ConstructorRecetasPasoAPaso {

    private RecetaDulceTradicional recetaActual;

    @Override
    public void comenzarNuevaReceta() {
        recetaActual = new RecetaDulceTradicional("Postre Casero Artesanal");
    }

    @Override
    public void incorporarComponente(String etiqueta, String cantidad) {
        recetaActual.agregarComponente(new ElementoIngrediente(etiqueta, cantidad));
    }

    @Override
    public void anotarPaso(String descripcion) {
        recetaActual.agregarPaso(new InstruccionProceso(descripcion));
    }

    @Override
    public RecetaGeneral finalizarReceta() {
        return recetaActual;
    }
}
