class Circulo extends Figura {
	
	Circulo(int ancho, int alto) {
		super(ancho, alto);
	}

	@Override
	public double calcularPerimetro() {
		perimetro = Math.PI * ancho;
		return perimetro;
	}
	
	@Override
	public double calcularArea() {
		if(ancho == alto) {
			area = Math.PI * (ancho/2)*(ancho/2);
		}
		else
			area = 0;
		return area;
	}
}