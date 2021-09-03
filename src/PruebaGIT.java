
public class PruebaGIT {
	public static void main(String[] args) {
		
		Robot unidad1 = new Robot("DANTE");
		
		unidad1.setMision("Explorar a otro planeta");
		
		System.out.println("La tarea de la unidad es " + unidad1.getMision());
		
		System.out.println("-----------Registro de la operación------------");
		
		unidad1.setTemperatura(100);
		
		unidad1.avanzar();

	}
}
