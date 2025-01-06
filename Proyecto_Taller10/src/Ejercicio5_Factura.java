import java.util.Scanner;
/**
 * Crea un programa que gestione el inventario de una tienda, así como la emisión de facturas. Utiliza una matriz bidimensional para almacenar 
 * los productos disponibles en la tienda, con información como nombre, precio y cantidad. El programa debe permitir facturar un producto 
 * dado su código, y unidades deseadas. Adicional se debe agregar a la factura al 15% del IVA, y si la compra superar los $100, se debe aplicar un descuento.
 * @author Luis
 */
public class Ejercicio5_Factura {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int cont = 0, cantidad = 0;
        double costo = 0, descuento = 0;
        String producto = " ";
        System.out.print("Ingrese la cantidad de productos que va a llevar: ");
        cont = tcl.nextInt();
        String[] productos = new String[cont];
        double[][] precioycantidad = new double[cont][2];
        for (int i = 0; i < productos.length; i++) {
            tcl.nextLine();
            System.out.print("Ingrese el nombre del producto: ");
            productos[i] = tcl.nextLine();
            System.out.print("Ingrese el precio del producto: ");
            precioycantidad[i][0] = tcl.nextDouble();
            System.out.print("Ingrese la cantidad del producto: ");
            precioycantidad[i][1] = tcl.nextDouble();
        }
        tcl.nextLine(); 
        System.out.print("Ingrese el nombre del producto que va a llevar: ");
        producto = tcl.nextLine();
        for (int i = 0; i < productos.length; i++) {
            if (producto.equalsIgnoreCase(productos[i])) {
                System.out.print("Producto disponible");
                System.out.print("\nIngrese las unidades de producto que va a llevar: ");
                cantidad = tcl.nextInt();
                if (cantidad > precioycantidad[i][1]) {
                    System.out.print("No hay cantidades suficientes del profcuto\nLas cantidades disponibles son: " + precioycantidad[i][1]);
                    break;
                } else {
                    System.out.print("Cantidad disponible\nFACTURIZACION\n");
                    costo = (cantidad * precioycantidad[i][0]);
                }
                if (costo > 100) {
                    descuento = costo * 0.05;
                    costo = costo - descuento;
                }
                System.out.printf("%s  %s\t%s\t%s\t\n", "Producto", "Cantidad", "Costo", "Descuento");
                System.out.printf("%s\t  %d\t\t%.2f\t%.2f\n", productos[i], cantidad, costo, descuento);
            } else {
                System.out.println("Producto no disponible");
                break;
            }
        }
        System.out.println("");
    }
}

/***
 * run:
 * Ingrese la cantidad de productos que va a llevar: 1
 * Ingrese el nombre del producto: suavitel
 * Ingrese el precio del producto: 6,80
 * Ingrese la cantidad del producto: 2
 * Ingrese el nombre del producto que va a llevar: suavitel
 * Producto disponible
 * Ingrese las unidades de producto que va a llevar: 2
 * Cantidad disponible
 * FACTURIZACION
 * Producto  Cantidad	Costo	Descuento	
 * suavitel	  2	13,60	0,00
 * BUILD SUCCESSFUL (total time: 17 seconds)
 */