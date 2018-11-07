/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokedexmaster;

import javax.swing.ImageIcon;
import org.json.JSONException;

/**
 *
 * @author lucas
 */
public class Pokemon extends JsonReader {
    
    	public String name;
	public int id;
        public ImageIcon icon;
        public String Type_1,Type_2,Total,HP,Attack,Defense,SpAtk,SpDef,Speed,Generation,Legendary,Experience,
                Height,Weight;
	
    	public Pokemon() throws JSONException{
		
                 name = "vazio";
                 icon = null;
	}
        
        
        // Construtor mais importante: recebe id do pokemon 
        
        public Pokemon(int ID) throws JSONException{
		
		String dados = "";
		try {
			dados = get("pokemon/"+ID);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
        

        public ImageIcon getIcon(){
            return icon;
     
        }
        
        public String getName(){
            return name;
        
        }
        
}
