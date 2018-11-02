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
    public String [] added_pokemon = new String[20];
    public int numero_pokemons;
    

    
    
    public Treinador() throws JSONException, IOException{
    
          
            numero_pokemons = 0;
            int i;
            
            for(i = 0;i <= 29; i++){
                added_pokemon[i] = ""; 
            }
    
    };
    public Treinador(String nome){
    
            this.nome = nome;
            this.numero_pokemons = 0;
            

    }

}
