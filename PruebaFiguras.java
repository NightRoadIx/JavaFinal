import java.lang.*;
import java.util.Scanner;

public class PruebaFiguras {
	
	public static void main(String[] args) {

		String opcion, mostra = "";
		int seleccion = 0;
		int ancho, alto, lados;
		
		Scanner sc = new Scanner(System.in);
		
		// Mostra el menu
		while(seleccion == 0) {
			seleccion = mostrarMenu();
		}
		
		// Obtener los datos
		switch(seleccion)
		{
			case 1:		// cuadrado
				System.out.print("Ingresar lado: ");
				ancho = aceptarDatos();
				System.out.print("Desea mostrar la figura (s/n)");
				mostra = sc.nextLine();
				if(mostra.equals("s"))
					presenta(new Cuadrado2(ancho));
				else
					presenta(new Cuadrado(ancho));
				break;
			case 2:		// rectangulo
				System.out.print("Ingresar ancho: ");
				ancho = aceptarDatos();
				System.out.print("Ingresar alto: ");
				alto = aceptarDatos();
				if(mostra.equals("s"))
					presenta(new Rectangulo2(ancho,alto));
				else
					presenta(new Rectangulo(ancho,alto));				
				break;
			case 3:		// triangulo
				System.out.print("Ingresar ancho: ");
				ancho = aceptarDatos();
				System.out.print("Ingresar alto: ");
				alto = aceptarDatos();
				presenta(new Triangulo(ancho, alto));
				break;
			case 4:		// circulo
				System.out.print("Ingresar radio: ");
				ancho = aceptarDatos();
				presenta(new Circulo(ancho, ancho));
				break;
			case 5:		// poligono
				System.out.print("Ingresar longitud de lado: ");
				ancho = aceptarDatos();
				System.out.print("Ingresar apotema: ");
				alto = aceptarDatos();
				System.out.print("Ingresar numero de lados: ");
				lados = aceptarDatos();
				presenta(new Poligono(ancho, alto, lados));
				break;
		}
	
	}

	private static int mostrarMenu() {
		
		String opcion;
		int selecc;
		
		// Aceptar una cadena de texto
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-- Cálculo de áreas y perímetros de figuras en Java");
		System.out.println("1.-Cuadrado");
		System.out.println("2.-Rectangulo");
		System.out.println("3.-Triangulo");
		System.out.println("4.-Circulo");
		System.out.println("5.-Poligono");
		System.out.print("Seleccion >> ");
		opcion = sc.nextLine();
			
		// Comparar la cadena de texto
		if( (opcion.equals("1"))||(opcion.equalsIgnoreCase("cuadrado")) )
			selecc = 1;
		else if( (opcion.equals("2"))||(opcion.equalsIgnoreCase("rectangulo")) )
			selecc = 2;
		else if( (opcion.equals("3"))||(opcion.equalsIgnoreCase("triangulo")) )
			selecc = 3;
		else if( (opcion.equals("4"))||(opcion.equalsIgnoreCase("circulo")) )
			selecc = 4;
		else if( (opcion.equals("5"))||(opcion.equalsIgnoreCase("poligono")) )
			selecc = 5;
		else
			selecc = 0;
		
		return selecc;
	}
	
	// Metodo aceptar datos que solo sean numericos
	private static int aceptarDatos() {
		Scanner sc = new Scanner(System.in);
		String valor = "";
		do {
			valor = sc.nextLine();
		} while(isNumeric(valor)==false);
		
		return Integer.parseInt(valor);
	}
	
	// Metodo para revisar que una cadena sea solo numerica
	private static boolean isNumeric(String cadena) {
		for(int i=0; i < cadena.length(); i++) {
			if( !Character.isDigit(cadena.charAt(i)) )
				return false;
		}
		return true;
	}
	
	private static void presenta(Figura dato) {
		try {
			System.out.println("Perimetro " + dato.getClass().getSimpleName() + " de " + dato.getAncho() + "x" + dato.getAlto() + " = " + dato.calcularPerimetro());
			System.out.println("Area " + dato.getClass().getSimpleName() + " de " + dato.getAncho() + "x" + dato.getAlto() + " = " + dato.calcularArea());
		} catch(ArithmeticException e1) {
			System.out.println("Excepción ArithmeticException: " + e1);
		} catch(NullPointerException e2) {
			System.out.println("Excepción NullPointerException: " + e2);
		}
		
		if(dato instanceof Rectangulo2) {
			Rectangulo2 tmp = (Rectangulo2) dato;
			tmp.dibujar();
		}	
	}
		
}