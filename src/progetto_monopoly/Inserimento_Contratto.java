package progetto_monopoly;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import static progetto_monopoly.Inserimento_Casella.contratto;
import static progetto_monopoly.Inserimento_Casella.prezzo;
import static progetto_monopoly.Inserimento_Casella.colore;
import static progetto_monopoly.Inserimento_Casella.ID_Casella;
import static progetto_monopoly.Inserimento_Casella.nome_cas;

public class Inserimento_Contratto extends javax.swing.JFrame {
    static int selection=0;
    static Connection con_contr = null;
    static PreparedStatement pst_con;
    PreparedStatement pst;
    ResultSet rs;
    static String nome_con,colore_con;
    static int ID_Contratto,ID_Cas,casella=0,prezzo_con;
    
    public Inserimento_Contratto() {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        selection=0;
        casella=0;
        UIManager.put("ComboBox.disabledForeground", Color.BLACK);
        if(contratto==1){
            tipo_contr.setSelectedItem("EDIFICABILE");
            tipo_contr.setEnabled(false);
            price.setText(""+prezzo);
            price.setEnabled(false);
            name.setText(""+nome_cas);
            name.setEnabled(false);
            t_colore.setSelectedItem(colore);
            t_colore.setEnabled(false);
            indietro3.setEnabled(false);
            clear3.setEnabled(false);
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
               jpane9.setVisible(false);}
        else if(contratto==2){
               tipo_contr.setSelectedItem("FERROVIA");
               tipo_contr.setEnabled(false);
               price.setText(""+prezzo);
               price.setEnabled(false);
               indietro3.setEnabled(false);
                 clear3.setEnabled(false);
               name.setText(""+nome_cas);
               name.setEnabled(false);
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
            
        } else if(contratto==3){
            tipo_contr.setSelectedItem("SOCIETÀ");
               tipo_contr.setEnabled(false);
               indietro3.setEnabled(false);
                 clear3.setEnabled(false);
               price.setText(""+prezzo);
               price.setEnabled(false);
              name.setText(""+nome_cas);
            name.setEnabled(false);
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
        }
        else {
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
        aggiungi3 = new javax.swing.JButton();
        txt7 = new javax.swing.JLabel();
        clear3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
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
        setMaximumSize(new java.awt.Dimension(700, 600));
        setMinimumSize(new java.awt.Dimension(700, 600));
        setSize(new java.awt.Dimension(700, 600));

        jPanel1.setBackground(new java.awt.Color(193, 255, 193));
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
        jLabel1.setText("Riempire i campi di Contratto e premere Aggiungi per confermare");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 60, 375, 17);

        jLabel2.setFont(new java.awt.Font("ITC Kabel Std", 1, 16)); // NOI18N
        jLabel2.setText("Seleziona tipo*");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 90, 116, 20);

