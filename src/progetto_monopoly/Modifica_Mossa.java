
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

public class Modifica_Mossa extends javax.swing.JFrame {
    Connection con = null;
    PreparedStatement pst;
    ResultSet rs;
    String query,query1;
    int tipo_m, dado1, dado2, p_dato, p_ric;
    int cod_g,cod_partita,tur,id_partenza,posP,posA,id_arrivo;
    int selection = 0;
    
    public Modifica_Mossa() {
         initComponents();
         setLocationRelativeTo(null);
         this.setResizable(false);
         
         
         turno7.setText(""+Dati_Tabella.turno);
         ordine7.setText(""+Dati_Tabella.Ordine);
         tipo_m7.setSelectedItem(""+Dati_Tabella.Tipo_Mossa);
         selection=tipo_m7.getSelectedIndex();
         
         switch(selection) {
             case 0:
                 //Movimento
                 d1.setText(""+Dati_Tabella.Dado1);
                 d2.setText(""+Dati_Tabella.Dado2);
                 break;
         case 1:
            //Pagamento
             tipo_p7.setSelectedItem(""+Dati_Tabella.Tipo_Pagamento);
             p_dato7.setText(""+Dati_Tabella.Pagamento_dato);
             p_ric7.setText(""+Dati_Tabella.Pagamento_ricevuto);
         }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        indietro7 = new javax.swing.JButton();
        aggiorna7 = new javax.swing.JButton();
        clear7 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tipo_m7 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tipo_p7 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        turno7 = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        ordine7 = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        d2 = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        p_dato7 = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        p_ric7 = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        d1 = new javax.swing.JTextPane();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(550, 460));
        setMinimumSize(new java.awt.Dimension(550, 460));
        setPreferredSize(new java.awt.Dimension(550, 460));

        jPanel1.setBackground(new java.awt.Color(193, 255, 193));
        jPanel1.setMaximumSize(new java.awt.Dimension(550, 460));
        jPanel1.setMinimumSize(new java.awt.Dimension(550, 460));
        jPanel1.setPreferredSize(new java.awt.Dimension(550, 460));
        jPanel1.setSize(new java.awt.Dimension(550, 460));

        jLabel2.setFont(new java.awt.Font("ITC Kabel Std", 1, 13)); // NOI18N
        jLabel2.setText("Riempire i campi di Mossa e premere Aggiorna per confermare*");

