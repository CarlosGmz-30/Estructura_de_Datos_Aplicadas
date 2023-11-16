import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        cola<String> colaPaquete = new cola<>();
        cola<String> colaPostergado = new cola<>();
        Scanner sc = new Scanner(System.in);
        int opprin, cont = 0;
        try {
            do {
                System.out.println("--------------- PAQUETERÍA ---------------\n");
                System.out.println("¿Qué desea hacer?\n");
                System.out.println(
                        "1.Agregar paquete\n2.Postergar paquete\n3.Cancelar paquete\n4.Entregar paquetes\n5.Entregar postergados\n6.Salir");
                System.out.print("\nSelecciona una opción: ");
                opprin = sc.nextInt();
                sc.nextLine();

                switch (opprin) {
                    case 1:
                        System.out.println("\n------------ AGREGAR PAQUETE -----------\n");
                        if (colaPaquete.colaLlena()) {
                            System.out.println("\n¡PAQUETERÍA LLENA!\n");
                        } else {
                            System.out.print("Nombre del paquete: ");
                            String nombre = sc.nextLine();
                            cont++;
                            colaPaquete.insertar(nombre);
                            System.out.println("\n¡PAQUETE AGREGADO CON ÉXITO!\n");
                        }
                        break;
                    case 2:
                        System.out.println("\n----------- POSTERGAR PAQUETE ----------");
                        int tamanioCola = colaPostergado.obtenerTamanio();
                        if (tamanioCola == 3) {
                            System.out.println("\n¡NO HAY MÁS ESPACIO PARA POSTERGAR PAQUETES!\n");
                        } else {
                            if (!colaPaquete.colaVacia()) {
                                String paquetePostergado = colaPaquete.quitar();
                                colaPostergado.insertar(paquetePostergado);
                                cont--;
                                System.out.println("\n¡PAQUETE POSTERGADO!\n");
                                if (cont <= 0) {
                                    colaPaquete.reiniciarCola();
                                }
                            } else {
                                System.out.println("\n¡ERROR!, Sin paquetes disponibles\n");
                            }
                        }
                        break;
                    case 3:
                        System.out.println("\n------------ CANCELAR PAQUETE ----------\n");
                        if (!colaPaquete.colaVacia()) {
                            colaPaquete.quitar();
                            System.out.println("\n¡PAQUETE CANCELADO CON ÉXITO!\n");
                            cont--;
                            if (cont <= 0) {
                                colaPaquete.reiniciarCola();
                            }
                        } else {
                            System.out.println("\n¡ERROR!, Sin paquetes disponibles\n");
                        }
                        break;
                    case 4:
                        System.out.println("\n----------- ENTREGAR PAQUETES ----------\n");
                        if (!colaPaquete.colaVacia()) {
                            while (!colaPaquete.colaVacia()) {
                                String paqueteEntregado = colaPaquete.quitar();
                                System.out.println("Paquete entregado: " + paqueteEntregado);
                            }
                            System.out.println("\n¡TODOS LOS PAQUETES FUERON ENTREGADOS!\n");
                            colaPaquete.reiniciarCola();
                        } else {
                            System.out.println("\n¡ERROR!, Sin paquetes disponibles\n");
                        }
                        break;
                    case 5:
                        System.out.println("\n----------- PAQUETES POSTERGADOS ----------\n");
                        if (!colaPostergado.colaVacia()) {
                            while (!colaPostergado.colaVacia()) {
                                String paquetePostergado = colaPostergado.quitar();
                                System.out.println("Paquete entregado: " + paquetePostergado);
                            }
                            System.out.println("\n¡TODOS LOS PAQUETES POSTERGADOS FUERON ENTREGADOS!\n");
                            colaPostergado.reiniciarCola();
                        } else {
                            System.out.println("¡ERROR!, Sin paquetes postergados disponibles\n");
                        }
                        break;
                    case 6:
                        System.out.println("\nSALIENDO...\n");
                        break;
                    default:
                        System.out.println("\n¡ERROR!, selecciona una opción válida\n");
                        break;
                }
            } while (opprin != 6);

        } catch (Exception e) {
            e.printStackTrace();
        }
        sc.close();
    }
}
