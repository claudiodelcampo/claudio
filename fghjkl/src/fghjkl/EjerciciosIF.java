package fghjkl;

import java.util.Scanner;

public class EjerciciosIF {





		private static Scanner sc = new Scanner(System.in);
		

		public static void main(String[] args) {
	
			//PEDIR 2 NUMEROS COMPROBAR QUE SON IGUALES.
			
			System.out.println("Uno:");
			int uno = sc.nextInt();
			
			System.out.println("Dos:");
			int dos = sc.nextInt();
			
		
			
			if (uno == dos) {
				System.out.println(uno + " es igual a " + dos);
			} else {
				System.out.println(uno + " es igual a " + dos);
			}
			
			boolean condicion = uno == dos;
			if(condicion)
				System.out.println(uno + " es igual a " + dos);
		 else 
			System.out.println(uno + " no es igual a " + dos);
			

			// PEDIR UN NUMERO E INDICAR SI ES POSITVO, NEGATIVO O CERO
			if(uno > 0)
				System.out.println(uno + " es positivo ");
			else if(uno < 0)
				System.out.println(uno + " es negativo ");
			else
				System.out.println(uno + " es cero ");
			//PEDIR DOS NUMEROS Y DECIR SI ES MULTIPLO DE OTRO
			
			if (uno % dos == 0)
				System.out.println(uno + " es multiplo de " + dos);
			else if (dos % uno == 0)
				System.out.println(dos + " es multiplo de " + uno);
			else 
				System.out.println(" no son multiplos");
		 //PEDIR 2 NUMEROS E INDICAR EL MAYOR O SI SON IGUALES
		
			
			
			if (uno > dos)
				System.out.println(uno + " es mayor que " + dos);
			else if (dos > uno)
				System.out.println(dos + " es mayor que " + uno);
			else 
				System.out.println("son iguales");
			//PEDIR 3 NUMEROS Y MOSTRARLOS ORDENADOS
			System.out.println("Tres:");
			int tres = sc.nextInt();
			if (uno > dos && uno > tres)
				if (dos > tres)
					System.out.println(uno + " es mayor que " + dos + " es mayor que " + tres);
				else
					System.out.println(uno + " es mayor que " + tres + " es mayor que " + dos);
			else if (dos > uno && dos > tres)
				
				if (uno > tres)
					System.out.println(dos + " es mayor que " + uno + " es mayor que " + tres);
				else
					System.out.println(dos + " es mayor que " + tres + " es mayor que " + dos);
			
			
			
			sc.close();
		
		}
		
		
}