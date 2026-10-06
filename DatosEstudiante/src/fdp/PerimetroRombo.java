package fdp;

import java.util.Scanner;

public class PerimetroRombo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Pedir la medida de un lado
        System.out.print("Ingresa la longitud del lado del rombo: ");
        double lado = entrada.nextDouble();

        // Fórmula: Perímetro = 4 × lado
        double perimetro = 4 * lado;

        // Mostrar resultados
        System.out.println("---------------------------");
        System.out.println("Perímetro del rombo: " + perimetro);
        System.out.printf("Con 2 decimales: %.2f%n", perimetro);

        entrada.close();
    }
}
