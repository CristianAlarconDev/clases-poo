package clase04;

public class ContactoProfesional extends Contacto{
	private String empresa;
	
	
	public ContactoProfesional(String nombre, String correo, Direccion direccion, String empresa) {
		super(nombre, correo, direccion);
		this.empresa=empresa;
		
	}

	public String getEmpresa() {
		return empresa;
	}




	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	@Override
	public String toString() {
		return "ContactoProfesional [empresa=" + empresa + ", toString()=" + super.toString() + "]";
	}
	
	public void mostrarInfo() {
		System.out.println("Contacto profesional");
		System.out.println("Empresa : "+ this.empresa);
	}
	

	
	
	
}
