
public class Password {
	
	private int longitud = 8;

	private String contrasena;

	
	public Password() {
	}
	
	public Password(int longitud) {
		this.longitud = longitud;
		this.contrasena = generarContrasena(longitud);
	}
	
	
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String generarContrasena(int longitud) {
		String contrasenaGenerada = "";
		String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxy";
		
		for (int i = 0; i < longitud; i++) {
			int random = (int)((Math.random() * ((caracteres.length()) - 0)) + 0);
			contrasenaGenerada += caracteres.charAt(random);
		}
		return contrasenaGenerada;
	}
	
	
	
	

}
