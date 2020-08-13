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




public class Cancellazione_Casella extends javax.swing.JFrame {
 Connection con = null;
    PreparedStatement pst;
    ResultSet rs;
    String query, testo, nome;
    int id_casella, tcas, pos, prezzo, tne, tc;
    int flag;
    int selection=0;
    

    public Cancellazione_Casella() {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
          
       try {
           con = Database.getDefaultConnection();
           query = "SELECT ID_CASELLA FROM CASELLA ORDER BY (ID_CASELLA) ASC";
           pst = con.prepareStatement(query);
           rs= pst.executeQuery();
           
           id_cas.removeAllItems();
                   while(rs.next()){
                    id_cas.addItem(""+rs.getInt(1));
                }
            id_cas.setSelectedIndex(-1);
   
            con.close();
            
       }catch(SQLException e){ System.out.println(e);}
       
            
            tipo_casella.setSelectedItem(Dati_Tabella.Tipo_casella);
            selection=tipo_casella.getSelectedIndex();
            id_cas.setSelectedItem(""+Dati_Tabella.ID_Casella);
            nome2.setText(""+Dati_Tabella.nome_casella);
            posizione2.setText(""+Dati_Tabella.posizione);
            
            switch (selection){
            case 0:
                //Territorio ->0
                importo2.setText("" + Dati_Tabella.prezzo);
                tipo_colore.setSelectedItem(Dati_Tabella.colore);
                break;
            case 1:
                //Non edificabile ->1
                tipo_nonEd.setSelectedItem(Dati_Tabella.Tipo_non_edificabile);
                importo2.setText("" + Dati_Tabella.prezzo);
           
                break;
            case 2:
                //Speciale ->2
                descrizione2.setText(""+Dati_Tabella.testo_casella);
                importo2.setText(""+Dati_Tabella.prezzo);
          
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
        nome2 = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        tipo_casella = new javax.swing.JComboBox<>();
        tipo_nonEd = new javax.swing.JComboBox<>();
        testo1 = new javax.swing.JLabel();
        tipo_colore = new javax.swing.JComboBox<>();
        testo2 = new javax.swing.JLabel();
        pImporto = new javax.swing.JScrollPane();
        importo2 = new javax.swing.JTextPane();
        testo3 = new javax.swing.JLabel();
        Elimina2 = new javax.swing.JButton();
        clear2 = new javax.swing.JButton();
        pDescrizione = new javax.swing.JScrollPane();
        descrizione2 = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        posizione2 = new javax.swing.JTextPane();
        jLabel7 = new javax.swing.JLabel();
        id_cas = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(627, 435));
        setMinimumSize(new java.awt.Dimension(627, 435));
        setSize(new java.awt.Dimension(627, 435));

        jPanel1.setBackground(new java.awt.Color(193, 255, 193));
        jPanel1.setMaximumSize(new java.awt.Dimension(627, 435));
        jPanel1.setSize(new java.awt.Dimension(627, 435));

        indietro2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progetto_monopoly/icone/back.png"))); // NOI18N
        indietro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indietro2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("ITC Kabel Std", 1, 13)); // NOI18N
        jLabel1.setText("Riempire i campi di Casella in base alla quale si vuole effettuare la cancellazione");

        jLabel2.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel2.setText("Nome");

        nome2.setBackground(new java.awt.Color(193, 255, 193));
        nome2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        nome2.setFont(new java.awt.Font("ITC Kabel Std", 0, 14)); // NOI18N
        nome2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(nome2);

        jLabel3.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel3.setText("Tipo");

