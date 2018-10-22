/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokedexmaster;

import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author lucas
 */
public class Pokemon extends JsonReader {
    
    	public String name;
	public int height, id, weight;
	
    	public Pokemon() throws JSONException{
		initializePokemon("");
	}
        
        
        // Construtor mais importante: recebe id do pokemon 
        
        public Pokemon(int ID) throws JSONException{
		
		String dados = "";
		try {
			dados = get("pokemon/"+ID);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		initializePokemon(dados);
	}
        
        
    
        public void initializePokemon(String dados) throws JSONException{
          
            
                name = "";
                height = 0;
                id = 0;
                weight = 0;
        
        }
        

        
}