        tipo_contr.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        tipo_contr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EDIFICABILE", "FERROVIA", "SOCIETÀ" }));
        tipo_contr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipo_contrActionPerformed(evt);
            }
        });
        jPanel1.add(tipo_contr);
        tipo_contr.setBounds(190, 80, 170, 30);

        jLabel3.setFont(new java.awt.Font("ITC Kabel Std", 1, 16)); // NOI18N
        jLabel3.setText("Nome*");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 120, 60, 20);

        jLabel4.setFont(new java.awt.Font("ITC Kabel Std", 1, 16)); // NOI18N
        jLabel4.setText("Prezzo*");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 160, 60, 30);

        price.setBackground(new java.awt.Color(193, 255, 193));
        price.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        price.setFont(new java.awt.Font("ITC Kabel Std", 0, 16)); // NOI18N
        price.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(price);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(190, 155, 83, 30);

        jLabel5.setFont(new java.awt.Font("ITC Kabel Std", 1, 14)); // NOI18N
        jLabel5.setText("Rendita Semplice*");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 217, 120, 30);

        valIp.setBackground(new java.awt.Color(193, 255, 193));
        valIp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        valIp.setFont(new java.awt.Font("ITC Kabel Std", 0, 12)); // NOI18N
        jScrollPane3.setViewportView(valIp);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(190, 190, 83, 21);

        jLabel6.setFont(new java.awt.Font("ITC Kabel Std", 1, 14)); // NOI18N
        jLabel6.setText("Valore Ipotecario*");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 190, 120, 30);

        jtext.setBackground(new java.awt.Color(193, 255, 193));
        jtext.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        jtext.setFont(new java.awt.Font("ITC Kabel Std", 0, 12)); // NOI18N
        jScrollPane4.setViewportView(jtext);

        jPanel1.add(jScrollPane4);
        jScrollPane4.setBounds(190, 220, 83, 21);

        txt1.setFont(new java.awt.Font("ITC Kabel Std", 1, 14)); // NOI18N
        txt1.setText("Rendita 2 Società*");
        jPanel1.add(txt1);
        txt1.setBounds(20, 247, 140, 30);

        jtext1.setBackground(new java.awt.Color(193, 255, 193));
        jtext1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        jtext1.setFont(new java.awt.Font("ITC Kabel Std", 0, 12)); // NOI18N
        jpane1.setViewportView(jtext1);

        jPanel1.add(jpane1);
        jpane1.setBounds(190, 250, 83, 21);

        jtext2.setBackground(new java.awt.Color(193, 255, 193));
        jtext2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        jtext2.setFont(new java.awt.Font("ITC Kabel Std", 0, 12)); // NOI18N
        jpane2.setViewportView(jtext2);

        jPanel1.add(jpane2);
        jpane2.setBounds(190, 280, 83, 21);

        jtext3.setBackground(new java.awt.Color(193, 255, 193));
        jtext3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        jtext3.setFont(new java.awt.Font("ITC Kabel Std", 0, 12)); // NOI18N
        jpane3.setViewportView(jtext3);

        jPanel1.add(jpane3);
        jpane3.setBounds(190, 310, 83, 21);

        jtext4.setBackground(new java.awt.Color(193, 255, 193));
        jtext4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        jtext4.setFont(new java.awt.Font("ITC Kabel Std", 0, 12)); // NOI18N
        jpane4.setViewportView(jtext4);

        jPanel1.add(jpane4);
        jpane4.setBounds(190, 340, 83, 21);

        jtext5.setBackground(new java.awt.Color(193, 255, 193));
        jtext5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        jtext5.setFont(new java.awt.Font("ITC Kabel Std", 0, 12)); // NOI18N
        jpane5.setViewportView(jtext5);

        jPanel1.add(jpane5);
        jpane5.setBounds(190, 370, 83, 21);

        jtext6.setBackground(new java.awt.Color(193, 255, 193));
        jtext6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        jtext6.setFont(new java.awt.Font("ITC Kabel Std", 0, 12)); // NOI18N
        jpane6.setViewportView(jtext6);

        jPanel1.add(jpane6);
        jpane6.setBounds(190, 400, 83, 21);

        txt3.setFont(new java.awt.Font("ITC Kabel Std", 1, 14)); // NOI18N
        txt3.setText("Rendita 3 Case*");
        txt3.setToolTipText("");
        jPanel1.add(txt3);
        txt3.setBounds(20, 310, 140, 18);

        txt4.setFont(new java.awt.Font("ITC Kabel Std", 1, 14)); // NOI18N
        txt4.setText("Rendita 4 Case*");
        txt4.setToolTipText("");
        jPanel1.add(txt4);
        txt4.setBounds(20, 340, 150, 18);

        txt5.setFont(new java.awt.Font("ITC Kabel Std", 1, 14)); // NOI18N
        txt5.setText("Rendita Albergo*");
        jPanel1.add(txt5);
        txt5.setBounds(20, 370, 140, 18);

        txt6.setFont(new java.awt.Font("ITC Kabel Std", 1, 14)); // NOI18N
        txt6.setText("Prezzo d'acquisto*");
        jPanel1.add(txt6);
        txt6.setBounds(20, 400, 140, 18);

        aggiungi3.setFont(new java.awt.Font("Kabel", 2, 12)); // NOI18N
        aggiungi3.setText("Aggiungi");
        aggiungi3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aggiungi3ActionPerformed(evt);
            }
        });
        jPanel1.add(aggiungi3);
        aggiungi3.setBounds(60, 470, 107, 39);

        txt7.setFont(new java.awt.Font("ITC Kabel Std", 1, 16)); // NOI18N
        txt7.setText("Colore*");
        jPanel1.add(txt7);
        txt7.setBounds(20, 430, 60, 30);

        clear3.setFont(new java.awt.Font("Kabel", 2, 12)); // NOI18N
        clear3.setText("Clear");
        clear3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear3ActionPerformed(evt);
            }
        });
        jPanel1.add(clear3);
        clear3.setBounds(200, 470, 107, 39);

        jLabel10.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        jLabel10.setText("*I campi contrassegnati con (*) sono obbligatori");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(20, 550, 261, 17);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progetto_monopoly/icone/contratto.png"))); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(360, 110, 350, 390);

        jtext8.setBackground(new java.awt.Color(193, 255, 193));
        jtext8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        jtext8.setFont(new java.awt.Font("ITC Kabel Std", 0, 15)); // NOI18N
        jpane8.setViewportView(jtext8);

        jPanel1.add(jpane8);
        jpane8.setBounds(180, 280, 190, 40);

        jtext9.setBackground(new java.awt.Color(193, 255, 193));
        jtext9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        jtext9.setFont(new java.awt.Font("ITC Kabel Std", 0, 15)); // NOI18N
        jpane9.setViewportView(jtext9);

        jPanel1.add(jpane9);
        jpane9.setBounds(180, 340, 190, 40);

        txt2.setFont(new java.awt.Font("ITC Kabel Std", 1, 14)); // NOI18N
        txt2.setText("Rendita 2 Società*");
        jPanel1.add(txt2);
        txt2.setBounds(20, 280, 380, 20);

        name.setBackground(new java.awt.Color(193, 255, 193));
        name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        name.setFont(new java.awt.Font("ITC Kabel Std", 0, 16)); // NOI18N
        name.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(name);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(190, 120, 160, 30);

        t_colore.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        t_colore.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FUCSIA", "CELESTE", "ARANCIONE", "MARRONE", "ROSSO", "GIALLO", "VERDE", "BLU" }));
        jPanel1.add(t_colore);
        t_colore.setBounds(190, 430, 190, 27);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
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
        casella=0;
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

    private void aggiungi3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aggiungi3ActionPerformed
       try{
                con_contr = Database.getDefaultConnection();
                String query="SELECT MAX(ID_CONTRATTO) FROM DB_MONO.CONTRATTO";
                pst = con_contr.prepareStatement(query);
                rs = pst.executeQuery();
                while(rs.next()){
                    ID_Contratto = rs.getInt(1);
                }
                
                String query1;
                if(selection==0 | contratto==1){
                    query1="INSERT INTO CONTRATTO(ID_CONTRATTO,TIPO_CONTRATTO,NOME,PREZZO,VALIPOTECARIO,COLORE,RENDITASEMPLICE,RENDITA1CASA,RENDITA2CASE,RENDITA3CASE,RENDITA4CASE,RENDITAALBERGO,PREZZOACQUISTOED,ID_CASELLA)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                    pst_con = con_contr.prepareStatement(query1);
                    pst_con.setInt(1,(ID_Contratto+1));
                    pst_con.setString(2,"EDIFICABILE");
                    nome_con=name.getText();
                    pst_con.setString(3,nome_con);
                    
                    String string=price.getText();
                    prezzo_con=Integer.parseInt(string);
                    pst_con.setInt(4, prezzo_con);
                    
                    string=valIp.getText();
                    int number=Integer.parseInt(string);
                    pst_con.setInt(5, number);
                    
                    //controlla qui
                    colore_con=(String)t_colore.getSelectedItem();
                    pst_con.setString(6, colore_con);
                    
                    string=jtext.getText();
                    number=Integer.parseInt(string);
                    pst_con.setInt(7, number);
                    
                    string=jtext1.getText();
                    number=Integer.parseInt(string);
                    pst_con.setInt(8, number);
                    
                    string=jtext2.getText();
                    number=Integer.parseInt(string);
                    pst_con.setInt(9, number);
                    
                    string=jtext3.getText();
                    number=Integer.parseInt(string);
                    pst_con.setInt(10, number);
                    
                    string=jtext4.getText();
                    number=Integer.parseInt(string);
                    pst_con.setInt(11, number);
                    
                    string=jtext5.getText();
                    number=Integer.parseInt(string);
                    pst_con.setInt(12, number);
                    
                    string=jtext6.getText();
                    number=Integer.parseInt(string);
                    pst_con.setInt(13, number);
                    
                    if(contratto==1){
                        pst_con.setInt(14, (ID_Casella+1));
                    } else {
                        query="SELECT MAX(ID_CASELLA) FROM DB_MONO.CASELLA";
                        pst = con_contr.prepareStatement(query);
                        rs = pst.executeQuery();
                        while(rs.next()){
                             ID_Cas = rs.getInt(1);
                              }
                        pst_con.setInt(14, (ID_Cas+1));
                    }
                    
                } else if(selection==1 | contratto==2){
                    query1="INSERT INTO CONTRATTO(ID_CONTRATTO,TIPO_CONTRATTO,TIPO_NONED,NOME,PREZZO,VALIPOTECARIO,RENDITASEMPLICE,RENDITA2STAZIONI,RENDITA3STAZIONI,RENDITA4STAZIONI,ID_CASELLA) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
                    pst_con = con_contr.prepareStatement(query1);
                    pst_con.setInt(1,(ID_Contratto+1));
                    pst_con.setString(2,"NON EDIFICABILE");
                    pst_con.setString(3,"FERROVIA");
                    nome_con=name.getText();
                    pst_con.setString(4,nome_con);
                    
                    String string=price.getText();
                    prezzo_con=Integer.parseInt(string);
                    pst_con.setInt(5, prezzo_con);
                    
                    string=valIp.getText();
                    int number=Integer.parseInt(string);
                    pst_con.setInt(6, number);
                    
                    string=jtext.getText();
                    number=Integer.parseInt(string);
                    pst_con.setInt(7, number);
                    
                    string=jtext1.getText();
                    number=Integer.parseInt(string);
                    pst_con.setInt(8, number);
                    
                    string=jtext2.getText();
                    number=Integer.parseInt(string);
                    pst_con.setInt(9, number);
                    
                    string=jtext3.getText();
                    number=Integer.parseInt(string);
                    pst_con.setInt(10, number);
                    
                     if(contratto==2){
                        pst_con.setInt(11, (ID_Casella+1));
                    } else {
                        query="SELECT MAX(ID_CASELLA) FROM DB_MONO.CASELLA";
                        pst = con_contr.prepareStatement(query);
                        rs = pst.executeQuery();
                        while(rs.next()){
                             ID_Cas = rs.getInt(1);
                              }
                        pst_con.setInt(11, (ID_Cas+1));
                    }
                     
                } else if(selection==2 | contratto==3){
                    query1="INSERT INTO CONTRATTO(ID_CONTRATTO,TIPO_CONTRATTO,TIPO_NONED,NOME,PREZZO,VALIPOTECARIO,RENDITASEMPLICE,RENDITA2SOCIETA,TESTO1SOCIETA,TESTO2SOCIETA,ID_CASELLA) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
                    pst_con = con_contr.prepareStatement(query1);
                    pst_con.setInt(1,(ID_Contratto+1));
                    pst_con.setString(2,"NON EDIFICABILE");
                    pst_con.setString(3,"SOCIETÀ");
                    nome_con=name.getText();
                    pst_con.setString(4,nome_con);
                    
                    String string=price.getText();
                    int number=Integer.parseInt(string);
                    pst_con.setInt(5, number);
                    
                    string=valIp.getText();
                    number=Integer.parseInt(string);
                    pst_con.setInt(6, number);
                    
                    string=jtext.getText();
                    number=Integer.parseInt(string);
                    pst_con.setInt(7, number);
                    
                    string=jtext1.getText();
                    number=Integer.parseInt(string);
                    pst_con.setInt(8, number);
                    
                    pst_con.setString(9,jtext8.getText());
                    pst_con.setString(10,jtext9.getText());
                    
                     if(contratto==3){
                        pst_con.setInt(11, (ID_Casella+1));
                    } else {
                        query="SELECT MAX(ID_CASELLA) FROM DB_MONO.CASELLA";
                        pst = con_contr.prepareStatement(query);
                        rs = pst.executeQuery();
                        while(rs.next()){
                             ID_Cas = rs.getInt(1);
                              }
                        pst_con.setInt(11, (ID_Cas+1));
                    }
                }
                
                if(contratto==1 | contratto==2 | contratto==3){
                    pst_con.executeUpdate();
                     con_contr.close();
                }
                
               
                
               UIManager.put("OptionPane.background",new ColorUIResource(193,255,193));
               UIManager.put("Panel.background",new ColorUIResource(193,255,193));
               UIManager.put("OptionPane.messageFont", new Font("ITC Kabel Std", Font.BOLD, 14));
               UIManager.put("OptionPane.buttonFont", new Font("AppleMyungjo", Font.ITALIC, 12));
               JOptionPane.showMessageDialog(this, "Inserimento riuscito!", "", JOptionPane.INFORMATION_MESSAGE,new ImageIcon("pollice.gif"));
               if(contratto==1 | contratto==2 | contratto==3){
                   this.dispose();
                   Classe obj = new Classe();
                   obj.setVisible(true);
               } else if(selection==0 ){
                    casella=1;
                   this.dispose();
                   Inserimento_Casella obj = new Inserimento_Casella();
                   obj.setVisible(true);
                  
               } else if(selection==1){
                   casella=2;
                   this.dispose();
                   Inserimento_Casella obj = new Inserimento_Casella();
                   obj.setVisible(true);
               } else if(selection==2){
                   casella=3;
                   this.dispose();
                   Inserimento_Casella obj = new Inserimento_Casella();
                   obj.setVisible(true);
               } 
                
       }
       
       catch( NumberFormatException | NullPointerException | SQLException t){
                UIManager.put("OptionPane.background",new ColorUIResource(193,255,193));
                UIManager.put("Panel.background",new ColorUIResource(193,255,193));
                UIManager.put("OptionPane.messageFont", new Font("ITC Kabel Std", Font.BOLD, 14));
                UIManager.put("OptionPane.buttonFont", new Font("AppleMyungjo", Font.ITALIC, 12));
                JOptionPane.showMessageDialog(this, "Inserire tutti i campi.", "Errore", JOptionPane.ERROR_MESSAGE,new ImageIcon("prigione.gif"));}
         
    }//GEN-LAST:event_aggiungi3ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inserimento_Contratto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aggiungi3;
    private javax.swing.JButton clear3;
    private javax.swing.JButton indietro3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
