package Solucion;

import java.util.Scanner;
public class Caso11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese n�mero....: ");
		int n = sc.nextInt();
		
		String dia ="";
		
		// Condicional Multiple
		switch (n) {
			case 1:
				dia ="Domingo";
			case 2:
				dia ="Lunes";
			case 3:
				dia ="Martes";
			case 4:
				dia ="Miercoles";
			case 5:
				dia ="Jueves";
			case 6:
				dia ="Viernes";
			case 7:
				dia ="Sabado";
				break;
			default:
				dia ="Desconocido";
		}
		
		System.out.println("\nResultados");
		System.out.println("------------");
		System.out.println("D�a de la semana......: " + dia);

	}

}
