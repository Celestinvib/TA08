
public class Persona {
	
	private String nombre;
	
	private int edad;

	private String dni;

	private String sexo;
	
	private double peso;

	private double altura;

		
	public Persona() {
		this.nombre = "";
		this.edad = 0;
		this.sexo = "H";
		this.peso = 0;
		this.altura = 0;
		
	}
	public Persona(String nombre, int edad, String sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}

	public Persona(String nombre, int edad, String dni, String sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	
	

	
	
	
}
