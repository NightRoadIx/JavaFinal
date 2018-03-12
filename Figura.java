// Clase Figura de tipo abstracto
public abstract class Figura
{
	/* ATRIBUTOS */
	protected int coordenada_x, coordenada_y, ancho, alto;
	protected double perimetro, area;
	
	/* MÉTODOS */
	
	// Constructor
	Figura(int ancho, int alto) {
		this.ancho = ancho;
		this.alto = alto;
	}
	
	// Métodos abstractos
	// Obtener el area
	public abstract double calcularArea();
	
	// Obtener el perimetro
	public abstract double calcularPerimetro();
	
	
	// GETTERS
	public int getCoordenada_x() {
		return coordenada_x;
	}
	
	public int getCoordenada_y() {
		return coordenada_y;
	}
	
	public int getAncho() {
		return ancho;
	}
	
	public int getAlto() {
		return alto;
	}	
	
	// SETTERS
	public void setCoordenada_x(int coordenada_x) {
		this.coordenada_x = coordenada_x;
	}
	
	public void setCoordenada_y(int coordenada_y) {
		this.coordenada_y = coordenada_y;
	}
	
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	
	public void setAlto(int alto) {
		this.alto = alto;
	}		
}