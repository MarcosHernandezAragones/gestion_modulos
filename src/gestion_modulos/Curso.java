package gestion_modulos;

import java.util.Arrays;
import java.util.Scanner;

public class Curso {
	
	private String nombre;
	private String tutor;
	private Modulos vModulos[];
	
	

	public Curso(String nombre, String tutor) {
		this.nombre = nombre;
		this.tutor = tutor;
		this.vModulos= new Modulos[10];
		vModulos[0]= new Modulos("Programacion", "PRG", 300);
		vModulos[1]= new Modulos("Sistemas Ingormaticos", "SI", 300);
		vModulos[2]= new Modulos("Lenguaje de marcas", "LM", 300);
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getTutor() {
		return tutor;
	}



	public void setTutor(String tutor) {
		this.tutor = tutor;
	}



	public Modulos[] getvModulos() {
		return vModulos;
	}



	public void setvModulos(Modulos[] vModulos) {
		this.vModulos = vModulos;
	}



	@Override
	public String toString() {
		String datos="";
		
		for (Modulos m : vModulos) {
			if (m != null) {
				datos += m.toString() + "\n";
			}
		}
		
		return "Curso nombre " + nombre + ",\ntutor " + tutor + ",\nModulos " + datos +"\n";
	}
	
	
	
	
}
