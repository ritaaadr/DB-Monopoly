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


public class Modifica_Casella extends javax.swing.JFrame {
    Connection con = null;
    PreparedStatement pst;
    ResultSet rs;
    int selection=0;
    String query,query1,query2,query3,query4,query5,query6;
  

    public Modifica_Casella() {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        
        tipo_casella.setSelectedItem(Dati_Tabella.Tipo_casella);
        selection=tipo_casella.getSelectedIndex();
        nomeC.setText(Dati_Tabella.nome_casella);
        posizione.setText("" + Dati_Tabella.posizione);
        switch (selection){
            case 0:
                //Territorio ->0
                testo1.setVisible(true);
                importo.setText("" + Dati_Tabella.prezzo);
                tipo_nonEd.setVisible(false);
                tipo_colore.setVisible(true);
                tipo_colore.setSelectedItem(Dati_Tabella.colore);
                testo2.setVisible(true);
                pImporto.setVisible(true);
                testo3.setVisible(false);
                pDescrizione.setVisible(false);
             
                break;
            case 1:
                //Non edificabile ->1
                tipo_nonEd.setVisible(true);
                importo.setText("" + Dati_Tabella.prezzo);
                tipo_nonEd.setSelectedItem(Dati_Tabella.Tipo_non_edificabile);
                tipo_colore.setVisible(false);
                testo1.setVisible(true);
                testo2.setVisible(true);
                pImporto.setVisible(true);
                testo3.setVisible(false);
                pDescrizione.setVisible(false);
           
                break;
            case 2:
                //Speciale ->2
                tipo_nonEd.setVisible(false);
                importo.setText("" + Dati_Tabella.prezzo);
                tipo_colore.setVisible(false);
                testo1.setVisible(false);
                testo2.setVisible(true);
                pImporto.setVisible(true);
                testo3.setVisible(true);
                pDescrizione.setVisible(true);
                descrizione.setText(Dati_Tabella.testo_casella);
          
                break;
            case 3:
                //Imprevisti ->3
                tipo_nonEd.setVisible(false);
                tipo_colore.setVisible(false);
                testo1.setVisible(false);
                testo2.setVisible(false);
                pImporto.setVisible(false);
                testo3.setVisible(false);
                pDescrizione.setVisible(false);
           
                break;
            case 4:
                //Probabilità ->4
                tipo_nonEd.setVisible(false);
                tipo_colore.setVisible(false);
                testo1.setVisible(false);
                testo2.setVisible(false);
                pImporto.setVisible(false);
                testo3.setVisible(false);
                pDescrizione.setVisible(false);
                break;
              }
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        indietro2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        nomeC = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        tipo_casella = new javax.swing.JComboBox<>();
        tipo_nonEd = new javax.swing.JComboBox<>();
        testo1 = new javax.swing.JLabel();
        tipo_colore = new javax.swing.JComboBox<>();
        testo2 = new javax.swing.JLabel();
        pImporto = new javax.swing.JScrollPane();
        importo = new javax.swing.JTextPane();
        testo3 = new javax.swing.JLabel();
        modifica4 = new javax.swing.JButton();
        clear2 = new javax.swing.JButton();
        pDescrizione = new javax.swing.JScrollPane();
        descrizione = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        posizione = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(620, 365));
        setMinimumSize(new java.awt.Dimension(620, 365));
        setPreferredSize(new java.awt.Dimension(620, 365));
        setSize(new java.awt.Dimension(620, 365));

        jPanel1.setBackground(new java.awt.Color(193, 255, 193));
        jPanel1.setMaximumSize(new java.awt.Dimension(620, 365));
        jPanel1.setMinimumSize(new java.awt.Dimension(620, 365));
        jPanel1.setPreferredSize(new java.awt.Dimension(620, 365));
        jPanel1.setSize(new java.awt.Dimension(620, 365));
        jPanel1.setLayout(null);

