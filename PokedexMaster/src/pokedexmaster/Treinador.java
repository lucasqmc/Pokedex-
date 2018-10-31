/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokedexmaster;

import java.io.IOException;
import org.json.JSONException;

/**
 *
 * @author lucas
 */
public class Treinador extends Pokedex {
    
    public String nome;
    public String[] added_pokemon;
    

    
    
    public Treinador() throws JSONException, IOException{
    
            ConsegueNomes();
    
    };
    
        
    
}
