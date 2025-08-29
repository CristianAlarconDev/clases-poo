package clase04;

import java.util.ArrayList;
import java.util.List; 

public class Agenda {

	private List<Contacto> contactos;

	public Agenda(){
		this.contactos=new ArrayList<>();
	}
	
	public void agregarContacto(Contacto unContacto) {
		contactos.add(unContacto);
	}
	public void mostrarAgenda () {
		
		for(Contacto contacto :contactos ) {
			
			System.out.println(contacto);		
		}
	}
}
