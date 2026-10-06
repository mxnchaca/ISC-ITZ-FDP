/*
 * Ejercicio 21
 */
package fdp;
	import java.util.Scanner;

	public class Medidas {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Valor: ");
	        double valor = sc.nextDouble();

	        System.out.print("De: ");
	        String de = sc.next();

	        System.out.print("A: ");
	        String a = sc.next();

	        String[] unidades = {"kg", "hg", "dag", "g", "dg", "cg", "mg"};

	        int x = 0, y = 0;

	        for (int i = 0; i < unidades.length; i++) {
	            if (unidades[i].equals(de)) x = i;
	            if (unidades[i].equals(a)) y = i;
	        }

	        double resultado = valor * Math.pow(10, y - x);

	        System.out.println("Resultado: " + resultado + " " + a);
	    }
	}