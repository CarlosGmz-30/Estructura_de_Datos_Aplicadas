package EjercicioServicioMedico;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import EjercicioManipulacionTareas.tarea;

public class main {
    public static void main(String[] args) {
        // Zona de declaración de variables
        Queue<paciente> colaPacientes = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int opprin = 0;

        // Zona de menú principal
        do {
            System.out.println("------------ SERVICIO MÉDICO ------------\n");
            System.out.println("¿Qué dese hacer?\n");
            System.out.println("1.Añadir paciente\n2.Consultar pacientes\n3.Atender pacientes\n4.Salir");
            System.out.print("\nSelecciona una opción: ");
            opprin = sc.nextInt();
            sc.nextLine();
            switch (opprin) {
                case 1:
                    System.out.println("\n------------ AÑADIR PACIENTE ------------\n");
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Prioridad (alta/baja): ");
                    String prioridad = sc.nextLine();
                    System.out.print("Problema: ");
                    String problema = sc.nextLine();
                    // Creamos un nuevo paciente y lo agregamos a nuestra cola
                    paciente nuevoPaciente = new paciente(nombre, prioridad, problema);
                    colaPacientes.add(nuevoPaciente);
                    System.out.println("\n¡PACIENTE AGREGADO CORRECTAMENTE!\n");
                    break;
                case 2:
                    System.out.println("\n---------- CONSULTAR PACIENTES ----------\n");
                    if (colaPacientes.isEmpty()) {
                        System.out.println("¡NO HAY PACIENTES REGISTRADOS AÚN!\n");
                    } else {
                        for (paciente paciente : colaPacientes) {
                            System.out.println("Nombre: " + paciente.getNombre());
                            System.out.println("Prioridad: " + paciente.getPrioridad());
                            System.out.println("Problema: " + paciente.getProblema());
                            System.out.println();
                        }
                    }
                    break;
                case 3:
                    System.out.println("\n----------- ATENDER PACIENTES -----------\n");
                    if (colaPacientes.isEmpty()) {
                        System.out.println("¡NO HAY PACIENTES REGISTRADOS AÚN!\n");
                    } else {
                        int numPacientes = colaPacientes.size();
                        for (int i = 0; i < numPacientes; i++) {
                            paciente paciente = colaPacientes.poll();
                            System.out.println("Paciente [" + paciente.getNombre() + "] atendido");
                        }
                        System.out.println("\n¡TODOS LOS PACIENTES HAN SIDO ATENDIDOS!\n");
                    }
                    break;
                case 4:
                    System.out.println("\nSALIENDO...\n");
                    sc.close();
                    break;
                default:
                    System.out.println("¡ERROR! Selecciona una opción inválida");
                    break;
            }
        } while (opprin != 4);
    }

}
