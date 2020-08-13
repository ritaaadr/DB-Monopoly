package progetto_monopoly;

import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import net.proteanit.sql.DbUtils;



public class Inserimento_Giocatore extends javax.swing.JFrame {
    String sql;
    PreparedStatement pst,pst1;
    ResultSet rs;
    Connection con = null;
    Number ID_Partita;
    int selection=0;
    int ID_Gioc;
    String pedina[] =new String[1000];
    Integer ID_G[]=new Integer[1000];
    int k,j,flag=0;
    
    public Inserimento_Giocatore() {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        testo.setEnabled(false);
        testo.setText("");
        tab_p.setDefaultEditor(Object.class, null);
        
        try{
            con = Database.getDefaultConnection();
            sql ="SELECT PARTITA.ID_PARTITA AS PARTITA,PARTITA.NUMGIOCATORI,PARTITA_GIOCATORE.GIOCATORE,GIOCATORE.NOME,PARTITA_GIOCATORE.PEDINA FROM (PARTITA JOIN PARTITA_GIOCATORE ON PARTITA.ID_PARTITA=PARTITA_GIOCATORE.PARTITA) JOIN GIOCATORE ON GIOCATORE.ID_GIOCATORE=PARTITA_GIOCATORE.GIOCATORE WHERE PARTITA.NUMGIOCATORI<6 ORDER BY PARTITA.ID_PARTITA";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
                    
            tab_p.setModel(DbUtils.resultSetToTableModel(rs));
            con.close(); 
        }catch(SQLException e){ System.out.println(e);}
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
        text1 = new javax.swing.JLabel();
        nu = new javax.swing.JScrollPane();
        testo = new javax.swing.JTextPane();
        aggiungi4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tipo_ped = new javax.swing.JComboBox<>();
        nome = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Jscroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        jLabel1.setText("Seleziona la partita*, riempi i campi e premi Aggiungi per confermare");

        jLabel2.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel2.setText("Giocatore*");

        text1.setFont(new java.awt.Font("ITC Kabel Std", 1, 16)); // NOI18N
        text1.setText("Partita");

        testo.setBackground(new java.awt.Color(193, 255, 193));
        testo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        testo.setFont(new java.awt.Font("ITC Kabel Std", 0, 15)); // NOI18N
        testo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        nu.setViewportView(testo);

        aggiungi4.setFont(new java.awt.Font("Kabel", 2, 12)); // NOI18N
        aggiungi4.setText("Aggiungi");
        aggiungi4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aggiungi4ActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progetto_monopoly/icone/mare.jpg"))); // NOI18N

        tipo_ped.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        tipo_ped.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BARCA", "AUTOMOBILE", "CAPPELLO", "SCARPONE", "FERRO DA STIRO", "CANE", "CARRIOLA", "DITALE" }));
        tipo_ped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipo_pedActionPerformed(evt);
            }
        });

        nome.setEditable(true);
        nome.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        jLabel4.setText("*I campi contrassegnati con (*) sono obbligatori");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(indietro4)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(33, 33, 33)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nu, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(43, 43, 43)
                                                .addComponent(tipo_ped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(aggiungi4)))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(indietro4)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(12, 12, 12)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tipo_ped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(aggiungi4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void indietro4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indietro4ActionPerformed
       this.dispose();
        Classe obj = new Classe ();
        obj.setVisible(true);
    }//GEN-LAST:event_indietro4ActionPerformed

    private void tab_pMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_pMouseClicked
       
         ID_Partita=(Number)tab_p.getValueAt(tab_p.getSelectedRow(),0);

         testo.setText(""+ID_Partita);
         testo.setEnabled(false);
         
         try{
            con = Database.getDefaultConnection();
            sql ="SELECT ID_GIOCATORE,NOME FROM GIOCATORE WHERE ID_GIOCATORE NOT IN (SELECT GIOCATORE FROM PARTITA_GIOCATORE WHERE PARTITA="+ID_Partita+") ORDER BY (ID_GIOCATORE) ASC";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            k=0;
            nome.removeAllItems();
            while(rs.next()){
                    nome.addItem(""+rs.getInt(1)+" - "+rs.getString(2));
                    ID_G[k]= rs.getInt(1);
                    k++;
                }
   
            con.close(); 
         } catch(SQLException e){ System.out.println(e);}
         
    }//GEN-LAST:event_tab_pMouseClicked

    private void aggiungi4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aggiungi4ActionPerformed
      
        try{  flag=0;
              j=0;
              con = Database.getDefaultConnection();
              String query="SELECT PEDINA FROM PARTITA_GIOCATORE WHERE PARTITA="+ID_Partita;
              pst = con.prepareStatement(query);
              rs = pst.executeQuery();
              while(rs.next()){
                  pedina[j]=rs.getString(1);
                  if(pedina[j].equals((String)tipo_ped.getSelectedItem())){
                UIManager.put("OptionPane.background",new ColorUIResource(193,255,193));
                UIManager.put("Panel.background",new ColorUIResource(193,255,193));
                UIManager.put("OptionPane.messageFont", new Font("ITC Kabel Std", Font.BOLD, 14));
                UIManager.put("OptionPane.buttonFont", new Font("AppleMyungjo", Font.ITALIC, 12));
                JOptionPane.showMessageDialog(this, "Inserire tutti i campi!\nLa pedina potrebbe essere già di un altro giocatore!", "Errore", JOptionPane.ERROR_MESSAGE,new ImageIcon("prigione.gif"));
                flag=1;
                  }
                  j++;
              } 
             
             if(flag==0){
              query="SELECT MAX(ID_GIOCATORE) FROM DB_MONO.GIOCATORE";
              pst = con.prepareStatement(query);
              rs = pst.executeQuery();
              while(rs.next()){
                  ID_Gioc = rs.getInt(1);
              } 
              
              String query2="INSERT INTO GIOCATORE(ID_GIOCATORE,NOME) VALUES (?,?)";
              if(selection==-1){
              pst1 = con.prepareStatement(query2);
              pst1.setInt(1,(ID_Gioc+1));
              pst1.setString(2,(String)nome.getSelectedItem());
              pst1.executeUpdate();
              }
              
              String query3="INSERT INTO PARTITA_GIOCATORE(PARTITA,GIOCATORE,CONTO,PEDINA) VALUES (?,?,?,?)";
              pst = con.prepareStatement(query3);
              String partita=""+ID_Partita;
              pst.setInt(1,Integer.parseInt(partita));
              if(selection==-1)
                  pst.setInt(2,(ID_Gioc+1));
              else{
                  pst.setInt(2,ID_G[nome.getSelectedIndex()]);
                  System.out.println(ID_G[nome.getSelectedIndex()]);
              }
              pst.setInt(3,1500);
              pst.setString(4,(String)tipo_ped.getSelectedItem());
              pst.executeUpdate();
              
              String query1="UPDATE PARTITA SET NUMGIOCATORI=NUMGIOCATORI+1 WHERE ID_PARTITA="+ID_Partita;
              pst=con.prepareStatement(query1);
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
             }
        
        }catch(NumberFormatException s){
        UIManager.put("OptionPane.background",new ColorUIResource(193,255,193));
                UIManager.put("Panel.background",new ColorUIResource(193,255,193));
                UIManager.put("OptionPane.messageFont", new Font("ITC Kabel Std", Font.BOLD, 14));
                UIManager.put("OptionPane.buttonFont", new Font("AppleMyungjo", Font.ITALIC, 12));
                JOptionPane.showMessageDialog(this, "Seleziona riga!", "Errore", JOptionPane.ERROR_MESSAGE,new ImageIcon("seleziona.gif"));
        }catch(SQLIntegrityConstraintViolationException r){
            UIManager.put("OptionPane.background",new ColorUIResource(193,255,193));
                UIManager.put("Panel.background",new ColorUIResource(193,255,193));
                UIManager.put("OptionPane.messageFont", new Font("ITC Kabel Std", Font.BOLD, 14));
                UIManager.put("OptionPane.buttonFont", new Font("AppleMyungjo", Font.ITALIC, 12));
                JOptionPane.showMessageDialog(this, "Inserire tutti i campi!\nLa pedina potrebbe essere già di un altro giocatore.", "Errore", JOptionPane.ERROR_MESSAGE,new ImageIcon("prigione.gif"));
                        }catch(SQLException e){ System.out.println(e);}
        
   
    }//GEN-LAST:event_aggiungi4ActionPerformed

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
          selection=nome.getSelectedIndex();
    }//GEN-LAST:event_nomeActionPerformed

    private void tipo_pedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipo_pedActionPerformed

    }//GEN-LAST:event_tipo_pedActionPerformed

   
    
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inserimento_Giocatore().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane Jscroll;
    private javax.swing.JButton aggiungi4;
    private javax.swing.JButton indietro4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> nome;
    private javax.swing.JScrollPane nu;
    private javax.swing.JTable tab_p;
    private javax.swing.JTextPane testo;
    private javax.swing.JLabel text1;
    private javax.swing.JComboBox<String> tipo_ped;
    // End of variables declaration//GEN-END:variables
}
