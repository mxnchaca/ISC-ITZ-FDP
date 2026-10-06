package fdp;

import java.util.Scanner;

public class AreaCuadrado {
    public static void main(String[] args) {
        // Definición de variables
        double lado, area;
        Scanner entrada = new Scanner(System.in);
        String linea = "-----------------------------------------------------\n";
        // Solicitar valor
        System.out.print("Ingresa el valor del lado: ");
        lado = entrada.nextDouble();
        // Calcular área
        area = lado * lado;
        // Mostrar resultado
        System.out.print(linea);
        System.out.print("\tArea del Cuadrado\n");
        System.out.print(linea);
        System.out.print("Lado = " + String.format("%.2f", lado) + "\n");
        System.out.print("Area = " + String.format("%.2f", area) + "\n");
        System.out.print(linea);
    }
}

