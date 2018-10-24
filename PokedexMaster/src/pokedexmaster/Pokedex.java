/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokedexmaster;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


/**
 *
 * @author lucas
 */
public class Pokedex extends JsonReader {
    

	public Pokemon pokemon[] = new Pokemon[941];
        int i;
                
        public ImageIcon RetornaUmIcon() throws IOException {
          
                    URL url = new URL("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/1.png");
              
                    BufferedImage img = ImageIO.read(url);

       
            ImageIcon icon = new ImageIcon(img);
            
            return icon;
                       
          }
                      
                
        //CONSTRUTOR :
        public Pokedex(){}
        
        
        public void ConstroiPokemons() throws JSONException{
        
            for(i=0;i<=940;i++){
        
                pokemon[i] = new Pokemon();
        
        
            }
        
        }
        
        public void ConseguePokemonsInfo() throws JSONException, IOException{
            
                ConstroiPokemons();
               
                  
                String dados = "";
		
		dados = get();
        
                         JSONObject root = parse(dados);
                
			 JSONArray pokemonNode = root.getJSONArray("results");
		
				for (int i = 0; i <= 940; i++) {
                                    
					pokemon[i].name = pokemonNode.getJSONObject(i).getString("name");
					//gets the pokemon name
					
				}
        }
        
        


}
    
    

