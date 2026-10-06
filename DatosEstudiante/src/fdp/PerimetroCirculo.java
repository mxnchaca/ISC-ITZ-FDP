package fdp;

import java.util.Scanner;

public class PerimetroCirculo {
    public static void main(String[] args) {
        // Crear objeto Scanner para leer datos
        Scanner entrada = new Scanner(System.in);
        
        // Constante PI con precisión
        final double PI = 3.14159265359;
        
        // Pedir radio al usuario
        System.out.print("Ingresa el radio del círculo: ");
        double radio = entrada.nextDouble();
        
        // Fórmula: Perímetro = 2 * π * radio
        double perimetro = 2 * PI * radio;
        
        // Mostrar resultado
        System.out.println("El perímetro del círculo es: " + perimetro);
        
        // Con decimales limitados (opcional)
        System.out.printf("Con 2 decimales: %.2f%n", perimetro);
        
        entrada.close();
    }
}
