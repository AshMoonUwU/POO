public class RecetaInfusionCasera extends RecetaGeneral {

    public RecetaInfusionCasera(String titulo) {
        super(titulo);
    }

    @Override
    public String tipoReceta() {
        return "Infusion / Bebida";
    }

    @Override
    public void mostrarCompleta() {
        System.out.println("=== Receta (INFUSION) ===");
        super.mostrarCompleta(false); //no mostrar ingredientes por defecto
        System.out.println("(Recomendacion: usar agua filtrada)");
    }
}
