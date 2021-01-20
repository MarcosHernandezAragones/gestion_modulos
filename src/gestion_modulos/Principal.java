package gestion_modulos;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		
		int aux=0;
		
		Modulos vModulos[] = new Modulos[10];
		
		Scanner leer = new Scanner(System.in);
		
		
		
		vModulos[0]= new Modulos("Programación", "PRG", 300);
		vModulos[1]= new Modulos("Sistemas Informaticos", "SI", 300);
		vModulos[2]= new Modulos("Lenguaje de Marcas", "LM", 300);
		
		
		for (Modulos m : vModulos) {
			if (m != null)  {
				aux=m.getNumHoras()+aux;
				System.out.println(m);
			}
		}
		System.out.println("Numero de horas total: " + aux);
		
				
	}

}
