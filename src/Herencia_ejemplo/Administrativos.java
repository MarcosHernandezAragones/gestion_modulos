package Herencia_ejemplo;

public class Administrativos extends Personal{
	
	//Hereda de Personal y tiene dos hijos: Fijos e Interinos
	
	protected String cargo;

	public Administrativos(String nombre, int edad, String cargo) {
		super(nombre, edad);
		this.cargo = cargo;
	}
	

	protected String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		return super.toString() + "Administrativos cargo " + cargo;
	}




	
	
	
	
}