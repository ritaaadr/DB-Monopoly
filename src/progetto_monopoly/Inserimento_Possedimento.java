package progetto_monopoly;

import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import net.proteanit.sql.DbUtils;



public class Inserimento_Possedimento extends javax.swing.JFrame {
    PreparedStatement pst;
    ResultSet rs,rs1,rs2;
    Connection con = null;
    
    String Giocatore,Tipo;
     int ID_Poss;
     
    String query;
    Integer ID_C[] =new Integer[1000];
    Integer ID_G[] =new Integer[1000];
    Integer ID_P[] =new Integer[1000];
    int k,x;
    
    public Inserimento_Possedimento() {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        
        id_g.removeAllItems();
        nome.removeAllItems();
        tab_p.setDefaultEditor(Object.class, null);
        try{
            con = Database.getDefaultConnection();
            query="SELECT MOSSA.ID_PARTITA AS PARTITA,GIOCATORE.ID_GIOCATORE,GIOCATORE.NOME AS GIOCATORE,POSSEDIMENTO.NOME,POSSEDIMENTO.TIPO_POSSEDIMENTO,POSSEDIMENTO.NUM_CASA FROM (MOSSA JOIN POSSEDIMENTO ON MOSSA.ID_POSSEDIMENTO=POSSEDIMENTO.ID_POSSEDIMENTO) JOIN GIOCATORE ON GIOCATORE.ID_GIOCATORE=POSSEDIMENTO.ID_GIOCATORE ORDER BY MOSSA.ID_PARTITA";
           pst = con.prepareStatement(query);
            rs = pst.executeQuery();
                    
            tab_p.setModel(DbUtils.resultSetToTableModel(rs));
            con.close(); 
        }catch(SQLException e){ System.out.println(e);}
        
         
       try{ 
           con = Database.getDefaultConnection();
            query ="SELECT PARTITA_GIOCATORE.PARTITA,GIOCATORE.ID_GIOCATORE,GIOCATORE.NOME FROM GIOCATORE JOIN PARTITA_GIOCATORE ON GIOCATORE.ID_GIOCATORE=PARTITA_GIOCATORE.GIOCATORE ORDER BY (PARTITA_GIOCATORE.PARTITA) ASC";
            pst = con.prepareStatement(query);
            rs1 = pst.executeQuery();
            
            k=0;
            id_g.removeAllItems();
            while(rs1.next()){
                    id_g.addItem("Partita: "+rs1.getInt(1)+" - Giocatore: "+rs1.getString(3));
                    ID_P[k]= rs1.getInt(1);
                    ID_G[k]= rs1.getInt(2);
                    k++;
                }
            
            con.close(); 
         } catch(SQLException e){ System.out.println(e);}
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        indietro4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Jscroll = new javax.swing.JScrollPane();
        tab_p = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        aggiungi4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tipo_poss = new javax.swing.JComboBox<>();
        nome = new javax.swing.JComboBox<>();
        Nome = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        num6 = new javax.swing.JComboBox<>();
        id_g = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cerca = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(193, 255, 193));

