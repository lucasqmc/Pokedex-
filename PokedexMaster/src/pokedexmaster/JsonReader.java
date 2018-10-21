/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokedexmaster;

import java.io.IOException;
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
    
    


  public static void main(String[] args) throws IOException, JSONException {
       
   
      Pokemon p = new Pokemon(6);
      
      
      System.out.println(p.id);
      System.out.println(p.name);
     
      
   
      
  
  }
}