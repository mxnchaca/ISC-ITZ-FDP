package fdp;

import java.util.Scanner;

public class PerimetroCuadrado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Pedir el lado al usuario
        System.out.print("Ingresa la longitud del lado: ");
        double lado = entrada.nextDouble();

        // Fórmula: Perímetro = 4 × lado
        double perimetro = 4 * lado;

        // Mostrar resultados
        System.out.println("---------------------------");
        System.out.println("Perímetro: " + perimetro);
        System.out.printf("Con 2 decimales: %.2f%n", perimetro);

        entrada.close();
    }
}
