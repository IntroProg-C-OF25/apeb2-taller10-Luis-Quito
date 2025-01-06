import java.util.Scanner;
/**
 * Dadas dos matrices (cuadradas y/o rectangulares) de valores enteros aleatorios, desarrollar su procesamiento para calcular y presentar:
 * La suma de las dos matrices (considerar las restricciones matemáticas para ello).
 * La multiplicación de las dos matrices (considerar las reglas matemáticas para ello).
 * @author Luis
 */
public class Ejercicio2_SumaYMultiplicacion {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int fila, columna, operacion = 0;
        System.out.print("Ingrese la cantidad de filas de la matriz: ");
        fila = tcl.nextInt();
        System.out.print("Ingrese la cantidad de columnas de la matriz: ");
        columna = tcl.nextInt();
        int matriz1[][] = new int[fila][columna];
        int matriz2[][] = new int[fila][columna];
        int matriz3[][] = new int[fila][columna];
        System.out.println("");
        System.out.println("Matriz 1: ");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                matriz1[i][j] = (int) (Math.random() * 10);
                System.out.print(matriz1[i][j] + "\t");
            }
            System.out.println("\n");
        }
        System.out.println("Matriz 2: ");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[0].length; j++) {
                matriz2[i][j] = (int) (Math.random() * 10);
                System.out.print(matriz2[i][j] + "\t");
            }
            System.out.println("\n");
        }
        System.out.print("Tipo de operacion: (1)suma o (2)multiplicacion): ");
        operacion = tcl.nextInt();
        if (operacion == 1) {
            System.out.println("");
            System.out.println("Suma: ");
            for (int i = 0; i < matriz1.length; i++) {
                for (int j = 0; j < matriz1[0].length; j++) {
                    matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
                    System.out.print(matriz3[i][j] + "\t");
                }
                System.out.println("");
            }
        } else if (operacion == 2) {
            System.out.println("");
            System.out.println("Multiplicacion: ");
            for (int i = 0; i < matriz1.length; i++) {
                for (int j = 0; j < matriz1[0].length; j++) {
                    for (int k = 0; k < matriz1[0].length; k++) {
                        matriz3[i][j] = matriz3[i][j] + (matriz1[i][k] * matriz2[k][j]);
                    }
                    System.out.print(matriz3[i][j] + "\t");
                }
                System.out.println("");
            }
        }
    }
}

/***
 * run:
 * Ingrese la cantidad de filas de la matriz: 4
 * Ingrese la cantidad de columnas de la matriz: 4
 * 
 * Matriz 1: 
 * 4	0	2	9	
 * 1	3	9	3	
 * 6	5	8	7	
 * 2	0	3	6	
 * 
 * Matriz 2: 
 * 7	5	5	7	
 * 2	2	9	0	
 * 8	7	6	1	
 * 0	4	6	2	
 * 
 * Tipo de operacion: (1)suma o (2)multiplicacion): 2
 * 
 * Multiplicacion: 
 * 44	70	86	48	
 * 85	86	104	22	
 * 116	124	165	64	
 * 38	55	64	29	
 * BUILD SUCCESSFUL (total time: 7 seconds)
 */