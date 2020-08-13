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



public class Cancellazione_Contratto extends javax.swing.JFrame {
    
    Connection con = null;
    PreparedStatement pst;
    ResultSet rs;
    String query;
    int prezzo, valip, rends,rend1, rend2,rend3,rend4,rend2s,rend3s,rend4s,renda,prezzo_ed,rend2soc;
    int selection = 0;
    String tipoNE;
    
    public Cancellazione_Contratto() {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        setVisible(true);
    try{
        con = Database.getDefaultConnection();
        query="SELECT ID_CONTRATTO FROM CONTRATTO ORDER BY (ID_CONTRATTO) ASC";
        pst = con.prepareStatement(query);
           rs= pst.executeQuery();
           
           id_contr.removeAllItems();
                   while(rs.next()){
                    id_contr.addItem(""+rs.getInt(1));
                }
            id_contr.setSelectedIndex(-1);
   
            con.close(); 
    }catch(SQLException e){ System.out.println(e);}
    
    id_contr.setSelectedItem(""+Dati_Tabella.ID_Contratto);
    nome3.setText(""+Dati_Tabella.Nome_contratto);
    importo3.setText(""+Dati_Tabella.Prezzo);
    valIp.setText(""+Dati_Tabella.ValIpotecario);
    tipo_contr.setSelectedItem(""+Dati_Tabella.Tipo_Contratto);
    rsemp.setText(Dati_Tabella.RenditaSemplice+"");
    if(Dati_Tabella.Tipo_Contratto.equals("EDIFICABILE"))
            selection=0;
    else {
            tipoNE=Dati_Tabella.Tipo_NonEd;
            if(tipoNE.equals("FERROVIA"))
            selection=1;
            else
                selection=2;
    }
    switch(selection){
        case 0:
            //Edificabile
            t_colore.setSelectedItem(Dati_Tabella.Colore+"");
            r1.setText(""+Dati_Tabella.Rendita1Casa);
            r2.setText(""+Dati_Tabella.Rendita2Case);
            r3.setText(""+Dati_Tabella.Rendita3Case);
            r4.setText(""+Dati_Tabella.Rendita4Case);
            ra.setText(""+Dati_Tabella.RenditaAlbergo);
            importoa.setText(""+Dati_Tabella.PrezzoAcquistoEd);
            break;
        case 1:
            //Ferrovia
            t_noned.setSelectedItem(Dati_Tabella.Tipo_NonEd);
            r2s.setText(""+Dati_Tabella.Rendita2Stazioni);
            r3s.setText(""+Dati_Tabella.Rendita3Stazioni);
            r4s.setText(""+Dati_Tabella.Rendita4Stazioni);
            break;
        case 2:
            //Società
            t_noned.setSelectedItem(Dati_Tabella.Tipo_NonEd);
            r2soc.setText(""+Dati_Tabella.Rendita2Società);
            ts.setText(""+Dati_Tabella.Testo1Società);
            t2s.setText(""+Dati_Tabella.Testo2Società);
            break;
    }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        indietro3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tipo_contr = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        importo3 = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        valIp = new javax.swing.JTextPane();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        rsemp = new javax.swing.JTextPane();
        txt1 = new javax.swing.JLabel();
        jpane1 = new javax.swing.JScrollPane();
        r1 = new javax.swing.JTextPane();
        jpane2 = new javax.swing.JScrollPane();
        r2 = new javax.swing.JTextPane();
        jpane3 = new javax.swing.JScrollPane();
        r3 = new javax.swing.JTextPane();
        jpane4 = new javax.swing.JScrollPane();
        r4 = new javax.swing.JTextPane();
        jpane5 = new javax.swing.JScrollPane();
        ra = new javax.swing.JTextPane();
        jpane6 = new javax.swing.JScrollPane();
        importoa = new javax.swing.JTextPane();
        txt3 = new javax.swing.JLabel();
        txt4 = new javax.swing.JLabel();
        txt5 = new javax.swing.JLabel();
        txt6 = new javax.swing.JLabel();
        elimina3 = new javax.swing.JButton();
        txt7 = new javax.swing.JLabel();
        clear3 = new javax.swing.JButton();
        jpane8 = new javax.swing.JScrollPane();
        t2s = new javax.swing.JTextPane();
        jpane9 = new javax.swing.JScrollPane();
        ts = new javax.swing.JTextPane();
        txt2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        nome3 = new javax.swing.JTextPane();
        t_colore = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        id_contr = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        r2s = new javax.swing.JTextPane();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        r3s = new javax.swing.JTextPane();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        r4s = new javax.swing.JTextPane();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        r2soc = new javax.swing.JTextPane();
        jLabel15 = new javax.swing.JLabel();
        t_noned = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(920, 520));
        setMinimumSize(new java.awt.Dimension(920, 520));
        setPreferredSize(new java.awt.Dimension(920, 520));
        setSize(new java.awt.Dimension(920, 520));

