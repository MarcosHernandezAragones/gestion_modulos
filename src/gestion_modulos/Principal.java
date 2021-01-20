package gestion_modulos;

public class Principal {

	public static void main(String[] args) {
		
		Modulos m = new Modulos("Programación", "PRG", 300);
		
		System.out.println(m.toString());
		System.out.println("Numero de horas del ciclo: " + m.getNumHoras());

	}

}
