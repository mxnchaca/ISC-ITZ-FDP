package fdp;

import java.util.Scanner;

public class PerimetroTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir los 3 lados al usuario
        System.out.print("Ingresa el lado 1: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Ingresa el lado 2: ");
        double lado2 = scanner.nextDouble();

        System.out.print("Ingresa el lado 3: ");
        double lado3 = scanner.nextDouble();

        // Fórmula: Perímetro = suma de los 3 lados
        double perimetro = lado1 + lado2 + lado3;

        // Mostrar resultado
        System.out.println("---------------------------");
        System.out.println("El perímetro del triángulo es: " + perimetro);
        System.out.printf("Con 2 decimales: %.2f%n", perimetro);

        scanner.close();
    }
}