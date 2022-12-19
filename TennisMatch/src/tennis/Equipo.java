package tennis;

import java.util.Objects;

public class Equipo {
	private String nombre;
	private Jugador jugador1;
	private Jugador jugador2;

//---------------------------CONSTRUCTORES------------------------
	public Equipo(String nombreE,String nombreJ1,String nombreJ2) {
		this.nombre = nombreE;
		jugador1 = new Jugador(nombreJ1);
		jugador2 = new Jugador(nombreJ2);
	}
	
	public Equipo(String nombre) {
		this.nombre = nombre;
	}

//--------------------------EQUALS & TOSTRING---------------------
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipo other = (Equipo) obj;
		return Objects.equals(nombre, other.nombre);
	}

	//Estadisticas equipo
	public String toString() {
		String info = this.nombre.toUpperCase()+"---> Puntos: " + (jugador1.getPuntos() + jugador2.getPuntos()) + " Saques directos: "
				+ (jugador1.getSaques() + jugador2.getSaques()) + " Errores no forzados: " + (jugador1.getErrores() + jugador2.getErrores());
		return info;
	}
	
//--------------------------METODOS JUGADOR----------------------
	
	public int estadisticasJugador(String nombreJugador) {
		//comprobamos a que jugador corresponde el nombre e imprimimos las estadisticas del equipo
		int error = 0;
		if (jugador1.getNombre().equals(nombreJugador)) {
			System.out.println(jugador1.toString());
		} else if (jugador2.getNombre().equals(nombreJugador)) {
				System.out.println(jugador2.toString());
		} else {
			error = -1;
		}
		return error;
	}
	
	public int contabiliza(String nombreJugador, int opcion) {
		//comprobamos a que equipo corresponde el nombre y llamamos al metodo que añade un valor 
		int error=0;
		if(jugador1.getNombre().equals(nombreJugador)) {
			anyadeValor(opcion,jugador1);
		}
		else if (jugador2.getNombre().equals(nombreJugador)){
			anyadeValor(opcion,jugador2);
		}
		else {
			error=-1;
		}
		return error;
	}
	
	//Auxiliar del metodo contabilizar que dependiendo de opc añade al jugador un punto/saque/error
	public void anyadeValor(int opc, Jugador jug) {
		if (opc == 1) {
			jug.anyadePunto();
		} else if (opc == 2) {
			jug.anyadeSaque();
		} else if (opc == 3) {
			jug.anyadeError();
		}
	}
	
	//Metodo para comprobar si un jugador se encuentra en el equipo
	public boolean existeJugador(String nombreJugador) {
		boolean existe=false;
		if(jugador1.getNombre().equals(nombreJugador) || jugador2.getNombre().equals(nombreJugador)) {
			existe=true;
		}
		return existe;
	}
//--------------------------GETTERS & SETTERS---------------------
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
