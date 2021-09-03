
public class Robot {
	
	String nombre_unidad;
	int temperatura;
	
	public Robot(String nombre_unidad) {
		super();
		this.nombre_unidad = nombre_unidad;
	}

	public String getNombre_unidad() {
		return nombre_unidad;
	}

	public void setNombre_unidad(String nombre_unidad) {
		this.nombre_unidad = nombre_unidad;
	}

	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

	public void avanzar(){
		if(temperatura >= 100){
			System.out.println("No puedo seguir avanzando, la temperatura a alcanzado el limite " + temperatura + " grados");
		}else{
			System.out.println("Avanzado... Tempratura actual: " + temperatura + " grados");
		}
	}
}
