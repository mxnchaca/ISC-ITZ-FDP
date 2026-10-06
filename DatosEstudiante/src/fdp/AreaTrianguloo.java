package fdp;

import java.util.Scanner;

public class AreaTrianguloo {
   
	public static void main(String[] args) {
        // Definición de variables
        double base, altura, area;
        Scanner entrada = new Scanner(System.in);
        String linea = "-----------------------------------------------------\n";
        // Solicitar valores
        System.out.print("Ingresa el valor de la base: ");
        base = entrada.nextDouble();
        System.out.print("Ingresa el valor de la altura: ");
        altura = entrada.nextDouble();
        // Calcular área
        area = (base * altura) / 2;
        // Mostrar resultado
        System.out.print(linea);
        System.out.print("\tArea del Triangulo\n");
        System.out.print(linea);
        System.out.print("Base = " + String.format("%.2f", base) + "\n");
        System.out.print("Altura = " + String.format("%.2f", altura) + "\n");
        System.out.print("Area = " + String.format("%.2f", area) + "\n");
        System.out.print(linea);
    }
}
