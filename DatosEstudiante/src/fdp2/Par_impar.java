/*
 * Ejercicio 3 (Par_Impar.java)
 * Determinar si un numero entero es par o impar
 * utilizar sentencia if, clase scanner y metodo print
 */
package fdp2;

import java.util.Scanner;

import java.util.InputMismatchException;

public class Par_impar {

	public static void main(String[] args) {
		// definicion de variables
		int numero;
		String linea = "\u001B[32m-------------------------------------\n";
		Scanner in = new Scanner (System.in);
		//solicitar valores de inicio
		try
		{
			
		System.out.print("Ingresa un numero entero : ");
		numero=in.nextInt();
		//determinar si es par o impar
		if(numero == 0)
		{
			System.out.print(linea);
			System.out.print(" numero es cero\n");
			System.out.print(linea);
		}
		else if (numero %2 ==0)
		{
			System.out.print(linea);
			System.out.print(numero+ " es par\n");
			System.out.print(linea);
		}
		
		else
		{
			System.out.print(linea);
			System.out.print(numero+ " es impar\n");
			System.out.print(linea);
		}
		} catch(InputMismatchException e) {
			System.err.print("El valor debe ser un numero entero !!!");
		}

	}

}
