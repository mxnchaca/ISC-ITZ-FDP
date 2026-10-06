package fdp;

import java.util.Scanner;

public class AreaRombo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double diagonalMayor, diagonalMenor, area;
        Scanner entrada = new Scanner(System.in);
        String linea = "-----------------------------------------------------\n";
        // Solicitar valores

        System.out.print("Ingresa el valor de la diagonal mayor: ");
        diagonalMayor = entrada.nextDouble();
        System.out.print("Ingresa el valor de la diagonal menor: ");
        diagonalMenor = entrada.nextDouble();

        // Calcular área

        area = (diagonalMayor * diagonalMenor) / 2;
        
        // Mostrar resultado
        
        System.out.print(linea);
        System.out.print("\tArea del Rombo\n");
        System.out.print(linea);
        System.out.print("Diagonal mayor = " + String.format("%.2f", diagonalMayor) + "\n");
        System.out.print("Diagonal menor = " + String.format("%.2f", diagonalMenor) + "\n");
        System.out.print("Area = " + String.format("%.2f", area) + "\n");
        System.out.print(linea);

	}

}
