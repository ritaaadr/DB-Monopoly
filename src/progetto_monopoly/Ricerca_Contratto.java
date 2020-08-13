
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

public class Ricerca_Contratto extends javax.swing.JFrame {
    
    Connection con = null;
    PreparedStatement pst;
    ResultSet rs;
    String query;
    int p1, p2, p3, p4;
    int ped,rend2s, turno;
    
    public Ricerca_Contratto() {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
         
        ris1.setDefaultEditor(Object.class, null);
        ris2.setDefaultEditor(Object.class, null);
      
       try{
            con = Database.getDefaultConnection();
            query ="SELECT ID_CONTRATTO,ID_CASELLA FROM CONTRATTO ORDER BY (ID_CONTRATTO) ASC";
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();
            
            id_co.removeAllItems();
            id_ca.removeAllItems();
            while(rs.next()){
                    id_co.addItem(""+rs.getInt(1));
                     id_ca.addItem(""+rs.getInt(2));
                }
            id_co.setSelectedIndex(-1);
            id_ca.setSelectedIndex(-1);
   
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
   
         try{
            con = Database.getDefaultConnection();
            query ="SELECT ID_MOSSA FROM MOSSA WHERE ID_POSSEDIMENTO IS NOT NULL ORDER BY (ID_MOSSA) ASC";
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
            query ="SELECT ID_POSSEDIMENTO FROM POSSEDIMENTO ORDER BY (ID_POSSEDIMENTO) ASC";
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();
            
            id_po.removeAllItems();
            while(rs.next()){
                    id_po.addItem(""+rs.getInt(1));
                }
            id_po.setSelectedIndex(-1);
   
            con.close(); 
         } catch(SQLException e){ System.out.println(e);}
   
        
         
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        indietro3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        id_co = new javax.swing.JComboBox<>();
        tipo = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        prezzo1 = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        prezzo2 = new javax.swing.JTextPane();
        jScrollPane11 = new javax.swing.JScrollPane();
        prezzo3 = new javax.swing.JTextPane();
        op3 = new javax.swing.JComboBox<>();
        tipo_ne = new javax.swing.JComboBox<>();
        op4 = new javax.swing.JComboBox<>();
        jScrollPane13 = new javax.swing.JScrollPane();
        prezzo4 = new javax.swing.JTextPane();
        ricerca3 = new javax.swing.JButton();
        clear3 = new javax.swing.JButton();
        colore = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        id_p = new javax.swing.JComboBox<>();
        id_g = new javax.swing.JComboBox<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        turno3 = new javax.swing.JTextPane();
        cerca23 = new javax.swing.JButton();
        op5 = new javax.swing.JComboBox<>();
        op1 = new javax.swing.JComboBox<>();
        op2 = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        scelta1 = new javax.swing.JComboBox<>();
        scelta2 = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        id_ca = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ris1 = new javax.swing.JTable();
        id_m = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        id_po = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        t_po = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        ris2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1080, 610));
        setMinimumSize(new java.awt.Dimension(1080, 610));
        setPreferredSize(new java.awt.Dimension(1080, 610));
        setSize(new java.awt.Dimension(1080, 610));

        jPanel1.setBackground(new java.awt.Color(193, 255, 193));
        jPanel1.setMaximumSize(new java.awt.Dimension(1080, 610));
        jPanel1.setMinimumSize(new java.awt.Dimension(1080, 610));
        jPanel1.setPreferredSize(new java.awt.Dimension(1080, 610));
        jPanel1.setSize(new java.awt.Dimension(1080, 610));
        jPanel1.setLayout(null);

