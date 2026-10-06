/*
 *Ejercicio 6 (OperacionesBasicas.java)
 * Realiza operaciones basicas tales como
 * +,-,*,/,% mediante el uso del metodo print 
 */
package fdp;

public class OperacionesBasicas {

	public static void main(String[] args) {
		// declaracion de variables
		int n1 = 10, n2 = 20;
		String linea = "-----------------------------------------------------------------\n";
		// realizar operaciones
		System.out.print("\u001B[30m"+linea+"\u001B[0m");
		System.out.print("\t\t\t\u001B[31mOperaciones Basicas\u001B[0m\n");
		System.out.print("\u001B[30m"+linea+"\u001B[0m");
		System.out.println("\u001B[32mSuma\t\t\t"+n1+"\t+\t"+n2+"\t=\t"+(n1+n2)+"\u001B[0m");
		System.out.println("\u001B[33mResta\t\t\t"+n1+"\t-\t"+n2+"\t=\t"+(n1-n2)+"\u001B[0m");
		System.out.println("\u001B[34mMultiplicacion\t\t"+n1+"\t*\t"+n2+"\t=\t"+(n1*n2)+"\u001B[0m");
		System.out.println("\u001B[35mDivision\t\t"+n1+"\t/\t"+n2+"\t=\t"+(n1/n2)+"\u001B[0m");
		System.out.println("\u001B[36mSumaResiduo\t\t"+n1+"\t%\t"+n2+"\t=\t"+(n1%n2)+"\u001B[0m");
		
	}
}
