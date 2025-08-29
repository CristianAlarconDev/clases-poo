package clase04;

public class Test {

	public static void main (String [] args) {
		

		//Direccion direccion= new Direccion("Aguilar", 1800 ,1725);
		//ContactoPersonal cPersonal= new ContactoPersonal("Cristian", "calarcon@fi", );
		
		Direccion dpersonal = new Direccion("Alta dirección", 145, 1408);
		ContactoPersonal cpersonal = new ContactoPersonal("Juan", "juan@gmail.com",
				dpersonal, "2025-08-29");
		
		//System.out.println(cpersonal);
		
		Direccion dprofesional = new Direccion("Calle empresa", 555, 1409);
		ContactoProfesional cprofesional = new ContactoProfesional("Laura", 
				"laura@gmail.com", dprofesional, "ACME S.A.");

		//System.out.println(cprofesional);
		
		Agenda unaAgenda = new Agenda();
		unaAgenda.agregarContacto(cprofesional);
		unaAgenda.agregarContacto(cpersonal);
		
		unaAgenda.mostrarAgenda();
		
	}
	
}
