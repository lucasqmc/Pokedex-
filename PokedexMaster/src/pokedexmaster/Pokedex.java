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
    

	public Pokemon pokemon[] = new Pokemon[803]; 
        int i;
        
        
        public void ConstroiPokemons() throws JSONException{
        
            for(i=0;i<=801;i++){
        
                pokemon[i] = new Pokemon();
        
        
            }
        
        }
        
	
	public Pokedex(){}
	
        public void SetNomes() throws JSONException{
            
                ConstroiPokemons();
                  
                String dados = "";
		
		dados = get();
        
                JSONObject root = parse(dados);
                
                
			JSONArray pokemonNode = root.getJSONArray("results");
			
			
			
				for (int i = 0; i < 802; i++) {
                                    
					pokemon[i].name = pokemonNode.getJSONObject(i).getString("name");
					//gets the pokemon name
					
				}
        }

}
    
    