        jPanel1.setBackground(new java.awt.Color(193, 255, 193));
        jPanel1.setMaximumSize(new java.awt.Dimension(950, 520));
        jPanel1.setPreferredSize(new java.awt.Dimension(950, 520));
        jPanel1.setSize(new java.awt.Dimension(950, 520));
        jPanel1.setLayout(null);

        indietro3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progetto_monopoly/icone/back.png"))); // NOI18N
        indietro3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indietro3ActionPerformed(evt);
            }
        });
        jPanel1.add(indietro3);
        indietro3.setBounds(22, 21, 81, 31);

        jLabel1.setFont(new java.awt.Font("ITC Kabel Std", 1, 13)); // NOI18N
        jLabel1.setText("Riempire i campi di Contratto in base alla quale si vuole effettuare la cancellazione");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(22, 70, 477, 17);

        jLabel2.setFont(new java.awt.Font("ITC Kabel Std", 1, 16)); // NOI18N
        jLabel2.setText("Tipo contratto");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(24, 133, 116, 20);

        tipo_contr.setEditable(true);
        tipo_contr.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        tipo_contr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EDIFICABILE", "NON EDIFICABILE" }));
        tipo_contr.setSelectedIndex(-1);
        tipo_contr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipo_contrActionPerformed(evt);
            }
        });
        jPanel1.add(tipo_contr);
        tipo_contr.setBounds(158, 129, 132, 27);

        jLabel3.setFont(new java.awt.Font("ITC Kabel Std", 1, 16)); // NOI18N
        jLabel3.setText("Nome");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(340, 104, 60, 20);

        jLabel4.setFont(new java.awt.Font("ITC Kabel Std", 1, 16)); // NOI18N
        jLabel4.setText("Prezzo");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(340, 133, 60, 20);

        importo3.setBackground(new java.awt.Color(193, 255, 193));
        importo3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        importo3.setFont(new java.awt.Font("ITC Kabel Std", 0, 16)); // NOI18N
        importo3.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(importo3);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(490, 129, 102, 26);

        jLabel5.setFont(new java.awt.Font("ITC Kabel Std", 1, 14)); // NOI18N
        jLabel5.setText("Rendita Semplice");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(24, 161, 120, 24);

        valIp.setBackground(new java.awt.Color(193, 255, 193));
        valIp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        valIp.setFont(new java.awt.Font("ITC Kabel Std", 0, 12)); // NOI18N
        jScrollPane3.setViewportView(valIp);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(174, 193, 104, 23);

        jLabel6.setFont(new java.awt.Font("ITC Kabel Std", 1, 14)); // NOI18N
        jLabel6.setText("Valore Ipotecario");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(24, 193, 120, 23);

        rsemp.setBackground(new java.awt.Color(193, 255, 193));
        rsemp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        rsemp.setFont(new java.awt.Font("ITC Kabel Std", 0, 12)); // NOI18N
        jScrollPane4.setViewportView(rsemp);

        jPanel1.add(jScrollPane4);
        jScrollPane4.setBounds(174, 162, 104, 23);

        txt1.setFont(new java.awt.Font("ITC Kabel Std", 1, 14)); // NOI18N
        txt1.setText("Rendita 2 Case");
        jPanel1.add(txt1);
        txt1.setBounds(24, 288, 101, 23);

        r1.setBackground(new java.awt.Color(193, 255, 193));
        r1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        r1.setFont(new java.awt.Font("ITC Kabel Std", 0, 12)); // NOI18N
        jpane1.setViewportView(r1);

        jPanel1.add(jpane1);
        jpane1.setBounds(176, 258, 104, 21);

        r2.setBackground(new java.awt.Color(193, 255, 193));
        r2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        r2.setFont(new java.awt.Font("ITC Kabel Std", 0, 12)); // NOI18N
        jpane2.setViewportView(r2);

        jPanel1.add(jpane2);
        jpane2.setBounds(176, 288, 104, 23);

        r3.setBackground(new java.awt.Color(193, 255, 193));
        r3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        r3.setFont(new java.awt.Font("ITC Kabel Std", 0, 12)); // NOI18N
        jpane3.setViewportView(r3);

        jPanel1.add(jpane3);
        jpane3.setBounds(176, 320, 104, 21);

        r4.setBackground(new java.awt.Color(193, 255, 193));
        r4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        r4.setFont(new java.awt.Font("ITC Kabel Std", 0, 12)); // NOI18N
        jpane4.setViewportView(r4);

        jPanel1.add(jpane4);
        jpane4.setBounds(176, 350, 104, 21);

        ra.setBackground(new java.awt.Color(193, 255, 193));
        ra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        ra.setFont(new java.awt.Font("ITC Kabel Std", 0, 12)); // NOI18N
        jpane5.setViewportView(ra);

        jPanel1.add(jpane5);
        jpane5.setBounds(176, 380, 104, 21);

        importoa.setBackground(new java.awt.Color(193, 255, 193));
        importoa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        importoa.setFont(new java.awt.Font("ITC Kabel Std", 0, 12)); // NOI18N
        jpane6.setViewportView(importoa);

        jPanel1.add(jpane6);
        jpane6.setBounds(176, 407, 104, 21);

        txt3.setFont(new java.awt.Font("ITC Kabel Std", 1, 14)); // NOI18N
        txt3.setText("Rendita 3 Case");
        txt3.setToolTipText("");
        jPanel1.add(txt3);
        txt3.setBounds(24, 320, 101, 18);

        txt4.setFont(new java.awt.Font("ITC Kabel Std", 1, 14)); // NOI18N
        txt4.setText("Rendita 4 Case");
        txt4.setToolTipText("");
        jPanel1.add(txt4);
        txt4.setBounds(24, 350, 101, 18);

        txt5.setFont(new java.awt.Font("ITC Kabel Std", 1, 14)); // NOI18N
        txt5.setText("Rendita Albergo");
        jPanel1.add(txt5);
        txt5.setBounds(24, 380, 103, 18);

        txt6.setFont(new java.awt.Font("ITC Kabel Std", 1, 14)); // NOI18N
        txt6.setText("Prezzo d'acquisto");
        jPanel1.add(txt6);
        txt6.setBounds(24, 407, 120, 18);

        elimina3.setFont(new java.awt.Font("Kabel", 2, 12)); // NOI18N
        elimina3.setText("Elimina");
        elimina3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elimina3ActionPerformed(evt);
            }
        });
        jPanel1.add(elimina3);
        elimina3.setBounds(740, 430, 107, 39);

        txt7.setFont(new java.awt.Font("ITC Kabel Std", 1, 14)); // NOI18N
        txt7.setText("Colore");
        jPanel1.add(txt7);
        txt7.setBounds(26, 222, 60, 27);

        clear3.setFont(new java.awt.Font("Kabel", 2, 12)); // NOI18N
        clear3.setText("Clear");
        clear3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear3ActionPerformed(evt);
            }
        });
        jPanel1.add(clear3);
        clear3.setBounds(620, 430, 107, 39);

        t2s.setBackground(new java.awt.Color(193, 255, 193));
        t2s.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        t2s.setFont(new java.awt.Font("ITC Kabel Std", 0, 15)); // NOI18N
        jpane8.setViewportView(t2s);

        jPanel1.add(jpane8);
        jpane8.setBounds(456, 369, 300, 40);

        ts.setBackground(new java.awt.Color(193, 255, 193));
        ts.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        ts.setFont(new java.awt.Font("ITC Kabel Std", 0, 15)); // NOI18N
        jpane9.setViewportView(ts);

        jPanel1.add(jpane9);
        jpane9.setBounds(456, 319, 300, 40);

        txt2.setFont(new java.awt.Font("ITC Kabel Std", 1, 14)); // NOI18N
        txt2.setText("Rendita 1 casa");
        jPanel1.add(txt2);
        txt2.setBounds(26, 258, 99, 18);

        nome3.setBackground(new java.awt.Color(193, 255, 193));
        nome3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        nome3.setFont(new java.awt.Font("ITC Kabel Std", 0, 16)); // NOI18N
        nome3.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(nome3);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(460, 100, 193, 26);

        t_colore.setEditable(true);
        t_colore.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        t_colore.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FUCSIA", "CELESTE", "ARANCIONE", "MARRONE", "ROSSO", "GIALLO", "VERDE", "BLU" }));
        t_colore.setSelectedIndex(-1);
        jPanel1.add(t_colore);
        t_colore.setBounds(160, 220, 130, 27);

        jLabel7.setFont(new java.awt.Font("ITC Kabel Std", 1, 14)); // NOI18N
        jLabel7.setText("Testo Società");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(340, 319, 110, 18);

        jLabel8.setFont(new java.awt.Font("ITC Kabel Std", 1, 14)); // NOI18N
        jLabel8.setText("Testo 2 Società");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(340, 369, 110, 18);

        jLabel9.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel9.setText("ID_contratto");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(22, 95, 100, 29);

        id_contr.setEditable(true);
        id_contr.setFont(new java.awt.Font("ITC Kabel Std", 0, 15)); // NOI18N
        id_contr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        id_contr.setSelectedIndex(-1);
        jPanel1.add(id_contr);
        id_contr.setBounds(156, 92, 130, 29);

        jLabel10.setFont(new java.awt.Font("ITC Kabel Std", 1, 14)); // NOI18N
        jLabel10.setText("Rendita 2 Stazioni");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(340, 197, 120, 18);

        r2s.setBackground(new java.awt.Color(193, 255, 193));
        r2s.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        r2s.setFont(new java.awt.Font("ITC Kabel Std", 0, 12)); // NOI18N
        jScrollPane5.setViewportView(r2s);

        jPanel1.add(jScrollPane5);
        jScrollPane5.setBounds(490, 193, 100, 21);

        jLabel12.setFont(new java.awt.Font("ITC Kabel Std", 1, 14)); // NOI18N
        jLabel12.setText("Rendita 3 Stazioni");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(340, 221, 120, 18);

        r3s.setBackground(new java.awt.Color(193, 255, 193));
        r3s.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        r3s.setFont(new java.awt.Font("ITC Kabel Std", 0, 12)); // NOI18N
        jScrollPane6.setViewportView(r3s);

        jPanel1.add(jScrollPane6);
        jScrollPane6.setBounds(490, 221, 100, 21);

        jLabel13.setFont(new java.awt.Font("ITC Kabel Std", 1, 14)); // NOI18N
        jLabel13.setText("Rendita 4 Stazioni");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(340, 251, 120, 18);

        r4s.setBackground(new java.awt.Color(193, 255, 193));
        r4s.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        r4s.setFont(new java.awt.Font("ITC Kabel Std", 0, 12)); // NOI18N
        jScrollPane7.setViewportView(r4s);

        jPanel1.add(jScrollPane7);
        jScrollPane7.setBounds(490, 251, 100, 21);

        jLabel14.setFont(new java.awt.Font("ITC Kabel Std", 1, 14)); // NOI18N
        jLabel14.setText("Rendita 2 Società");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(340, 285, 120, 18);

        r2soc.setBackground(new java.awt.Color(193, 255, 193));
        r2soc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        r2soc.setFont(new java.awt.Font("ITC Kabel Std", 0, 12)); // NOI18N
        jScrollPane8.setViewportView(r2soc);

        jPanel1.add(jScrollPane8);
        jScrollPane8.setBounds(490, 285, 100, 21);

        jLabel15.setFont(new java.awt.Font("ITC Kabel Std", 1, 14)); // NOI18N
        jLabel15.setText("Tipo Non Edificabile");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(340, 164, 126, 20);

        t_noned.setEditable(true);
        t_noned.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        t_noned.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FERROVIA", "SOCIETÀ" }));
        t_noned.setSelectedIndex(-1);
        jPanel1.add(t_noned);
        t_noned.setBounds(484, 161, 125, 27);
        jPanel1.add(jLabel11);
        jLabel11.setBounds(690, 70, 254, 0);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progetto_monopoly/icone/super.png"))); // NOI18N
        jPanel1.add(jLabel16);
        jLabel16.setBounds(710, 60, 190, 190);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 923, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tipo_contrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipo_contrActionPerformed
       
    }//GEN-LAST:event_tipo_contrActionPerformed

    private void indietro3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indietro3ActionPerformed
       this.dispose();
       Classe obj = new Classe();
       obj.setVisible(true);
    }//GEN-LAST:event_indietro3ActionPerformed

    private void clear3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear3ActionPerformed
       id_contr.setSelectedIndex(-1);
       nome3.setText(null);
       tipo_contr.setSelectedIndex(-1);
       t_noned.setSelectedIndex(-1);
       importo3.setText(null);
       valIp.setText(null);
       t_colore.setSelectedIndex(-1);
       rsemp.setText(null);
       r1.setText(null);
       r2.setText(null);
       r3.setText(null);
       r4.setText(null);
       ra.setText(null);
       importoa.setText(null);
       ts.setText(null);
       t2s.setText(null);
       r2s.setText(null);
       r3s.setText(null);
       r4s.setText(null);
       r2soc.setText(null);
       
    }//GEN-LAST:event_clear3ActionPerformed

    private void elimina3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elimina3ActionPerformed
       try{
            con = Database.getDefaultConnection();
      try{
          prezzo=Integer.parseInt(importo3.getText()); 
      }catch(NumberFormatException e){
          prezzo=0;
      }
      try {
          valip=Integer.parseInt(valIp.getText()); 
      }catch(NumberFormatException e){
          valip=0;
      }
      try{
          rends=Integer.parseInt(rsemp.getText()); 
      }catch(NumberFormatException e) {
          rends=0;
      }
      try{
          rend1=Integer.parseInt(r1.getText()); 
      }catch(NumberFormatException e) {
          rend1=0;
      }
      try{
          rend2=Integer.parseInt(r2.getText()); 
      }catch(NumberFormatException e) {
          rend2=0;
      }try{
          rend3=Integer.parseInt(r3.getText()); 
      }catch(NumberFormatException e) {
          rend3=0;
      }
      try{
          rend4=Integer.parseInt(r4.getText()); 
      }catch(NumberFormatException e) {
          rend4=0;
      }
      try{
          renda=Integer.parseInt(ra.getText()); 
      }catch(NumberFormatException e) {
          renda=0;
      }
      try{
          prezzo_ed=Integer.parseInt(importoa.getText()); 
      }catch(NumberFormatException e) {
          prezzo_ed=0;
      }
      try{
          rend2s=Integer.parseInt(r2s.getText()); 
      }catch(NumberFormatException e) {
          rend2s=0;
      }
      try{
          rend3s=Integer.parseInt(r3s.getText()); 
      }catch(NumberFormatException e) {
          rend3s=0;
      }
      try{
          rend4s=Integer.parseInt(r4s.getText()); 
      }catch(NumberFormatException e) {
          rend4s=0;
      }
      try{
          rends=Integer.parseInt(rsemp.getText()); 
      }catch(NumberFormatException e) {
          rends=0;
      }
      try{
          rend2soc=Integer.parseInt(r2soc.getText()); 
      }catch(NumberFormatException e) {
          rend2soc=0;
      }
      
      query="DELETE FROM CONTRATTO WHERE";
      
      int flag=0;
      
      if(id_contr.getSelectedIndex()!=-1){
          query=query+" ID_CONTRATTO="+id_contr.getSelectedItem();
          flag=1;
      }
          if(!(nome3.getText().equals(""))){
              if(flag==0){
                  query=query+" NOME='"+nome3.getText()+"'";
                  flag=1;
          }else if(flag==1)
              query=query+" AND NOME='"+nome3.getText()+"'";
              
          }
          if(prezzo!=0){
          if(flag==0){
              query=query+" PREZZO="+prezzo;    
              flag=1;
          }else if(flag==1)
             query=query+" AND PREZZO="+prezzo;
      }
          
         if(valip!=0){
          if(flag==0){
              query=query+" VALIPOTECARIO="+valip;
              flag=1;
          }else if(flag==1)
             query=query+" AND VALIPOTECARIO="+valip;
         }
         
          if(t_colore.getSelectedIndex()!=-1){
          if(flag==0){
              query=query+" COLORE='"+t_colore.getSelectedItem()+"'";
              flag=1;
          }else if(flag==1)
             query=query+" AND COLORE='"+t_colore.getSelectedItem()+"'";
      }
          
          if(tipo_contr.getSelectedIndex()!=-1){
          if(flag==0){
              query=query+" TIPO_CONTRATTO='"+tipo_contr.getSelectedItem()+"'";
              flag=1;
          }else if(flag==1)
             query=query+" AND TIPO_CONTRATTO='"+tipo_contr.getSelectedItem()+"'";
      }
          if(rends!=0){
          if(flag==0){
              query=query+" RENDITASEMPLICE="+rends;
              flag=1;
          }else if(flag==1)
             query=query+" AND RENDITASEMPLICE="+rends;
        }
          if(rend1!=0){
          if(flag==0){
              query=query+" RENDITA1CASA="+rend1;
              flag=1;
          }else if(flag==1)
             query=query+" AND RENDITA1CASA="+rend1;
      }
          if(rend2!=0){
          if(flag==0){
              query=query+" RENDITA2CASE="+rend2;
              flag=1;
          }else if(flag==1)
             query=query+" AND RENDITA2CASE="+rend2;
      }
          if(rend3!=0){
          if(flag==0){
              query=query+" RENDITA3CASE="+rend3;
              flag=1;
          }else if(flag==1)
             query=query+" AND RENDITA3CASE="+rend3;
      }
          if(rend4!=0){
          if(flag==0){
              query=query+" RENDITA4CASE="+rend4;
              flag=1;
          }else if(flag==1)
             query=query+" AND RENDITA4CASE="+rend4;
      }
          if(renda!=0){
          if(flag==0){
              query=query+" RENDITAALBERGO="+renda;
              flag=1;
          }else if(flag==1)
             query=query+" AND RENDITAALBERGO="+renda;
      }
          if(prezzo_ed!=0){
          if(flag==0){
              query=query+" PREZZOACQUISTOED="+prezzo_ed;
              flag=1;
          }else if(flag==1)
             query=query+" AND PREZZOACQUISTOED="+prezzo_ed;
      }
          if(t_noned.getSelectedIndex()!=-1){
          if(flag==0){
              query=query+" TIPO_NONED='"+t_noned.getSelectedItem()+"'";
              flag=1;
          }else if(flag==1)
             query=query+" AND TIPO_NONED='"+t_noned.getSelectedItem()+"'";
      }
          if(rend2s!=0){
          if(flag==0){
              query=query+" RENDITA2STAZIONI="+rend2s;
              flag=1;
          }else if(flag==1)
             query=query+" AND RENDITA2STAZIONI="+rend2s;
      }
          if(rend3s!=0){
          if(flag==0){
              query=query+" RENDITA3STAZIONI="+rend3s;
              flag=1;
          }else if(flag==1)
             query=query+" AND RENDITA3STAZIONI="+rend3s;
      }
          if(rend4s!=0){
          if(flag==0){
              query=query+" RENDITA4STAZIONI="+rend4s;
              flag=1;
          }else if(flag==1)
             query=query+" AND RENDITA4STAZIONI="+rend4s;
      }
          if(rend2soc!=0){
          if(flag==0){
              query=query+" RENDITA2SOCIETA="+rend2soc;
              flag=1;
          }else if(flag==1)
             query=query+" AND RENDITA2SOCIETA="+rend2soc;
      }
          if(!(ts.getText().equals(""))){
          if(flag==0){
              query=query+" TESTO1SOCIETA='"+ts.getText()+"'";
              flag=1;
          }else if(flag==1)
             query=query+" AND TESTO1SOCIETA='"+ts.getText()+"'";
      }
          if(!(t2s.getText().equals(""))){
          if(flag==0){
              query=query+" TESTO2SOCIETA='"+t2s.getText()+"'";
              flag=1;
          }else if(flag==1)
             query=query+" AND TESTO2SOCIETA='"+t2s.getText()+"'";
      }
      
         pst = con.prepareStatement(query);
         
         if((pst.executeUpdate(query))== 0){
                UIManager.put("OptionPane.background",new ColorUIResource(193,255,193));
                UIManager.put("Panel.background",new ColorUIResource(193,255,193));
                UIManager.put("OptionPane.messageFont", new Font("ITC Kabel Std", Font.BOLD, 14));
                UIManager.put("OptionPane.buttonFont", new Font("AppleMyungjo", Font.ITALIC, 12));
                JOptionPane.showMessageDialog(this, "Il contratto che si vuole cancellare non esiste!", "Errore", JOptionPane.INFORMATION_MESSAGE,new ImageIcon("oh.gif"));
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
    }//GEN-LAST:event_elimina3ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cancellazione_Contratto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear3;
    private javax.swing.JButton elimina3;
    private javax.swing.JComboBox<String> id_contr;
    private javax.swing.JTextPane importo3;
    private javax.swing.JTextPane importoa;
    private javax.swing.JButton indietro3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jpane1;
    private javax.swing.JScrollPane jpane2;
    private javax.swing.JScrollPane jpane3;
    private javax.swing.JScrollPane jpane4;
    private javax.swing.JScrollPane jpane5;
    private javax.swing.JScrollPane jpane6;
    private javax.swing.JScrollPane jpane8;
    private javax.swing.JScrollPane jpane9;
    private javax.swing.JTextPane nome3;
    private javax.swing.JTextPane r1;
    private javax.swing.JTextPane r2;
    private javax.swing.JTextPane r2s;
    private javax.swing.JTextPane r2soc;
    private javax.swing.JTextPane r3;
    private javax.swing.JTextPane r3s;
    private javax.swing.JTextPane r4;
    private javax.swing.JTextPane r4s;
    private javax.swing.JTextPane ra;
    private javax.swing.JTextPane rsemp;
    private javax.swing.JTextPane t2s;
    private javax.swing.JComboBox<String> t_colore;
    private javax.swing.JComboBox<String> t_noned;
    private javax.swing.JComboBox<String> tipo_contr;
    private javax.swing.JTextPane ts;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt2;
    private javax.swing.JLabel txt3;
    private javax.swing.JLabel txt4;
    private javax.swing.JLabel txt5;
    private javax.swing.JLabel txt6;
    private javax.swing.JLabel txt7;
    private javax.swing.JTextPane valIp;
    // End of variables declaration//GEN-END:variables
}
