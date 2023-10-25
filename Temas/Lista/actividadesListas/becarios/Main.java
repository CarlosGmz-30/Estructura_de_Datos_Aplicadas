package becarios;

import java.util.ArrayList;
import java.util.List;

/*
Desarrolla un programa de becarios. De una lista de alumnos
(objeto con atributos: Nombre, grado y promedio) filtra los datos
de los promedios de 10 y 9 con diferentes en dos listas diferentes.
Después presenta cada lista. Los datos pueden ser estáticos.
 */

public class Main {
    public static void main(String[] args) {
        // Zona de incialización de alumnos
        Estudiante e1 = new Estudiante("Carlos", 4, 10);
        Estudiante e2 = new Estudiante("Keyla", 4, 9.4);
        Estudiante e3 = new Estudiante("Daniela", 3, 9.7);
        Estudiante e4 = new Estudiante("Castor", 3, 9.7);
        Estudiante e5 = new Estudiante("Alejandro", 5, 8.2);
        Estudiante e6 = new Estudiante("Alexa", 5, 10);
        Estudiante e7 = new Estudiante("Jesse", 2, 9.5);
        Estudiante e8 = new Estudiante("Yamila", 2, 9.0);
        Estudiante e9 = new Estudiante("Alan", 1, 10);
        Estudiante e10 = new Estudiante("Diego", 1, 10);

        // Zona de inicialización de listas
        List<Estudiante> estudiantes = new ArrayList<>();
        List<Estudiante> listaDiez = new ArrayList<>();
        List<Estudiante> listaNueve = new ArrayList<>();

        // Zona de llenado de lista de estudiantes
        estudiantes.add(e1);
        estudiantes.add(e2);
        estudiantes.add(e3);
        estudiantes.add(e4);
        estudiantes.add(e5);
        estudiantes.add(e6);
        estudiantes.add(e7);
        estudiantes.add(e8);
        estudiantes.add(e9);
        estudiantes.add(e10);

        // Zona de filtro de estudiantes
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getPromedio() >= 9.0 && estudiante.getPromedio() < 10.0) {
                listaNueve.add(estudiante);
            } else if (estudiante.getPromedio() == 10.0) {
                listaDiez.add(estudiante);
            }
        }

        // Zona de mostrado de listas
        System.out.println("Alumnos con promedio de 10: ");
        for (Estudiante estudiante : listaDiez) {
            System.out.println("- " + estudiante.getNombre() + " " + estudiante.getPromedio());
        }

        System.out.println("Alumnos con promedio de 9: ");
        for (Estudiante estudiante : listaNueve) {
            System.out.println("- " + estudiante.getNombre() + " " + estudiante.getPromedio());
        }
    }
}