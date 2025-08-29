package clase04;

public abstract class Contacto {
	private String nombre, correo;
	private Direccion direccion;
	
	public Contacto(String nombre, String correo, Direccion direccion) {
		
		this.nombre = nombre;
		this.correo = correo;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}
	protected void mostrarInformacionBase() {
		System.out.println("Nombre: "+ this.nombre);
		System.out.println("Correo: "+ this.correo);
		System.out.println("Direccion: "+ this.direccion.getNombre()+ 
				" "+ this.direccion.getAltura());
		
	}
	public abstract void  mostrarInformacion();
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", correo=" + correo + ", direccion=" + direccion + "]";
	}


	
	
	
	
	
}
