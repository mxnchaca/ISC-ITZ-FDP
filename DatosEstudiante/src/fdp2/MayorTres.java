/*
 * Ejercicio 5 (MayorTres.java)
 * Determinar el mayor uso de tres numeros 
 * mediante el uso de la sentencia if, clase Scanner 
 * y metodo print
 */
package fdp2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MayorTres {

	public static void main(String[] args) {
		// definir variables
		
		
		int num1, num2, num3;
		String linea="---------------------------------------------\n";
		Scanner in= new Scanner(System.in);
		
		//solicitar valores de inicio
		System.out.print("Ingresa el primer numero : ");
		num1 = in.nextInt();
		System.out.print("Ingresa el segundo numero : ");
		num2 = in.nextInt();
		System.out.print("Ingresa tercer numero : ");
		num3 = in.nextInt();
		if (num1>num2 && num1>num3)
		{
			System.out.print("num1 es mayor");
		}
		else if (num1==num2 && num1>num3)
		{
			System.out.print("num1 es igual a num2 y mayor a num3");
		}
		else if (num2>num1 && num2>num3)
		{
			System.out.print("num2 es mayor");
		}
		else if (num2==num1 && num2>num3)
		{
			System.out.print("num2 es igual a num1 y mayor a num3");
		}
		else if (num3>num1 && num3>num2)
		{
			System.out.print("num3 es mayor");
		}
		else if (num3==num1 && num3>num2)
		{
			System.out.print("num3 es igual a num1 y mayor a num2");
		}
		else
		{
			System.out.print("Los numeros son iguales");
		}
		}
	}


