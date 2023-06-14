package entity;

public class Empleado {
	//Atributos
	private String nombre;
	private String apellido;
	private int edad;
	private String direccion;
	
	//Constructor lleno
	public Empleado(String nombre, String apellido, int edad, String direccion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.direccion = direccion;
	}
	
	//Constructor Vacío
	public Empleado() {
		super();
	}

	//Getters & Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	//Metodo toString
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", direccion=" + direccion
				+ "]";
	}
	
	
	

}
