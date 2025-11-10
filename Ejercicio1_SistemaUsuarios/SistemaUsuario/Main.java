public class Main {
    public static void main(String[] args) {

        Administrador admin = new Administrador("Laura", 1, "admin123", "Lunes a Viernes 8am-5pm");
        Profesor profe = new Profesor("Carlos", 2, "prof456", "Matemáticas", "Lunes y Miércoles 9am-12pm");
        Estudiante est = new Estudiante("Ana", 3, "estu789", "Lunes-Viernes 7am-12pm", "Grupo A");

        System.out.println("\n--- Información de los usuarios ---");
        admin.verInfo();
        profe.verInfo();
        est.verInfo();

        System.out.println("\n--- Acciones del Administrador ---");
        admin.crearNota();
        admin.agregarUsuario();
        admin.verListaUsuarios();

        System.out.println("\n--- Acciones del Profesor ---");
        profe.administrarNotas();
        profe.crearNota();
        profe.borrarNota();

        System.out.println("\n--- Acciones del Estudiante ---");
        est.subirTrabajo();
        est.actualizarInformacion();
    }
}
