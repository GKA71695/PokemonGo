package startPokemon;

import gimnasio.Gimnasio;
import pokemon.Charmander;
import pokemon.Picachu;
import pokemon.Pokemon;
import pokemon.Squirtle;
import robots.Robot;

public class Start {

	public static void main(String[] args) {
		
		Picachu pika = new Picachu("Pika");
		Robot doraemon = new Robot("Dora");
		
		Gimnasio goFit = new Gimnasio();
		goFit.batalla(pika, doraemon);

		//Vector de Pokemons
		Pokemon[] miColeccion = new Pokemon[3];
		miColeccion[0] = new Picachu("Pika");
		miColeccion[1] = new Charmander("Char");
		miColeccion[2] = new Squirtle("Quir");
		
		for(Pokemon pokemon : miColeccion) {
			//Nombre del Pokemon
			System.out.println(pokemon.getNombre());
			
			//Tipo del Pokemon
			switch (pokemon.getTipo()) {
				
				case Pokemon.POKEMON_ELECTRICO: System.out.println("Electrico");
				break;
				case Pokemon.POKEMON_FUEGO: System.out.println("Fuego");
				break;
				case Pokemon.POKEMON_AGUA: System.out.println("Agua");
				break;
			}
		}
	}

}
