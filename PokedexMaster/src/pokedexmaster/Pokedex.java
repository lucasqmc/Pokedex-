/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokedexmaster;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
    

	Pokemon[] pokemon = new Pokemon[950];
        int i;
        public int IndiceUpdateMax,IndiceUpdateMin;
                

                      
                
        //CONSTRUTOR :
        public Pokedex(){
            
            //seta os indices maximo e minimo para o ciclo que coloca os pokemons na list.
            IndiceUpdateMax = 10;
            IndiceUpdateMin = 0;
            
        }
        
        
        public void ConstroiPokemons() throws JSONException, IOException{
        
            for(i=0;i<=948;i++){
        
                pokemon[i] = new Pokemon();  
            }
        
        }
        
        public void ConsegueNomes() throws JSONException, IOException{
        
                ConstroiPokemons();
                
                String dados = "";		
		dados = get();
        
                         JSONObject root = parse(dados);
                
			 JSONArray pokemonNode = root.getJSONArray("results");
                         
                         //Pega nome e id de 949 pokemons criados na pokedex  - - - - ->
                            
                                        for (int i = 0; i <= 948  ; i++) {

                                                pokemon[i].name = pokemonNode.getJSONObject(i).getString("name");
                                                pokemon[i].id = i +1;//pega os nomes e ids dos pokemons 
                                        }

        }
        public void ConsegueCaracts() throws FileNotFoundException, IOException{
        
         //Leitura dos arquivos csv :                
                String csvFile = "src//data/POKEMONS_DATA1.csv";
                String csvFile2 = "src//data/POKEMONS_DATA2.csv";
                BufferedReader br = null;
                BufferedReader br2 = null;
                String line = "";
                String cvsSplitBy = ",";
                
                    try {
                        int i = 0;
                        br = new BufferedReader(new FileReader(csvFile));
                        while ((line = br.readLine()) != null) {
                                
                            // use comma as separator
                            String[] cell = line.split(cvsSplitBy);

                            pokemon[i].Type_1 = cell[0];
                            pokemon[i].Type_2 = cell[1];
                            pokemon[i].Total = cell[2];
                            pokemon[i].HP = cell[3];
                            pokemon[i].Attack = cell[4];
                            pokemon[i].Defense = cell[5];
                            pokemon[i].SpAtk = cell[6];
                            pokemon[i].SpDef = cell[7];
                            pokemon[i].Speed = cell[8];
                            pokemon[i].Generation = cell[9];
                            pokemon[i].Legendary = cell[10];
                            i++;

                        }

                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                       int i = 0;
                       br2 = new BufferedReader(new FileReader(csvFile2));
                        while ((line = br2.readLine()) != null){
                            String[] cell2 = line.split(",");
                        
                             pokemon[i].Experience = cell2[0];
                             pokemon[i].Height = cell2[1];
                             pokemon[i].Weight = cell2[2];
                             pokemon[i].Abilitie_1 = cell2[4];
                             pokemon[i].Abilitie_2 = cell2[5];
                             pokemon[i].Abilitie_3 = cell2[6];
                             pokemon[i].Move_1 = cell2[7];
                             pokemon[i].Move_2 = cell2[8];
                             pokemon[i].Move_3 = cell2[9];
                             pokemon[i].Move_4 = cell2[10];

                            
                             i++;
                            
                             
                   
                        }                    
        
        }
        
        public void ConseguePokemonsInfo() throws JSONException, IOException{
            
                    ConsegueNomes();

                                for (int i = IndiceUpdateMin; i <= IndiceUpdateMax; i++) {
                                    
                                    URL url = new URL("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/"+ (i+1) + ".png" );
              
                                    BufferedImage img = ImageIO.read(url);
                                    
					pokemon[i].icon = new ImageIcon(img);
					//pega os icones de dos pokemons(de 20 em 20).	
				}
                    ConsegueCaracts(); 
        }
        
}
    
    

