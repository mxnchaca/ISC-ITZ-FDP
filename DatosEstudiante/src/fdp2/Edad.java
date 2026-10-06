package fdp2;

import java.util.Scanner;

public class Edad {

	public static void main(String[] args) {
		// definicion de variables
		String nombre;
		int edad;
		String linea = "------------------------------------------\n";
		Scanner in = new Scanner(System.in);
		//solicitar valores de inicio
		System.out.print("Ingresa Nombre : ");
		nombre=in.nextLine();
		System.out.print("Ingresa Edad : " );
		edad=in.nextInt();
		//determinar si la persona es mayor de edad
		if(edad>=18)
		{
			System.out.print(linea);
			System.out.print(nombre+" es mayor de edad\n");
			System.out.print(linea);
		}
		else
		{
			System.out.print(linea);
			System.out.print(nombre+" es mayor de edad\n");
			System.out.print(linea);
		}
		
		System.out.print("Programa Ejecutado");
	System.out.print("Hola mundo");
	System.out.print("hola");
	}
	
}
