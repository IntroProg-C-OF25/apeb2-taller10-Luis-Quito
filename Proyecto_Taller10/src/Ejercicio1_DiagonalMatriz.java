import java.util.Scanner;
/**
 * Dada una matriz cuadrada (m X m) de valores enteros aleatorios, desarrollar su procesamiento para presentar los elementos:
 * De la diagonal principal.
 * De la diagonal segundaria.
 * Ubicados bajo la diagonal principal.
 * Ubicados sobre la diagonal principal.
 * Ubicados bajo la diagonal secundaria.
 * Ubicados sobre la diagonal secundaria.
 * @author Luis
 */
public class Ejercicio1_DiagonalMatriz {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int tamanioMatriz = 0;
        System.out.print("Deme el tamanio de la matriz: ");
        tamanioMatriz = tcl.nextInt();
        int matriz[][] = new int[tamanioMatriz][tamanioMatriz];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }      
            System.out.println("");
        }
        System.out.println("\nDiagonal principal");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + "\t");
        }
        System.out.println("");
        System.out.println("\nDiagonal secundaria");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][matriz.length-i-1] + "\t");
        }
        System.out.println("");
        System.out.println("\nBajo la diagonal principal");
        for (int i = 1; i < matriz.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
        }
        System.out.println("");
        System.out.println("\nSobre la diagonal principal");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 1+i; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
        }
        System.out.println("");
        System.out.println("\nBajo la diagonal secundaria");
        for (int i = 1; i < matriz.length; i++) {
            for (int j = 1; j < matriz.length; j++) {
                if (i+j > matriz.length - 1) {
                System.out.print(matriz[i][j] + "\t");
                }
            }
        }
        System.out.println("");
        System.out.println("\nSobre la diagonal secundaria");
        for (int i = 0 ; i < matriz.length; i++) {
            for (int j = 0 ; j < matriz.length+1; j++) {
                if (i + j < matriz.length - 1) {
                System.out.print(matriz[i][j] + "\t");
                }
            }
        }
        System.out.println("");
    }    
}
  
/***
 * run:
 * Deme el tamanio de la matriz: 6
 * 1	3	8	6	3	1	
 * 6	9	7	3	4	5	
 * 0	2	7	8	1	1	
 * 3	0	4	5	5	6	
 * 6	1	9	4	9	6	
 * 5	7	5	0	7	4	
 * Diagonal principal
 * 1	9	7	5	9	4
 * Diagonal secundaria
 * 1	4	8	4	1	5	
 * Bajo la diagonal principal
 * 6	0	2	3	0	4	6	1	9	4	5	7	5	0	7	
 * Sobre la diagonal principal
 * 3	8	6	3	1	7	3	4	5	8	1	1	5	6	6	
 * Bajo la diagonal secundaria
 * 5	1	1	5	5	6	9	4	9	6	7	5	0	7	4	
 * Sobre la diagonal secundaria
 * 1	3	8	6	3	6	9	7	3	0	2	7	3	0	6	
 * BUILD SUCCESSFUL (total time: 3 seconds)
 */