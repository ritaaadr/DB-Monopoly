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
import static progetto_monopoly.Inserimento_Partita.numG;
import static progetto_monopoly.Inserimento_Partita.ID_Partita;



public class Giocatori extends javax.swing.JFrame {
    String sql;
    PreparedStatement pst,pst1;
    ResultSet rs;
    Connection con = null;
    int selection=0;
    int ID_Gioc;
    static int cont;
    String pedina[] =new String[1000];
    Integer ID_G[]=new Integer[1000];
    int k,j,ok=0;
    
    public Giocatori() {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        testo.setText(""+(ID_Partita+1));
        testo.setEnabled(false);
        k=0;
        nome.removeAllItems();
         try{
            con = Database.getDefaultConnection();
            sql ="SELECT ID_GIOCATORE,NOME FROM GIOCATORE WHERE ID_GIOCATORE NOT IN (SELECT GIOCATORE FROM PARTITA_GIOCATORE WHERE PARTITA="+(ID_Partita+1)+") ORDER BY (ID_GIOCATORE) ASC";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                    nome.addItem(""+rs.getInt(1)+" - "+rs.getString(2));
                    ID_G[k]= rs.getInt(1);
                    k++;
                }
            
            nome.setSelectedIndex(-1);
   
            con.close(); 
         } catch(SQLException e){ System.out.println(e);}
         
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
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
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(193, 255, 193));

        jLabel1.setFont(new java.awt.Font("ITC Kabel Std", 1, 13)); // NOI18N
        jLabel1.setText("Riempi i campi e premi Aggiungi per confermare");

        jLabel2.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel2.setText("*Giocatore");

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

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progetto_monopoly/icone/giocatori.png"))); // NOI18N

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
        jLabel4.setText("*Inserisci il nome di un nuovo giocatore o selezionalo tra quelli presenti.");

        jLabel5.setFont(new java.awt.Font("ITC Kabel Std", 1, 16)); // NOI18N
        jLabel5.setText("Pedina");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(aggiungi4)
                                .addGap(64, 64, 64))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel5))
                                        .addGap(34, 34, 34)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(nome, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(tipo_ped, 0, 157, Short.MAX_VALUE)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addComponent(nu, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)))
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tipo_ped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(aggiungi4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aggiungi4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aggiungi4ActionPerformed
   
        try{  ok=0;
              j=0;
              con = Database.getDefaultConnection();
              String query="SELECT PEDINA FROM PARTITA_GIOCATORE WHERE PARTITA="+(ID_Partita+1);
              pst = con.prepareStatement(query);
              rs = pst.executeQuery();
              while(rs.next()){
                  pedina[j]=rs.getString(1);
                  if(pedina[j].equals((String)tipo_ped.getSelectedItem())){
                UIManager.put("OptionPane.background",new ColorUIResource(193,255,193));
                UIManager.put("Panel.background",new ColorUIResource(193,255,193));
                UIManager.put("OptionPane.messageFont", new Font("ITC Kabel Std", Font.BOLD, 14));
                UIManager.put("OptionPane.buttonFont", new Font("AppleMyungjo", Font.ITALIC, 12));
                JOptionPane.showMessageDialog(this, "Inserire una pedina diversa!", "Errore", JOptionPane.ERROR_MESSAGE,new ImageIcon("prigione.gif"));
                ok=1;
                  }
                  j++;
              } 
             
             if(ok==0){
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
              String partita=""+(ID_Partita+1);
              pst.setInt(1,Integer.parseInt(partita));
              if(selection==-1)
                  pst.setInt(2,(ID_Gioc+1));
              else{
                  pst.setInt(2,ID_G[nome.getSelectedIndex()]);
              }
              pst.setInt(3,1500);
              pst.setString(4,(String)tipo_ped.getSelectedItem());
              pst.executeUpdate();
              
              con.close();
              
               UIManager.put("OptionPane.background",new ColorUIResource(193,255,193));
               UIManager.put("Panel.background",new ColorUIResource(193,255,193));
               UIManager.put("OptionPane.messageFont", new Font("ITC Kabel Std", Font.BOLD, 14));
               UIManager.put("OptionPane.buttonFont", new Font("AppleMyungjo", Font.ITALIC, 12));
               JOptionPane.showMessageDialog(this, "Inserimento riuscito!", "", JOptionPane.INFORMATION_MESSAGE,new ImageIcon("pollice.gif"));
               
               cont++;
               if(cont!=numG){
            this.dispose();
            Giocatori obj1 = new Giocatori();
            obj1.setVisible(true);
          }else {
              cont=0;
              this.dispose();
              Classe obj = new Classe();
              obj.setVisible(true);}
                  
             }           
             
        } catch(SQLException e){ 
         UIManager.put("OptionPane.background",new ColorUIResource(193,255,193));
                UIManager.put("Panel.background",new ColorUIResource(193,255,193));
                UIManager.put("OptionPane.messageFont", new Font("ITC Kabel Std", Font.BOLD, 14));
                UIManager.put("OptionPane.buttonFont", new Font("AppleMyungjo", Font.ITALIC, 12));
                JOptionPane.showMessageDialog(this, "Inserire tutti i campi!", "Errore", JOptionPane.ERROR_MESSAGE,new ImageIcon("prigione.gif"));
              }
       
      
      
       
   
    }//GEN-LAST:event_aggiungi4ActionPerformed

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
          selection=nome.getSelectedIndex();
    }//GEN-LAST:event_nomeActionPerformed

    private void tipo_pedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipo_pedActionPerformed

    }//GEN-LAST:event_tipo_pedActionPerformed

   
    
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Giocatori().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aggiungi4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> nome;
    private javax.swing.JScrollPane nu;
    private javax.swing.JTextPane testo;
    private javax.swing.JLabel text1;
    private javax.swing.JComboBox<String> tipo_ped;
    // End of variables declaration//GEN-END:variables
}
