package Dia2_Java;

import java.util.*;

public class Clases_objetos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lista de campers con notas
        Map<String, Integer> CampersConNotas = new HashMap<>();
        CampersConNotas.put("Maria Gomez", 85);
        CampersConNotas.put("Carlos Lopez", 78);
        CampersConNotas.put("Laura Martinez", 92);

        // Lista de campers en peligro
        ArrayList<String> CampersPeligro = new ArrayList<>(Arrays.asList(
                "Luis Hernandez", "Sofia Diaz", "Diego Torres", "Valeria Ramirez"));

        // Lista de campers matriculados
        ArrayList<String> CampersMatriculados = new ArrayList<>();

        // Lista de todos los campers
        ArrayList<String> Campers = new ArrayList<>(Arrays.asList("Pedro Garcia", "Ana Rodriguez"));
        Campers.addAll(CampersPeligro);
        Campers.addAll(CampersConNotas.keySet());
        Campers.addAll(CampersMatriculados);

        // Rutas de aprendizaje
        ArrayList<String> RutasCampers = new ArrayList<>(Arrays.asList("NodeJS", "Java", "NetCore"));

        // Lista de campers matriculados con detalles
        ArrayList<ArrayList<String>> DetallesCampersMatriculados = new ArrayList<>();
        DetallesCampersMatriculados.add(new ArrayList<>(Arrays.asList(
                "Andrés", "Ramírez", "32", "301-456-7890", "andres.ramirez@email.com",
                "P1", "Carlos Mendoza", "Calle 45 #12-34", "Artemis", "Bajo",
                "10.234.567", "Java", "15/03/2022", "30/06/2025")));

        boolean inicio = true;

        System.out.println("Ingresa tu nombre: ");
        String NombreUsuario = sc.nextLine();

        while (inicio) {
            mostrarMenuPrincipal();
            int eleccion = sc.nextInt();
            sc.nextLine();

            switch (eleccion) {
                case 1:
                    menuCoordinador(sc, NombreUsuario, Campers, CampersPeligro, CampersMatriculados);
                    break;
                case 2:
                    menuTrainer(sc, NombreUsuario, Campers, CampersConNotas);
                    break;
                case 3:
                    menuCamper(sc, NombreUsuario, RutasCampers, CampersConNotas);
                    break;
                case 4:
                    System.out.println("Hasta pronto " + NombreUsuario);
                    inicio = false;
                    break;
                default:
                    System.out.println("Ingresa una opcion valida");
            };
        } sc.close();
    };

    public static void mostrarMenuPrincipal() {
        System.out.println("==========================================================");
        System.out.println("BIENVENIDO AL CENTRO DE DESARROLLO DE SOFTWARE CAMPUSLANDS");
        System.out.println("==========================================================");
        System.out.println("Ingresa tu rol dentro del centro de entrenamiento:");
        System.out.println("1. Coordinador");
        System.out.println("2. Trainer (Profesor)");
        System.out.println("3. Camper (Estudiante)");
        System.out.println("4. Salir del programa");
    };

    public static void menuCoordinador(Scanner sc, String nombre, ArrayList<String> Campers, 
                                       ArrayList<String> CampersPeligro, ArrayList<String> CampersMatriculados) {
        System.out.println("Bienvenido " + nombre + " Coordinador del centro de entrenamiento");
        System.out.println("1. Campers inscritos");
        System.out.println("2. Ver campers en peligro");
        System.out.println("3. Regresar");
        System.out.println("4. Matricular camper nuevo");
        System.out.println("5. Eliminar camper");

        int opcion = sc.nextInt();
        sc.nextLine();

        switch (opcion) {
            case 1:
                System.out.println("Campers que se encuentran en el centro de entrenamiento: ");
                imprimirLista(Campers);
                System.out.println(CampersMatriculados);
                break;
            case 2:
                System.out.println("Los campers en peligro son: ");
                imprimirLista(CampersPeligro);
                break;
            case 3:
                System.out.println("Regresando al menu principal");
                break;
            case 4:
                System.out.println("Ingrese el nombre del camper a matricular: ");
                String nuevoCamper = sc.nextLine();
                
                if (!CampersMatriculados.contains(nuevoCamper)) {
                    CampersMatriculados.add(nuevoCamper);
                    System.out.println(nuevoCamper + " ha sido matriculado con exito");
                } else {
                    System.out.println("El camper ya esta matriculado");
                } break;
            case 5:
                System.out.println("Lista de campers: ");
                imprimirLista(Campers);
                System.out.println("Ingrese el numero del camper que desea eliminar: ");
                int index = sc.nextInt();
                if (index > 0 && index <= Campers.size()) {
                    System.out.println("Se elimino a: " + Campers.remove(index - 1));
                } else {
                    System.out.println("Seleccion invalida");
                } break;
            default:
                System.out.println("Ingresa una opcion valida");
        };
    };

    public static void menuTrainer(Scanner sc, String nombre, ArrayList<String> Campers, Map<String, Integer> CampersConNotas) {
        System.out.println("Bienvenido " + nombre + " Trainer del centro de entrenamiento");
        System.out.println("1. Subir notas de los campers");
        System.out.println("2. Revisar notas de los campers");

        int opcion = sc.nextInt();
        sc.nextLine();

        switch (opcion) {
            case 1:
                System.out.println("Lista de campers:");
                imprimirLista(Campers);

                System.out.println("Selecciona el numero del camper al que deseas asignar una nota: ");
                int indice = sc.nextInt();
                sc.nextLine();

                if (indice < 1 || indice > Campers.size()) {
                    System.out.println("Seleccion invalida");
                } else {
                    String camperSeleccionado = Campers.get(indice - 1);
                    System.out.println("Ingresa la nota nueva (0-100): ");
                    int nuevaNota = sc.nextInt();
                    sc.nextLine();

                    if (nuevaNota < 0 || nuevaNota > 100) {
                        System.out.println("Ingresa una nota valida (0-100)");
                    } else {
                        CampersConNotas.put(camperSeleccionado, nuevaNota);
                        System.out.println("Nota asignada correctamente");
                    };
                } break;
            case 2:
                System.out.println("Notas de los campers:");
                for (Map.Entry<String, Integer> entry : CampersConNotas.entrySet()) {
                    System.out.println(entry.getKey() + " - Nota: " + entry.getValue());
                } break;
            default:
                System.out.println("Ingresa una opcion valida");
        };
    };

    public static void menuCamper(Scanner sc, String nombre, ArrayList<String> RutasCampers, Map<String, Integer> CampersConNotas) {
        System.out.println("Bienvenido " + nombre + " Camper del centro de entrenamiento");
        System.out.println("1. Ver tus notas");
        System.out.println("2. Ver rutas de aprendizaje");

        int opcion = sc.nextInt();
        sc.nextLine();

        switch (opcion) {
            case 1:
                if (CampersConNotas.size() > 1) {
                System.out.println(CampersConNotas);                    
                } else {
                    System.out.println("No tienes notas registradas");  
                } break;
            case 2:
                System.out.println("Las rutas disponibles son: ");
                imprimirLista(RutasCampers);
                break;
            default:
                System.out.println("Ingresa una opcion valida");
        };
    };

    public static void imprimirLista(ArrayList<String> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println((i + 1) + ". " + lista.get(i));
        };
    };
};