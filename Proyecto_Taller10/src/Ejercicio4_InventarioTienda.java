import java.util.Scanner;
/**
 * Crea un programa que gestione el inventario de una tienda. Utiliza una matriz bidimensional para almacenar 
 * los productos disponibles en la tienda, con información como nombre, precio y cantidad. El programa debe permitir 
 * agregar nuevos productos, actualizar existencias, buscar productos y eliminarlos.
 * @author Luis
 */
public class Ejercicio4_InventarioTienda {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int num = 0, tipoProceso = 0;
        boolean continuar = true;
        String actualizar, eliminar;
        String[][] productos = new String[20][3];
        System.out.print("BIENVENIDO A TU TIENDA");
        System.out.println("");
        while (continuar == true) {
            System.out.print("\nSeleccione el tipo de proceso que quiera realizar:\n");
            System.out.print(" 1. Agregar un nuevo producto\n 2. Actualizar producto\n 3. Buscar un producto \n 4. Eliminar un producto\n 5. Terminar\n");
            System.out.print("Proceso: ");
            tipoProceso = tcl.nextInt();
            tcl.nextLine();
            if (tipoProceso == 5) {
                continuar = false;
            }
            if (tipoProceso == 1) {
                System.out.print("Ingrese la cantidad de productos que desee agregar: ");
                num = tcl.nextInt();
                tcl.nextLine();
                if (num == 0) {
                    continuar = false;
                }
                for (int i = 0; i < num; i++) {
                    System.out.print("Nombre del producto: ");
                    productos[i][0] = tcl.nextLine();
                    System.out.print("Precio del producto: ");
                    productos[i][1] = tcl.nextLine();
                    System.out.print("Cantidad del producto: ");
                    productos[i][2] = tcl.nextLine();
                }
            }        
            if (tipoProceso == 2) {
                System.out.println("Ingrese el nombre del produco que desee actualizar: ");
                actualizar = tcl.nextLine();
                tcl.nextLine();
                for (int i = 0; i < num; i++) {
                    if (productos[i][0].equalsIgnoreCase(actualizar)) {
                        System.out.print("Ingrese el nombre del nuevo producto: ");
                        actualizar = tcl.nextLine();
                        tcl.nextLine();
                        productos[i][0] = actualizar;
                        System.out.print("Ingrese el precio del nuevo producto: ");
                        productos[i][1] = tcl.nextLine();
                        System.out.print("Ingrese la cantidad del nuevo producto: ");
                        productos[i][2] = tcl.nextLine();
                        System.out.println(productos[i][0]);
                        System.out.println(productos[i][1]);
                        System.out.println(productos[i][2]);
                        actualizar = "";
                    }
                }
            }
            if (tipoProceso == 3) {
                System.out.print("Ingrese el nombre del producto que desee encontrar: ");
                actualizar = tcl.nextLine();
                tcl.nextLine();
                for (int i = 0; i < num; i++) {
                    if (productos[i][0].equalsIgnoreCase(actualizar)) {
                        System.out.print("Puede encontrar el producto en: " + i + "\n");
                        System.out.print("Producto: " + productos[i][0] + " Precio: " + productos[i][1] + " Cantidad: " + productos[i][2]);
                        actualizar = "";
                    }
                }
            }
            if (tipoProceso == 4) {
                System.out.print("Ingrese el nombre del producto que desee eliminar: ");
                eliminar = tcl.nextLine();
                tcl.nextLine();
                for (int i = 0; i < num; i++) {
                    if (productos[i][0].equalsIgnoreCase(eliminar)) {
                        System.out.print("El siguiente producto va a ser borrado: " + productos[i][0] + "\n");
                        for (int j = 0; j < productos[0].length; j++) {
                            productos[i][j] = "";
                        }
                        eliminar = "";
                    }
                }
            }
        }
    }
}
/***
 * run:
 * BIENVENIDO A TU TIENDA

* Seleccione el tipo de proceso que quiera realizar:
* 1. Agregar un nuevo producto
* 2. Actualizar producto
* 3. Buscar un producto 
* 4. Eliminar un producto
* 5. Terminar
* Proceso: 1
* Ingrese la cantidad de productos que desee agregar: 2
* Nombre del producto: Fideos
* Precio del producto: 3,5
* Cantidad del producto: 20
* Nombre del producto: Pan integral
* Precio del producto: 2,30
* Cantidad del producto: 40
* Seleccione el tipo de proceso que quiera realizar:
* 1. Agregar un nuevo producto
* 2. Actualizar producto
* 3. Buscar un producto 
* 4. Eliminar un producto
* 5. Terminar
* Proceso: 5
* BUILD SUCCESSFUL (total time: 54 seconds)
 */