        tipo_casella.setEditable(true);
        tipo_casella.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        tipo_casella.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TERRITORIO", "NON EDIFICABILE", "SPECIALE", "IMPREVISTI", "PROBABILITÀ" }));
        tipo_casella.setSelectedIndex(-1);
        tipo_casella.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipo_casellaActionPerformed(evt);
            }
        });

        tipo_nonEd.setEditable(true);
        tipo_nonEd.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        tipo_nonEd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FERROVIA", "SOCIETÀ" }));
        tipo_nonEd.setSelectedIndex(-1);
        tipo_nonEd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipo_nonEdActionPerformed(evt);
            }
        });

        testo1.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        testo1.setText("Colore");

        tipo_colore.setEditable(true);
        tipo_colore.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        tipo_colore.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FUCSIA", "CELESTE", "ARANCIONE", "MARRONE", "ROSSO", "GIALLO", "VERDE", "BLU" }));
        tipo_colore.setSelectedIndex(-1);

        testo2.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        testo2.setText("Prezzo");
        testo2.setToolTipText("");

        importo2.setBackground(new java.awt.Color(193, 255, 193));
        importo2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        importo2.setFont(new java.awt.Font("ITC Kabel Std", 0, 14)); // NOI18N
        pImporto.setViewportView(importo2);

        testo3.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        testo3.setText("Testo");

        Elimina2.setFont(new java.awt.Font("Kabel", 2, 12)); // NOI18N
        Elimina2.setText("Elimina");
        Elimina2.setToolTipText("");
        Elimina2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Elimina2ActionPerformed(evt);
            }
        });

        clear2.setFont(new java.awt.Font("Kabel", 2, 12)); // NOI18N
        clear2.setText("Clear");
        clear2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear2ActionPerformed(evt);
            }
        });

        descrizione2.setBackground(new java.awt.Color(193, 255, 193));
        descrizione2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        descrizione2.setFont(new java.awt.Font("ITC Kabel Std", 0, 12)); // NOI18N
        pDescrizione.setViewportView(descrizione2);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progetto_monopoly/icone/macchina.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel6.setText("Posizione");

        posizione2.setBackground(new java.awt.Color(193, 255, 193));
        posizione2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        posizione2.setFont(new java.awt.Font("ITC Kabel Std", 0, 14)); // NOI18N
        posizione2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(posizione2);

        jLabel7.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel7.setText("ID_Casella");

        id_cas.setEditable(true);
        id_cas.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N

        jLabel4.setFont(new java.awt.Font("ITC Kabel Std", 1, 14)); // NOI18N
        jLabel4.setText("Tipo Non Edificabile");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(indietro2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel6)
                                        .addComponent(testo2))
                                    .addGap(40, 40, 40))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(testo3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(testo1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(72, 72, 72)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pImporto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                            .addComponent(tipo_casella, 0, 1, Short.MAX_VALUE)
                            .addComponent(id_cas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tipo_nonEd, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tipo_colore, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pDescrizione))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addComponent(jLabel5))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clear2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Elimina2)
                .addGap(111, 111, 111))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(indietro2)
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_cas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tipo_casella, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pImporto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(testo2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tipo_colore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(testo1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tipo_nonEd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(testo3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pDescrizione, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Elimina2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void indietro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indietro2ActionPerformed
       this.dispose();
       Classe obj = new Classe();
       obj.setVisible(true);
    }//GEN-LAST:event_indietro2ActionPerformed

    private void tipo_casellaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipo_casellaActionPerformed

           
    }//GEN-LAST:event_tipo_casellaActionPerformed

    private void Elimina2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Elimina2ActionPerformed
        try{
            con = Database.getDefaultConnection();
            
        try{
            id_casella=Integer.parseInt((String)id_cas.getSelectedItem());
         }catch(NumberFormatException e) {
             id_casella=0;
         }
        try{
            pos=Integer.parseInt(posizione2.getText());
            }catch(NumberFormatException e) {
                pos=0;
            }
        try{
            prezzo=Integer.parseInt(importo2.getText());
        }catch(NumberFormatException e){
            prezzo=0;
        }
        
        tcas=tipo_casella.getSelectedIndex();
        nome=nome2.getText();
        tne=tipo_nonEd.getSelectedIndex();
        tc=tipo_colore.getSelectedIndex();
        testo=descrizione2.getText();
        query="DELETE FROM CASELLA WHERE ";
        
        int flag=0;
        if(id_casella!=0){
            query=query+" ID_CASELLA="+id_casella;
            flag=1;
        }
            if(tcas!=-1){
                if(flag==0){
                query= query+ " TIPO_CASELLA='"+tipo_casella.getSelectedItem()+"'";
                flag=1;
            } else if(flag==1)
                query=query+ " AND TIPO_CASELLA='"+tipo_casella.getSelectedItem()+"'";
            }
            if(!(nome.equals(""))){
                if(flag==0){
                query=query+ " NOME ='"+nome+"'";
                flag=1;
                }
            else if(flag==1)
                query=query+" AND NOME='"+nome+"'";
            }
            if(pos!=0){
                if(flag==0){
                    query=query+" POSIZIONE="+pos;
                    flag=1;
                }else if(flag==1)
                    query=query+" AND POSIZIONE="+pos;
            }
            if(prezzo!=0){
                if(flag==0){
                    query=query+" PREZZO="+prezzo;
                    flag=1;
                }else if(flag==1)
                    query=query+" AND PREZZO="+prezzo;
            }
            if(tne!=-1){
                if(flag==0){
                    query=query+" TIPO_NONED='"+tipo_nonEd.getSelectedItem()+"'";
                    flag=1;
                }else if(flag==1)
                    query=query+" AND TIPO_NONED='"+tipo_nonEd.getSelectedItem()+"'";
            }
            if(tc!=-1){
                if(flag==0){
                    query=query+" COLORE='"+tipo_colore.getSelectedItem()+"'";
                    flag=1;
                }else if(flag==1)
                    query=query+" AND COLORE='"+tipo_colore.getSelectedItem()+"'";
            }
             if(!(testo.equals(""))){
                 if(flag==0){
                 query=query+" TESTO='"+testo+"'";
                 flag=1;
             }else if(flag==1)
                     query=query+" AND TESTO='"+testo+"'";
        }
        
          pst = con.prepareStatement(query);
          if((pst.executeUpdate(query))== 0){
                UIManager.put("OptionPane.background",new ColorUIResource(193,255,193));
                UIManager.put("Panel.background",new ColorUIResource(193,255,193));
                UIManager.put("OptionPane.messageFont", new Font("ITC Kabel Std", Font.BOLD, 14));
                UIManager.put("OptionPane.buttonFont", new Font("AppleMyungjo", Font.ITALIC, 12));
                JOptionPane.showMessageDialog(this, "La casella che si vuole cancellare non esiste!", "Errore", JOptionPane.ERROR_MESSAGE,new ImageIcon("oh.gif"));
            } else{
                UIManager.put("OptionPane.background",new ColorUIResource(193,255,193));
                UIManager.put("Panel.background",new ColorUIResource(193,255,193));
                UIManager.put("OptionPane.messageFont", new Font("ITC Kabel Std", Font.BOLD, 14));
                UIManager.put("OptionPane.buttonFont", new Font("AppleMyungjo", Font.ITALIC, 12));
                JOptionPane.showMessageDialog(this, "Cancellazione effettuata!", "", JOptionPane.INFORMATION_MESSAGE,new ImageIcon("pollice.gif"));
            
               con.close(); 
                
                this.dispose();
                Classe obj = new Classe();
                obj.setVisible(true);
          }
        }catch(SQLException e){ 
             UIManager.put("OptionPane.background",new ColorUIResource(193,255,193));
                UIManager.put("Panel.background",new ColorUIResource(193,255,193));
                UIManager.put("OptionPane.messageFont", new Font("ITC Kabel Std", Font.BOLD, 14));
                UIManager.put("OptionPane.buttonFont", new Font("AppleMyungjo", Font.ITALIC, 12));
                JOptionPane.showMessageDialog(this, "Riempi almeno un campo!", "", JOptionPane.INFORMATION_MESSAGE,new ImageIcon("seleziona.gif"));
       
        }
        
               
                  
            
       
        
    }//GEN-LAST:event_Elimina2ActionPerformed

    private void tipo_nonEdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipo_nonEdActionPerformed
        
    }//GEN-LAST:event_tipo_nonEdActionPerformed

    private void clear2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear2ActionPerformed

        id_cas.setSelectedIndex(-1);
        tipo_casella.setSelectedIndex(-1);
        nome2.setText(null);
        posizione2.setText(null);
        importo2.setText(null);
        tipo_nonEd.setSelectedIndex(-1);
        tipo_colore.setSelectedIndex(-1);
        descrizione2.setText(null);
    }//GEN-LAST:event_clear2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cancellazione_Casella().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Elimina2;
    private javax.swing.JButton clear2;
    private javax.swing.JTextPane descrizione2;
    private javax.swing.JComboBox<String> id_cas;
    private javax.swing.JTextPane importo2;
    private javax.swing.JButton indietro2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane nome2;
    private javax.swing.JScrollPane pDescrizione;
    private javax.swing.JScrollPane pImporto;
    private javax.swing.JTextPane posizione2;
    private javax.swing.JLabel testo1;
    private javax.swing.JLabel testo2;
    private javax.swing.JLabel testo3;
    private javax.swing.JComboBox<String> tipo_casella;
    private javax.swing.JComboBox<String> tipo_colore;
    private javax.swing.JComboBox<String> tipo_nonEd;
    // End of variables declaration//GEN-END:variables
}
