class Cuadrado extends Figura {
	
	Cuadrado(int lado) {
		super(lado, lado);
	}

	@Override
	public double calcularPerimetro() {
		perimetro = 2.0 * ancho + 2.0 * alto;
		return perimetro;
	}
	
	@Override
	public double calcularArea() {
		area = ancho * alto;
		return area;
	}
}