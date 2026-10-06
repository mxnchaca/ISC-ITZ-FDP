package fdp;

import java.util.Scanner;

public class PerimetroRectangulo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Pedir la base al usuario
        System.out.print("Ingresa la longitud de la base: ");
        double base = entrada.nextDouble();

        // Pedir la altura al usuario
        System.out.print("Ingresa la longitud de la altura: ");
        double altura = entrada.nextDouble();

        // Fórmula: Perímetro = 2 × (base + altura)
        double perimetro = 2 * (base + altura);

        // Mostrar resultados
        System.out.println("---------------------------");
        System.out.println("Perímetro: " + perimetro);
        System.out.printf("Con 2 decimales: %.2f%n", perimetro);

        entrada.close();

    }
}
