public class Main {
    public static void main(String[] args) {
        // Modalidad a) Crear las clases componentes como clases anidadas y en el programa main() crear objetos de las clases componentes a partir de la clase externa
        Bicicleta.TODO bicicleta = new Bicicleta.TODO(26, "MTB", "Aluminio", "Aluminio", "MTB", 18, "Disco", "Shimano", 160);
        bicicleta.mostrarInformacion();
    }
}
