package gestion_modulos;

import java.util.Scanner;

public class Principal {

	public static int pintaMenu(){
		
		 Scanner leer = new Scanner(System.in);
		 boolean interruptor = true;
		 int opc=0;
		
			do {
				
				System.out.println("1 para añadir un modulo");
				System.out.println("2 para mostrar los modulos");
				System.out.println("3 para consultar las horas");
				System.out.println("4 para salir de la aplicacion");
				System.out.println("");
				System.out.println("Dame una opcion");
				try {
					opc = leer.nextInt();
				} catch (Exception e) {
					System.out.println("Opcion no valida");
					leer = new Scanner(System.in);
					interruptor =false;
				}
				
			} while (interruptor ==false);
		
		
		
		return opc;
	}

	public static void main(String[] args) {

		pintaMenu();

		//Curso c = new Curso("1ºDAW", "José Micolau");

		//System.out.println(c.toString());

	}

}
