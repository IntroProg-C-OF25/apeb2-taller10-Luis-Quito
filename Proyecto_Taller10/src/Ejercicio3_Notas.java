/**
 * El primer ciclo paralelo C, cuenta con 28 estudiantes, de los cuáles al finalizar el periodo, la Dirección de la carrera de Computación a solicitado 
 * las siguientes estadísticas de la materia INTRODUCCIÓN A LA PROGRAMACIÓN en función a los promedios por estudiante, dichos promedios se deben calcular 
 * (ponderar, ya que el docente ingresa todo sobre 10pts.) de 3 calificaciones (ACD que representa el 35% de la nota, APE del 35% y la nota del AA con un peso del 30%). 
 * En resumen, los requerimientos son los siguientes:
 * Registre los nombres de cada estudiante de dicho paralelo.
 * Genere aleatoriamente las notas ACD, APE, AA, para cada uno de los 28 estudiantes de 0-10 pts.
 * Calcule el promedio de cada uno de los estudiantes del paralelo dada la siguiente ponderación: ACD->35%, APE->35%, y el AA->30%.
 * Obtenga el promedio del curso, del paralelo C.
 * Liste los nombres de los estudiantes y su nota, que hayan obtenido un promedio por encima del promedio del curso.
 * Liste los nombres de los estudiantes y su nota, que hayan obtenido un promedio por debajo del promedio del curso.
 * Muestre el estudiante con su calificación, si es el del mayor promedio (el más alto de la clase).
 * Muestre el estudiante con su calificación, si es el del menor promedio (el más bajo de la clase).
 * @author Luis
 */
public class Ejercicio3_Notas {
    public static void main(String[] args) {
      double nota[][] = new double[28][3];
        double promedio[] = new double[28];
        String[] estudiantes = {"Ricardo", "Jorge", "Mathias", "Emanuel", "Jordi", "Christian", "Danna", "Daniel", "Anny", "Helen", "Arelis", "Sebastian", "Daniela", "Antonny", "Karla", "Andres", "Willy", "Ivan", "Aliss", "Elcy", "Sara", "Mateo", "Omar", "Gavi", "Pedro", "Gabriela", "Iker", "Sophia"};
        double promtotal = 0, mayorprom = 0, menorprom = 10;
        int aprobado = 0, reprobado = 0;
        for (int i = 0; i < nota.length; i++) {
            for (int j = 0; j < nota[0].length; j++) {
                nota[i][j] = (int) (Math.random() * 10);
                nota[i][j] = ((nota[i][j] * 3.5) / 10);
                nota[i][2] = ((nota[i][2] * 3) / 10);
                promedio[i] = (nota[i][0] + nota[i][1] + nota[i][2]);
            }
            promtotal = promtotal + promedio[i];
            if (promedio[i] > 7) {
                aprobado++;
            } else {
                reprobado++;
            }if (promedio[i] > mayorprom) {
                mayorprom = promedio[i];
            }if (promedio[i] < menorprom) {
                menorprom = promedio[i];
            }
        }
        promtotal = promtotal / promedio.length;
        System.out.printf("|  %s\t|  %s\t|  %s\t|  %s\t|   %s\t|", "NOMBRES", "APE", "ACD", "AA", "PROMEDIO");
        for (int i = 0; i < nota.length; i++) {
            System.out.printf("\n%s\t\t  %.2f\t  %.2f\t  %.2f\t       %.2f\t", estudiantes[i], nota[i][0], nota[i][1], nota[i][2], promedio[i]);
        }
        System.out.println("");
        System.out.println("\nEstudiantes aprobados: " + aprobado + "\nEstudiantes reprobados: " + reprobado);
        System.out.println("\nMayor promedio: " + mayorprom + "\nMenor promedio: " + menorprom);
    }
}

/***
 * run:
 * |  NOMBRES	|  APE	|  ACD	|  AA	|   PROMEDIO	|
 * Ricardo	  1,05	  3,15	  0,10	       4,31	
 * Jorge	  2,80	  2,45	  0,21	       5,46	
 * Mathias	  2,80	  0,00	  0,00	       2,80	
 * Emanuel	  1,40	  3,15	  0,74	       5,29	
 * Jordi	  0,70	  1,40	  0,84	       2,94	
 * Christian	  1,05	  2,45	  0,32	       3,82	
 * Danna	  0,00	  1,40	  0,84	       2,24	
 * Daniel         0,70	  0,00	  0,53	       1,23	
 * Anny		  0,35	  1,75	  0,95	       3,05	
 * Helen	  0,35	  2,10	  0,00	       2,45	
 * Arelis	  1,05	  1,75	  0,84	       3,64	
 * Sebastian	  2,10	  1,05	  0,42	       3,57	
 * Daniela	  2,80	  2,45	  0,63	       5,88	
 * Antonny	  2,80	  0,00	  0,21	       3,01	
 * Karla	  1,75	  0,35	  0,10	       2,21	
 * Andres	  1,05	  2,80	  0,95	       4,80	
 * Willy	  0,70	  2,10	  0,53	       3,32	
 * Ivan		  1,75	  3,15	  0,53	       5,43	
 * Aliss	  3,15	  3,15	  0,84	       7,14	
 * Elcy		  3,15	  0,70	  0,32	       4,17	
 * Sara		  2,10	  1,05	  0,21	       3,36	
 * Mateo	  1,75	  0,00	  0,21	       1,96	
 * Omar		  1,05	  1,05	  0,84	       2,94	
 * Gavi		  0,70	  2,10	  0,74	       3,54	
 * Pedro	  1,75	  2,10	  0,32	       4,17	
 * Gabriela	  2,45	  0,70	  0,53	       3,68	
 * Iker		  2,45	  1,05	  0,74	       4,24	
 * Sophia	  0,70	  2,80	  0,74	       4,24	
 * 
 * Estudiantes aprobados: 1
 * Estudiantes reprobados: 27
 * 
 * Mayor promedio: 7.14
 * Menor promedio: 1.225
 * BUILD SUCCESSFUL (total time: 0 seconds)
 */
