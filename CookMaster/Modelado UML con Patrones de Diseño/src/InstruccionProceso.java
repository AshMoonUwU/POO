public class InstruccionProceso {

    private String detallePaso;

    public InstruccionProceso(String detalle) {
        this.detallePaso = detalle;
    }

    @Override
    public String toString() {
        return detallePaso;
    }

    // Sobrecarga: agregar prioridad 
    public String toString(int prioridad) {
        return "[" + prioridad + "] " + detallePaso;
    }
}
