package EjercicioSeis;

import java.util.Scanner;

public class EjercicioDos {

	
private static Scanner sc = new Scanner(System.in);
	

	public static void main(String[] args) {

		// Se solicita leer un número entero positivo y determinar si es un número de 1,2,3 o 4 cifras.
		
		System.out.println("Uno:");
		int uno = sc.nextInt();
	
		
		 if(uno > 0) {
		 if (uno / 10 == 0)
		 
		   System.out.println(uno + " Tiene una cifra");
		   else if (uno / 100 == 0)
	 
	   System.out.println(uno + " Tiene dos cifra");
	   else if (uno / 1000 == 0)
	 
	   System.out.println(uno + " Tiene tres cifra");
	   else if (uno / 10000 == 0)
			 
		   System.out.println(uno + " Tiene cuatro cifra");
	   else
	
		   System.out.println(uno + " Tiene mas cifra");
		 }
		 else
			 System.out.println("es negativo");
		sc.close();
		
}


	
}

