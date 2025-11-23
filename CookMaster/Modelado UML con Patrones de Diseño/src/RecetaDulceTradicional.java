public class RecetaDulceTradicional extends RecetaGeneral {

    public RecetaDulceTradicional(String titulo) {
        super(titulo); // llama al constructor del padre
    }

    @Override
    public String tipoReceta() {
        return "Dulce tradicional";
    }

    //sobreescritura: mostrar con nota especial
    @Override
    public void mostrarCompleta() {
        System.out.println("=== Receta (DULCE) ===");
        super.mostrarCompleta();
        System.out.println("(Esta receta es ideal para postres caseros)");
    }
}
