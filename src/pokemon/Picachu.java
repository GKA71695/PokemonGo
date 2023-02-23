package pokemon;

public class Picachu extends Pokemon implements Evolucionador{

	private int cargaElectrica;
	
	public Picachu(String nombre) {
		
		super(nombre);
		cargaElectrica = 100;
	}

	@Override
	public int getTipo() {
	
		return Pokemon.POKEMON_ELECTRICO;
	}

	@Override
	public int ataque() {
		// TODO Auto-generated method stub
		return 85;
	}

	@Override
	public int defensa() {
		// TODO Auto-generated method stub
		return 45;
	}
	
	public Pokemons evolucion() {
		
		return Evolucionador.Pokemons.RAIUCHU;
	}

}
