import java.util.ArrayList;
import java.util.List;

public class RecetaGeneral {

    protected String tituloReceta;
    protected List<ElementoIngrediente> listaComponentes;
    protected List<InstruccionProceso> secuenciaPreparacion;
    protected String tiempoTotal;

    // Constructor vacio
    public RecetaGeneral() {
        this.tituloReceta = "Receta sin titulo";
        this.listaComponentes = new ArrayList<>();
        this.secuenciaPreparacion = new ArrayList<>();
        this.tiempoTotal = "no especificado";
    }

    // Constructor sobrecargado 
    public RecetaGeneral(String titulo) {
        this();
        this.tituloReceta = titulo;
    }

    // Sobrecarga de fijarTitulo
    public void fijarTitulo(String titulo) {
        this.tituloReceta = titulo;
    }

    public void fijarTitulo(String titulo, boolean enMayusculas) {
        this.tituloReceta = enMayusculas ? titulo.toUpperCase() : titulo;
    }

    public void agregarComponente(ElementoIngrediente elemento) {
        this.listaComponentes.add(elemento);
    }

    public void agregarPaso(InstruccionProceso paso) {
        this.secuenciaPreparacion.add(paso);
    }

    public void fijarTiempo(String tiempo) {
        this.tiempoTotal = tiempo;
    }

    // Mostrar (sobrecarga: mostrarCompleta() y mostrarCompleta(boolean))
    public void mostrarCompleta() {
        mostrarCompleta(true);
    }

    public void mostrarCompleta(boolean mostrarComponentes) {
        System.out.println("o.O" + tituloReceta);
        if (mostrarComponentes) {
            System.out.println("Componentes:");
            if (listaComponentes.isEmpty()) System.out.println(" - (ninguno)");
            for (ElementoIngrediente e : listaComponentes) {
                System.out.println(" - " + e);
            }
        }
        System.out.println("Pasos:");
        if (secuenciaPreparacion.isEmpty()) System.out.println(" - (ninguno)");
        for (InstruccionProceso p : secuenciaPreparacion) {
            System.out.println(" * " + p);
        }
        System.out.println("Tiempo estimado: " + tiempoTotal);
    }

    // Metodo que puede ser sobrescrito por subclases (polimorfismo)
    public String tipoReceta() {
        return "Generica";
    }
}
