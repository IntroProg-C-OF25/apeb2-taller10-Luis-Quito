import java.util.Scanner;
/**
 * Crea un juego de tres en raya utilizando una matriz bidimensional de 3x3. Permita a dos jugadores marcar sus movimientos alternativamente. 
 * El juego debe verificar si alguno de los jugadores ha ganado o si hay un empate.
 * @author L E N O V O
 */
public class Ejercicio6_Juego {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        boolean continuar = true;
        int x = 0, y = 0, movimientos = 0;
        char[][] tabla = new char[3][3];
        System.out.print("""
                                     TRES EN RAYA
                         """);
        while (continuar == true) {
            for (int i = 0; i < tabla.length; i++) {
                for (int j = 0; j < tabla.length; j++) {
                    System.out.print("\t[ " + tabla[i][j] + " ]");
                }
                System.out.println("");
            }
            System.out.print("Turno del jugador X \nIngresa tu proximo moviemiento(Tiene que ser en coordenadas (x,y): ");
            x = tcl.nextInt();
            y = tcl.nextInt();
            if (tabla[x][y] == 'o') {
                System.out.println("Casilla no disponoble");
            } else {
                tabla[x][y] = 'x';
                movimientos++;
            }
            System.out.print("Turno del jugador O \nIngresa tu proximo moviemiento(Tiene que ser en coordenadas (x,y): ");
            x = tcl.nextInt();
            y = tcl.nextInt();
            if (tabla[x][y] == 'x') {
                System.out.println("Casilla no disponible");
            } else {
                tabla[x][y] = 'o';
                movimientos++;
            }
            for (int i = 0; i < tabla.length; i++) {
                if(movimientos != 9) {
                    if (tabla[i][0] == 'x' && tabla[i][1] == 'x' && tabla[i][2] == 'x'
                            || tabla[0][i] == 'x' && tabla[1][i] == 'x' && tabla[2][i] == 'x') {
                        System.out.print("EL GANADOR ES EL JUGADOR x\n");
                        continuar = false;
                    } else if (tabla[0][2] == 'x' && tabla[1][1] == 'x' && tabla[2][0] == 'x'
                            || tabla[0][0] == 'x' && tabla[1][1] == 'x' && tabla[2][2] == 'x') {
                        System.out.print("EL GANADOR ES EL JUGADOR  x\n");
                        continuar = false;
                    }
                    if (tabla[i][0] == 'o' && tabla[i][1] == 'o' && tabla[i][2] == 'o'
                            || tabla[0][i] == 'o' && tabla[1][i] == 'o' && tabla[2][i] == 'o') {
                        System.out.print("EL GANADOR ES EL JUGADOR o\n");
                        continuar = false;
                    } else if (tabla[0][2] == 'o' && tabla[1][1] == 'o' && tabla[2][0] == 'o'
                            || tabla[0][0] == 'o' && tabla[1][1] == 'o' && tabla[2][2] == 'o') {
                        System.out.print("EL GANADOR ES EL JUGADOR o\n");
                        continuar = false;
                    }
                }else{
                    System.out.println("ES UN EMPATE");
                    continuar = false;
                    break;
                }
            }
            System.out.println("");
        }
    }
}

/***
 * TRES EN RAYA
	[   ]	[   ]	[   ]
	[   ]	[   ]	[   ]
	[   ]	[   ]	[   ]

* Turno del jugador X
* Ingresa tu proximo moviemiento(Tiene que ser en coordenadas (x,y): 1 0
* Turno del jugador O 
* Ingresa tu proximo moviemiento(Tiene que ser en coordenadas (x,y): 2 2

	[   ]	[   ]	[   ]
	[ x ]	[   ]	[   ]
	[   ]	[   ]	[ o ]

* Turno del jugador X
* Ingresa tu proximo moviemiento(Tiene que ser en coordenadas (x,y): 2 1
* Turno del jugador O 
* Ingresa tu proximo moviemiento(Tiene que ser en coordenadas (x,y): 1 1

	[   ]	[   ]	[   ]
	[ x ]	[ o ]	[   ]
	[   ]	[ x ]	[ o ]

* Turno del jugador X 
* Ingresa tu proximo moviemiento(Tiene que ser en coordenadas (x,y): 0 1
* Turno del jugador O 
* Ingresa tu proximo moviemiento(Tiene que ser en coordenadas (x,y): 0 0
* EL GANADOR ES EL JUGADOR o
 */