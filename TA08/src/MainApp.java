
public class MainApp {

	public static void main(String[] args) {
	 
		Persona persona1 = new Persona("47785643A");
		Persona persona2 = new Persona("Marcela",34,"47785643C","F");
		Persona persona3 = new Persona("Leo",31,"37785643A","H",60.5,1.75);
		
		
		System.out.println("Persona 1:\n"+persona1.getNombre()+" - "+persona1.getEdad()+" Años- "+persona1.getDni()+" - "+persona1.getSexo()+" - "+persona1.getPeso()+"kg - "+persona1.getAltura()+"m");
		System.out.println("Persona 2:\n"+persona2.getNombre()+" - "+persona2.getEdad()+" Años- "+persona2.getDni()+" - "+persona2.getSexo()+" - "+persona2.getPeso()+"kg - "+persona2.getAltura()+"m");
		System.out.println("Persona 3:\n"+persona3.getNombre()+" - "+persona3.getEdad()+" Años- "+persona3.getDni()+" - "+persona3.getSexo()+" - "+persona3.getPeso()+"kg - "+persona3.getAltura()+"m");
		
	}

}
