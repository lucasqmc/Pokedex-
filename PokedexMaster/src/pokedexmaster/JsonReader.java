/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokedexmaster;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.client.fluent.Request;


import org.json.*;



public class JsonReader {
    
    
    	public static String get(String urlAddress) {
		String dados = "";
		try {
			dados = Request.Get("http://pokeapi.co/api/v2/" +urlAddress).execute().returnContent().asString();
		} catch (Exception e){
			e.printStackTrace();
		}
		
		return dados;
	}
        public static String get() {
		String dados = "";
		try {
			dados = Request.Get("http://pokeapi.co/api/v2/pokedex/1").execute().returnContent().asString();
		} catch (Exception e){
			e.printStackTrace();
		}
		
		return dados;
	}
        
        public JSONObject parse(String dados) {
		JSONObject root;
		try {
		root = new JSONObject(dados);		
		return root;
                
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
    
    
        public static void main(String[] args) throws JSONException{
        
            Pokedex pokedex = new Pokedex();
            int i;
            
       ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
       
       pokemons = pokedex.getPokemons();
       
       System.out.println(pokemons.get(0).name);
       System.out.println(pokemons.get(0).weight);
       System.out.println(pokemons.get(1).name);
       System.out.println(pokemons.get(1).weight);
       System.out.println(pokemons.get(2).name);
       System.out.println(pokemons.get(2).weight);
       System.out.println(pokemons.get(3).name);
       System.out.println(pokemons.get(3).weight);
       System.out.println(pokemons.get(4).name);
       System.out.println(pokemons.get(4).weight);
       System.out.println(pokemons.get(5).name);
       System.out.println(pokemons.get(5).weight);
        
        
       }
      

}