package tennis;

public class Partido {
	private Equipo equipo1;
	private Equipo equipo2;

	
	public Partido(String nombreE1,String nombreJ1E1,String nombreJ2E1,
					String nombreE2,String nombreJ1E2,String nombreJ2E2) {
		
		equipo1 = new Equipo(nombreE1,nombreJ1E1,nombreJ2E1);
		equipo2 = new Equipo(nombreE2,nombreJ1E2,nombreJ2E2);
	}

//--------------------------METODOS EQUIPO----------------------
	public int estadisticasEquipo(String nombreEquipo) {
		int error = 0;
		//Comprobamos a que equipo corresponde el nombre e imprimimos las estadisticas del equipo
		if (equipo1.getNombre().equals(nombreEquipo)) {
			System.out.println(equipo1.toString());
		} else if (equipo2.getNombre().equals(nombreEquipo)) {
			System.out.println(equipo2.toString());
		} else {
			error = -1;
		}
		return error;
	}

//--------------------------METODOS JUGADOR----------------------	
	// Estadisticas jugador
	public int estadisticasJugador(String nombreJugador) {
		int error = 0;
		//Comprobamos en que equipo esta el jugador para llamar a sus estadisticas
		if (equipo1.existeJugador(nombreJugador)) {
			equipo1.estadisticasJugador(nombreJugador);
		} 
		else if (equipo2.existeJugador(nombreJugador)) {
			equipo2.estadisticasJugador(nombreJugador);
		} 
		else {
			error = -1;
		}
		return error;
	}
	
	// Contabilizar
	public int contabiliza(int opc, String nombreJugador) {
		int error = 0;
		//Comprobamos en que equipo esta el jugador para contabilizarleel valor que sea necesario
		if (equipo1.existeJugador(nombreJugador)) {
			equipo1.contabiliza(nombreJugador, opc);
		} else if (equipo2.existeJugador(nombreJugador)) {
			equipo2.contabiliza(nombreJugador, opc);
		} else
			error = -1;
		return error;
	}
}
