/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokedexmaster;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author lucas
 */
public class Renderer
 extends JLabel implements ListCellRenderer
{
   private JLabel label;
  
   public Component getListCellRendererComponent(JList list, Object value,
                                                 int index, boolean isSelected,
                                                 boolean cellHasFocus) {
      NameIcon entry = (NameIcon) value;
  
      setText(value.toString());
      setIcon(entry.getIcon());
   
      if (isSelected) {
         setBackground(list.getSelectionBackground());
         setForeground(list.getSelectionForeground());
      }
      else {
         setBackground(list.getBackground());
         setForeground(list.getForeground());
      }
  
      setEnabled(true);
      setFont(list.getFont());
      setOpaque(true);
  
      return this;
   }
}
