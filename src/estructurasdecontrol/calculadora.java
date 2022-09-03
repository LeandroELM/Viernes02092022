package estructurasdecontrol;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		/*Crear un calculadora que muestre las opciones
		 * de una calculadora estandar:
		 * sumar (2numeros)
		 * Restar (2 numeros)
		 * Multiplicar (2 numeros)
		 * Dividir (2 numeros - tomar en cuenta la division entre cero)
		 * Residuo (2 numeros)
		 * Potencia (de una base a un exoponente) 
		 * Raiz cuadrada (Tomar en cuenta el signo de la raiz)
		 * Inverso multiplicativo (tomar en cuenta la division entre cero)
		   Salir de la aplicacion*/
    
		
		Scanner lector = new Scanner(System.in);
		double a,b,resultado;		
		
		
		System.out.print("Ingrese su opcion:");
		System.out.println("--Calculadora--");
		System.out.println("--1.Suma--");
		System.out.println("--2.Resta--");
		System.out.println("--3.Multiplicacion--");
		System.out.println("--Division--");
		System.out.println("--Residuo--");
		System.out.println("--Division--");
		System.out.println("--Division--");
		int opcion = lector.nextInt();
		switch (opcion) {
		
		case 1:
			System.out.println("Escriba un numero: ");
			a = lector.nextDouble();
			System.out.println("Escriba un numero: ");
		    b = lector.nextDouble();
			System.out.println("El resultado de la suma es "+a+" y "+b+" es igual a: " +(a+b) );
			
			break;
		case 2:
			System.out.println("Escriba un numero: ");
			a = lector.nextDouble();
			System.out.println("Escriba un numero: ");
			b = lector.nextDouble();
			System.out.println("El resultado de la resta de "+a+" y "+b+" es igual a: " +(a+b));
		break;
		
		case 3:
			System.out.println("Escriba un numero: ");
			a = lector.nextDouble();
			System.out.println("Escriba un numero");
			b = lector.nextDouble();
			System.out.println("El resultado de la multiplicacion de "+a+" y "+b+" es igual a: " +(a*b));
		break;
		
		
		}
		
		
	}

}
