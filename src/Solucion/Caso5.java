package Solucion;

import java.util.Scanner;

public class Caso5 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Precio...: ");
		float precio= sc.nextFloat();
		System.out.print("Cantidad...: ");
		float cantidad= sc.nextFloat();
		
		float total= precio * cantidad;
		float dscto= 0;
		
		if (cantidad > 8)
			dscto= (float) 0.1 * total;
		
		System.out.println("\nResultados");
		System.out.println("------------");
		System.out.println("Total....:" + total);
		System.out.println("Total....:" + dscto);
		System.out.println("Neto....:" + (total - dscto) );
		
		
	}
}
