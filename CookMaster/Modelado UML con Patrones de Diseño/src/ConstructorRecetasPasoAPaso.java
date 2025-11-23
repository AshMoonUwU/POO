public interface ConstructorRecetasPasoAPaso {

    void comenzarNuevaReceta();
    void incorporarComponente(String etiqueta, String cantidad);
    void anotarPaso(String descripcion);
    RecetaGeneral finalizarReceta();
}
