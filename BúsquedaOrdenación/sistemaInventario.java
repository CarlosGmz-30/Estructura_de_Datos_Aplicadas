package BúsquedaOrdenación;

import java.util.Scanner;

/*
Crea un sistema de inventario para una tienda que incluya productos, estos tengan precios
y cantidades en stock. Prepara el arreglo de datos con al menos 10 productos con diferentes
precios y cantidades. Permite al usuario presentar los 5 productos con menor cantidad en stock.
Permite al usuario presentar los 5 productos con mayor costo. Permite al usuario buscar productos
por precios y cantidades en stock donde puedas implementar el uso de un método de ordenamiento y 
realizar la búsqueda por método binario.
 */

public class sistemaInventario {
    public static void main(String[] args) {

        // Zona de variables
        Scanner sc = new Scanner(System.in);
        String[] productos = {
                "Papas", "Manzanas", "Plátanos", "Naranjas", "Fresas",
                "Uvas", "Sandías", "Melones", "Mangos", "Cocos"
        };
        double[] precios = new double[10];
        int[] stock = new int[10];
        int opcion;

        // Zona de relleno de arreglos de precios y stock
        for (int i = 0; i < 10; i++) {
            precios[i] = (int) (Math.random() * 50) + 1;
            stock[i] = (int) (Math.random() * 100) + 1;
        }

        // Zona de menú principal
        do {
            System.out.println("\n*************** Sistema de Inventario ***************\n");

            System.out.println("¿QUÉ DESEA HACER?\n");
            System.out.println("1. Mostrar los 5 productos con menor stock");
            System.out.println("2. Mostrar los 5 productos con mayor costo");
            System.out.println("3. Buscar productos por precio");
            System.out.println("4. Buscar productos por cantidad en stock");
            System.out.println("5. Salir");
            System.out.print("\nSeleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\n*****************************************************\n");
                    mostrarProductosMenorStock(productos, stock);
                    break;
                case 2:
                    System.out.println("\n*****************************************************\n");
                    mostrarProductosMayorCosto(productos, precios);
                    break;
                case 3:
                    System.out.println("\n*****************************************************\n");
                    System.out.print("Ingrese el precio a buscar: ");
                    double precioBuscado = sc.nextDouble();
                    buscarPorPrecio(productos, precios, precioBuscado);
                    break;
                case 4:
                    System.out.println("\n*****************************************************\n");
                    System.out.print("Ingrese la cantidad en stock a buscar:");
                    int cantidadBuscada = sc.nextInt();
                    buscarPorStock(productos, stock, cantidadBuscada);
                    break;
                case 5:
                    System.out.println("\n*****************************************************");
                    System.out.println("SALIENDO...\n");
                    break;
                default:
                    System.out.println("\n*****************************************************\n");
                    System.out.println("Opción no válida. Por favor, elija una opción válida.");
                    break;
            }
        } while (opcion != 5);
        sc.close();
    }

    // Zona de método para ordenar los productos por stock
    public static void mostrarProductosMenorStock(String[] productos, int[] stock) {
        for (int i = 0; i < stock.length - 1; i++) {
            for (int j = 0; j < stock.length - 1 - i; j++) {
                if (stock[j] > stock[j + 1]) {
                    int tempStock = stock[j];
                    stock[j] = stock[j + 1];
                    stock[j + 1] = tempStock;

                    String tempProducto = productos[j];
                    productos[j] = productos[j + 1];
                    productos[j + 1] = tempProducto;
                }
            }
        }

        System.out.println("Los 5 productos con menor stock son:\n");
        for (int i = 0; i < 5; i++) {
            System.out.println(productos[i] + " - Stock: " + stock[i]);
        }
    }

    // Zona de método para ordenar los productos por precio
    public static void mostrarProductosMayorCosto(String[] productos, double[] precios) {
        for (int i = 0; i < precios.length - 1; i++) {
            for (int j = 0; j < precios.length - 1 - i; j++) {
                if (precios[j] < precios[j + 1]) {
                    double tempPrecio = precios[j];
                    precios[j] = precios[j + 1];
                    precios[j + 1] = tempPrecio;

                    String tempProducto = productos[j];
                    productos[j] = productos[j + 1];
                    productos[j + 1] = tempProducto;
                }
            }
        }

        System.out.println("Los 5 productos con mayor costo son:");
        for (int i = 0; i < 5; i++) {
            System.out.println(productos[i] + " - Precio: $" + precios[i]);
        }
    }

    // Zona de método para buscar productos por precio
    public static void buscarPorPrecio(String[] productos, double[] precios, double precioBuscado) {
        boolean encontrado = false;
        System.out.println("Productos encontrados con precio $" + precioBuscado + ":\n");
        for (int i = 0; i < productos.length; i++) {
            if (precios[i] == precioBuscado) {
                System.out.println(productos[i] + " - Precio: $" + precios[i]);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("NO SE ENCONTRARON PRODUCTOS CON ESE PRECIO.\n");
        }
    }

    // Zona de método para buscar productos por cantidad en stock
    public static void buscarPorStock(String[] productos, int[] stock, int cantidadBuscada) {
        boolean encontrado = false;
        System.out.println("Productos con " + cantidadBuscada + " unidades en stock:\n");
        for (int i = 0; i < productos.length; i++) {
            if (stock[i] == cantidadBuscada) {
                System.out.println(productos[i] + " - Stock: " + stock[i]);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("NO SE ENCONTRARON PRODUCTOS CON ESA CANTIDAD EN STOCK.\n");
        }
    }
}
