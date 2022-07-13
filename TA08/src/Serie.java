
public class Serie {
	
	private String titulo = "";
	
	private int temporadas = 3;
	
	private boolean entregado = false;
	
	private String genero = "";
	
	private String creador = "";
	
	public Serie() {
		
	}

	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
	}

	public Serie(String titulo, int temporadas, String genero, String creador) {
		this.titulo = titulo;
		this.temporadas = temporadas;
		this.genero = genero;
		this.creador = creador;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getTemporadas() {
		return temporadas;
	}

	public boolean isEntregado() {
		return entregado;
	}

	public String getGenero() {
		return genero;
	}

	public String getCreador() {
		return creador;
	}

	
	

	
	
}
