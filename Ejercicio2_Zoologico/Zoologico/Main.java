public class Main {
    public static void main(String[] args) {
        // Crear animales
        Leon leon = new Leon("Simba", 5, 190.5, "Sabana", "Corto", 38.5, true);
        Elefante elefante = new Elefante("Dumbo", 10, 5000, "Selva", "Grueso", 36.7, 120);
        Cocodrilo coco = new Cocodrilo("Coco", 8, 400, "Río", "Dura", false, 1.8);
        Iguana iguana = new Iguana("Iggy", 3, 4.5, "Desierto", "Suave", false, "Verde");

        // Crear usuarios
        Registrador reg = new Registrador("Carlos", 101, "1234", "Mamíferos");
        Guia guia = new Guia("Laura", 102, "abcd", "Ruta Norte");
        Admin admin = new Admin("Sofía", 100, "admin", "8am - 5pm");

        // Acciones del sistema
        reg.login();
        reg.registrarAnimal(leon);
        guia.guiarVisita();
        guia.mostrarInformacion(elefante);
        admin.asignarPermisos(reg);

        // Mostrar info de todos los animales
        Animal[] animales = {leon, elefante, coco, iguana};
        System.out.println("\n--- Información de los animales ---");
        for (Animal a : animales) {
            a.mostrarInfo();
            a.emitirSonido();
            System.out.println("----------------------");
        }
    }
}
