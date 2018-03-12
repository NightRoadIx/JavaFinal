class Rectangulo2 extends Figura {
	
	Rectangulo2(int ancho, int alto) {
		super(ancho, alto);
		if(ancho>=20) setAncho(20);
		if(alto>=20) setAlto(20);
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
	
	public void dibujar() {
		for(int alt=0; alt < alto; alt++) {
			for(int anc=0; anc < ancho; anc++) System.out.print("*");
			System.out.println("");
		}
	}
}