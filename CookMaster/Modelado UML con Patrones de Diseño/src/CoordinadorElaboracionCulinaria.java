public class CoordinadorElaboracionCulinaria {

    public RecetaGeneral generarPostreClasico(ConstructorRecetasPasoAPaso constructor) {

        constructor.comenzarNuevaReceta();

        constructor.incorporarComponente("Azucar blanca", "200g");
        constructor.incorporarComponente("Harina suave", "300g");
        constructor.incorporarComponente("Huevos frescos", "2 unidades");

        constructor.anotarPaso("Integrar todos los componentes en un tazon amplio.");
        constructor.anotarPaso("Mezclar hasta lograr una textura homogenea.");
        constructor.anotarPaso("Hornear durante 30 minutos a temperatura media.");

        return constructor.finalizarReceta();
    }
}
