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

public class Ricerca_Possedimento extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst;
    ResultSet rs;
    String query;
    int tur;
    
    public Ricerca_Possedimento() {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        
        ris1.setDefaultEditor(Object.class, null);
        
        try{
            con = Database.getDefaultConnection();
            query ="SELECT ID_POSSEDIMENTO FROM POSSEDIMENTO ORDER BY (ID_POSSEDIMENTO) ASC";
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();
            
            id6.removeAllItems();
            while(rs.next()){
                    id6.addItem(""+rs.getInt(1));
                }
            id6.setSelectedIndex(-1);
   
            con.close(); 
         } catch(SQLException e){ System.out.println(e);}
        try{
            con = Database.getDefaultConnection();
            query ="SELECT ID_PARTITA FROM PARTITA ORDER BY (ID_PARTITA) ASC";
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();
            
            idp6.removeAllItems();
            while(rs.next()){
                    idp6.addItem(""+rs.getInt(1));
                }
            idp6.setSelectedIndex(-1);
   
            con.close(); 
         } catch(SQLException e){ System.out.println(e);}
        
         try{
            con = Database.getDefaultConnection();
            query ="SELECT ID_MOSSA FROM MOSSA ORDER BY (ID_MOSSA) ASC";
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();
            
            idm6.removeAllItems();
            while(rs.next()){
                    idm6.addItem(""+rs.getInt(1));
                }
            idm6.setSelectedIndex(-1);
   
            con.close(); 
         } catch(SQLException e){ System.out.println(e);}
         
         try{
            con = Database.getDefaultConnection();
            query ="SELECT ID_GIOCATORE FROM POSSEDIMENTO ORDER BY (ID_GIOCATORE) ASC";
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();
            
            idg6.removeAllItems();
            while(rs.next()){
                    idg6.addItem(""+rs.getInt(1));
                }
            idg6.setSelectedIndex(-1);
   
            con.close(); 
         } catch(SQLException e){ System.out.println(e);}
         
          try{
            con = Database.getDefaultConnection();
            query ="SELECT DISTINCT ID_CONTRATTO FROM POSSEDIMENTO ORDER BY (ID_CONTRATTO) ASC";
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();
            
            contr6.removeAllItems();
            while(rs.next()){
                    contr6.addItem(""+rs.getInt(1));
                }
            contr6.setSelectedIndex(-1);
   
            con.close(); 
         } catch(SQLException e){ System.out.println(e);}
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        indietro6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        id6 = new javax.swing.JComboBox<>();
        tipop6 = new javax.swing.JComboBox<>();
        ricerca6 = new javax.swing.JButton();
        clear6 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        idp6 = new javax.swing.JComboBox<>();
        idg6 = new javax.swing.JComboBox<>();
        Cerca2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        numc6 = new javax.swing.JComboBox<>();
        contr6 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        idm6 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        turno6 = new javax.swing.JTextPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ris1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        ris2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(770, 510));
        setMinimumSize(new java.awt.Dimension(770, 510));

        jPanel1.setBackground(new java.awt.Color(193, 255, 193));
        jPanel1.setMaximumSize(new java.awt.Dimension(770, 510));
        jPanel1.setPreferredSize(new java.awt.Dimension(770, 510));
        jPanel1.setSize(new java.awt.Dimension(770, 510));

        indietro6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progetto_monopoly/icone/back.png"))); // NOI18N
        indietro6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indietro6ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel1.setText("ID_Possedimento");

        jLabel3.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel3.setText("Tipo");

        jLabel4.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel4.setText("Numero Case");

        jLabel5.setFont(new java.awt.Font("ITC Kabel Std", 1, 14)); // NOI18N
        jLabel5.setText("Ricerca per caratteristica:");

        id6.setEditable(true);
        id6.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        id6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id6ActionPerformed(evt);
            }
        });

        tipop6.setEditable(true);
        tipop6.setFont(new java.awt.Font("ITC Kabel Std", 0, 15)); // NOI18N
        tipop6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SEMPLICE", "CASA", "ALBERGO", "IPOTECATA" }));
        tipop6.setSelectedIndex(-1);

        ricerca6.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        ricerca6.setText("Cerca");
        ricerca6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ricerca6ActionPerformed(evt);
            }
        });

        clear6.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        clear6.setText("Clear");
        clear6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear6ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("ITC Kabel Std", 1, 14)); // NOI18N
        jLabel6.setText("e/o presenza nel gioco:");

        jLabel7.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel7.setText("ID_Partita");

        jLabel8.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel8.setText("ID_Giocatore");

        idp6.setEditable(true);
        idp6.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N

        idg6.setEditable(true);
        idg6.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N

        Cerca2.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        Cerca2.setText("Cerca");
        Cerca2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cerca2ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("ITC Kabel Std", 1, 13)); // NOI18N
        jLabel9.setText("Contratto");

        jLabel10.setFont(new java.awt.Font("ITC Kabel Std", 1, 13)); // NOI18N
        jLabel10.setText("associato");

        numc6.setEditable(true);
        numc6.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        numc6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        numc6.setSelectedIndex(-1);

        contr6.setEditable(true);
        contr6.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N

        jLabel2.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel2.setText("ID_Mossa");

        jLabel11.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel11.setText("Turno");

        idm6.setEditable(true);
        idm6.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N

        turno6.setBackground(new java.awt.Color(193, 255, 193));
        turno6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        turno6.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        jScrollPane1.setViewportView(turno6);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));

        ris1.setBackground(new java.awt.Color(193, 255, 193));
        ris1.setFont(new java.awt.Font("ITC Kabel Std", 1, 12)); // NOI18N
        ris1.setSelectionBackground(new java.awt.Color(204, 0, 0));
        jScrollPane3.setViewportView(ris1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));

        ris2.setBackground(new java.awt.Color(193, 255, 193));
        ris2.setFont(new java.awt.Font("ITC Kabel Std", 1, 12)); // NOI18N
        ris2.setSelectionBackground(new java.awt.Color(204, 0, 0));
        jScrollPane4.setViewportView(ris2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(contr6, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                                    .addComponent(idg6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(numc6, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tipop6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(id6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(clear6)
                                .addGap(5, 5, 5))
                            .addComponent(ricerca6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(indietro6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel2))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(idm6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idp6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(104, 104, 104))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Cerca2)
                        .addGap(5, 5, 5)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(indietro6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(id6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tipop6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numc6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel10))
                            .addComponent(contr6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(idg6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ricerca6)
                        .addGap(8, 8, 8)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(idp6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(idm6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(30, 30, 30))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Cerca2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(clear6)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void indietro6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indietro6ActionPerformed
        this.dispose();
        Classe obj = new Classe();
        obj.setVisible(true);
    }//GEN-LAST:event_indietro6ActionPerformed

    private void clear6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear6ActionPerformed
        id6.setSelectedIndex(-1);
        tipop6.setSelectedIndex(-1);
        numc6.setSelectedIndex(-1);
        contr6.setSelectedIndex(-1);
        idg6.setSelectedIndex(-1);
        idp6.setSelectedIndex(-1);
        idm6.setSelectedIndex(-1);
        turno6.setText(null);
        
        
        Dati_Tabella.clearTable(ris2);
    }//GEN-LAST:event_clear6ActionPerformed

    private void ricerca6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ricerca6ActionPerformed
        Dati_Tabella.clearTable(ris1);
        try{
            con= Database.getDefaultConnection(); 
            
            query="SELECT * FROM POSSEDIMENTO WHERE";
            int flag=0;
            if(id6.getSelectedIndex()!=-1){
                query=query+" ID_POSSEDIMENTO="+id6.getSelectedItem();
                flag=1;
            }
            if(tipop6.getSelectedIndex()!=-1){
                if(flag==0){
                    query=query+" TIPO_POSSEDIMENTO LIKE '%"+tipop6.getSelectedItem()+"%'";
                    flag=1;
                }else if(flag==1)
                    query=query+" AND TIPO_POSSEDIMENTO LIKE '%"+tipop6.getSelectedItem()+"%'";
            }
            if(numc6.getSelectedIndex()!=-1){
                if(flag==0){
                    query=query+" NUM_CASA="+numc6.getSelectedItem();
                    flag=1;
                }else if(flag==1)
                    query=query+" AND NUM_CASA="+numc6.getSelectedItem();
            }
            if(contr6.getSelectedIndex()!=-1){
                if(flag==0){
                    query=query+" ID_CONTRATTO="+contr6.getSelectedItem();
                    flag=1;
                }else if(flag==1)
                    query=query+" AND ID_CONTRATTO="+contr6.getSelectedItem();
            }
            if(idg6.getSelectedIndex()!=-1){
                if(flag==0){
                    query=query+" ID_GIOCATORE="+idg6.getSelectedItem();
                    flag=1;
                }else if(flag==1)
                    query=query+" AND ID_GIOCATORE="+idg6.getSelectedItem();
            }
            
            query = query + " ORDER BY (ID_POSSEDIMENTO) ASC";
        
            pst = con.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);            
            rs = pst.executeQuery();
            ris1.setModel(DbUtils.resultSetToTableModel(rs));
            if(!(rs.first())){
                UIManager.put("OptionPane.background",new ColorUIResource(193,255,193));
                UIManager.put("Panel.background",new ColorUIResource(193,255,193));
                UIManager.put("OptionPane.messageFont", new Font("ITC Kabel Std", Font.BOLD, 14));
                UIManager.put("OptionPane.buttonFont", new Font("AppleMyungjo", Font.ITALIC, 12));
                JOptionPane.showMessageDialog(this, "Non ci sono risultati per questa ricerca!", "", JOptionPane.INFORMATION_MESSAGE,new ImageIcon("oh.gif"));    
            }
        con.close();
        }catch(NumberFormatException | SQLException e){
        UIManager.put("OptionPane.background",new ColorUIResource(193,255,193));
                UIManager.put("Panel.background",new ColorUIResource(193,255,193));
                UIManager.put("OptionPane.messageFont", new Font("ITC Kabel Std", Font.BOLD, 14));
                UIManager.put("OptionPane.buttonFont", new Font("AppleMyungjo", Font.ITALIC, 12));
                JOptionPane.showMessageDialog(this, "Inserire campi!", "Errore", JOptionPane.ERROR_MESSAGE,new ImageIcon("oh.gif"));    
            
        }
    }//GEN-LAST:event_ricerca6ActionPerformed

    private void Cerca2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cerca2ActionPerformed
        Dati_Tabella.clearTable(ris2);
         try{
            con= Database.getDefaultConnection(); 
            
             try{
          tur=Integer.parseInt(turno6.getText());
            } catch(NumberFormatException e){
                tur=0;
            }
             
             query="SELECT MOSSA.ID_POSSEDIMENTO,POSSEDIMENTO.NOME,POSSEDIMENTO.TIPO_POSSEDIMENTO,POSSEDIMENTO.NUM_CASA,MOSSA.ID_GIOCATORE,MOSSA.ID_PARTITA, MOSSA.ID_MOSSA, MOSSA.TURNO, MOSSA.TIPO_PAGAMENTO FROM POSSEDIMENTO JOIN MOSSA ON POSSEDIMENTO.ID_POSSEDIMENTO=MOSSA.ID_POSSEDIMENTO WHERE";
             
             int flag=0;
             if(idp6.getSelectedIndex()!=-1){
                 query=query+" MOSSA.ID_PARTITA="+idp6.getSelectedItem();
                 flag=1;
             }
             
              if(tipop6.getSelectedIndex()!=-1){
                if(flag==0){
                    query=query+" POSSEDIMENTO.TIPO_POSSEDIMENTO LIKE '%"+tipop6.getSelectedItem()+"%'";
                    flag=1;
                }else if(flag==1)
                    query=query+" AND POSSEDIMENTO.TIPO_POSSEDIMENTO LIKE '%"+tipop6.getSelectedItem()+"%'";
            }
            if(numc6.getSelectedIndex()!=-1){
                if(flag==0){
                    query=query+" POSSEDIMENTO.NUM_CASA="+numc6.getSelectedItem();
                    flag=1;
                }else if(flag==1)
                    query=query+" AND POSSEDIMENTO.NUM_CASA="+numc6.getSelectedItem();
            }
            if(contr6.getSelectedIndex()!=-1){
                if(flag==0){
                    query=query+" POSSEDIMENTO.ID_CONTRATTO="+contr6.getSelectedItem();
                    flag=1;
                }else if(flag==1)
                    query=query+" AND POSSEDIMENTO.ID_CONTRATTO="+contr6.getSelectedItem();
            }
            if(idg6.getSelectedIndex()!=-1){
                if(flag==0){
                    query=query+" POSSEDIMENTO.ID_GIOCATORE="+idg6.getSelectedItem();
                    flag=1;
                }else if(flag==1)
                    query=query+" AND POSSEDIMENTO.ID_GIOCATORE="+idg6.getSelectedItem();
            }
            
             if(id6.getSelectedIndex()!=-1){
                if(flag==0){
                    query=query+" POSSEDIMENTO.ID_POSSEDIMENTO="+id6.getSelectedItem();
                    flag=1;
                }else if(flag==1)
                    query=query+" AND POSSEDIMENTO.ID_POSSEDIMENTO="+id6.getSelectedItem();
            }
            
            
             if(idm6.getSelectedIndex()!=-1){
                 if(flag==0){
                     query=query+" MOSSA.ID_MOSSA="+idm6.getSelectedItem();
                     flag=1;
                 }else if(flag==1)
                     query=query+" AND MOSSA.ID_MOSSA="+idm6.getSelectedItem();
             }
             if(tur!=0){
                 if(flag==0){
                     query=query+" MOSSA.TURNO="+tur;
                     flag=1;
                 }else if(flag==1)
                     query=query+" AND MOSSA.TURNO="+tur;
             }
             query=query+" ORDER BY (ID_POSSEDIMENTO) ASC";
             
          
         pst = con.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);            
            rs = pst.executeQuery();
            ris2.setModel(DbUtils.resultSetToTableModel(rs));
            if(!(rs.first())){
                UIManager.put("OptionPane.background",new ColorUIResource(193,255,193));
                UIManager.put("Panel.background",new ColorUIResource(193,255,193));
                UIManager.put("OptionPane.messageFont", new Font("ITC Kabel Std", Font.BOLD, 14));
                UIManager.put("OptionPane.buttonFont", new Font("AppleMyungjo", Font.ITALIC, 12));
                JOptionPane.showMessageDialog(this, "Non ci sono risultati per questa ricerca!", "Errore", JOptionPane.ERROR_MESSAGE,new ImageIcon("oh.gif"));    
            }
        con.close();
        }catch(NumberFormatException | SQLException e){
        
        UIManager.put("OptionPane.background",new ColorUIResource(193,255,193));
                UIManager.put("Panel.background",new ColorUIResource(193,255,193));
                UIManager.put("OptionPane.messageFont", new Font("ITC Kabel Std", Font.BOLD, 14));
                UIManager.put("OptionPane.buttonFont", new Font("AppleMyungjo", Font.ITALIC, 12));
                JOptionPane.showMessageDialog(this, "Inserire campi!", "Errore", JOptionPane.ERROR_MESSAGE,new ImageIcon("oh.gif"));    
            
        }
    }//GEN-LAST:event_Cerca2ActionPerformed

    private void id6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id6ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ricerca_Possedimento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cerca2;
    private javax.swing.JButton clear6;
    private javax.swing.JComboBox<String> contr6;
    private javax.swing.JComboBox<String> id6;
    private javax.swing.JComboBox<String> idg6;
    private javax.swing.JComboBox<String> idm6;
    private javax.swing.JComboBox<String> idp6;
    private javax.swing.JButton indietro6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JComboBox<String> numc6;
    private javax.swing.JButton ricerca6;
    private javax.swing.JTable ris1;
    private javax.swing.JTable ris2;
    private javax.swing.JComboBox<String> tipop6;
    private javax.swing.JTextPane turno6;
    // End of variables declaration//GEN-END:variables
}