        indietro4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progetto_monopoly/icone/back.png"))); // NOI18N
        indietro4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indietro4ActionPerformed(evt);
            }
        });

        Jscroll.setBackground(new java.awt.Color(193, 255, 193));
        Jscroll.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        Jscroll.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N

        tab_p.setBackground(new java.awt.Color(193, 255, 193));
        tab_p.setFont(new java.awt.Font("ITC Kabel Std", 1, 12)); // NOI18N
        tab_p.setSelectionBackground(new java.awt.Color(204, 0, 0));
        tab_p.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab_pMouseClicked(evt);
            }
        });
        Jscroll.setViewportView(tab_p);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Jscroll, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Jscroll, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("ITC Kabel Std", 1, 13)); // NOI18N
        jLabel1.setText("Riempi i campi e premi Aggiungi per confermare");

        jLabel2.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel2.setText("Seleziona*");

        aggiungi4.setFont(new java.awt.Font("Kabel", 2, 12)); // NOI18N
        aggiungi4.setText("Aggiungi");
        aggiungi4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aggiungi4ActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progetto_monopoly/icone/ed.jpg.png"))); // NOI18N

        tipo_poss.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        tipo_poss.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SEMPLICE", "CASA", "ALBERGO", "IPOTECA" }));
        tipo_poss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipo_possActionPerformed(evt);
            }
        });

        nome.setEditable(true);
        nome.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });

        Nome.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        Nome.setText("Nome Possedimento*");

        jLabel4.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel4.setText("Tipo*");

        jLabel5.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        jLabel5.setText("*I campi contrassegnati con (*) sono obbligatori");

        jLabel6.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel6.setText("Numero Casa*");

        num6.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        num6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));

        id_g.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        id_g.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_gActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel7.setText("Possedimenti disponibili*:");

        cerca.setFont(new java.awt.Font("ITC Kabel Std", 1, 14)); // NOI18N
        cerca.setText("cerca");
        cerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cercaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(indietro4)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(aggiungi4))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(26, 26, 26)
                                    .addComponent(id_g, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel6)
                                                .addComponent(jLabel4))
                                            .addGap(61, 61, 61))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                            .addComponent(Nome)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(num6, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(tipo_poss, javax.swing.GroupLayout.Alignment.LEADING, 0, 135, Short.MAX_VALUE))
                                        .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(33, 33, 33)
                                .addComponent(cerca)))
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(indietro4)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(id_g, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cerca))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tipo_poss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(num6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addComponent(aggiungi4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel5)))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void indietro4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indietro4ActionPerformed
       this.dispose();
        Classe obj = new Classe ();
        obj.setVisible(true);
    }//GEN-LAST:event_indietro4ActionPerformed

    private void tab_pMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_pMouseClicked
   
    }//GEN-LAST:event_tab_pMouseClicked

    private void aggiungi4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aggiungi4ActionPerformed
     try{
            
             con = Database.getDefaultConnection(); 
              query="SELECT MAX(ID_POSSEDIMENTO) FROM POSSEDIMENTO";
              pst = con.prepareStatement(query);
              rs = pst.executeQuery();
              while(rs.next()){
                  ID_Poss = rs.getInt(1);
              } 
              
              String query2="INSERT INTO POSSEDIMENTO(ID_POSSEDIMENTO,NOME,TIPO_POSSEDIMENTO,NUM_CASA,ID_GIOCATORE,ID_CONTRATTO) VALUES (?,?,?,?,?,?)";
              pst = con.prepareStatement(query2);
              pst.setInt(1, ID_Poss+1);
              pst.setString(2,(String)nome.getSelectedItem());
              pst.setString(3,(String)tipo_poss.getSelectedItem());
              pst.setString(4,""+num6.getSelectedItem());
              pst.setInt(5,ID_G[id_g.getSelectedIndex()]);
              pst.setInt(6,ID_C[nome.getSelectedIndex()]);
              pst.executeUpdate();
              con.close();
               UIManager.put("OptionPane.background",new ColorUIResource(193,255,193));
               UIManager.put("Panel.background",new ColorUIResource(193,255,193));
               UIManager.put("OptionPane.messageFont", new Font("ITC Kabel Std", Font.BOLD, 14));
               UIManager.put("OptionPane.buttonFont", new Font("AppleMyungjo", Font.ITALIC, 12));
               JOptionPane.showMessageDialog(this, "Inserimento riuscito!", "", JOptionPane.INFORMATION_MESSAGE,new ImageIcon("pollice.gif"));
               
               this.dispose();
               Classe obj = new Classe();
               obj.setVisible(true);
             
          }catch(ArrayIndexOutOfBoundsException r){
              UIManager.put("OptionPane.background",new ColorUIResource(193,255,193));
               UIManager.put("Panel.background",new ColorUIResource(193,255,193));
               UIManager.put("OptionPane.messageFont", new Font("ITC Kabel Std", Font.BOLD, 14));
               UIManager.put("OptionPane.buttonFont", new Font("AppleMyungjo", Font.ITALIC, 12));
               JOptionPane.showMessageDialog(this, "Inserire tutti i campi!", "Errore", JOptionPane.ERROR_MESSAGE,new ImageIcon("prigione.gif"));
              
          }
     catch(SQLException e){
        UIManager.put("OptionPane.background",new ColorUIResource(193,255,193));
                UIManager.put("Panel.background",new ColorUIResource(193,255,193));
                UIManager.put("OptionPane.messageFont", new Font("ITC Kabel Std", Font.BOLD, 14));
                UIManager.put("OptionPane.buttonFont", new Font("AppleMyungjo", Font.ITALIC, 12));
                JOptionPane.showMessageDialog(this, "La combinazione scelta non è corretta!", "Errore", JOptionPane.ERROR_MESSAGE,new ImageIcon("prigione.gif"));
       }
   
    }//GEN-LAST:event_aggiungi4ActionPerformed

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
  
    }//GEN-LAST:event_nomeActionPerformed

    private void tipo_possActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipo_possActionPerformed

    }//GEN-LAST:event_tipo_possActionPerformed

    private void id_gActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_gActionPerformed
   nome.removeAllItems();
    }//GEN-LAST:event_id_gActionPerformed

    private void cercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cercaActionPerformed
       try{
            con = Database.getDefaultConnection();
            query ="SELECT CONTRATTO.ID_CONTRATTO,CONTRATTO.NOME FROM CONTRATTO WHERE ID_CONTRATTO NOT IN (SELECT POSSEDIMENTO.ID_CONTRATTO FROM MOSSA JOIN POSSEDIMENTO ON MOSSA.ID_POSSEDIMENTO=POSSEDIMENTO.ID_POSSEDIMENTO WHERE MOSSA.ID_PARTITA="+ID_P[id_g.getSelectedIndex()]+" AND POSSEDIMENTO.ID_GIOCATORE<>"+ID_G[id_g.getSelectedIndex()]+") ORDER BY (ID_CONTRATTO) ASC";
            pst = con.prepareStatement(query);
            rs2 = pst.executeQuery();
            x=0;
            nome.removeAllItems();
            while(rs2.next()){
                    nome.addItem(rs2.getString(2));
                    ID_C[x]= rs2.getInt(1);
                    x++;
                }
   
            con.close(); 
         } catch(SQLException e){ System.out.println(e);}
    }//GEN-LAST:event_cercaActionPerformed

   
    
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inserimento_Possedimento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane Jscroll;
    private javax.swing.JLabel Nome;
    private javax.swing.JButton aggiungi4;
    private javax.swing.JButton cerca;
    private javax.swing.JComboBox<String> id_g;
    private javax.swing.JButton indietro4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> nome;
    private javax.swing.JComboBox<String> num6;
    private javax.swing.JTable tab_p;
    private javax.swing.JComboBox<String> tipo_poss;
    // End of variables declaration//GEN-END:variables
}
