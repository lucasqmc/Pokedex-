/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokedexmaster;

import javax.swing.ImageIcon;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author lucas
 */
public class Pokemon extends JsonReader {
    
    	public String name;
	public int id;
        public ImageIcon icon;
        public String Type_1,Type_2,Total,HP,Attack,Defense,SpAtk,SpDef,Speed,Generation,Legendary,Experience,
                Height,Weight,Abilitie_1,Abilitie_2,Abilitie_3,Move_1,Move_2,Move_3,Move_4,Move_5,Move_6,Move_7;
	
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
          
            
                name = "vazio";

                icon = null;
        
        }
        
        public ImageIcon getIcon(){
            return icon;
     
        }
        
        public String getName(){
            return name;
        
        }
        
}
