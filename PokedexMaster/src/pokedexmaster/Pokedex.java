/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokedexmaster;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author lucas
 */
public class Pokedex extends JsonReader {
    
//I thing it will be better to have a Map with the PokemonId and the name
	
	
	public Pokedex(){}
	
	
	public ArrayList<Pokemon> getPokemons() throws JSONException{
		ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
		
		for (int i = 1; i <= 950; i++){
			Pokemon p = new Pokemon(i);
			pokemons.add(p);
		}
		if (pokemons.isEmpty()) { return null;}
		
		return pokemons;
	}
	
	
}
    
    

