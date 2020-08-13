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

public class Modifica_Contratto extends javax.swing.JFrame {
    Connection con=null;
    PreparedStatement pst;
    ResultSet rs;
    
    int selection;
    String tipo,tipoNE,query,query1;
    
    public Modifica_Contratto() {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        
        tipo=Dati_Tabella.Tipo_Contratto;
        if(tipo.equals("EDIFICABILE"))
            selection=0;
         else {
            tipoNE=Dati_Tabella.Tipo_NonEd;
            if(tipoNE.equals("FERROVIA"))
            selection=1;
            else
                selection=2;
        }
        
        tipo_contr.setSelectedIndex(selection);
        name.setText(Dati_Tabella.Nome_contratto);
        price.setText("" + Dati_Tabella.Prezzo);
        valIp.setText("" + Dati_Tabella.ValIpotecario);
        jtext.setText("" + Dati_Tabella.RenditaSemplice);
        if (selection == 0){
            jtext1.setText("" + Dati_Tabella.Rendita1Casa);
            jtext2.setText("" + Dati_Tabella.Rendita2Case);
            jtext3.setText("" + Dati_Tabella.Rendita3Case);
            jtext4.setText("" + Dati_Tabella.Rendita4Case);
            jtext5.setText("" + Dati_Tabella.RenditaAlbergo);
            jtext6.setText("" + Dati_Tabella.PrezzoAcquistoEd);
            t_colore.setSelectedItem("" + Dati_Tabella.Colore);
        }else if(selection == 1){
           jtext1.setText("" + Dati_Tabella.Rendita2Stazioni);
           jtext2.setText("" + Dati_Tabella.Rendita3Stazioni);
           jtext3.setText("" + Dati_Tabella.Rendita4Stazioni);
        }else if(selection == 2){
           jtext1.setText("" + Dati_Tabella.Rendita2Società);
           jtext8.setText("" + Dati_Tabella.Testo1Società);
           jtext9.setText("" + Dati_Tabella.Testo2Società);
        }
        switch(selection){
           case 0:
               //Edificabile ->0
               txt1.setVisible(true);
               txt1.setText("Rendita 1 Casa");
               txt2.setVisible(true);
               txt2.setText("Rendita 2 Case");
               txt3.setVisible(true);
               txt3.setText("Rendita 3 Case");
               txt4.setVisible(true);
               txt4.setText("Rendita 4 Case");
               txt5.setVisible(true);
               txt6.setVisible(true);
               txt7.setVisible(true);
               jpane1.setVisible(true);
               jpane2.setVisible(true);
               jpane3.setVisible(true);
               jpane4.setVisible(true);
               jpane5.setVisible(true);
               jpane6.setVisible(true);
               t_colore.setVisible(true);
               jpane8.setVisible(false);
               jpane9.setVisible(false);
               break;
           case 1:
               //Stazioni ->1
               txt1.setVisible(true);
               txt1.setText("Rendita 2 Stazioni");
               txt2.setVisible(true);
               txt2.setText("Rendita 3 Stazioni");
               txt3.setVisible(true);
               txt3.setText("Rendita 4 Stazioni");
               txt4.setVisible(false);
               txt5.setVisible(false);
               txt6.setVisible(false);
               txt7.setVisible(false);
               jpane1.setVisible(true);
               jpane2.setVisible(true);
               jpane3.setVisible(true);
               jpane4.setVisible(false);
               jpane5.setVisible(false);
               jpane6.setVisible(false);
               t_colore.setVisible(false);
               jpane8.setVisible(false);
               jpane9.setVisible(false);
               break;
           case 2:
               //Società -> 2
               txt1.setVisible(true);
               txt1.setText("Rendita 2 Società");
               txt2.setVisible(true);
               txt2.setText("Descrizione 1 Società");
               txt3.setVisible(false);
               txt4.setVisible(true);
               txt4.setText("Descrizione 2 Società");
               txt5.setVisible(false);
               txt6.setVisible(false);
               txt7.setVisible(false);
               jpane1.setVisible(true);
               jpane2.setVisible(false);
               jpane3.setVisible(false);
               jpane4.setVisible(false);
               jpane5.setVisible(false);
               jpane6.setVisible(false);
               t_colore.setVisible(false);
               jpane8.setVisible(true);
               jpane9.setVisible(true);
               break;
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        indietro3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tipo_contr = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        price = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        valIp = new javax.swing.JTextPane();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtext = new javax.swing.JTextPane();
        txt1 = new javax.swing.JLabel();
        jpane1 = new javax.swing.JScrollPane();
        jtext1 = new javax.swing.JTextPane();
        jpane2 = new javax.swing.JScrollPane();
        jtext2 = new javax.swing.JTextPane();
        jpane3 = new javax.swing.JScrollPane();
        jtext3 = new javax.swing.JTextPane();
        jpane4 = new javax.swing.JScrollPane();
        jtext4 = new javax.swing.JTextPane();
        jpane5 = new javax.swing.JScrollPane();
        jtext5 = new javax.swing.JTextPane();
        jpane6 = new javax.swing.JScrollPane();
        jtext6 = new javax.swing.JTextPane();
        txt3 = new javax.swing.JLabel();
        txt4 = new javax.swing.JLabel();
        txt5 = new javax.swing.JLabel();
        txt6 = new javax.swing.JLabel();
        modifica3 = new javax.swing.JButton();
        txt7 = new javax.swing.JLabel();
        clear3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jpane8 = new javax.swing.JScrollPane();
        jtext8 = new javax.swing.JTextPane();
        jpane9 = new javax.swing.JScrollPane();
        jtext9 = new javax.swing.JTextPane();
        txt2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        name = new javax.swing.JTextPane();
        t_colore = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(650, 540));
        setMinimumSize(new java.awt.Dimension(650, 540));
        setPreferredSize(new java.awt.Dimension(650, 540));
        setSize(new java.awt.Dimension(650, 540));

        jPanel1.setBackground(new java.awt.Color(193, 255, 193));
        jPanel1.setMaximumSize(new java.awt.Dimension(650, 540));
        jPanel1.setMinimumSize(new java.awt.Dimension(650, 540));
        jPanel1.setPreferredSize(new java.awt.Dimension(650, 540));
        jPanel1.setSize(new java.awt.Dimension(650, 540));
        jPanel1.setLayout(null);

        indietro3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progetto_monopoly/icone/back.png"))); // NOI18N
        indietro3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indietro3ActionPerformed(evt);
            }
        });
        jPanel1.add(indietro3);
        indietro3.setBounds(19, 15, 81, 31);

        jLabel1.setFont(new java.awt.Font("ITC Kabel Std", 1, 13)); // NOI18N
        jLabel1.setText("Riempire i campi di Contratto e premere Aggiorna per confermare");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 50, 410, 17);

        jLabel2.setFont(new java.awt.Font("ITC Kabel Std", 1, 16)); // NOI18N
        jLabel2.setText("Tipo");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 80, 116, 20);

        tipo_contr.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        tipo_contr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EDIFICABILE", "FERROVIA", "SOCIETÀ" }));
        tipo_contr.setSelectedIndex(-1);
        tipo_contr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipo_contrActionPerformed(evt);
            }
        });
        jPanel1.add(tipo_contr);
        tipo_contr.setBounds(190, 70, 170, 30);

        jLabel3.setFont(new java.awt.Font("ITC Kabel Std", 1, 16)); // NOI18N
        jLabel3.setText("Nome");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 110, 60, 20);

        jLabel4.setFont(new java.awt.Font("ITC Kabel Std", 1, 16)); // NOI18N
        jLabel4.setText("Prezzo");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 140, 60, 30);

        price.setBackground(new java.awt.Color(193, 255, 193));
        price.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        price.setFont(new java.awt.Font("ITC Kabel Std", 0, 16)); // NOI18N
        price.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(price);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(190, 140, 83, 26);

        jLabel5.setFont(new java.awt.Font("ITC Kabel Std", 1, 14)); // NOI18N
        jLabel5.setText("Rendita Semplice");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 210, 120, 30);

        valIp.setBackground(new java.awt.Color(193, 255, 193));
        valIp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        valIp.setFont(new java.awt.Font("ITC Kabel Std", 0, 12)); // NOI18N
        jScrollPane3.setViewportView(valIp);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(190, 180, 83, 21);

        jLabel6.setFont(new java.awt.Font("ITC Kabel Std", 1, 14)); // NOI18N
        jLabel6.setText("Valore Ipotecario");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 180, 120, 30);

        jtext.setBackground(new java.awt.Color(193, 255, 193));
        jtext.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        jtext.setFont(new java.awt.Font("ITC Kabel Std", 0, 12)); // NOI18N
        jScrollPane4.setViewportView(jtext);

        jPanel1.add(jScrollPane4);
        jScrollPane4.setBounds(190, 210, 83, 21);

        txt1.setFont(new java.awt.Font("ITC Kabel Std", 1, 14)); // NOI18N
        txt1.setText("Rendita 2 Società");
        jPanel1.add(txt1);
        txt1.setBounds(20, 240, 140, 30);

        jtext1.setBackground(new java.awt.Color(193, 255, 193));
        jtext1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        jtext1.setFont(new java.awt.Font("ITC Kabel Std", 0, 12)); // NOI18N
        jpane1.setViewportView(jtext1);

        jPanel1.add(jpane1);
        jpane1.setBounds(190, 240, 83, 21);

        jtext2.setBackground(new java.awt.Color(193, 255, 193));
        jtext2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        jtext2.setFont(new java.awt.Font("ITC Kabel Std", 0, 12)); // NOI18N
        jpane2.setViewportView(jtext2);

        jPanel1.add(jpane2);
        jpane2.setBounds(190, 270, 83, 21);

        jtext3.setBackground(new java.awt.Color(193, 255, 193));
        jtext3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        jtext3.setFont(new java.awt.Font("ITC Kabel Std", 0, 12)); // NOI18N
        jpane3.setViewportView(jtext3);

        jPanel1.add(jpane3);
        jpane3.setBounds(190, 300, 83, 21);

        jtext4.setBackground(new java.awt.Color(193, 255, 193));
        jtext4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        jtext4.setFont(new java.awt.Font("ITC Kabel Std", 0, 12)); // NOI18N
        jpane4.setViewportView(jtext4);

        jPanel1.add(jpane4);
        jpane4.setBounds(190, 330, 83, 21);

        jtext5.setBackground(new java.awt.Color(193, 255, 193));
        jtext5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        jtext5.setFont(new java.awt.Font("ITC Kabel Std", 0, 12)); // NOI18N
        jpane5.setViewportView(jtext5);

        jPanel1.add(jpane5);
        jpane5.setBounds(190, 360, 83, 21);

        jtext6.setBackground(new java.awt.Color(193, 255, 193));
        jtext6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        jtext6.setFont(new java.awt.Font("ITC Kabel Std", 0, 12)); // NOI18N
        jpane6.setViewportView(jtext6);

        jPanel1.add(jpane6);
        jpane6.setBounds(190, 390, 83, 21);

        txt3.setFont(new java.awt.Font("ITC Kabel Std", 1, 14)); // NOI18N
        txt3.setText("Rendita 3 Case*");
        txt3.setToolTipText("");
        jPanel1.add(txt3);
        txt3.setBounds(20, 300, 140, 18);

        txt4.setFont(new java.awt.Font("ITC Kabel Std", 1, 14)); // NOI18N
        txt4.setText("Rendita 4 Case*");
        txt4.setToolTipText("");
        jPanel1.add(txt4);
        txt4.setBounds(20, 330, 150, 18);

        txt5.setFont(new java.awt.Font("ITC Kabel Std", 1, 14)); // NOI18N
        txt5.setText("Rendita Albergo");
        jPanel1.add(txt5);
        txt5.setBounds(20, 360, 140, 18);

        txt6.setFont(new java.awt.Font("ITC Kabel Std", 1, 14)); // NOI18N
        txt6.setText("Prezzo d'acquisto");
        jPanel1.add(txt6);
        txt6.setBounds(20, 390, 140, 18);

        modifica3.setFont(new java.awt.Font("Kabel", 2, 12)); // NOI18N
        modifica3.setText("Aggiorna");
        modifica3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifica3ActionPerformed(evt);
            }
        });
        jPanel1.add(modifica3);
        modifica3.setBounds(80, 460, 109, 39);

        txt7.setFont(new java.awt.Font("ITC Kabel Std", 1, 16)); // NOI18N
        txt7.setText("Colore");
        jPanel1.add(txt7);
        txt7.setBounds(20, 420, 60, 30);

        clear3.setFont(new java.awt.Font("Kabel", 2, 12)); // NOI18N
        clear3.setText("Clear");
        clear3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear3ActionPerformed(evt);
            }
        });
        jPanel1.add(clear3);
        clear3.setBounds(220, 460, 107, 39);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progetto_monopoly/icone/shh.png"))); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(380, 80, 260, 390);

        jtext8.setBackground(new java.awt.Color(193, 255, 193));
        jtext8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        jtext8.setFont(new java.awt.Font("ITC Kabel Std", 0, 15)); // NOI18N
        jpane8.setViewportView(jtext8);

        jPanel1.add(jpane8);
        jpane8.setBounds(180, 270, 190, 40);

        jtext9.setBackground(new java.awt.Color(193, 255, 193));
        jtext9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        jtext9.setFont(new java.awt.Font("ITC Kabel Std", 0, 15)); // NOI18N
        jpane9.setViewportView(jtext9);

        jPanel1.add(jpane9);
        jpane9.setBounds(180, 330, 190, 40);

        txt2.setFont(new java.awt.Font("ITC Kabel Std", 1, 14)); // NOI18N
        txt2.setText("Rendita 2 Società");
        jPanel1.add(txt2);
        txt2.setBounds(20, 270, 380, 20);

        name.setBackground(new java.awt.Color(193, 255, 193));
        name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        name.setFont(new java.awt.Font("ITC Kabel Std", 0, 16)); // NOI18N
        name.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(name);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(190, 100, 160, 26);

        t_colore.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        t_colore.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FUCSIA", "CELESTE", "ARANCIONE", "MARRONE", "ROSSO", "GIALLO", "VERDE", "BLU" }));
        t_colore.setSelectedIndex(-1);
        jPanel1.add(t_colore);
        t_colore.setBounds(190, 420, 190, 27);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tipo_contrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipo_contrActionPerformed
       selection=tipo_contr.getSelectedIndex();
       switch(selection){
           case 0:
               //Edificabile ->0
               txt1.setVisible(true);
               txt1.setText("Rendita 1 Casa*");
               txt2.setVisible(true);
               txt2.setText("Rendita 2 Case*");
               txt3.setVisible(true);
               txt3.setText("Rendita 3 Case*");
               txt4.setVisible(true);
               txt4.setText("Rendita 4 Case*");
               txt5.setVisible(true);
               txt6.setVisible(true);
               txt7.setVisible(true);
               jpane1.setVisible(true);
               jpane2.setVisible(true);
               jpane3.setVisible(true);
               jpane4.setVisible(true);
               jpane5.setVisible(true);
               jpane6.setVisible(true);
               t_colore.setVisible(true);
               jpane8.setVisible(false);
               jpane9.setVisible(false);
               break;
           case 1:
               //Stazioni ->1
               txt1.setVisible(true);
               txt1.setText("Rendita 2 Stazioni*");
               txt2.setVisible(true);
               txt2.setText("Rendita 3 Stazioni*");
               txt3.setVisible(true);
               txt3.setText("Rendita 4 Stazioni*");
               txt4.setVisible(false);
               txt5.setVisible(false);
               txt6.setVisible(false);
               txt7.setVisible(false);
               jpane1.setVisible(true);
               jpane2.setVisible(true);
               jpane3.setVisible(true);
               jpane4.setVisible(false);
               jpane5.setVisible(false);
               jpane6.setVisible(false);
               t_colore.setVisible(false);
               jpane8.setVisible(false);
               jpane9.setVisible(false);
               break;
           case 2:
               //Società -> 2
               txt1.setVisible(true);
               txt1.setText("Rendita 2 Società*");
               txt2.setVisible(true);
               txt2.setText("Descrizione 1 Società*");
               txt3.setVisible(false);
               txt4.setVisible(true);
               txt4.setText("Descrizione 2 Società*");
               txt5.setVisible(false);
               txt6.setVisible(false);
               txt7.setVisible(false);
               jpane1.setVisible(true);
               jpane2.setVisible(false);
               jpane3.setVisible(false);
               jpane4.setVisible(false);
               jpane5.setVisible(false);
               jpane6.setVisible(false);
               t_colore.setVisible(false);
               jpane8.setVisible(true);
               jpane9.setVisible(true);
               break;
       }
    }//GEN-LAST:event_tipo_contrActionPerformed

    private void indietro3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indietro3ActionPerformed
       this.dispose();
       Classe obj = new Classe();
       obj.setVisible(true);
    }//GEN-LAST:event_indietro3ActionPerformed

    private void clear3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear3ActionPerformed
       name.setText(null);
       price.setText(null);
       valIp.setText(null);
       jtext.setText(null);
       jtext1.setText(null);
       jtext2.setText(null);
       jtext3.setText(null);
       jtext4.setText(null);
       jtext5.setText(null);
       jtext6.setText(null);
       jtext8.setText(null);
       jtext9.setText(null);
        switch(selection){
           case 0:
               //Edificabile ->0
               tipo_contr.setSelectedItem("EDIFICABILE");
               t_colore.setSelectedItem("FUCSIA");
               txt1.setVisible(true);
               txt1.setText("Rendita 1 Casa*");
               txt2.setVisible(true);
               txt2.setText("Rendita 2 Case*");
               txt3.setVisible(true);
               txt3.setText("Rendita 3 Case*");
               txt4.setVisible(true);
               txt4.setText("Rendita 4 Case*");
               txt5.setVisible(true);
               txt6.setVisible(true);
               txt7.setVisible(true);
               jpane1.setVisible(true);
               jpane2.setVisible(true);
               jpane3.setVisible(true);
               jpane4.setVisible(true);
               jpane5.setVisible(true);
               jpane6.setVisible(true);
               t_colore.setVisible(true);
               jpane8.setVisible(false);
               jpane9.setVisible(false);
               break;
           case 1:
               //Stazioni ->1
               tipo_contr.setSelectedItem("FERROVIA");
               txt1.setVisible(true);
               txt1.setText("Rendita 2 Stazioni*");
               txt2.setVisible(true);
               txt2.setText("Rendita 3 Stazioni*");
               txt3.setVisible(true);
               txt3.setText("Rendita 4 Stazioni*");
               txt4.setVisible(false);
               txt5.setVisible(false);
               txt6.setVisible(false);
               txt7.setVisible(false);
               jpane1.setVisible(true);
               jpane2.setVisible(true);
               jpane3.setVisible(true);
               jpane4.setVisible(false);
               jpane5.setVisible(false);
               jpane6.setVisible(false);
               t_colore.setVisible(false);
               jpane8.setVisible(false);
               jpane9.setVisible(false);
               break;
           case 2:
               //Società -> 2
               tipo_contr.setSelectedItem("SOCIETÀ");
               txt1.setVisible(true);
               txt1.setText("Rendita 2 Società*");
               txt2.setVisible(true);
               txt2.setText("Descrizione 1 Società*");
               txt3.setVisible(false);
               txt4.setVisible(true);
               txt4.setText("Descrizione 2 Società*");
               txt5.setVisible(false);
               txt6.setVisible(false);
               txt7.setVisible(false);
               jpane1.setVisible(true);
               jpane2.setVisible(false);
               jpane3.setVisible(false);
               jpane4.setVisible(false);
               jpane5.setVisible(false);
               jpane6.setVisible(false);
               t_colore.setVisible(false);
               jpane8.setVisible(true);
               jpane9.setVisible(true);
               break;
           
       }
    }//GEN-LAST:event_clear3ActionPerformed

    private void modifica3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifica3ActionPerformed
       try{
            con = Database.getDefaultConnection();
           
            int prezzo=Integer.parseInt(price.getText());
            int VI=Integer.parseInt(valIp.getText());
            int RS=Integer.parseInt(jtext.getText());
            query="UPDATE CONTRATTO SET NOME="+"'"+name.getText()+"'"+" ,PREZZO="+prezzo+",VALIPOTECARIO="+VI+" ,RENDITASEMPLICE="+RS+" WHERE ID_CONTRATTO=" + Dati_Tabella.ID_Contratto;
            switch(selection){
                case 0:
                    int R1=Integer.parseInt(jtext1.getText());
                    int R2=Integer.parseInt(jtext2.getText());
                    int R3=Integer.parseInt(jtext3.getText());
                    int R4=Integer.parseInt(jtext4.getText());
                    int RA=Integer.parseInt(jtext5.getText());
                    int PA=Integer.parseInt(jtext6.getText());
                    query1="UPDATE CONTRATTO SET TIPO_CONTRATTO='EDIFICABILE',TIPO_NONED=NULL,RENDITA2STAZIONI=NULL,RENDITA3STAZIONI=NULL,RENDITA4STAZIONI=NULL,RENDITA2SOCIETA=NULL,TESTO1SOCIETA=NULL,TESTO2SOCIETA=NULL, RENDITA1CASA="+R1+",RENDITA2CASE="+R2+" ,RENDITA3CASE="+R3+",RENDITA4CASE="+R4+",RENDITAALBERGO="+RA+",PREZZOACQUISTOED="+PA+",COLORE="+"'"+(String)t_colore.getSelectedItem()+"'"+" WHERE ID_CONTRATTO=" + Dati_Tabella.ID_Contratto;
                    break;
                case 1:
                    int R2S=Integer.parseInt(jtext1.getText());
                    int R3S=Integer.parseInt(jtext2.getText());
                    int R4S=Integer.parseInt(jtext3.getText());
                    query1="UPDATE CONTRATTO SET TIPO_CONTRATTO='NON EDIFICABILE',TIPO_NONED='FERROVIA',RENDITA2STAZIONI="+R2S+",RENDITA3STAZIONI="+R3S+",RENDITA4STAZIONI="+R4S+",RENDITA2SOCIETA=NULL,TESTO1SOCIETA=NULL,TESTO2SOCIETA=NULL,RENDITA1CASA=NULL,RENDITA2CASE=NULL,RENDITA3CASE=NULL,COLORE=NULL,RENDITA4CASE=NULL,RENDITAALBERGO=NULL,PREZZOACQUISTOED=NULL WHERE ID_CONTRATTO=" + Dati_Tabella.ID_Contratto;
                    break;
                case 2:
                    int RSS=Integer.parseInt(jtext1.getText());
                    query1="UPDATE CONTRATTO SET TIPO_CONTRATTO='NON EDIFICABILE',TIPO_NONED='SOCIETÀ',RENDITA2STAZIONI=NULL,RENDITA3STAZIONI=NULL,RENDITA4STAZIONI=NULL,RENDITA2SOCIETA="+RSS+",TESTO1SOCIETA="+"'"+jtext8.getText()+"'"+",TESTO2SOCIETA="+"'"+jtext9.getText()+"'"+", COLORE=NULL,RENDITA1CASA=NULL,RENDITA2CASE=NULL,RENDITA3CASE=NULL,RENDITA4CASE=NULL,RENDITAALBERGO=NULL,PREZZOACQUISTOED=NULL WHERE ID_CONTRATTO=" + Dati_Tabella.ID_Contratto;
                
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
               
               this.dispose();
               Classe obj = new Classe();
               obj.setVisible(true);
                      
        
     }catch( SQLException | NumberFormatException t){
             
                UIManager.put("OptionPane.background",new ColorUIResource(193,255,193));
                UIManager.put("Panel.background",new ColorUIResource(193,255,193));
                UIManager.put("OptionPane.messageFont", new Font("ITC Kabel Std", Font.BOLD, 14));
                UIManager.put("OptionPane.buttonFont", new Font("AppleMyungjo", Font.ITALIC, 12));
                JOptionPane.showMessageDialog(this, "Inserire tutti i campi.", "Errore", JOptionPane.ERROR_MESSAGE,new ImageIcon("prigione.gif"));
           }
    }//GEN-LAST:event_modifica3ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modifica_Contratto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear3;
    private javax.swing.JButton indietro3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jpane1;
    private javax.swing.JScrollPane jpane2;
    private javax.swing.JScrollPane jpane3;
    private javax.swing.JScrollPane jpane4;
    private javax.swing.JScrollPane jpane5;
    private javax.swing.JScrollPane jpane6;
    private javax.swing.JScrollPane jpane8;
    private javax.swing.JScrollPane jpane9;
    private javax.swing.JTextPane jtext;
    private javax.swing.JTextPane jtext1;
    private javax.swing.JTextPane jtext2;
    private javax.swing.JTextPane jtext3;
    private javax.swing.JTextPane jtext4;
    private javax.swing.JTextPane jtext5;
    private javax.swing.JTextPane jtext6;
    private javax.swing.JTextPane jtext8;
    private javax.swing.JTextPane jtext9;
    private javax.swing.JButton modifica3;
    private javax.swing.JTextPane name;
    private javax.swing.JTextPane price;
    private javax.swing.JComboBox<String> t_colore;
    private javax.swing.JComboBox<String> tipo_contr;
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
