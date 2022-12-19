package tennis;

import java.util.Objects;

public class Jugador {

	private String nombre;
	private int puntos;
	private int errores;
	private int saques;

//---------------------------CONSTRUCTORES------------------------

	public Jugador(String nombre) {
		this.nombre = nombre;
		this.puntos = 0;
		this.errores = 0;
		this.saques = 0;
	}

//--------------------------GETTERS & SETTERS---------------------
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public int getErrores() {
		return errores;
	}

	public void setErrores(int errores) {
		this.errores = errores;
	}

	public int getSaques() {
		return saques;
	}

	public void setSaques(int saques) {
		this.saques = saques;
	}

//--------------------------EQUALS & TOSTRING----------------------
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jugador other = (Jugador) obj;
		return Objects.equals(nombre, other.nombre);
	}

	//Estadisticas jugador
	public String toString() {
		String info = this.nombre.toUpperCase()+"---> Puntos:" + getPuntos() + " Saques directos:" + getSaques() + " Errores no forzados:"
				+ getErrores();
		return info;
	}

//----------METODOS PARA AÑADIR VALORES A LOS ATRIBUTOS DE JUGADOR-------------

	public void anyadePunto() {
		this.puntos++;
	}

	public void anyadeSaque() {
		this.saques++;
	}

	public void anyadeError() {
		this.errores++;
	}
}
