public class IniciadorCulinario {

    public static void main(String[] args) {

        // aca puse el Builder y el Director
        ConstructorRecetasPasoAPaso constructor = new ConstructorPostreCasero();
        CoordinadorElaboracionCulinaria coordinador = new CoordinadorElaboracionCulinaria();
        RecetaGeneral recetaBuilder = coordinador.generarPostreClasico(constructor);

        // este es el Factory 
        FabricaRecetas fabrica = new FabricaRecetasSimple();
        RecetaGeneral recetaDesdeFabrica = fabrica.crearReceta("dulce");

        // este seria el Singleton
        ArchivoRecetasUnificado archivo = ArchivoRecetasUnificado.accederArchivo();
        archivo.registrarReceta(recetaBuilder);
        archivo.registrarReceta(recetaDesdeFabrica);

        // para poder Mostrar
        System.out.println("\n=== Recetas Guardadas ===");
        for (RecetaGeneral r : archivo.consultarRecetas()) {
            r.mostrarCompleta();
            System.out.println("--------------------------");
        }

        // este seria mi polimorfismo,sobrecarga:
        System.out.println("\n=== Ejemplo: Mostrar solo títulos (sobrecarga no directa pero uso de metodos) ===");
        recetaBuilder.mostrarCompleta(false); // usa la sobrecarga que oculta ingredientes
    }
}
