package tennis;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);	

		//INFO EQUIPO 1
		System.out.println("Introduzca el nombre del 1er equipo: ");
		String nombreE1 = entrada.nextLine();
		System.out.println("Jugador 1: ");
		String nombreJ1E1 = entrada.nextLine();
		System.out.println("Jugador 2: ");
		String nombreJ2E1 = entrada.nextLine();

		//INFO EQUIPO 2
		System.out.println("Introduzca el nombre del 2º equipo: ");
		String nombreE2 = entrada.nextLine();
		System.out.println("Jugador 1: ");
		String nombreJ1E2 = entrada.nextLine();
		System.out.println("Jugador 2: ");
		String nombreJ2E2 = entrada.nextLine();
		
		
		Partido partido = new Partido(nombreE1,nombreJ1E1,nombreJ2E1,nombreE2,nombreJ1E2,nombreJ2E2);
		
		
		boolean finalizar = false;
		while (!finalizar) {
			System.out.println("\t __________________________________");
			System.out.println("\t Estadísticas");
			System.out.println("\t ------------ \n");
			System.out.println("\t 1. Contabiliza punto ganador");
			System.out.println("\t 2. Contabiliza error no forzado");
			System.out.println("\t 3. Contabiliza saque directo");
			System.out.println("\t 4. Muestra estadísticas jugador");
			System.out.println("\t 5. Muestra estadísticas equipo");
			System.out.println("\t    Opcion: ");
			System.out.println("\t __________________________________");
			int opcion = Integer.parseInt(entrada.nextLine());
			
			
			//CONTABILIZAR PUNTO/SAQUE/ERROR
			if (opcion >= 1 && opcion <= 3) {
				int error=0;
				System.out.println("Nombre del jugador: ");
				error = partido.contabiliza(opcion, entrada.nextLine());
				if (error == -1) System.out.println("El jugador no existe");
				
			//ESTADISTICAS JUGADOR
			} else if (opcion == 4) {
				int error=0;
				System.out.println("Nombre del jugador: ");
				error=partido.estadisticasJugador(entrada.nextLine());
				if (error == -1) System.out.println("El jugador no existe");
				
			//ESTADISTICAS EQUIPO
			} else if (opcion == 5) {
				int error = 0;
				System.out.println("Nombre del equipo: ");
				error = partido.estadisticasEquipo(entrada.nextLine());
				if (error == -1) System.out.println("El equipo no existe");
				
			//para cualquier otro valor de opcion
			} else {
				System.out.println("Opcion no valida");
			}
		}
		entrada.close();
	}
}
