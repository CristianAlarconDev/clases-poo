package clase04;


public class ContactoPersonal extends Contacto{

	private String fechaCumple;

	ContactoPersonal (String nombre, String correo, Direccion direccion, String fechaCumple ){
		super(nombre, correo, direccion);
		this.fechaCumple=fechaCumple;
	}

	public String getFechaCumple() {
		return fechaCumple;
	}

	public void setFechaCumple(String fechaCumple) {
		this.fechaCumple = fechaCumple;
	}

	@Override
	public String toString() {
		return "ContactoPersonal [fechaCumple=" + fechaCumple + ", toString()=" + super.toString() + "]";
	}	
	public void mostrarInformacion() {
		System.out.println("Contacto personal");
		super.mostrarInformacionBase();
		System.out.println("Fecha cumple: "+ this.getFechaCumple());
	}
}

	
