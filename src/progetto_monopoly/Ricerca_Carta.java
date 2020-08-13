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

public class Ricerca_Carta extends javax.swing.JFrame {
    Connection con = null;
    PreparedStatement pst;
    ResultSet rs;
    String query,testo;
    int imp=0,tur=0;

   
    public Ricerca_Carta() {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        
        ris1.setDefaultEditor(Object.class, null);
        try{
            con = Database.getDefaultConnection();
            query ="SELECT ID_CARTA FROM CARTA ORDER BY (ID_CARTA) ASC";
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();
            
            id_c.removeAllItems();
            while(rs.next()){
                    id_c.addItem(""+rs.getInt(1));
                }
            id_c.setSelectedIndex(-1);
   
            con.close(); 
         } catch(SQLException e){ System.out.println(e);}
        
        try{
            con = Database.getDefaultConnection();
            query ="SELECT ID_PARTITA FROM PARTITA ORDER BY (ID_PARTITA) ASC";
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();
            
            id_p.removeAllItems();
            while(rs.next()){
                    id_p.addItem(""+rs.getInt(1));
                }
            id_p.setSelectedIndex(-1);
   
            con.close(); 
         } catch(SQLException e){ System.out.println(e);}
        
         try{
            con = Database.getDefaultConnection();
            query ="SELECT ID_MOSSA FROM MOSSA ORDER BY (ID_MOSSA) ASC";
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();
            
            id_m.removeAllItems();
            while(rs.next()){
                    id_m.addItem(""+rs.getInt(1));
                }
            id_m.setSelectedIndex(-1);
   
            con.close(); 
         } catch(SQLException e){ System.out.println(e);}
         
         try{
            con = Database.getDefaultConnection();
            query ="SELECT ID_GIOCATORE FROM GIOCATORE ORDER BY (ID_GIOCATORE) ASC";
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();
            
            id_g.removeAllItems();
            while(rs.next()){
                    id_g.addItem(""+rs.getInt(1));
                }
            id_g.setSelectedIndex(-1);
   
            con.close(); 
         } catch(SQLException e){ System.out.println(e);}
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        indietro1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tipo_carta = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        importo = new javax.swing.JTextPane();
        clear1 = new javax.swing.JButton();
        ricerca1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        id_c = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ris1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        id_p = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        id_m = new javax.swing.JComboBox<>();
        id_g = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        turno = new javax.swing.JTextPane();
        ricerca2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        ris2 = new javax.swing.JTable();
        op3 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 450));
        setSize(new java.awt.Dimension(800, 450));

        jPanel1.setBackground(new java.awt.Color(193, 255, 193));
        jPanel1.setMaximumSize(new java.awt.Dimension(800, 435));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 435));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 435));
        jPanel1.setSize(new java.awt.Dimension(800, 450));

        indietro1.setFont(new java.awt.Font("Kabel", 2, 12)); // NOI18N
        indietro1.setForeground(new java.awt.Color(153, 0, 0));
        indietro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progetto_monopoly/icone/back.png"))); // NOI18N
        indietro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indietro1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("ITC Kabel Std", 1, 13)); // NOI18N
        jLabel1.setText("Ricerca per caratteristica:");

        jLabel3.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel3.setText("Tipo Carta");

        tipo_carta.setEditable(true);
        tipo_carta.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        tipo_carta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IMPREVISTI", "PROBABILITÀ" }));
        tipo_carta.setSelectedIndex(-1);
        tipo_carta.setToolTipText("");
        tipo_carta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipo_cartaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel5.setText("Importo");

        importo.setBackground(new java.awt.Color(193, 255, 193));
        importo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        importo.setFont(new java.awt.Font("ITC Kabel Std", 0, 14)); // NOI18N
        jScrollPane2.setViewportView(importo);

        clear1.setFont(new java.awt.Font("Kabel", 2, 12)); // NOI18N
        clear1.setText("Clear");
        clear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear1ActionPerformed(evt);
            }
        });

        ricerca1.setFont(new java.awt.Font("Kabel", 2, 12)); // NOI18N
        ricerca1.setText("Cerca");
        ricerca1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ricerca1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel6.setText("ID Carta");

        id_c.setEditable(true);
        id_c.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        id_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_cActionPerformed(evt);
            }
        });

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
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel2.setText("ID_Partita");

        id_p.setEditable(true);
        id_p.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N

        jLabel4.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel4.setText("ID_Mossa");

        jLabel7.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel7.setText("ID_Giocatore");

        id_m.setEditable(true);
        id_m.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N

        id_g.setEditable(true);
        id_g.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N

        jLabel8.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel8.setText("Turno");

        turno.setBackground(new java.awt.Color(193, 255, 193));
        turno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        turno.setFont(new java.awt.Font("ITC Kabel Std", 0, 14)); // NOI18N
        jScrollPane4.setViewportView(turno);

        ricerca2.setFont(new java.awt.Font("Kabel", 2, 12)); // NOI18N
        ricerca2.setText("Cerca");
        ricerca2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ricerca2ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("ITC Kabel Std", 1, 13)); // NOI18N
        jLabel9.setText("e/o presenza nel gioco come carta pescata:");

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));

        ris2.setBackground(new java.awt.Color(193, 255, 193));
        ris2.setFont(new java.awt.Font("ITC Kabel Std", 1, 12)); // NOI18N
        ris2.setSelectionBackground(new java.awt.Color(204, 0, 0));
        jScrollPane5.setViewportView(ris2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                .addContainerGap())
        );

        op3.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        op3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "=", ">", "<", "<=", ">=", "<>" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel8)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(id_m, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(id_p, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(8, 8, 8)
                                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(id_g, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(id_c, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(tipo_carta, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(23, 23, 23))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(op3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(ricerca1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(14, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(indietro1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(clear1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ricerca2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(532, 532, 532))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(indietro1)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 43, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, 0)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tipo_carta, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(op3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(3, 3, 3)
                        .addComponent(ricerca1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addGap(0, 11, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(id_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(id_m, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(id_g, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ricerca2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clear1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void indietro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indietro1ActionPerformed
        this.dispose();
        Classe obj = new Classe();
        obj.setVisible(true);
    }//GEN-LAST:event_indietro1ActionPerformed

    private void tipo_cartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipo_cartaActionPerformed
        
    }//GEN-LAST:event_tipo_cartaActionPerformed

    private void clear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear1ActionPerformed
        id_c.setSelectedIndex(-1);
        id_p.setSelectedIndex(-1);
        id_g.setSelectedIndex(-1);
        id_m.setSelectedIndex(-1);
        turno.setText(null);
       importo.setText(null);
       tipo_carta.setSelectedIndex(-1);
         Dati_Tabella.clearTable(ris2);
           Dati_Tabella.clearTable(ris1);
           op3.setSelectedIndex(-1);
    }//GEN-LAST:event_clear1ActionPerformed

    private void ricerca1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ricerca1ActionPerformed
         Dati_Tabella.clearTable(ris1);
        try{
            con= Database.getDefaultConnection(); 
            try{
          imp=Integer.parseInt(importo.getText());
            } catch(NumberFormatException e){
                imp=0;
            }
            
            query="SELECT * FROM CARTA WHERE ";
            int flag=0;
           if(id_c.getSelectedIndex()!=-1){
               query=query+"CARTA.ID_CARTA="+id_c.getSelectedItem();
               flag=1;
           }
           
           if(tipo_carta.getSelectedIndex()!=-1){
               if(flag==0){
                    query=query+" CARTA.TIPO_CARTA LIKE '%"+tipo_carta.getSelectedItem()+"%'";
                    flag=1;
               } else if(flag==1){
                   query=query+" AND CARTA.TIPO_CARTA LIKE '%"+tipo_carta.getSelectedItem()+"%'";
               }
           }
           
           if(imp!=0){
                if(flag==0){
                    query=query+" CARTA.IMPORTO"+op3.getSelectedItem()+imp;
                } else if(flag==1)
                    query=query+" AND CARTA.IMPORTO"+op3.getSelectedItem()+imp;
            }
           
             query = query + " ORDER BY (ID_CARTA) ASC";
        
            pst = con.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);            
            rs = pst.executeQuery();
            ris1.setModel(DbUtils.resultSetToTableModel(rs));
            if(!(rs.first())){
                UIManager.put("OptionPane.background",new ColorUIResource(193,255,193));
                UIManager.put("Panel.background",new ColorUIResource(193,255,193));
                UIManager.put("OptionPane.messageFont", new Font("ITC Kabel Std", Font.BOLD, 14));
                UIManager.put("OptionPane.buttonFont", new Font("AppleMyungjo", Font.ITALIC, 12));
                JOptionPane.showMessageDialog(this, "Non ci sono risultati per questa ricerca!","", JOptionPane.INFORMATION_MESSAGE,new ImageIcon("oh.gif"));    
            }
        con.close();
        }catch(NumberFormatException | SQLException e){
        UIManager.put("OptionPane.background",new ColorUIResource(193,255,193));
                UIManager.put("Panel.background",new ColorUIResource(193,255,193));
                UIManager.put("OptionPane.messageFont", new Font("ITC Kabel Std", Font.BOLD, 14));
                UIManager.put("OptionPane.buttonFont", new Font("AppleMyungjo", Font.ITALIC, 12));
                JOptionPane.showMessageDialog(this, "Inserire campi!", "Errore", JOptionPane.ERROR_MESSAGE,new ImageIcon("oh.gif"));    
            
        }
        
        
    }//GEN-LAST:event_ricerca1ActionPerformed

    private void id_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_cActionPerformed
     
    }//GEN-LAST:event_id_cActionPerformed

    private void ricerca2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ricerca2ActionPerformed
        Dati_Tabella.clearTable(ris2);
        try{
            con= Database.getDefaultConnection(); 
            try{
          imp=Integer.parseInt(importo.getText());
            } catch(NumberFormatException e){
                imp=0;
            }
            
            
             try{
          tur=Integer.parseInt(turno.getText());
            } catch(NumberFormatException e){
                tur=0;
            }
            
            query="SELECT CARTA.ID_CARTA,CARTA.TIPO_CARTA,MOSSA.ID_PARTITA,MOSSA.ID_MOSSA,MOSSA.TURNO,MOSSA.ID_GIOCATORE FROM CARTA JOIN MOSSA ON CARTA.ID_CARTA=MOSSA.ID_CARTA WHERE ";
            
            
            int flag=0;
           if(id_c.getSelectedIndex()!=-1){
               query=query+"CARTA.ID_CARTA="+id_c.getSelectedItem();
               flag=1;
           }
           
           if(tipo_carta.getSelectedIndex()!=-1){
               if(flag==0){
                    query=query+" CARTA.TIPO_CARTA LIKE '%"+tipo_carta.getSelectedItem()+"%'";
                    flag=1;
               } else if(flag==1){
                   query=query+" AND CARTA.TIPO_CARTA LIKE '%"+tipo_carta.getSelectedItem()+"%'";
               }
           }
           
           if(imp!=0){
                if(flag==0){
                    query=query+" CARTA.IMPORTO"+op3.getSelectedItem()+imp;
                    flag=1;
                } else if(flag==1)
                    query=query+" AND CARTA.IMPORTO"+op3.getSelectedItem()+imp;
            }
           
           if(tur!=0){
                if(flag==0){
                    query=query+" MOSSA.TURNO="+tur;
                    flag=1;
                } else if(flag==1)
                    query=query+" AND MOSSA.TURNO="+tur;
            }
            
           if(id_p.getSelectedIndex()!=-1){
                if(flag==0){
                    query=query+" MOSSA.ID_PARTITA="+id_p.getSelectedItem();
                    flag=1;
                } else if(flag==1)
                    query=query+" AND MOSSA.ID_PARTITA="+id_p.getSelectedItem();
            }
           
           if(id_m.getSelectedIndex()!=-1){
                if(flag==0){
                    query=query+" MOSSA.ID_MOSSA="+id_m.getSelectedItem();
                    flag=1;
                } else if(flag==1)
                    query=query+" AND MOSSA.ID_MOSSA="+id_m.getSelectedItem();
            }
           
           if(id_g.getSelectedIndex()!=-1){
                if(flag==0){
                    query=query+" MOSSA.ID_GIOCATORE="+(String)id_g.getSelectedItem();
                    flag=1;
                } else if(flag==1)
                    query=query+" AND MOSSA.ID_GIOCATORE="+(String)id_g.getSelectedItem();
            }
           
             query = query + " ORDER BY (ID_CARTA) ASC";
        
            pst = con.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);            
            rs = pst.executeQuery();
            ris2.setModel(DbUtils.resultSetToTableModel(rs));
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
        
        
    }//GEN-LAST:event_ricerca2ActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ricerca_Carta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear1;
    private javax.swing.JComboBox<String> id_c;
    private javax.swing.JComboBox<String> id_g;
    private javax.swing.JComboBox<String> id_m;
    private javax.swing.JComboBox<String> id_p;
    private javax.swing.JTextPane importo;
    private javax.swing.JButton indietro1;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JComboBox<String> op3;
    private javax.swing.JButton ricerca1;
    private javax.swing.JButton ricerca2;
    private javax.swing.JTable ris1;
    private javax.swing.JTable ris2;
    private javax.swing.JComboBox<String> tipo_carta;
    private javax.swing.JTextPane turno;
    // End of variables declaration//GEN-END:variables
}
