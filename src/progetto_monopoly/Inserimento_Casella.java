package progetto_monopoly;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import static progetto_monopoly.Inserimento_Contratto.casella;
import static progetto_monopoly.Inserimento_Contratto.ID_Cas;
import static progetto_monopoly.Inserimento_Contratto.nome_con;
import static progetto_monopoly.Inserimento_Contratto.pst_con;
import static progetto_monopoly.Inserimento_Contratto.prezzo_con;
import static progetto_monopoly.Inserimento_Contratto.colore_con;
import static progetto_monopoly.Inserimento_Contratto.con_contr;


public class Inserimento_Casella extends javax.swing.JFrame {
    int flag=1;
    static int contratto=0;
    Connection con = null;
    PreparedStatement pst,pst1,pst2,pst3,pst4,pst5;
    ResultSet rs;
    int posizione1,tipoNonEd=2;
    static String nome_cas,colore;
    String pos;
    int selection=0;
    static int prezzo, ID_Casella;

    public Inserimento_Casella() {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        flag=1;
        contratto=0;
        selection=0;
        tipoNonEd=2;
        UIManager.put("ComboBox.disabledForeground", Color.BLACK);
        if(casella==1){
            indietro2.setEnabled(false);
              clear2.setEnabled(false);
            tipo_casella.setSelectedItem("TERRITORIO");
            tipo_casella.setEnabled(false);
            testo1.setVisible(true);
            nomeC.setText(nome_con);
            nomeC.setEnabled(false);
            importo.setText(""+prezzo_con);
            importo.setEnabled(false);
                tipo_nonEd.setVisible(false);
                tipo_colore.setVisible(true);
                tipo_colore.setSelectedItem(colore_con);
                tipo_colore.setEnabled(false);
                testo2.setVisible(true);
                pImporto.setVisible(true);
                testo3.setVisible(false);
                pDescrizione.setVisible(false);
                
        } else if(casella==2 | casella==3){
            indietro2.setEnabled(false);
            clear2.setEnabled(false);
            tipo_casella.setSelectedItem("NON EDIFICABILE");
            if(casella==2){
                 tipo_nonEd.setSelectedItem("FERROVIA");
            } else 
                tipo_nonEd.setSelectedItem("SOCIETÀ");
            
            nomeC.setText(nome_con);
            nomeC.setEnabled(false);
            importo.setText(""+prezzo_con);
            importo.setEnabled(false);
            tipo_casella.setEnabled(false);
              tipo_nonEd.setVisible(true);
                tipo_colore.setVisible(false);
                tipo_nonEd.setEnabled(false);
                testo1.setVisible(true);
                testo2.setVisible(true);
                pImporto.setVisible(true);
                testo3.setVisible(false);
                pDescrizione.setVisible(false);
               
        }else {testo1.setVisible(true);
                tipo_nonEd.setVisible(false);
                tipo_colore.setVisible(true);
                testo2.setVisible(true);
                pImporto.setVisible(true);
                testo3.setVisible(false);
                pDescrizione.setVisible(false);
          
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
        aggiungi2 = new javax.swing.JButton();
        clear2 = new javax.swing.JButton();
        pDescrizione = new javax.swing.JScrollPane();
        descrizione = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        posizione = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(680, 470));
        setMinimumSize(new java.awt.Dimension(680, 470));
        setSize(new java.awt.Dimension(680, 470));

        jPanel1.setBackground(new java.awt.Color(193, 255, 193));
        jPanel1.setMaximumSize(new java.awt.Dimension(680, 470));
        jPanel1.setSize(new java.awt.Dimension(680, 470));
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
        jLabel1.setText("Riempire i campi di Casella e premere Aggiungi per confermare");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 66, 413, 17);

