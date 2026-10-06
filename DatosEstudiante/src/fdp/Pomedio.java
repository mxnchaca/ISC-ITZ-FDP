/*
 * Determinar el promedio de un estudiante que cursa 5 calificaciones
 * reportando si estudiante esta aprobado
 * Generar el sig mensaje:
 * Si promedio == 100 Excelente
 * Si promedio >=99 y <=80 Muy Bien 
 * Si promedio >=79 y <=70 Bien
 * Si promedio >70 y <=0 Reprobado
 * Utilizar sentencia if, clase Scanner y metodo print
 */
package fdp;

import java.util.Scanner;

public class Pomedio {

	public static void main(String[] args) {
		// declaracion de variables
		String materia1, materia2, materia3, materia4, materia5, nombre, reconocimiento;
		double calif1, calif2, calif3, calif4, calif5, promedio;
		Scanner in = new Scanner(System.in);
		String linea="-------------------------------------------------------\n";
		//Solicitar valores de inicio
		System.out.print(linea);
		System.out.print("Ingresa nombre del estudiante : ");
		nombre = in.nextLine();
		System.out.print("Ingresa nombre de la primer materia : ");
		materia1=in.nextLine();
		System.out.print("Ingrese calificacion de la materia : "+materia1+ " -> ");
		calif1=in.nextDouble();
		in.nextLine();
		System.out.print(linea);
		nombre = in.nextLine();
		System.out.print("Ingresa nombre de la segunda materia : ");
		materia2=in.nextLine();
		System.out.print("Ingrese calificacion de la materia : "+materia2+ " -> ");
		calif2=in.nextDouble();
		in.nextLine();
		System.out.print(linea);
		nombre = in.nextLine();
		System.out.print("Ingresa nombre de la tercer materia : ");
		materia3=in.nextLine();
		System.out.print("Ingrese calificacion de la materia : "+materia3+ " -> ");
		calif3=in.nextDouble();
		in.nextLine();
		System.out.print(linea);
		nombre = in.nextLine();
		System.out.print("Ingresa nombre de la cuarta materia : ");
		materia4=in.nextLine();
		System.out.print("Ingrese calificacion de la materia : "+materia4+ " -> ");
		calif4=in.nextDouble();
		in.nextLine();
		System.out.print(linea);
		nombre = in.nextLine();
		System.out.print("Ingresa nombre de la quinta materia : ");
		materia5=in.nextLine();
		in.nextLine();
		System.out.print("Ingrese calificacion de la materia : "+materia5+ " -> ");
		calif5=in.nextDouble();
		promedio=(calif1+calif2+calif3+calif4+calif5)/5;
		if(promedio==10.0)
		{
			reconocimiento="Excelente";
		}
		else if (promedio<=9.9 && promedio>=8.0)
		{
			reconocimiento="Muy bien sixeveniano";
		}
		else if (promedio<=7.9 && promedio>=7.0)
		{
			reconocimiento="bien";
		}
		else
		{
			reconocimiento="Reprobado ";
		}
		System.out.print(linea);
		System.out.print("Reporte del Estudiante "+nombre+"\n");
		System.out.print(linea);
		System.out.print("Materia: \tCalif: \n");
		System.out.print(linea);
		System.out.print(materia1+"\t"+"\t"+calif1+"\n");
		System.out.print(linea);
		System.out.print("Materia: \tCalif: \n");
		System.out.print(linea);
		System.out.print(materia2+"\t"+"\t"+calif2+"\n");
		System.out.print(linea);
		System.out.print("Materia: \tCalif: \n");
		System.out.print(linea);
		System.out.print(materia3+"\t"+"\t"+calif3+"\n");
		System.out.print(linea);
		System.out.print("Materia: \tCalif: \n");
		System.out.print(linea);
		System.out.print(materia4+"\t"+"\t"+calif4+"\n");
		System.out.print(linea);
		System.out.print("Materia: \tCalif: \n");
		System.out.print(linea);
		System.out.print(materia5+"\t"+"\t"+calif5+"\n");
		System.out.print(linea);
		System.out.print("El promedio total del estudiante es: "+promedio+"\n");
		System.out.print(linea);
		System.out.print("El estudiante "+nombre+"esta "+reconocimiento);

	}

}
