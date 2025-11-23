public class ElementoIngrediente {

    private String etiqueta;
    private String cantidadNecesaria;

    // ACA TENGO EL CONSTRUCTOR
    public ElementoIngrediente(String etiqueta, String cantidad) {
        this.etiqueta = etiqueta;
        this.cantidadNecesaria = cantidad;
    }

    //ACA VA MI  SOBRE CARGA DE CONSTRUCTOR 
    public ElementoIngrediente(String etiqueta) {
        this(etiqueta, "cantidad al gusto");
    }

    @Override
    public String toString() {
        return etiqueta + " (" + cantidadNecesaria + ")";
    }

    // GET Y SET
    public String getEtiqueta() { return etiqueta; }
    public String getCantidadNecesaria() { return cantidadNecesaria; }
}
