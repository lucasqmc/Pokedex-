/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokedexmaster;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import java.net.MalformedURLException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import org.json.JSONException;

/**
 *
 * @author lucas
 * @matricula 170016811
 */
public class NewJFrame extends javax.swing.JFrame implements ListSelectionListener {

    /**
     * MÉTODO CONSTRUTOR DA JFRAME:
     */
    public NewJFrame() throws JSONException, IOException {
        initComponents();
        PreencheListaPokemon();

        
    }
   public  Pokedex pokedex = new Pokedex();

    ////////////////// Métodos para preencher listas e combobox : ///////////////////////

   public void PreencheListaPokemon() throws JSONException, IOException{
        // Uso funções da pokedex para conseguir os pokemons.
               
                
           pokedex.ConseguePokemonsInfo();
           DefaultListModel<NameIcon> dm = new DefaultListModel();

                      int i;
        
                for (i = pokedex.IndiceUpdateMin; i <= pokedex.IndiceUpdateMax; i++ ){
                    dm.addElement(new NameIcon(pokedex.pokemon[i].name, pokedex.pokemon[i].icon));
                    
                    }                
           pokedex.IndiceUpdateMin = pokedex.IndiceUpdateMin + 5;
           pokedex.IndiceUpdateMax = pokedex.IndiceUpdateMax + 5 ;
           jList1.setCellRenderer( new Renderer());
           jList1.setModel(dm);
        
    }
        
    public void PreencheListaPokemon(int ID) throws MalformedURLException, IOException{
        
        URL url = new URL("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/"+ ID + ".png" );
              
        BufferedImage img = ImageIO.read(url);
        pokedex.pokemon[ID-1].icon = new ImageIcon(img);
 
        DefaultListModel<NameIcon> dm = new DefaultListModel();
        dm.addElement(new NameIcon(pokedex.pokemon[ID-1].name, pokedex.pokemon[ID-1].icon));
        jList1.setCellRenderer( new Renderer());
        jList1.setModel(dm);
    }
    
    public void PreencheListaTreinador(){
        if(pokedex.treinadores.size() > 0){
                DefaultListModel<String> dmt = new DefaultListModel();
                int i;
                                for (i = 0; i < pokedex.treinadores.size(); i++ ){
                                    dmt.addElement(pokedex.treinadores.get(i).nome);

                                }
                                
                 jList2.setModel(dmt);

        }
      
    }
    
    public void PreencheComboTreinador(){
            if(pokedex.treinadores.size() > 0){
           
                jComboBox1.addItem(pokedex.treinadores.get(pokedex.treinadores.size() - 1).nome);

            }
      
    }

// CODIGO GERADO PELA IDE :
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jButton5 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Mais ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Menos ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jButton3.setText("Pesquisar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTabbedPane1.setPreferredSize(new java.awt.Dimension(281, 612));
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jList1.setSelectionBackground(new java.awt.Color(25, 28, 41));
        jList1.setSelectionForeground(new java.awt.Color(26, 190, 192));
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jList1);

        jTabbedPane1.addTab("Pokemons", jScrollPane2);

        jLabel26.setText("Nome :");

        jLabel27.setFont(new java.awt.Font("Ubuntu Light", 1, 17)); // NOI18N
        jLabel27.setText("Novo");

        jLabel28.setFont(new java.awt.Font("Ubuntu Light", 1, 17)); // NOI18N
        jLabel28.setText("Treinador");