        jLabel2.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel2.setText("Nome*");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 132, 46, 19);

        nomeC.setBackground(new java.awt.Color(193, 255, 193));
        nomeC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        nomeC.setFont(new java.awt.Font("ITC Kabel Std", 0, 18)); // NOI18N
        nomeC.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(nomeC);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(190, 130, 164, 28);

        jLabel3.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel3.setText("Seleziona tipo*");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 90, 99, 30);

        tipo_casella.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        tipo_casella.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TERRITORIO", "NON EDIFICABILE", "SPECIALE", "IMPREVISTI", "PROBABILITÀ" }));
        tipo_casella.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipo_casellaActionPerformed(evt);
            }
        });
        jPanel1.add(tipo_casella);
        tipo_casella.setBounds(190, 90, 151, 27);

        tipo_nonEd.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        tipo_nonEd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FERROVIA", "SOCIETÀ" }));
        tipo_nonEd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipo_nonEdActionPerformed(evt);
            }
        });
        jPanel1.add(tipo_nonEd);
        tipo_nonEd.setBounds(180, 260, 130, 27);

        testo1.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        testo1.setText("Seleziona*");
        jPanel1.add(testo1);
        testo1.setBounds(30, 250, 69, 27);

        tipo_colore.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        tipo_colore.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FUCSIA", "CELESTE", "ARANCIONE", "MARRONE", "ROSSO", "GIALLO", "VERDE", "BLU" }));
        jPanel1.add(tipo_colore);
        tipo_colore.setBounds(180, 260, 125, 27);

        testo2.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        testo2.setText("Prezzo*");
        testo2.setToolTipText("");
        jPanel1.add(testo2);
        testo2.setBounds(30, 214, 51, 19);

        importo.setBackground(new java.awt.Color(193, 255, 193));
        importo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        importo.setFont(new java.awt.Font("ITC Kabel Std", 0, 18)); // NOI18N
        pImporto.setViewportView(importo);

        jPanel1.add(pImporto);
        pImporto.setBounds(190, 210, 100, 28);

        testo3.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        testo3.setText("Testo*");
        jPanel1.add(testo3);
        testo3.setBounds(30, 255, 60, 19);

        aggiungi2.setFont(new java.awt.Font("Kabel", 2, 12)); // NOI18N
        aggiungi2.setText("Aggiungi");
        aggiungi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aggiungi2ActionPerformed(evt);
            }
        });
        jPanel1.add(aggiungi2);
        aggiungi2.setBounds(70, 350, 107, 46);

        clear2.setFont(new java.awt.Font("Kabel", 2, 12)); // NOI18N
        clear2.setText("Clear");
        clear2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear2ActionPerformed(evt);
            }
        });
        jPanel1.add(clear2);
        clear2.setBounds(210, 350, 107, 46);

        descrizione.setBackground(new java.awt.Color(193, 255, 193));
        descrizione.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        descrizione.setFont(new java.awt.Font("ITC Kabel Std", 0, 12)); // NOI18N
        pDescrizione.setViewportView(descrizione);

        jPanel1.add(pDescrizione);
        pDescrizione.setBounds(150, 260, 232, 52);

        jLabel4.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        jLabel4.setText("*I campi contrassegnati con (*) sono obbligatori");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 420, 261, 17);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progetto_monopoly/icone/corri.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(400, 80, 260, 320);

        jLabel6.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel6.setText("Posizione*");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 169, 69, 19);

        posizione.setBackground(new java.awt.Color(193, 255, 193));
        posizione.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        posizione.setFont(new java.awt.Font("ITC Kabel Std", 0, 18)); // NOI18N
        posizione.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(posizione);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(190, 170, 100, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
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
                //Territorio ->1
                flag=1;
                testo1.setVisible(true);
                tipo_nonEd.setVisible(false);
                tipo_colore.setVisible(true);
                testo2.setVisible(true);
                pImporto.setVisible(true);
                testo3.setVisible(false);
                pDescrizione.setVisible(false);
             
                break;
            case 1:
                //Non edificabile ->2
                flag=2;
                tipo_nonEd.setVisible(true);
                tipo_colore.setVisible(false);
                testo1.setVisible(true);
                testo2.setVisible(true);
                pImporto.setVisible(true);
                testo3.setVisible(false);
                pDescrizione.setVisible(false);
           
                break;
            case 2:
                //Speciale ->3
                flag=3;
                tipo_nonEd.setVisible(false);
                tipo_colore.setVisible(false);
                testo1.setVisible(false);
                testo2.setVisible(true);
                pImporto.setVisible(true);
                testo3.setVisible(true);
                pDescrizione.setVisible(true);
          
                break;
            case 3:
                //Imprevisti ->4
                flag=4;
                tipo_nonEd.setVisible(false);
                tipo_colore.setVisible(false);
                testo1.setVisible(false);
                testo2.setVisible(false);
                pImporto.setVisible(false);
                testo3.setVisible(false);
                pDescrizione.setVisible(false);
           
                break;
            case 4:
                //Probabilità ->5
                flag=5;
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

    private void aggiungi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aggiungi2ActionPerformed
               
        try{
            con = Database.getDefaultConnection();
                
                nome_cas=nomeC.getText();
                pos=posizione.getText();
                posizione1=Integer.parseInt(pos);
                
                String query="SELECT MAX(ID_CASELLA) FROM DB_MONO.CASELLA";
                pst = con.prepareStatement(query);
                rs = pst.executeQuery();
                while(rs.next()){
                    ID_Casella = rs.getInt(1);
                }
                String query1;
                
                if(flag==1){
                    
                    query1="INSERT INTO CASELLA(ID_CASELLA,NOME,POSIZIONE,TIPO_CASELLA,PREZZO,COLORE) VALUES (?,?,?,?,?,?)";
                    pst1 = con.prepareStatement(query1);
                    if(casella==1) 
                        pst1.setInt(1,(ID_Cas+1));
                    else {
                        pst1.setInt(1,(ID_Casella+1));
                        //contratto associato ->1
                        contratto=1;
                    }
                    
                    pst1.setString(2,nome_cas);
                    pst1.setInt(3,posizione1);
                    pst1.setString(4, "TERRITORIO");
                    
                    String pre=importo.getText();
                    prezzo=Integer.parseInt(pre);
                    pst1.setInt(5, prezzo);
                    
                    colore=(String)tipo_colore.getSelectedItem();
                    pst1.setString(6,colore);
                    
                    pst1.executeUpdate(); 
                } else if(flag==2) {
                    query1="INSERT INTO CASELLA(ID_CASELLA,NOME,POSIZIONE,TIPO_CASELLA,PREZZO,TIPO_NONED) VALUES (?,?,?,?,?,?)";
                   
                    
                    pst2 = con.prepareStatement(query1);
                    if(casella==2 | casella==3) 
                        pst2.setInt(1,(ID_Cas+1));
                    else {
                        pst2.setInt(1,(ID_Casella+1));
                        //contratto (ferrovia) associato -> 2
                        contratto=2;
                        if(contratto!=tipoNonEd){
                           //contratto (stazione) associato ->3
                            contratto=3;
                     }
                    }
                    
                    pst2.setString(2,nome_cas);
                    pst2.setInt(3,posizione1);
                    pst2.setString(4, "NON EDIFICABILE");
                    
                    String pre=importo.getText();
                    prezzo=Integer.parseInt(pre);
                    pst2.setInt(5, prezzo);
                    
                    String nonEd=(String)tipo_nonEd.getSelectedItem();
                    pst2.setString(6,nonEd);
                    
                    pst2.executeUpdate();
                    
                } else if(flag==3){
                    query1="INSERT INTO CASELLA(ID_CASELLA,NOME,POSIZIONE,TIPO_CASELLA,PREZZO,TESTO) VALUES (?,?,?,?,?,?)";
                    pst3 = con.prepareStatement(query1);
                    pst3.setInt(1,(ID_Casella+1));
                    pst3.setString(2,nome_cas);
                    pst3.setInt(3,posizione1);
                    pst3.setString(4, "SPECIALE");
                    
                    String pre=importo.getText();
                    prezzo = Integer.parseInt(pre);
                    pst3.setInt(5, prezzo);
                    
                    String descr=descrizione.getText();
                    pst3.setString(6,descr);
                    pst3.executeUpdate();
                } else if(flag==4){
                    query1="INSERT INTO CASELLA(ID_CASELLA,NOME,POSIZIONE,TIPO_CASELLA) VALUES (?,?,?,?)";
                    pst4 = con.prepareStatement(query1);
                    pst4.setInt(1,(ID_Casella+1));
                    pst4.setString(2,nome_cas);
                    pst4.setInt(3,posizione1);
                    pst4.setString(4, "IMPREVISTI");
                    
                    pst4.executeUpdate();
                } else if(flag==5){
                    query1="INSERT INTO CASELLA(ID_CASELLA,NOME,POSIZIONE,TIPO_CASELLA) VALUES (?,?,?,?)";
                    pst5 = con.prepareStatement(query1);
                    pst5.setInt(1,(ID_Casella+1));
                    pst5.setString(2,nome_cas);
                    pst5.setInt(3,posizione1);
                    pst5.setString(4, "PROBABILITÀ");
                    
                    pst5.executeUpdate();
                }
                
                if(casella==1 | casella==2 | casella==3){
                    pst_con.executeUpdate();
                    con_contr.close();
                }
                
               con.close();
               UIManager.put("OptionPane.background",new ColorUIResource(193,255,193));
               UIManager.put("Panel.background",new ColorUIResource(193,255,193));
               UIManager.put("OptionPane.messageFont", new Font("ITC Kabel Std", Font.BOLD, 14));
               UIManager.put("OptionPane.buttonFont", new Font("AppleMyungjo", Font.ITALIC, 12));
               JOptionPane.showMessageDialog(this, "Inserimento riuscito!", "", JOptionPane.INFORMATION_MESSAGE,new ImageIcon("pollice.gif"));
               if(contratto==1 | contratto==2 | contratto==3){
                   this.dispose();
                   Inserimento_Contratto obj = new Inserimento_Contratto();
                   obj.setVisible(true);
               } else {
                   this.dispose();
                   Classe obj = new Classe();
                   obj.setVisible(true);
               }
                  
            
        }catch(SQLSyntaxErrorException r){
                UIManager.put("OptionPane.background",new ColorUIResource(193,255,193));
                UIManager.put("Panel.background",new ColorUIResource(193,255,193));
                UIManager.put("OptionPane.messageFont", new Font("ITC Kabel Std", Font.BOLD, 14));
                UIManager.put("OptionPane.buttonFont", new Font("AppleMyungjo", Font.ITALIC, 12));
                JOptionPane.showMessageDialog(this, "La posizione è già occupata.", "Errore", JOptionPane.ERROR_MESSAGE,new ImageIcon("oh.gif"));
        }
        catch( NumberFormatException | NullPointerException |  SQLException t){
                UIManager.put("OptionPane.background",new ColorUIResource(193,255,193));
                UIManager.put("Panel.background",new ColorUIResource(193,255,193));
                UIManager.put("OptionPane.messageFont", new Font("ITC Kabel Std", Font.BOLD, 14));
                UIManager.put("OptionPane.buttonFont", new Font("AppleMyungjo", Font.ITALIC, 12));
                JOptionPane.showMessageDialog(this, "Inserire tutti i campi.", "Errore", JOptionPane.ERROR_MESSAGE,new ImageIcon("prigione.gif"));}
   
        
        
    }//GEN-LAST:event_aggiungi2ActionPerformed

    private void tipo_nonEdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipo_nonEdActionPerformed
        tipoNonEd=tipo_nonEd.getSelectedIndex()+2;
    }//GEN-LAST:event_tipo_nonEdActionPerformed

    private void clear2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear2ActionPerformed
        selection=0;
        tipoNonEd=2;
        nomeC.setText(null);
        posizione.setText(null);
        contratto=0;
        if(flag==1){
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
               } else if(flag==2){
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
               } else if(flag==3){
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
               }else if(flag==4){
                   tipo_casella.setSelectedItem("Imprevisti");
               } else if(flag==5) {
                   tipo_casella.setSelectedItem("Probabilità");
               }
     
    }//GEN-LAST:event_clear2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inserimento_Casella().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aggiungi2;
    private javax.swing.JButton clear2;
    private javax.swing.JTextPane descrizione;
    private javax.swing.JTextPane importo;
    private javax.swing.JButton indietro2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
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
