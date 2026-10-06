/*
 * Ejercicio 4.- (Cifras.java)
 * Determinar el numero de cifras con las 
 * que se compone un determinado numero, por ejempolo si
 * se ingresa un numero 5 el programa debe responder es
 * de una cifra y asi sucesivamente, el rango permitido
 * seria de (1-9999). Utilizar sentencia if-else-if
 */
package fdp2;

import java.util.Scanner;

public class Cifras {

	public static void main(String[] args) {
		// definicion de variables
		int numero;
		String cifras;
		Scanner in= new Scanner(System.in);
		String linea="---------------------------------\n";
		//sollicitar valores de inicio
		try {
			System.out.print("Ingresa valor entero : ");
			numero = in.nextInt();
			//determina el numero de cifras
			if(numero >= 0 && numero < 10)
			{
				cifras= numero + " Tiene una cifra";
			}
			else if(numero>=10 && numero < 100)
			{
				cifras= numero + " Tiene dos cifras";
			}
			else if(numero>= 100 && numero<1000)
			{
				cifras = numero + " Tiene tres cifras";
			}
			else if(numero >=1000 && numero <10000)
			{
				cifras = numero + " Tiene cuatro cifras";
			}
			else
			{
				cifras="Valor fuera de rango";
			}
			//mostrar resultados
			System.out.print(linea);
			System.out.print("\t Determina cifras\n");
			System.out.print(linea);
			System.out.print("\t"+cifras);
		}catch(Exception e) {
			System.err.print("ERROR, DEBES INGRESAR UN NUMERO ENTERO!!!!");
		}
		

	}

}