        indietro2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progetto_monopoly/icone/back.png"))); // NOI18N
        indietro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indietro2ActionPerformed(evt);
            }
        });
        jPanel1.add(indietro2);
        indietro2.setBounds(30, 23, 81, 31);

        jLabel1.setFont(new java.awt.Font("ITC Kabel Std", 1, 13)); // NOI18N
        jLabel1.setText("Riempire i campi di Casella e premere Aggiorna per confermare");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 66, 413, 17);

        jLabel2.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel2.setText("Nome");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 130, 46, 19);

        nomeC.setBackground(new java.awt.Color(193, 255, 193));
        nomeC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        nomeC.setFont(new java.awt.Font("ITC Kabel Std", 0, 14)); // NOI18N
        nomeC.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(nomeC);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(190, 120, 164, 24);

        jLabel3.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel3.setText("Tipo");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 90, 29, 30);

        tipo_casella.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        tipo_casella.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TERRITORIO", "NON EDIFICABILE", "SPECIALE", "IMPREVISTI", "PROBABILITÀ" }));
        tipo_casella.setSelectedIndex(-1);
        tipo_casella.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipo_casellaActionPerformed(evt);
            }
        });
        jPanel1.add(tipo_casella);
        tipo_casella.setBounds(190, 90, 151, 27);

        tipo_nonEd.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        tipo_nonEd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FERROVIA", "SOCIETÀ" }));
        tipo_nonEd.setSelectedIndex(-1);
        tipo_nonEd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipo_nonEdActionPerformed(evt);
            }
        });
        jPanel1.add(tipo_nonEd);
        tipo_nonEd.setBounds(180, 230, 130, 27);

        testo1.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        testo1.setText("Seleziona");
        jPanel1.add(testo1);
        testo1.setBounds(30, 220, 62, 27);

        tipo_colore.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        tipo_colore.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FUCSIA", "CELESTE", "ARANCIONE", "MARRONE", "ROSSO", "GIALLO", "VERDE", "BLU" }));
        tipo_colore.setSelectedIndex(-1);
        jPanel1.add(tipo_colore);
        tipo_colore.setBounds(180, 230, 125, 27);

        testo2.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        testo2.setText("Prezzo");
        testo2.setToolTipText("");
        jPanel1.add(testo2);
        testo2.setBounds(30, 190, 44, 19);

        importo.setBackground(new java.awt.Color(193, 255, 193));
        importo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        importo.setFont(new java.awt.Font("ITC Kabel Std", 0, 14)); // NOI18N
        pImporto.setViewportView(importo);

        jPanel1.add(pImporto);
        pImporto.setBounds(190, 190, 100, 24);

        testo3.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        testo3.setText("Testo");
        jPanel1.add(testo3);
        testo3.setBounds(30, 220, 60, 19);

        modifica4.setFont(new java.awt.Font("Kabel", 2, 12)); // NOI18N
        modifica4.setText("Aggiorna");
        modifica4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifica4ActionPerformed(evt);
            }
        });
        jPanel1.add(modifica4);
        modifica4.setBounds(80, 290, 109, 40);

        clear2.setFont(new java.awt.Font("Kabel", 2, 12)); // NOI18N
        clear2.setText("Clear");
        clear2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear2ActionPerformed(evt);
            }
        });
        jPanel1.add(clear2);
        clear2.setBounds(210, 290, 107, 40);

        descrizione.setBackground(new java.awt.Color(193, 255, 193));
        descrizione.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        descrizione.setFont(new java.awt.Font("ITC Kabel Std", 0, 12)); // NOI18N
        pDescrizione.setViewportView(descrizione);

        jPanel1.add(pDescrizione);
        pDescrizione.setBounds(150, 220, 232, 52);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progetto_monopoly/icone/vacanza.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(410, 40, 200, 280);

        jLabel6.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel6.setText("Posizione");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 160, 62, 19);

        posizione.setBackground(new java.awt.Color(193, 255, 193));
        posizione.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        posizione.setFont(new java.awt.Font("ITC Kabel Std", 0, 14)); // NOI18N
        posizione.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(posizione);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(190, 156, 100, 24);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void indietro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indietro2ActionPerformed
       this.dispose();
       Classe obj = new Classe();
       obj.setVisible(true);
    }//GEN-LAST:event_indietro2ActionPerformed

    private void tipo_casellaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipo_casellaActionPerformed
       selection=tipo_casella.getSelectedIndex();
        switch (selection){
            case 0:
                //Territorio ->0
                testo1.setVisible(true);
                tipo_nonEd.setVisible(false);
                tipo_colore.setVisible(true);
                testo2.setVisible(true);
                pImporto.setVisible(true);
                testo3.setVisible(false);
                pDescrizione.setVisible(false);
             
                break;
            case 1:
                //Non edificabile ->1
                tipo_nonEd.setVisible(true);
                tipo_colore.setVisible(false);
                testo1.setVisible(true);
                testo2.setVisible(true);
                pImporto.setVisible(true);
                testo3.setVisible(false);
                pDescrizione.setVisible(false);
           
                break;
            case 2:
                //Speciale ->2
                tipo_nonEd.setVisible(false);
                tipo_colore.setVisible(false);
                testo1.setVisible(false);
                testo2.setVisible(true);
                pImporto.setVisible(true);
                testo3.setVisible(true);
                pDescrizione.setVisible(true);
          
                break;
            case 3:
                //Imprevisti ->3
                tipo_nonEd.setVisible(false);
                tipo_colore.setVisible(false);
                testo1.setVisible(false);
                testo2.setVisible(false);
                pImporto.setVisible(false);
                testo3.setVisible(false);
                pDescrizione.setVisible(false);
           
                break;
            case 4:
                //Probabilità ->4
                tipo_nonEd.setVisible(false);
                tipo_colore.setVisible(false);
                testo1.setVisible(false);
                testo2.setVisible(false);
                pImporto.setVisible(false);
                testo3.setVisible(false);
                pDescrizione.setVisible(false);
                break;
              } 
           
    }//GEN-LAST:event_tipo_casellaActionPerformed

    private void modifica4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifica4ActionPerformed
     try{
            con = Database.getDefaultConnection();
            query1 = "UPDATE CASELLA SET NOME ="+"'"+nomeC.getText() + "'" +" WHERE ID_CASELLA=" + Dati_Tabella.ID_Casella;
            int pos=Integer.parseInt(posizione.getText());
          query2 ="UPDATE CASELLA SET POSIZIONE="+pos +" WHERE ID_CASELLA=" + Dati_Tabella.ID_Casella;
    
            switch(selection){
                case 0:
                    int imp=Integer.parseInt(importo.getText());
                query="UPDATE CASELLA SET TIPO_CASELLA=" + "'" + (String) tipo_casella.getSelectedItem() + "'" + ", PREZZO=" +imp +", COLORE=" + "'"+ (String)tipo_colore.getSelectedItem() +"'"+" , TESTO= NULL , TIPO_NONED=NULL WHERE ID_CASELLA=" + Dati_Tabella.ID_Casella;
                break;
                case 1:
                    imp=Integer.parseInt(importo.getText());
                    query="UPDATE CASELLA SET TIPO_CASELLA=" + "'" + (String) tipo_casella.getSelectedItem() + "'" + ", PREZZO=" +imp +", COLORE=NULL, TESTO= NULL , TIPO_NONED="+ "'"+ (String)tipo_nonEd.getSelectedItem() +"' WHERE ID_CASELLA=" + Dati_Tabella.ID_Casella;
                   break;
                case 2:
                    imp=Integer.parseInt(importo.getText());
                    query="UPDATE CASELLA SET TIPO_CASELLA=" + "'" + (String) tipo_casella.getSelectedItem() + "'" + ", PREZZO=" +imp +", COLORE=NULL, TESTO="+ "'"+ descrizione.getText() +"',TIPO_NONED=NULL WHERE ID_CASELLA=" + Dati_Tabella.ID_Casella;
                   break;
                case 3:
                    query="UPDATE CASELLA SET TIPO_CASELLA=" + "'" + (String) tipo_casella.getSelectedItem() + "'" + ",PREZZO=NULL,COLORE=NULL,TESTO=NULL,TIPO_NONED=NULL WHERE ID_CASELLA=" + Dati_Tabella.ID_Casella;
                   break;
                 case 4:
                    query="UPDATE CASELLA SET TIPO_CASELLA=" + "'" + (String) tipo_casella.getSelectedItem() + "'" + ",PREZZO=NULL,COLORE=NULL,TESTO=NULL,TIPO_NONED=NULL WHERE ID_CASELLA=" + Dati_Tabella.ID_Casella;
                   break;
            
            }
            pst = con.prepareStatement(query);
            pst = con.prepareStatement(query1);
            pst = con.prepareStatement(query2);
            
            
            pst.executeUpdate(query);
            pst.executeUpdate(query1);
            pst.executeUpdate(query2);
           
            
            UIManager.put("OptionPane.background",new ColorUIResource(193,255,193));
               UIManager.put("Panel.background",new ColorUIResource(193,255,193));
               UIManager.put("OptionPane.messageFont", new Font("ITC Kabel Std", Font.BOLD, 14));
               UIManager.put("OptionPane.buttonFont", new Font("AppleMyungjo", Font.ITALIC, 12));
               JOptionPane.showMessageDialog(this, "Modifica effettuata!", "", JOptionPane.INFORMATION_MESSAGE,new ImageIcon("pollice.gif"));
               
               this.dispose();
               Classe obj = new Classe();
               obj.setVisible(true);
                      
        
     }catch( SQLException | NumberFormatException t){
             
                UIManager.put("OptionPane.background",new ColorUIResource(193,255,193));
                UIManager.put("Panel.background",new ColorUIResource(193,255,193));
                UIManager.put("OptionPane.messageFont", new Font("ITC Kabel Std", Font.BOLD, 14));
                UIManager.put("OptionPane.buttonFont", new Font("AppleMyungjo", Font.ITALIC, 12));
                JOptionPane.showMessageDialog(this, "Inserire tutti i campi.\nLa posizione potrebbe essere già occupata", "Errore", JOptionPane.ERROR_MESSAGE,new ImageIcon("prigione.gif"));
           }
      
        
        
        
                
             
    }//GEN-LAST:event_modifica4ActionPerformed

    private void tipo_nonEdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipo_nonEdActionPerformed
   
    }//GEN-LAST:event_tipo_nonEdActionPerformed

    private void clear2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear2ActionPerformed
       nomeC.setText(null);
        posizione.setText(null);
        
        if(selection==0){
                tipo_casella.setSelectedItem("Territorio");
                importo.setText(null);
                descrizione.setText(null);
                tipo_colore.setSelectedItem("FUCSIA");
                testo1.setVisible(true);
                tipo_nonEd.setVisible(false);
                tipo_colore.setVisible(true);
                testo2.setVisible(true);
                pImporto.setVisible(true);
                testo3.setVisible(false);
                pDescrizione.setVisible(false);
               } else if(selection==1){
                tipo_casella.setSelectedItem("Non Edificabile");
                importo.setText(null);
                tipo_nonEd.setSelectedItem("FERROVIA");
                tipo_nonEd.setVisible(true);
                tipo_colore.setVisible(false);
                testo1.setVisible(true);
                testo2.setVisible(true);
                pImporto.setVisible(true);
                testo3.setVisible(false);
                pDescrizione.setVisible(false);
               } else if(selection==2){
                tipo_casella.setSelectedItem("Speciale");
                importo.setText(null);
                descrizione.setText(null);
                tipo_nonEd.setVisible(false);
                tipo_colore.setVisible(false);
                testo1.setVisible(false);
                testo2.setVisible(true);
                pImporto.setVisible(true);
                testo3.setVisible(true);
                pDescrizione.setVisible(true);
               }else if(selection==3){
                   tipo_casella.setSelectedItem("Imprevisti");
               } else if(selection==4) {
                   tipo_casella.setSelectedItem("Probabilità");
               }
     
    }//GEN-LAST:event_clear2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modifica_Casella().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear2;
    private javax.swing.JTextPane descrizione;
    private javax.swing.JTextPane importo;
    private javax.swing.JButton indietro2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton modifica4;
    private javax.swing.JTextPane nomeC;
    private javax.swing.JScrollPane pDescrizione;
    private javax.swing.JScrollPane pImporto;
    private javax.swing.JTextPane posizione;
    private javax.swing.JLabel testo1;
    private javax.swing.JLabel testo2;
    private javax.swing.JLabel testo3;
    private javax.swing.JComboBox<String> tipo_casella;
    private javax.swing.JComboBox<String> tipo_colore;
    private javax.swing.JComboBox<String> tipo_nonEd;
    // End of variables declaration//GEN-END:variables
}
