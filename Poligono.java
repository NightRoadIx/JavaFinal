class Poligono extends Figura {
	
	protected int nlados;
	
	Poligono(int lado, int apotema, int numLados) {
		super(lado, apotema);
		this.nlados = numLados;
	}

	@Override
	public double calcularPerimetro() {
		perimetro = nlados * ancho;
		return perimetro;
	}
	
	@Override
	public double calcularArea() {
		area = ((nlados * ancho)*alto)/2;
		return area;
	}
}