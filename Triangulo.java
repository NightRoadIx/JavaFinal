class Triangulo extends Figura {
	
	Triangulo(int a, int b) {
		super(a,b);
	}
	
	@Override
	public double calcularPerimetro() {
		perimetro = ancho + alto + Math.sqrt(Math.pow(ancho,2) + Math.pow(alto,2));
		return perimetro;
	}	
	
	@Override
	public double calcularArea() {
		area = ancho * alto / 2;
		return area;
	}
}