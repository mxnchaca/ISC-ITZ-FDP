package fdp;

import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		// definicion de variables
		double area, radio;
		Scanner entrada = new Scanner(System.in);
		String linea = "-----------------------------------------------------\n";
		// solicitar valores de inicio
		System.out.print("Ingresa valor del radio : ");
		radio = entrada.nextDouble();
		// realizar operaciones
		area = Math.PI * Math.pow(radio, 2);
		// muestra resultado
		System.out.print(linea);
		System.out.print("\t\u001B[31mArea del Circulo\u001B[0m\n");
		System.out.print(linea);
		System.out.print("Area = "+String.format("%.2f", area)+"\n");
		System.out.print(linea);
	}

}
