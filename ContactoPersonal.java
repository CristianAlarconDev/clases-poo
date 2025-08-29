package clase04;


public class ContactoPersonal extends Contacto{


	private String nombre;
	private String correo;
	private Direccion direccion;
	

	ContactoPersonal (String nombre, String correo, Direccion direccion){
		super(nombre, correo, direccion);
		
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		if(!existe(correo)) {
			this.correo = correo;
		}
		else {
			System.out.println("Correo ya en sistema...");
		}
		
	}
	private Boolean existe(String correo) {
		return this.correo==correo;
	}

	public String toString() {
		String mensaje =String.format("ContactoPersonal%nnombre: %s , correo: %s "
				+ "y direccion: %s",
				this.nombre, this.correo, this.direccion.getNombre());
		
		return mensaje;
 
	}
	
}

	
