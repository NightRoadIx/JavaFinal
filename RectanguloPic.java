import java.util.Scanner;

public class RectanguloPic {
	
	public static void main(String[] args) {
		
		int alto, ancho;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingresar ancho: ");
		ancho = sc.nextInt();
		System.out.print("Ingresar alto:  ");
		alto = sc.nextInt();
		
		System.out.println("Dibujo : \n");
		dibujar(alto, ancho);
	}
	
	public static void dibujar(int alto, int ancho) {
		for(int alt=0; alt < alto; alt++) {
			for(int anc=0; anc < ancho; anc++) 
				System.out.print("*");
			System.out.println("");
		}	
	}
}