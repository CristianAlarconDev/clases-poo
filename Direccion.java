package clase04;

public class Direccion {

	@Override
	public String toString() {
		return "Direccion [nombre=" + nombre + ", altura=" + altura + ", codigoPostal=" + codigoPostal + "]";
	}

	private String nombre;
	private int altura, codigoPostal;
	
	public Direccion(String nombre, int altura, int codigoPostal) {
		
		this.nombre = nombre;
		this.altura = altura;
		this.codigoPostal = codigoPostal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	
	
}
