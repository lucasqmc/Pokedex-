/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokedexmaster;

import javax.swing.ImageIcon;

/**
 *
 * @author lucas
 */
public class NameIcon {
    
     private String value;
     private ImageIcon icon;
     private int ID;
     
        public NameIcon(String value, ImageIcon icon) {
      this.value = value;
      this.icon = icon;
   }
  
   public String getValue() {
      return value;
   }
  
   public ImageIcon getIcon() {
      return icon;
   }
  

}
    

