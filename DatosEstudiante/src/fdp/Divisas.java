/* Ejercicio 19 (Divisas.java)
 * Determinar el tipo de cambio de las siguientes divisas en relacion al peso mexicano
 * Dolar,Euro,Libra,Peso colombiano,Yen y Peso colombiano, utilizar clase Scanner
 */
package fdp;

import java.util.Scanner;

public class Divisas {
	
public static void main(String[] args) {
	//Definicion de variables
	double dollar=17.23,euro=19.76,libra=23.01,pesoCol=186,yen=9,pesoArg=87.87;
	double dol,eur,lib,pcol,ye,parg,peso;
	Scanner entrada = new Scanner(System.in);
	String linea = "--------------------------------------------------------\n";
	System.out.print("Ingresa cantidad en pesos (mex) : ");
	peso=entrada.nextDouble();
	//realizar operaciones
	dol=(peso/dollar);
	eur=(peso/euro);
	lib=(peso/libra);
	pcol=(peso*pesoCol);
	ye=(peso*yen);
	parg=(peso*pesoArg);
	//Muestra resultado
	System.out.print(linea);
	System.out.print("\t\t Divisas Mapaches\n");
	System.out.print(linea);
	System.out.print("Peso\tDollar\tEuro\tLibra\tP col\tYen\tP arg\n");
	System.out.print(linea);
	System.out.print(peso+"\t"+String.format("%.2f", dol)+"\t"+
	                 String.format("%.2f", eur)+"\t"+String.format("%.2f", lib)
	                 +"\t"+String.format("%.2f", pcol)+"\t"+
	                 String.format("%.2f", ye)+"\t"+String.format("%.2f", parg)+
	                 "\n");
	System.out.print(linea);
	
	
	
			
		}
}