        indietro3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progetto_monopoly/icone/back.png"))); // NOI18N
        indietro3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indietro3ActionPerformed(evt);
            }
        });
        jPanel1.add(indietro3);
        indietro3.setBounds(43, 16, 81, 31);

        jLabel1.setFont(new java.awt.Font("ITC Kabel Std", 1, 14)); // NOI18N
        jLabel1.setText("Ricerca per caratteristica:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(25, 53, 159, 18);

        jLabel2.setFont(new java.awt.Font("ITC Kabel Std", 1, 14)); // NOI18N
        jLabel2.setText("ID_Contratto");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(25, 81, 81, 18);

        jLabel4.setFont(new java.awt.Font("ITC Kabel Std", 1, 14)); // NOI18N
        jLabel4.setText("Tipo");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(25, 110, 35, 18);

        jLabel5.setFont(new java.awt.Font("ITC Kabel Std", 1, 14)); // NOI18N
        jLabel5.setText("Prezzo");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(25, 146, 41, 18);

        jLabel7.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel7.setText("Colore");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(285, 114, 42, 19);

        jLabel12.setFont(new java.awt.Font("ITC Kabel Std", 1, 13)); // NOI18N
        jLabel12.setText("Tipo Non");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(291, 78, 54, 16);

        jLabel13.setFont(new java.awt.Font("ITC Kabel Std", 1, 13)); // NOI18N
        jLabel13.setText("Edificabile");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(291, 94, 60, 17);

        id_co.setEditable(true);
        id_co.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        jPanel1.add(id_co);
        id_co.setBounds(118, 77, 143, 27);

        tipo.setEditable(true);
        tipo.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EDIFICABILE", "NON EDIFICABILE" }));
        tipo.setSelectedIndex(-1);
        jPanel1.add(tipo);
        tipo.setBounds(118, 110, 141, 27);

        prezzo1.setBackground(new java.awt.Color(193, 255, 193));
        prezzo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        prezzo1.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        jScrollPane3.setViewportView(prezzo1);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(184, 143, 75, 23);

        prezzo2.setBackground(new java.awt.Color(193, 255, 193));
        prezzo2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        prezzo2.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        jScrollPane4.setViewportView(prezzo2);

        jPanel1.add(jScrollPane4);
        jScrollPane4.setBounds(435, 149, 75, 23);

        prezzo3.setBackground(new java.awt.Color(193, 255, 193));
        prezzo3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        prezzo3.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        jScrollPane11.setViewportView(prezzo3);

        jPanel1.add(jScrollPane11);
        jScrollPane11.setBounds(291, 189, 75, 23);

        op3.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        op3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "=", ">", "<", "<=", ">=", "<>" }));
        jPanel1.add(op3);
        op3.setBounds(215, 185, 70, 27);

        tipo_ne.setEditable(true);
        tipo_ne.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        tipo_ne.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FERROVIA", "SOCIETÀ" }));
        tipo_ne.setSelectedIndex(-1);
        jPanel1.add(tipo_ne);
        tipo_ne.setBounds(369, 78, 141, 27);

        op4.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        op4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "=", ">", "<", ">=", "<=", "><" }));
        jPanel1.add(op4);
        op4.setBounds(213, 219, 72, 27);

        prezzo4.setBackground(new java.awt.Color(193, 255, 193));
        prezzo4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        prezzo4.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        jScrollPane13.setViewportView(prezzo4);

        jPanel1.add(jScrollPane13);
        jScrollPane13.setBounds(291, 224, 76, 23);

        ricerca3.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        ricerca3.setText("Cerca");
        ricerca3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ricerca3ActionPerformed(evt);
            }
        });
        jPanel1.add(ricerca3);
        ricerca3.setBounds(365, 279, 81, 29);

        clear3.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        clear3.setText("Clear");
        clear3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear3ActionPerformed(evt);
            }
        });
        jPanel1.add(clear3);
        clear3.setBounds(370, 550, 81, 29);

        colore.setEditable(true);
        colore.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        colore.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FUCSIA", "CELESTE", "ARANCIONE", "MARRONE", "ROSSO", "GIALLO", "VERDE", "VIOLA" }));
        colore.setSelectedIndex(-1);
        jPanel1.add(colore);
        colore.setBounds(369, 111, 141, 27);

        jLabel20.setFont(new java.awt.Font("ITC Kabel Std", 1, 13)); // NOI18N
        jLabel20.setText("e/o presenza nel gioco come contratto di un possedimento:");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(25, 347, 349, 17);

        jLabel21.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel21.setText("ID_Partita");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(25, 378, 63, 19);

        jLabel22.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel22.setText("ID_Giocatore");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(25, 411, 87, 19);

        jLabel23.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel23.setText("Turno");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(266, 414, 38, 19);

        jLabel24.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel24.setText("ID_Mossa");
        jPanel1.add(jLabel24);
        jLabel24.setBounds(25, 477, 63, 19);

        id_p.setEditable(true);
        id_p.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        jPanel1.add(id_p);
        id_p.setBounds(151, 374, 81, 27);

        id_g.setEditable(true);
        id_g.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        jPanel1.add(id_g);
        id_g.setBounds(151, 407, 81, 27);

        turno3.setBackground(new java.awt.Color(193, 255, 193));
        turno3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        turno3.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        jScrollPane6.setViewportView(turno3);

        jPanel1.add(jScrollPane6);
        jScrollPane6.setBounds(405, 415, 94, 23);

        cerca23.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        cerca23.setText("Cerca");
        cerca23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerca23ActionPerformed(evt);
            }
        });
        jPanel1.add(cerca23);
        cerca23.setBounds(369, 519, 81, 29);

        op5.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        op5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "=", "<", ">", ">=", "<=", "><" }));
        jPanel1.add(op5);
        op5.setBounds(322, 411, 65, 27);

        op1.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        op1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "=", ">", "<", "<=", ">=", "<>" }));
        jPanel1.add(op1);
        op1.setBounds(118, 143, 60, 27);

        op2.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        op2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "=", ">", "<", "<=", ">=", "<>" }));
        jPanel1.add(op2);
        op2.setBounds(369, 149, 60, 27);

        jLabel25.setFont(new java.awt.Font("ITC Kabel Std", 1, 13)); // NOI18N
        jLabel25.setText("Valore");
        jPanel1.add(jLabel25);
        jLabel25.setBounds(285, 143, 36, 16);

        jLabel26.setFont(new java.awt.Font("ITC Kabel Std", 1, 13)); // NOI18N
        jLabel26.setText("Ipotecario");
        jLabel26.setToolTipText("");
        jPanel1.add(jLabel26);
        jLabel26.setBounds(285, 159, 60, 17);

        scelta1.setEditable(true);
        scelta1.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        scelta1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RENDITASEMPLICE", "RENDITA1CASA", "RENDITA2CASE", "RENDITA3CASE", "RENDITA4CASE", "RENDITAALBERGO", "PREZZOACQUISTOED", "RENDITA2STAZIONI", "RENDITA3STAZIONI", "RENDITA4STAZIONI", "RENDITA2SOCIETA", " ", " " }));
        scelta1.setSelectedIndex(-1);
        jPanel1.add(scelta1);
        scelta1.setBounds(29, 185, 180, 27);

        scelta2.setEditable(true);
        scelta2.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        scelta2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RENDITASEMPLICE", "RENDITA1CASA", "RENDITA2CASE", "RENDITA3CASE", "RENDITA4CASE", "RENDITAALBERGO", "PREZZOACQUISTOED", "RENDITA2STAZIONI", "RENDITA3STAZIONI", "RENDITA4STAZIONI", "RENDITA2SOCIETA", " ", " " }));
        scelta2.setSelectedIndex(-1);
        jPanel1.add(scelta2);
        scelta2.setBounds(29, 218, 180, 27);

        jLabel27.setFont(new java.awt.Font("ITC Kabel Std", 1, 13)); // NOI18N
        jLabel27.setText("Casella");
        jPanel1.add(jLabel27);
        jLabel27.setBounds(25, 258, 40, 16);

        jLabel28.setFont(new java.awt.Font("ITC Kabel Std", 1, 13)); // NOI18N
        jLabel28.setText("Associata");
        jLabel28.setToolTipText("");
        jPanel1.add(jLabel28);
        jLabel28.setBounds(25, 274, 57, 17);

        id_ca.setEditable(true);
        id_ca.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        jPanel1.add(id_ca);
        id_ca.setBounds(117, 258, 143, 27);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));

        ris1.setBackground(new java.awt.Color(193, 255, 193));
        ris1.setFont(new java.awt.Font("ITC Kabel Std", 1, 12)); // NOI18N
        ris1.setToolTipText("");
        ris1.setSelectionBackground(new java.awt.Color(204, 0, 0));
        jScrollPane1.setViewportView(ris1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(540, 40, 509, 265);

        id_m.setEditable(true);
        id_m.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        jPanel1.add(id_m);
        id_m.setBounds(151, 473, 81, 27);

        jLabel29.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel29.setText("ID_Possedimento");
        jPanel1.add(jLabel29);
        jLabel29.setBounds(25, 444, 114, 19);

        id_po.setEditable(true);
        id_po.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        jPanel1.add(id_po);
        id_po.setBounds(151, 440, 81, 27);

        jLabel30.setFont(new java.awt.Font("ITC Kabel Std", 1, 13)); // NOI18N
        jLabel30.setText("Tipo");
        jPanel1.add(jLabel30);
        jLabel30.setBounds(266, 370, 26, 16);

        jLabel31.setFont(new java.awt.Font("ITC Kabel Std", 1, 13)); // NOI18N
        jLabel31.setText("Possedimento");
        jLabel31.setToolTipText("");
        jPanel1.add(jLabel31);
        jLabel31.setBounds(266, 386, 81, 17);

        t_po.setEditable(true);
        t_po.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        t_po.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SEMPLICE", "CASA", "ALBERGO", "IPOTECA" }));
        t_po.setSelectedIndex(-1);
        jPanel1.add(t_po);
        t_po.setBounds(365, 378, 134, 27);

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
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(540, 350, 509, 201);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1085, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clear3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear3ActionPerformed
       id_co.setSelectedIndex(-1);
       tipo.setSelectedIndex(-1);
       prezzo1.setText(null);
       prezzo2.setText(null);
       prezzo4.setText(null);
       prezzo3.setText(null);
       tipo_ne.setSelectedIndex(-1);
       id_ca.setSelectedIndex(-1);
       colore.setSelectedIndex(-1);
       
       op1.setSelectedIndex(0);
       op2.setSelectedIndex(0);
       op3.setSelectedIndex(0);
       op4.setSelectedIndex(0);
       op5.setSelectedIndex(0);
       
       t_po.setSelectedIndex(-1);
       id_po.setSelectedIndex(-1);
       turno3.setText(null);
       id_p.setSelectedIndex(-1);
       id_g.setSelectedIndex(-1);
       
       Dati_Tabella.clearTable(ris1);
          Dati_Tabella.clearTable(ris2);
       
    }//GEN-LAST:event_clear3ActionPerformed

    private void indietro3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indietro3ActionPerformed
     this.dispose();
       Classe obj = new Classe();
       obj.setVisible(true);
    }//GEN-LAST:event_indietro3ActionPerformed

    private void ricerca3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ricerca3ActionPerformed
           Dati_Tabella.clearTable(ris1);
        
        try{
            con = Database.getDefaultConnection();
        try{ 
        p1=Integer.parseInt(prezzo1.getText());   
        }catch(NumberFormatException e) {
                p1=0;
            }
        try{ 
        p2=Integer.parseInt(prezzo2.getText());   
        }catch(NumberFormatException e) {
                p2=0;
            }
        try{ 
        p3=Integer.parseInt(prezzo3.getText());   
        }catch(NumberFormatException e) {
                p3=0;
            }
        
        try{ 
        p4=Integer.parseInt(prezzo4.getText());   
        }catch(NumberFormatException e) {
                p4=0;
            }
        
        query=" SELECT CONTRATTO.NOME,CONTRATTO.TIPO_CONTRATTO,CONTRATTO.TIPO_NONED,CONTRATTO.COLORE,CASELLA.NOME AS CASELLA FROM CONTRATTO JOIN CASELLA ON CONTRATTO.ID_CASELLA=CASELLA.ID_CASELLA WHERE";
        int flag=0;
        if(id_co.getSelectedIndex()!=-1){
            query=query+" CONTRATTO.ID_CONTRATTO="+id_co.getSelectedItem()+" ";
            flag=1;
        }
            
        if(tipo.getSelectedIndex()!=-1){
            if(flag==0){
                query=query+" CONTRATTO.TIPO_CONTRATTO='"+tipo.getSelectedItem()+"'";
                flag=1;
            }else if(flag==1)
                query=query+" AND CONTRATTO.TIPO_CONTRATTO='"+tipo.getSelectedItem()+"'";
        }
        if(p1!=0){
            if(flag==0){
                query=query+" CONTRATTO.PREZZO"+op1.getSelectedItem()+p1;
                flag=1;
            }else if(flag==1)
                query=query+" AND CONTRATTO.PREZZO"+op1.getSelectedItem()+p1;
            
        }
        if(p2!=0){
            if(flag==0){
                query=query+" CONTRATTO.VALIPOTECARIO"+op2.getSelectedItem()+p2;
                flag=1;
            }else if(flag==1)
                query=query+" AND CONTRATTO.VALIPOTECARIO"+op2.getSelectedItem()+p2;
            
        }
        if(colore.getSelectedIndex()!=-1){
            if(flag==0){
                query=query+" CONTRATTO.COLORE='"+colore.getSelectedItem()+"'";
                flag=1;
            }else if(flag==1)
                query=query+" AND CONTRATTO.COLORE='"+colore.getSelectedItem()+"'";
        }
           
               if(tipo_ne.getSelectedIndex()!=-1){
                   if(flag==0){
                       query=query+" CONTRATTO.TIPO_NONED LIKE '%"+tipo_ne.getSelectedItem()+"%'";
                       flag=1;
                   }else if(flag==1)
                       query=query+" AND CONTRATTO.TIPO_NONED LIKE '%"+tipo_ne.getSelectedItem()+"%'";
               }
               
           if(scelta1.getSelectedIndex()!=-1){
            if(flag==0){
                query=query+" CONTRATTO."+scelta1.getSelectedItem()+op3.getSelectedItem()+p3;
                flag=1;
            }else if(flag==1)
                query=query+" AND CONTRATTO."+scelta1.getSelectedItem()+op3.getSelectedItem()+p3;
        }
           
           if(scelta2.getSelectedIndex()!=-1){
            if(flag==0){
                query=query+" CONTRATTO."+scelta2.getSelectedItem()+op4.getSelectedItem()+p4;
                flag=1;
            }else if(flag==1)
                query=query+" AND CONTRATTO."+scelta2.getSelectedItem()+op4.getSelectedItem()+p4;
        }
               
           
           if(id_ca.getSelectedIndex()!=-1){
                if(flag==0){
                query=query+" CONTRATTO.ID_CASELLA="+id_ca.getSelectedItem();
                flag=1;
            }else if(flag==1)
                query=query+" AND CONTRATTO.ID_CASELLA="+id_ca.getSelectedItem();
            
           }
           
            query = query + " ORDER BY (ID_CONTRATTO) ASC";
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
        }catch(SQLException e){ 
                UIManager.put("OptionPane.background",new ColorUIResource(193,255,193));
                UIManager.put("Panel.background",new ColorUIResource(193,255,193));
                UIManager.put("OptionPane.messageFont", new Font("ITC Kabel Std", Font.BOLD, 14));
                UIManager.put("OptionPane.buttonFont", new Font("AppleMyungjo", Font.ITALIC, 12));
                JOptionPane.showMessageDialog(this, "Inserire campi!", "Errore", JOptionPane.ERROR_MESSAGE,new ImageIcon("oh.gif"));    
            
        } 
    }//GEN-LAST:event_ricerca3ActionPerformed

    private void cerca23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerca23ActionPerformed
        Dati_Tabella.clearTable(ris2);
        try{
            con = Database.getDefaultConnection();
            try{
            turno=Integer.parseInt(turno3.getText());
            }catch(NumberFormatException e) {
                turno=0;
            }
            
        try{ 
        p1=Integer.parseInt(prezzo1.getText());   
        }catch(NumberFormatException e) {
                p1=0;
            }
        try{ 
        p2=Integer.parseInt(prezzo2.getText());   
        }catch(NumberFormatException e) {
                p2=0;
            }
        try{ 
        p3=Integer.parseInt(prezzo3.getText());   
        }catch(NumberFormatException e) {
                p3=0;
            }
        
        try{ 
        p4=Integer.parseInt(prezzo4.getText());   
        }catch(NumberFormatException e) {
                p4=0;
            }
         
         query="SELECT MOSSA.ID_PARTITA,MOSSA.TURNO,POSSEDIMENTO.NOME AS POSSEDIMENTO,POSSEDIMENTO.TIPO_POSSEDIMENTO,POSSEDIMENTO.NUM_CASA,POSSEDIMENTO.ID_GIOCATORE FROM (POSSEDIMENTO JOIN (CONTRATTO JOIN CASELLA ON CONTRATTO.ID_CASELLA=CASELLA.ID_CASELLA) ON POSSEDIMENTO.ID_CONTRATTO=CONTRATTO.ID_CONTRATTO) JOIN MOSSA ON POSSEDIMENTO.ID_POSSEDIMENTO=MOSSA.ID_POSSEDIMENTO WHERE";
          
          
          int flag=0;
          if(id_co.getSelectedIndex()!=-1){
            query=query+" CONTRATTO.ID_CONTRATTO="+id_co.getSelectedItem();
            flag=1;
        }
            
        if(tipo.getSelectedIndex()!=-1){
            if(flag==0){
                query=query+" CONTRATTO.TIPO_CONTRATTO='"+tipo.getSelectedItem();
                flag=1;
            }else if(flag==1)
                query=query+" AND CONTRATTO.TIPO_CONTRATTO='"+tipo.getSelectedItem();
        }
        if(p1!=0){
            if(flag==0){
                query=query+" CONTRATTO.PREZZO"+op1.getSelectedItem()+p1;
                flag=1;
            }else if(flag==1)
                query=query+" AND CONTRATTO.PREZZO"+op1.getSelectedItem()+p1;
            
        }
        if(p2!=0){
            if(flag==0){
                query=query+" CONTRATTO.VALIPOTECARIO"+op2.getSelectedItem()+p2;
                flag=1;
            }else if(flag==1)
                query=query+" AND CONTRATTO.VALIPOTECARIO"+op2.getSelectedItem()+p2;
            
        }
        if(colore.getSelectedIndex()!=-1){
            if(flag==0){
                query=query+" CONTRATTO.COLORE='"+colore.getSelectedItem();
                flag=1;
            }else if(flag==1)
                query=query+" AND CONTRATTO.COLORE='"+colore.getSelectedItem();
        }
           
               if(tipo_ne.getSelectedIndex()!=-1){
                   if(flag==0){
                       query=query+" CONTRATTO.TIPO_NONED LIKE '%"+tipo_ne.getSelectedItem()+"%'";
                       flag=1;
                   }else if(flag==1)
                       query=query+" AND CONTRATTO.TIPO_NONED LIKE '%"+tipo_ne.getSelectedItem()+"%'";
               }
               
               if(t_po.getSelectedIndex()!=-1){
                   if(flag==0){
                       query=query+" POSSEDIMENTO.TIPO_POSSEDIMENTO LIKE '%"+t_po.getSelectedItem()+"%'";
                       flag=1;
                   }else if(flag==1)
                       query=query+" AND POSSEDIMENTO.TIPO_POSSEDIMENTO LIKE '%"+t_po.getSelectedItem()+"%'";
               }
               
           if(scelta1.getSelectedIndex()!=-1){
            if(flag==0){
                query=query+" CONTRATTO."+scelta1.getSelectedItem()+op3.getSelectedItem()+p3;
                flag=1;
            }else if(flag==1)
                query=query+" AND CONTRATTO."+scelta1.getSelectedItem()+op3.getSelectedItem()+p3;
        }
           
           if(scelta2.getSelectedIndex()!=-1){
            if(flag==0){
                query=query+" CONTRATTO."+scelta2.getSelectedItem()+op4.getSelectedItem()+p4;
                flag=1;
            }else if(flag==1)
                query=query+" AND CONTRATTO."+scelta2.getSelectedItem()+op4.getSelectedItem()+p4;
        }
               
           
           if(id_ca.getSelectedIndex()!=-1){
                if(flag==0){
                query=query+" CONTRATTO.ID_CASELLA="+id_ca.getSelectedItem();
                flag=1;
            }else if(flag==1)
                query=query+" AND CONTRATTO.ID_CASELLA="+id_ca.getSelectedItem();
            
           }
          
          if(id_p.getSelectedIndex()!=-1){
              if(flag==0){
                  query=query+" MOSSA.ID_PARTITA="+id_p.getSelectedItem();
                  flag=1;
              }else if(flag==1)
                  query=query+" AND MOSSA.ID_PARTITA="+id_p.getSelectedItem();
          }
          
          if(id_po.getSelectedIndex()!=-1){
              if(flag==0){
                  query=query+" POSSEDIMENTO.ID_POSSEDIMENTO="+id_po.getSelectedItem();
                  flag=1;
              }else if(flag==1)
                  query=query+" AND POSSEDIMENTO.ID_POSSEDIMENTO="+id_po.getSelectedItem();
          }
          
          if(id_g.getSelectedIndex()!=-1){
              if(flag==0){
                  query=query+" POSSEDIMENTO.ID_GIOCATORE="+id_g.getSelectedItem();
                  flag=1;
              }else if(flag==1)
                  query=query+" AND POSSEDIMENTO.ID_GIOCATORE="+id_g.getSelectedItem();
          }
          if(turno!=0){
              if(flag==0){
                  query=query+" MOSSA.TURNO"+op5.getSelectedItem()+turno;
                  flag=1;
              }else if(flag==1)
               query=query+" AND MOSSA.TURNO"+op5.getSelectedItem()+turno;
          }
          if(id_m.getSelectedIndex()!=-1){
              if(flag==0){
                  query=query+" MOSSA.ID_MOSSA="+id_m.getSelectedItem();
              }else if(flag==1)
                  query=query+" AND MOSSA.ID_MOSSA="+id_m.getSelectedItem();
          }
          
          query=query+" ORDER BY (MOSSA.ID_PARTITA) ASC";
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
        }catch(SQLException e){ 
            System.out.println(e);
                UIManager.put("OptionPane.background",new ColorUIResource(193,255,193));
                UIManager.put("Panel.background",new ColorUIResource(193,255,193));
                UIManager.put("OptionPane.messageFont", new Font("ITC Kabel Std", Font.BOLD, 14));
                UIManager.put("OptionPane.buttonFont", new Font("AppleMyungjo", Font.ITALIC, 12));
                JOptionPane.showMessageDialog(this, "Inserire campi!", "Errore", JOptionPane.ERROR_MESSAGE,new ImageIcon("oh.gif"));    
            
        }
    }//GEN-LAST:event_cerca23ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ricerca_Contratto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cerca23;
    private javax.swing.JButton clear3;
    private javax.swing.JComboBox<String> colore;
    private javax.swing.JComboBox<String> id_ca;
    private javax.swing.JComboBox<String> id_co;
    private javax.swing.JComboBox<String> id_g;
    private javax.swing.JComboBox<String> id_m;
    private javax.swing.JComboBox<String> id_p;
    private javax.swing.JComboBox<String> id_po;
    private javax.swing.JButton indietro3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JComboBox<String> op1;
    private javax.swing.JComboBox<String> op2;
    private javax.swing.JComboBox<String> op3;
    private javax.swing.JComboBox<String> op4;
    private javax.swing.JComboBox<String> op5;
    private javax.swing.JTextPane prezzo1;
    private javax.swing.JTextPane prezzo2;
    private javax.swing.JTextPane prezzo3;
    private javax.swing.JTextPane prezzo4;
    private javax.swing.JButton ricerca3;
    private javax.swing.JTable ris1;
    private javax.swing.JTable ris2;
    private javax.swing.JComboBox<String> scelta1;
    private javax.swing.JComboBox<String> scelta2;
    private javax.swing.JComboBox<String> t_po;
    private javax.swing.JComboBox<String> tipo;
    private javax.swing.JComboBox<String> tipo_ne;
    private javax.swing.JTextPane turno3;
    // End of variables declaration//GEN-END:variables
}
