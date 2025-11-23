public class RecetaPreparacionCarnes extends RecetaGeneral {

    public RecetaPreparacionCarnes(String titulo) {
        super(titulo);
    }

    @Override
    public String tipoReceta() {
        return "Carnes";
    }

    @Override
    public void mostrarCompleta() {
        System.out.println("=== Receta (CARNES) ===");
        super.mostrarCompleta();
    }
}
