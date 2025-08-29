package clase04;

public class ContactoProfesional extends Contacto{
	private String empresa;
	
	
	public ContactoProfesional(String nombre, String correo, String empresa,
			Direccion direccion) {
		super(nombre, correo, direccion);
		this.empresa=empresa;
		
	}


	public String getEmpresa() {
		return empresa;
	}


	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	

	
	
	
}