        jButton4.setText("Cadastrar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel28)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(jLabel27)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 79, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
            .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28)
                .addGap(122, 122, 122)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jButton4)
                .addGap(35, 35, 35)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(138, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cadastro", jPanel2);

        jList2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Treinadores", jPanel3);

        jButton5.setText("Adicionar Pokemon ao Treinador");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(89, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(jButton2)
                        .addGap(35, 35, 35)
                        .addComponent(jButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//FIM
    // AÇÕES E BOTÕES PRESSIONADOS :
    //Botão para mais 5 pokemons ->
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            PreencheListaPokemon();
        } catch (JSONException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    //Botão para menos 20 pokemons ->
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                        
         if(pokedex.IndiceUpdateMax > 10){       
                     pokedex.IndiceUpdateMax = pokedex.IndiceUpdateMax - 10;
                     pokedex.IndiceUpdateMin = pokedex.IndiceUpdateMin - 10 ;
                try {
                    PreencheListaPokemon();
                } catch (JSONException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
         }
                
    }//GEN-LAST:event_jButton2ActionPerformed
    // Clicou em elemento na lista :
    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
              
        int i = 0;
        String SelectedPokemon = jList1.getSelectedValue().getValue();                   
               for(i = 0; i<= 720; i++){
                       
                   if(pokedex.pokemon[i].name == SelectedPokemon){
                               
                        jLabel1.setText("Name: . . . ."+pokedex.pokemon[i].name);
                               
                                    if(pokedex.pokemon[i].Type_1 != "Ausente"){
                                        jLabel2.setText("Type 1: . . . ."+pokedex.pokemon[i].Type_1);
                                    }
                                    if(pokedex.pokemon[i].Type_2.length() == 1){

                                        jLabel3.setText("");
                                    }
                                    if(pokedex.pokemon[i].Type_2.length() != 1){

                                        jLabel3.setText("Type 2: . . . ."+pokedex.pokemon[i].Type_2);
                                    }
                                    jLabel5.setText("HP  =    "+pokedex.pokemon[i].HP);
                                    jLabel6.setText("Attack  =    "+pokedex.pokemon[i].Attack);
                                    jLabel7.setText("Defense  =    "+pokedex.pokemon[i].Defense);
                                    jLabel8.setText("Speed  =    "+pokedex.pokemon[i].Speed );
                                    jLabel9.setText("Suported Attack Lvl   =       "+pokedex.pokemon[i].SpAtk );
                                    jLabel10.setText("Suported Defense Lvl    =    "+pokedex.pokemon[i].SpDef );
                                    jLabel25.setText("Total  =    " +pokedex.pokemon[i].Total);
                                    jLabel11.setText("Generation  "+pokedex.pokemon[i].Generation );
                                        if(pokedex.pokemon[i].Legendary.length() == 4){
                                             jLabel12.setText("POKEMON LENDÁRIO");
                                        }
                                        if(pokedex.pokemon[i].Legendary.length() != 4){
                                            jLabel12.setText("");
                                        }
                                        float peso = Float.parseFloat(pokedex.pokemon[i].Weight)/10;
                              
                                        float altura = Float.parseFloat(pokedex.pokemon[i].Height)/10;
                                       
                                        
                                   jLabel13.setText("Experience: . . . . ." +pokedex.pokemon[i].Experience + " pts");
                                   jLabel14.setText("Weight: . . . . ." +peso + " Kg");
                                   jLabel15.setText("Height: . . . . ." +altura + " m");
        
                               break;
                    }
                         
                }    
    }//GEN-LAST:event_jList1MouseClicked
    // BOTÃO PESQUISAR POR NOME :
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            pokedex.ConsegueNomes();
            pokedex.ConsegueCaracts();
        } catch (JSONException | IOException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        int aux = 0;//Auxiliar que indica se achou o pokemon ou nao 
        String s = jTextField1.getText().intern().toLowerCase();
        System.out.println(s);
        for(int i = 0; i <= 720; i++){
                if(s.intern() == pokedex.pokemon[i].name.intern()){
                        aux = 1;
                        jLabel1.setText("Name: . . . ."+pokedex.pokemon[i].name);
                               
                                    if(pokedex.pokemon[i].Type_1 != "Ausente"){
                                        jLabel2.setText("Type 1: . . . ."+pokedex.pokemon[i].Type_1);
                                    }
                                    if(pokedex.pokemon[i].Type_2.length() == 1){

                                        jLabel3.setText("");
                                    }
                                    if(pokedex.pokemon[i].Type_2.length() != 1){

                                        jLabel3.setText("Type 2: . . . ."+pokedex.pokemon[i].Type_2);
                                    }
                                    jLabel5.setText("HP:         "+pokedex.pokemon[i].HP);
                                    jLabel6.setText("Attack  =    "+pokedex.pokemon[i].Attack);
                                    jLabel7.setText("Defense  =    "+pokedex.pokemon[i].Defense);
                                    jLabel8.setText("Speed  =    "+pokedex.pokemon[i].Speed );
                                    jLabel9.setText("Suported Attack Lvl =       "+pokedex.pokemon[i].SpAtk );
                                    jLabel10.setText("Suported Defense Lvl  =    "+pokedex.pokemon[i].SpDef );
                                    jLabel25.setText("Total  =    " +pokedex.pokemon[i].Total);
                                    jLabel11.setText("Generation  "+pokedex.pokemon[i].Generation );
                                        if(pokedex.pokemon[i].Legendary.length() == 4){
                                             jLabel12.setText("POKEMON LENDÁRIO");
                                        }
                                        if(pokedex.pokemon[i].Legendary.length() != 4){
                                            jLabel12.setText("");
                                        }
                                        float peso = Float.parseFloat(pokedex.pokemon[i].Weight)/10;
                              
                                        float altura = Float.parseFloat(pokedex.pokemon[i].Height)/10;
                                       
                                        
                                   jLabel13.setText("Experience: . . . . ." +pokedex.pokemon[i].Experience + " pts");
                                   jLabel14.setText("Weight: . . . . ." +peso + " Kg");
                                   jLabel15.setText("Height: . . . . ." +altura + " m");
                                   
                    try {
                        PreencheListaPokemon(pokedex.pokemon[i].id);
                    } catch (IOException ex) {
                        Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                       break;
                }
             if(aux == 0 && i == 720){
                 //SÓ ENTRA AQUI SE ESTIVER NO ULTIMO CICLO E NÃO TIVER ACHADO NADA
                 JOptionPane.showMessageDialog(rootPane, "Pokemon não encontrado ! ");

             }   
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed
    //BOTAO PARA CADASTRAR TREINADOR :
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       String nome = jTextField2.getText().intern();
       Treinador trainer = new Treinador(nome);
       pokedex.treinadores.add(trainer);    //Adiciono treinador a lista.
       PreencheComboTreinador();
       
       jLabel29.setText(nome +" Cadastrado !");
    }//GEN-LAST:event_jButton4ActionPerformed
    // CLICOU EM QUALQUER LUGAR NO TABBED PANE: 
    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        PreencheListaTreinador();
        LimpaJLabels();
        jLabel1.setText("");
        jLabel2.setText("");
        jLabel5.setText("");
        jLabel3.setText("");
        jLabel20.setText("");
        jLabel21.setText("");
        
    }//GEN-LAST:event_jTabbedPane1MouseClicked
    //BOTAO PARA ADICIONAR POKEMON AO TREINADOR :
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(pokedex.treinadores.size() > 0){
               
                String nome_treinador = jComboBox1.getSelectedItem().toString(); //item selecionado no combobox.
                String nome_pokemon = jList1.getSelectedValue().getValue().intern();//item selecionado na lista de pokemons.
                int i;
                int aux = 0 ;
                
                    for (i = 0; i < pokedex.treinadores.size(); i++ ){
                            if(nome_treinador == pokedex.treinadores.get(i).nome){
                                // adiciona  a string que contem o nome do pokemon ao vetor de strings de Treinador.
                                 pokedex.treinadores.get(i).added_pokemon[pokedex.treinadores.get(i).numero_pokemons] = nome_pokemon;
                                 aux = 1; // variavel para confirmar se pokemon foi adicionado ao treinador.
                                 pokedex.treinadores.get(i).numero_pokemons++;
                                 JOptionPane.showMessageDialog(rootPane, "Pokemon adicionado com sucesso! ");
                                    break;
                            }
                    }
                
                System.out.println(aux);

        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Ainda não há treinadores!");
        }
    }//GEN-LAST:event_jButton5ActionPerformed
    // QUANDO CLICAR EM UM ITEM DA LISTA DE TREINADORES:
    private void jList2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList2MouseClicked
       String nome = jList2.getSelectedValue().toString();
        int i;
       
       for(i = 0 ; i < pokedex.treinadores.size(); i++ ){
           LimpaJLabels();
           if( pokedex.treinadores.get(i).nome == nome ){
               
               jLabel1.setText("Nome : " +pokedex.treinadores.get(i).nome);
               jLabel2.setText("Pokemons : ");
                   
                if(pokedex.treinadores.get(i).added_pokemon[0] == null){
                   jLabel3.setText("Ainda não há pokemons");

                }
               else{
                   jLabel3.setText(pokedex.treinadores.get(i).added_pokemon[0]);
                   
                   if(pokedex.treinadores.get(i).added_pokemon[1] != null){
                      jLabel4.setText(pokedex.treinadores.get(i).added_pokemon[1]);
                   }
                   if(pokedex.treinadores.get(i).added_pokemon[2] != null){
                      jLabel5.setText(pokedex.treinadores.get(i).added_pokemon[2]);
                   }
                   if(pokedex.treinadores.get(i).added_pokemon[3] != null){
                      jLabel6.setText(pokedex.treinadores.get(i).added_pokemon[3]);
                   }
                   if(pokedex.treinadores.get(i).added_pokemon[4] != null){
                      jLabel7.setText(pokedex.treinadores.get(i).added_pokemon[4]);
                   }
                   if(pokedex.treinadores.get(i).added_pokemon[5] != null){
                      jLabel8.setText(pokedex.treinadores.get(i).added_pokemon[5]);
                   }
                   if(pokedex.treinadores.get(i).added_pokemon[6] != null){
                      jLabel9.setText(pokedex.treinadores.get(i).added_pokemon[6]);
                   }
                   if(pokedex.treinadores.get(i).added_pokemon[7] != null){
                      jLabel10.setText(pokedex.treinadores.get(i).added_pokemon[7]);
                   }
                   if(pokedex.treinadores.get(i).added_pokemon[8] != null){
                      jLabel11.setText(pokedex.treinadores.get(i).added_pokemon[8]);
                   }
                   if(pokedex.treinadores.get(i).added_pokemon[9] != null){
                      jLabel12.setText(pokedex.treinadores.get(i).added_pokemon[9]);
                   }
                   if(pokedex.treinadores.get(i).added_pokemon[10] != null){
                      jLabel13.setText(pokedex.treinadores.get(i).added_pokemon[10]);
                   }
                   if(pokedex.treinadores.get(i).added_pokemon[11] != null){
                      jLabel14.setText(pokedex.treinadores.get(i).added_pokemon[11]);
                   }
                   if(pokedex.treinadores.get(i).added_pokemon[12] != null){
                      jLabel15.setText(pokedex.treinadores.get(i).added_pokemon[12]);
                   }
                   if(pokedex.treinadores.get(i).added_pokemon[13] != null){
                      jLabel16.setText(pokedex.treinadores.get(i).added_pokemon[13]);
                   }
                   if(pokedex.treinadores.get(i).added_pokemon[14] != null){
                      jLabel17.setText(pokedex.treinadores.get(i).added_pokemon[14]);
                   }
                   if(pokedex.treinadores.get(i).added_pokemon[15] != null){
                      jLabel18.setText(pokedex.treinadores.get(i).added_pokemon[15]);
                   }
                   if(pokedex.treinadores.get(i).added_pokemon[16] != null){
                      jLabel19.setText(pokedex.treinadores.get(i).added_pokemon[16]);
                   }
                   if(pokedex.treinadores.get(i).added_pokemon[17] != null){
                      jLabel20.setText(pokedex.treinadores.get(i).added_pokemon[17]);
                   }
                   if(pokedex.treinadores.get(i).added_pokemon[18] != null){
                      jLabel21.setText(pokedex.treinadores.get(i).added_pokemon[18]);
                   }
                   if(pokedex.treinadores.get(i).added_pokemon[19] != null){
                      jLabel22.setText(pokedex.treinadores.get(i).added_pokemon[19]);
                   }                   


               }
           
               
           
               break;
           }
       
       }
       
    }//GEN-LAST:event_jList2MouseClicked
    public void LimpaJLabels(){  //PARA LIMPAR AS LABELS DO JPANEL.
                   jLabel4.setText("");
                   jLabel5.setText("");
                   jLabel6.setText("");
                   jLabel7.setText("");
                   jLabel8.setText("");
                   jLabel9.setText("");
                   jLabel10.setText("");
                   jLabel11.setText("");
                   jLabel12.setText("");
                   jLabel13.setText("");
                   jLabel14.setText("");
                   jLabel15.setText("");
                   jLabel16.setText("");
                   jLabel17.setText("");
                   jLabel18.setText("");
                   jLabel19.setText("");
                   jLabel20.setText("");
                   jLabel25.setText("");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new NewJFrame().setVisible(true);
                    // catch de erros se tiver algo errado :
                } catch (JSONException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    public javax.swing.JLabel jLabel14;
    public javax.swing.JLabel jLabel15;
    public javax.swing.JLabel jLabel16;
    public javax.swing.JLabel jLabel17;
    public javax.swing.JLabel jLabel18;
    public javax.swing.JLabel jLabel19;
    public javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;

    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
    public JList<NameIcon> jList1 = new JList<>();
    
    @Override
    public void valueChanged(ListSelectionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
