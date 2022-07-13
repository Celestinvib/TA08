
public class MainApp {

	public static void main(String[] args) {
	 
		Persona persona1 = new Persona("47785643A");
		Persona persona2 = new Persona("Marcela",34,"47785643C","F");
		Persona persona3 = new Persona("Leo",31,"37785643A","H",60.5,1.75);
		
		
		System.out.println("Persona 1:\n"+persona1.getNombre()+" - "+persona1.getEdad()+" Años- "+persona1.getDni()+" - "+persona1.getSexo()+" - "+persona1.getPeso()+"kg - "+persona1.getAltura()+"m");
		System.out.println("Persona 2:\n"+persona2.getNombre()+" - "+persona2.getEdad()+" Años- "+persona2.getDni()+" - "+persona2.getSexo()+" - "+persona2.getPeso()+"kg - "+persona2.getAltura()+"m");
		System.out.println("Persona 3:\n"+persona3.getNombre()+" - "+persona3.getEdad()+" Años- "+persona3.getDni()+" - "+persona3.getSexo()+" - "+persona3.getPeso()+"kg - "+persona3.getAltura()+"m");
		
		
		Password pass1 = new Password();
		Password pass2 = new Password(10);
	
		System.out.println("Contraseña1:\n"+pass1.getContrasena()+" lenght("+pass1.getLongitud()+")");
		System.out.println("Contraseña2:\n"+pass2.getContrasena()+" lenght("+pass2.getLongitud()+")");
	
		Electrodomestico nevera1 = new Electrodomestico(499,8);
		Electrodomestico nevera2 = new Electrodomestico(599,"morado",'S',9);
		Electrodomestico nevera3 = new Electrodomestico(799,"gris",'C',7);

		System.out.println("\nElectrodoméstico1:\n"+nevera1.getPrecio()+"€ "+nevera1.getColor()+" -(Cosnumo) "+nevera1.getConsumoEnergetico()+" - "+nevera1.getPeso()+"kg");
		System.out.println("Electrodoméstico2:\n"+nevera2.getPrecio()+"€ "+nevera2.getColor()+" -(Cosnumo) "+nevera2.getConsumoEnergetico()+" - "+nevera2.getPeso()+"kg");
		System.out.println("Electrodoméstico3:\n"+nevera3.getPrecio()+"€ "+nevera3.getColor()+" -(Cosnumo) "+nevera3.getConsumoEnergetico()+" - "+nevera3.getPeso()+"kg");
		
		Serie serie1 = new Serie();
		Serie serie2 = new Serie("The walking CSharps","Jose Marín");
		Serie serie3 = new Serie("Resacón en Valencia",1,"Comedia","Felipe Gómez");
		
		System.out.println("\nSerie2:\n"+serie2.getTitulo()+" "+serie2.getTemporadas()+" T "+serie2.getGenero()+"  "+serie2.getCreador() +" Entregado:"+serie2.isEntregado());
		System.out.println("\nSerie3:\n"+serie3.getTitulo()+" "+serie3.getTemporadas()+" T "+serie3.getGenero()+"  "+serie3.getCreador() +" Entregado:"+serie3.isEntregado());


	}

}
