package fdp;

import java.util.Scanner;

public class InformeEstudiante {

	public static void main(String[] args) {
		// definicion de variables
		Scanner entrada = new Scanner(System.in);
		String nombre,direccion,email,carrera,escuela,control;
		int edad,semestre;
		double promedio,peso,altura;
		String linea = "-----------------------------------------\n";
		System.out.print(linea);
		System.out.print("\t\u001B[34mIngresa Datos del Estudiante\u001B[0m\n");
		System.out.print(linea);
		System.out.print("Nombre:");
		nombre=entrada.nextLine();
		System.out.print(linea);
		System.out.print("Direccion : ");
		direccion=entrada.nextLine();
		System.out.print(linea);
		System.out.print("Escuela : ");
		escuela=entrada.nextLine();
		System.out.print(linea);
		System.out.print("Carrera : ");
		carrera=entrada.nextLine();
		System.out.print(linea);
		System.out.print("Semestre : ");
		semestre=entrada.nextInt();
		System.out.print(linea);
		entrada.nextLine();// liberar el buffer
		System.out.print("No. Control : ");
		control=entrada.nextLine();
		System.out.print(linea);
		System.out.print("Promedio : ");
		promedio=entrada.nextDouble();
		System.out.print(linea);
		entrada.nextLine();// liberar el buffer
		System.out.print("Email : ");
		email=entrada.nextLine();
		System.out.print(linea);
		System.out.print("Edad : ");
		edad=entrada.nextInt();
		System.out.print(linea);
		entrada.nextLine();// liberar el buffer
		System.out.print("Peso en Kgs : ");
		peso=entrada.nextDouble();
		System.out.print(linea);
		System.out.print("Altura en Mts : ");
		altura=entrada.nextDouble();
		System.out.print(linea);	
		// muestra el reporte del estudiante
		System.out.print(linea);
		System.out.print("\t\u001B[30mInforma del Estudiante\u001B[0m\n");
		System.out.print(linea);
		System.out.print("Nombre : "+nombre+"\n");
		System.out.print(linea);
		System.out.print("Direccion : "+direccion+"\n");
		System.out.print(linea);
		System.out.print("Escuela : "+escuela+"\n");
		System.out.print(linea);
		System.out.print("Carrera : "+carrera+"\n");
		System.out.print(linea);
		System.out.print("Semestre : "+semestre+"\n");
		System.out.print(linea);
		System.out.print("No. de Control : "+control+"\n");
		System.out.print(linea);
		System.out.print("Promedio : "+promedio+"\n");
		System.out.print(linea);
		System.out.print("Email : "+email+"\n");
		System.out.print(linea);
		System.out.print("Edad : "+edad+"\n");
		System.out.print(linea);
		System.out.print("Peso en kgs : "+peso+"\n");
		System.out.print(linea);
		System.out.print("Altura en mts : "+altura+"\n");
		System.out.print(linea);
		
	}
}
