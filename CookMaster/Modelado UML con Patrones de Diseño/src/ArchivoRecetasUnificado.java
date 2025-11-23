import java.util.ArrayList;
import java.util.List;

public class ArchivoRecetasUnificado {

    private static ArchivoRecetasUnificado referenciaCompartida;
    private List<RecetaGeneral> coleccionRecetasGuardadas;

    private ArchivoRecetasUnificado() {
        coleccionRecetasGuardadas = new ArrayList<>();
    }

    public static ArchivoRecetasUnificado accederArchivo() {
        if (referenciaCompartida == null) {
            referenciaCompartida = new ArchivoRecetasUnificado();
        }
        return referenciaCompartida;
    }

    public void registrarReceta(RecetaGeneral receta) {
        coleccionRecetasGuardadas.add(receta);
    }

    public List<RecetaGeneral> consultarRecetas() {
        return coleccionRecetasGuardadas;
    }
}
