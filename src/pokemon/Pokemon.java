package pokemon;

import peleador.Peleador;

public abstract class Pokemon implements Peleador{
	
	//CONSTANTES: Atributo que se vea, que es propio de la clase(Static) y que no puede variar(final)
	//Se puede cambiar su valor sin que se alteren las clases que utilizan estos atributos
	public static final int POKEMON_ELECTRICO = 100;
	public static final int POKEMON_FUEGO = 200;
	public static final int POKEMON_AGUA = 300;


	//Atributo compartido en el paquete
	protected String nombre;
	
	//Constructor
	public Pokemon(String nombre) {
		
		this.nombre=nombre;
	}
	
	//Operaciones para el tipo de Pokemon y lucha.
	public abstract int getTipo();
	public abstract int ataque();
	public abstract int defensa();
	
	
	public String getNombre() {
		return nombre;
	}
	
	

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
