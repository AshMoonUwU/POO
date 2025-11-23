public class FabricaRecetasSimple implements FabricaRecetas {

    @Override
    public RecetaGeneral crearReceta(String tipo) {

        switch (tipo.toLowerCase()) {
            case "dulce":
                return new RecetaDulceTradicional("Postre Dulce Tradicional");

            case "carnes":
                return new RecetaPreparacionCarnes("Preparacion Carnes Casera");

            case "infusion":
                return new RecetaInfusionCasera("Infusion Natural Casera");

            default:
                return new RecetaGeneral("Receta generica creada por fabrica");
        }
    }
}