        indietro7.setFont(new java.awt.Font("ITC Kabel Std", 1, 14)); // NOI18N
        indietro7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progetto_monopoly/icone/back.png"))); // NOI18N
        indietro7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indietro7ActionPerformed(evt);
            }
        });

        aggiorna7.setFont(new java.awt.Font("Kabel", 2, 12)); // NOI18N
        aggiorna7.setText("Aggiorna");
        aggiorna7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aggiorna7ActionPerformed(evt);
            }
        });

        clear7.setFont(new java.awt.Font("Kabel", 2, 12)); // NOI18N
        clear7.setText("Clear");
        clear7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear7ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel3.setText("Turno");

        jLabel4.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel4.setText("Tipo");

        jLabel5.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel5.setText("Dado 1");

        tipo_m7.setEditable(true);
        tipo_m7.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        tipo_m7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MOVIMENTO", "PAGAMENTO" }));
        tipo_m7.setSelectedIndex(-1);

        jLabel6.setFont(new java.awt.Font("ITC Kabel Std", 1, 14)); // NOI18N
        jLabel6.setText("Pagamento");

        jLabel7.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel7.setText("Dado 2");

        jLabel8.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel8.setText("Ordine");

        tipo_p7.setEditable(true);
        tipo_p7.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        tipo_p7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GENERICO", "VERSO BANCA", "VERSO GIOCATORE" }));
        tipo_p7.setSelectedIndex(-1);

        jLabel9.setFont(new java.awt.Font("ITC Kabel Std", 1, 14)); // NOI18N
        jLabel9.setText("Pagamento Dato");

        jLabel10.setFont(new java.awt.Font("ITC Kabel Std", 1, 14)); // NOI18N
        jLabel10.setText("Pagamento Ricevuto");

        turno7.setBackground(new java.awt.Color(193, 255, 193));
        turno7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        turno7.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        jScrollPane1.setViewportView(turno7);

        ordine7.setBackground(new java.awt.Color(193, 255, 193));
        ordine7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        ordine7.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        jScrollPane2.setViewportView(ordine7);

        d2.setBackground(new java.awt.Color(193, 255, 193));
        d2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        d2.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        jScrollPane4.setViewportView(d2);

        p_dato7.setBackground(new java.awt.Color(193, 255, 193));
        p_dato7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        p_dato7.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        jScrollPane5.setViewportView(p_dato7);

        p_ric7.setBackground(new java.awt.Color(193, 255, 193));
        p_ric7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        p_ric7.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        jScrollPane6.setViewportView(p_ric7);

        d1.setBackground(new java.awt.Color(193, 255, 193));
        d1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        d1.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        jScrollPane7.setViewportView(d1);

        jLabel11.setFont(new java.awt.Font("ITC Kabel Std", 1, 14)); // NOI18N
        jLabel11.setText("Tipo");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progetto_monopoly/icone/mr7.jpg"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        jLabel1.setText("*Nota che verranno prese in considerazione solo le modifiche rispetto al tipo selezionato.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(indietro7))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel4)
                .addGap(94, 94, 94)
                .addComponent(tipo_m7, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(105, 105, 105)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(98, 98, 98)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(98, 98, 98)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(98, 98, 98)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel6))
                        .addGap(53, 53, 53)
                        .addComponent(tipo_p7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(63, 63, 63)
                .addComponent(jLabel12))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addComponent(clear7, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(aggiorna7, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(indietro7)
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel4))
                    .addComponent(tipo_m7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel8))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel5))
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel7))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel6))
                            .addComponent(tipo_p7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel9))
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel10))
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel12)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aggiorna7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void indietro7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indietro7ActionPerformed
       this.dispose();
       Classe obj = new Classe();
       obj.setVisible(true);
    }//GEN-LAST:event_indietro7ActionPerformed

    private void clear7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear7ActionPerformed
    
        turno7.setText(null);
        ordine7.setText(null);
        tipo_m7.setSelectedIndex(-1);
        d1.setText(null);
        d2.setText(null);
        tipo_p7.setSelectedIndex(-1);
        p_dato7.setText(null);
        p_ric7.setText(null);
    }//GEN-LAST:event_clear7ActionPerformed

    private void aggiorna7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aggiorna7ActionPerformed
       try{
            con = Database.getDefaultConnection();
         
        tipo_m = tipo_m7.getSelectedIndex();
        
        query="UPDATE MOSSA SET TURNO="+turno7.getText()+",ORDINE="+ordine7.getText()+" WHERE ID_MOSSA="+Dati_Tabella.ID_Mossa;
        switch(tipo_m){
            case 0:
                dado1=Integer.parseInt(d1.getText());
                dado2=Integer.parseInt(d2.getText());
               
                try{
                  String query="SELECT ID_GIOCATORE,ID_PARTITA FROM MOSSA WHERE ID_MOSSA="+Dati_Tabella.ID_Mossa;
                  pst = con.prepareStatement(query);
                 rs = pst.executeQuery();
                 while(rs.next()){
                   cod_g = rs.getInt(1);
                   cod_partita=rs.getInt(2);
                }
                  
                  query="SELECT MAX(TURNO) FROM MOSSA WHERE CASELLA_ARRIVO IS NOT NULL AND ID_PARTITA="+cod_partita+" AND ID_GIOCATORE="+cod_g;
                  pst = con.prepareStatement(query);
                  rs = pst.executeQuery();
                   while(rs.next()){
                      tur = rs.getInt(1);
                             }
                 
                  if(tur==0){
                      id_partenza=40;
                      posP=0;
           } else{
          query="SELECT MOSSA.CASELLA_ARRIVO,CASELLA.POSIZIONE FROM (MOSSA JOIN CASELLA ON MOSSA.CASELLA_ARRIVO=CASELLA.ID_CASELLA)  WHERE MOSSA.ID_PARTITA="+cod_partita+" AND MOSSA.ID_GIOCATORE="+cod_g+" AND MOSSA.TURNO="+tur;
          pst = con.prepareStatement(query);
          rs = pst.executeQuery();
          while(rs.next()){
                    id_partenza = rs.getInt(1);
                    posP=rs.getInt(2);
          }
                  }
          int somma=dado1+dado2;
          posA=posP;
     
           while(somma>0){
               if(posA==40){
                 posA=1;
            } else 
                posA=posA+1;
             somma--;
           }
         query="SELECT ID_CASELLA FROM CASELLA WHERE POSIZIONE="+posA;
                pst = con.prepareStatement(query);
                rs = pst.executeQuery();
                while(rs.next()){
                   id_arrivo=rs.getInt(1);
                }
           
           
           }catch(SQLException e){ System.out.println(e);}
                
                query1="UPDATE MOSSA SET TIPO_MOSSA='"+tipo_m7.getSelectedItem()+"', DADO1="+dado1+" ,DADO2="+dado2+",TIPO_PAGAMENTO=NULL,PAGAMENTO_DATO=NULL,PAGAMENTO_RICEVUTO=NULL,ID_POSSEDIMENTO=NULL,CASELLA_PARTENZA="+id_partenza+",CASELLA_ARRIVO="+id_arrivo+"WHERE ID_MOSSA="+Dati_Tabella.ID_Mossa;
                break;
            case 1:
                p_dato=Integer.parseInt(p_dato7.getText());
                p_ric=Integer.parseInt(p_ric7.getText());
                query1="UPDATE MOSSA SET TIPO_MOSSA='"+tipo_m7.getSelectedItem()+"', DADO1=NULL,DADO2=NULL,CASELLA_ARRIVO=NULL,CASELLA_PARTENZA=NULL,ID_CARTA=NULL,TIPO_PAGAMENTO='"+tipo_p7.getSelectedItem()+"', PAGAMENTO_RICEVUTO="+p_ric+", PAGAMENTO_DATO="+p_dato+"WHERE ID_MOSSA=" + Dati_Tabella.ID_Mossa;
                break;
        
        }
            pst = con.prepareStatement(query);
            pst = con.prepareStatement(query1);
            
            
            pst.executeUpdate(query);
            pst.executeUpdate(query1);
               
                UIManager.put("OptionPane.background",new ColorUIResource(193,255,193));
                UIManager.put("Panel.background",new ColorUIResource(193,255,193));
                UIManager.put("OptionPane.messageFont", new Font("ITC Kabel Std", Font.BOLD, 14));
                UIManager.put("OptionPane.buttonFont", new Font("AppleMyungjo", Font.ITALIC, 12));
                JOptionPane.showMessageDialog(this, "Modifica effettuata!", "", JOptionPane.INFORMATION_MESSAGE,new ImageIcon("pollice.gif"));
            
                con.close();
                
                this.dispose();
                Classe obj = new Classe();
                obj.setVisible(true);
          
        
       }catch(SQLException|NumberFormatException e){ 
                UIManager.put("OptionPane.background",new ColorUIResource(193,255,193));
                UIManager.put("Panel.background",new ColorUIResource(193,255,193));
                UIManager.put("OptionPane.messageFont", new Font("ITC Kabel Std", Font.BOLD, 14));
                UIManager.put("OptionPane.buttonFont", new Font("AppleMyungjo", Font.ITALIC, 12));
                JOptionPane.showMessageDialog(this, "Inserire campi!", "Errore", JOptionPane.ERROR_MESSAGE,new ImageIcon("oh.gif"));
           }
    }//GEN-LAST:event_aggiorna7ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modifica_Mossa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aggiorna7;
    private javax.swing.JButton clear7;
    private javax.swing.JTextPane d1;
    private javax.swing.JTextPane d2;
    private javax.swing.JButton indietro7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextPane ordine7;
    private javax.swing.JTextPane p_dato7;
    private javax.swing.JTextPane p_ric7;
    private javax.swing.JComboBox<String> tipo_m7;
    private javax.swing.JComboBox<String> tipo_p7;
    private javax.swing.JTextPane turno7;
    // End of variables declaration//GEN-END:variables
}
