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




public class Ricerca_Casella extends javax.swing.JFrame {
 Connection con = null;
    PreparedStatement pst;
    ResultSet rs;
    String query;
    int pos, prezzo,tur;
    

    public Ricerca_Casella() {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
         
        ris1.setDefaultEditor(Object.class, null);
        ris2.setDefaultEditor(Object.class, null);
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
        indietro2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tipo_casella = new javax.swing.JComboBox<>();
        tipo_nonEd = new javax.swing.JComboBox<>();
        testo1 = new javax.swing.JLabel();
        tipo_colore = new javax.swing.JComboBox<>();
        testo2 = new javax.swing.JLabel();
        pImporto = new javax.swing.JScrollPane();
        importo2 = new javax.swing.JTextPane();
        cerca2 = new javax.swing.JButton();
        clear2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        posizione2 = new javax.swing.JTextPane();
        jLabel7 = new javax.swing.JLabel();
        id_cas = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        id_p = new javax.swing.JComboBox<>();
        id_m = new javax.swing.JComboBox<>();
        id_g = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        turno = new javax.swing.JTextPane();
        cerca1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ris1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        ris2 = new javax.swing.JTable();
        op3 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(700, 500));
        setMinimumSize(new java.awt.Dimension(700, 500));
        setSize(new java.awt.Dimension(700, 500));

        jPanel1.setBackground(new java.awt.Color(193, 255, 193));
        jPanel1.setSize(new java.awt.Dimension(700, 500));

        indietro2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progetto_monopoly/icone/back.png"))); // NOI18N
        indietro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indietro2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("ITC Kabel Std", 1, 13)); // NOI18N
        jLabel1.setText("Ricerca per caratteristica: ");

        jLabel3.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel3.setText("Tipo Casella");

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
        importo2.setFont(new java.awt.Font("ITC Kabel Std", 0, 18)); // NOI18N
        pImporto.setViewportView(importo2);

        cerca2.setFont(new java.awt.Font("Kabel", 2, 12)); // NOI18N
        cerca2.setText("Cerca");
        cerca2.setToolTipText("");
        cerca2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerca2ActionPerformed(evt);
            }
        });

        clear2.setFont(new java.awt.Font("Kabel", 2, 12)); // NOI18N
        clear2.setText("Clear");
        clear2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel6.setText("Posizione");

        posizione2.setBackground(new java.awt.Color(193, 255, 193));
        posizione2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        posizione2.setFont(new java.awt.Font("ITC Kabel Std", 0, 16)); // NOI18N
        posizione2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(posizione2);

        jLabel7.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel7.setText("ID_Casella");

        id_cas.setEditable(true);
        id_cas.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N

        jLabel4.setFont(new java.awt.Font("ITC Kabel Std", 1, 13)); // NOI18N
        jLabel4.setText("Non Edificabile");

        jLabel5.setFont(new java.awt.Font("ITC Kabel Std", 1, 13)); // NOI18N
        jLabel5.setText("Tipo");

        jLabel8.setFont(new java.awt.Font("ITC Kabel Std", 1, 13)); // NOI18N
        jLabel8.setText("e/o presenza nel gioco come casella del tabellone:");

        jLabel11.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel11.setText("ID_Partita");

        jLabel12.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel12.setText("ID_Mossa");

        jLabel13.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel13.setText("Turno");

        jLabel14.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel14.setText("ID_Giocatore");

        id_p.setEditable(true);
        id_p.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N

        id_m.setEditable(true);
        id_m.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N

        id_g.setEditable(true);
        id_g.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N

        turno.setBackground(new java.awt.Color(193, 255, 193));
        turno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        turno.setFont(new java.awt.Font("ITC Kabel Std", 0, 16)); // NOI18N
        turno.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane4.setViewportView(turno);

        cerca1.setFont(new java.awt.Font("Kabel", 2, 12)); // NOI18N
        cerca1.setText("Cerca");
        cerca1.setToolTipText("");
        cerca1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerca1ActionPerformed(evt);
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
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                .addContainerGap())
        );

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
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        op3.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        op3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "=", ">", "<", "<=", ">=", "<>" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(indietro2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(22, 22, 22)
                                .addComponent(tipo_casella, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(id_cas, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(100, 100, 100)
                                        .addComponent(tipo_nonEd, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cerca1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(testo2)
                                    .addComponent(testo1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tipo_colore, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(op3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pImporto, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(107, 107, 107)))
                        .addGap(12, 12, 12)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(clear2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(id_g, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cerca2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(id_p, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(id_m, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(15, 15, 15)
                                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 29, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(indietro2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id_cas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipo_casella, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(testo2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pImporto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(op3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(testo1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipo_colore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipo_nonEd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(id_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(id_m, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id_g, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cerca1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(cerca2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clear2)
                .addGap(19, 19, 19))
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

    private void cerca2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerca2ActionPerformed
         Dati_Tabella.clearTable(ris2);
        try{
            con = Database.getDefaultConnection();
         
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
        
        try{
          tur=Integer.parseInt(turno.getText());
            } catch(NumberFormatException e){
                tur=0;
            }
        
        query="SELECT MOSSA.CASELLA_PARTENZA,MOSSA.CASELLA_ARRIVO,CASELLA.NOME,MOSSA.ID_PARTITA,MOSSA.ID_MOSSA,MOSSA.TURNO,MOSSA.ID_GIOCATORE FROM CASELLA,MOSSA WHERE (MOSSA.CASELLA_ARRIVO=CASELLA.ID_CASELLA OR MOSSA.CASELLA_PARTENZA=CASELLA.ID_CASELLA) AND";
        
        int flag=0;
        if(id_cas.getSelectedIndex()!=-1){
            query=query+" CASELLA.ID_CASELLA="+id_cas.getSelectedItem()+" ";
            flag=1;
        }
        if(tipo_casella.getSelectedIndex()!=-1){
            if(flag==0){
            query=query+" CASELLA.TIPO_CASELLA LIKE '%"+tipo_casella.getSelectedItem()+"%'";
            flag=1;
            } else if(flag==1)
                query=query+" AND CASELLA.TIPO_CASELLA LIKE '%"+tipo_casella.getSelectedItem()+"%'";
        }
        if(pos!=0){
                if(flag==0){
                    query=query+" CASELLA.POSIZIONE = "+pos;
                    flag=1;
                }else if(flag==1)
                    query=query+" AND CASELLA.POSIZIONE ="+pos; 
        }
        if(prezzo!=0){
                if(flag==0){
                    query=query+" CASELLA.PREZZO"+op3.getSelectedItem()+prezzo;
                    flag=1;
                }else if(flag==1)
                    query=query+" AND CASELLA.PREZZO"+op3.getSelectedItem()+prezzo;
            }    
        if(tipo_nonEd.getSelectedIndex()!=-1){
                if(flag==0){
                    query=query+" CASELLA.TIPO_NONED ='"+tipo_nonEd.getSelectedItem()+"'";
                    flag=1;
                }else if(flag==1)
                    query=query+" AND CASELLA.TIPO_NONED ='"+tipo_nonEd.getSelectedItem()+"'";
            }
        if(tipo_colore.getSelectedIndex()!=-1){
                if(flag==0){
                    query=query+" CASELLA.COLORE ='"+tipo_colore.getSelectedItem()+"'";
                    flag=1;
                }else if(flag==1)
                    query=query+" AND CASELLA.COLORE ='"+tipo_colore.getSelectedItem()+"'";
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
                    query=query+" MOSSA.ID_GIOCATORE="+id_g.getSelectedItem();
                    flag=1;
                } else if(flag==1)
                    query=query+" AND MOSSA.ID_GIOCATORE="+id_g.getSelectedItem();
            }
             
           query = query + " ORDER BY (MOSSA.ID_MOSSA) ASC";
        
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
            UIManager.put("OptionPane.background",new ColorUIResource(193,255,193));
                UIManager.put("Panel.background",new ColorUIResource(193,255,193));
                UIManager.put("OptionPane.messageFont", new Font("ITC Kabel Std", Font.BOLD, 14));
                UIManager.put("OptionPane.buttonFont", new Font("AppleMyungjo", Font.ITALIC, 12));
                JOptionPane.showMessageDialog(this, "Inserire campi!", "Errore", JOptionPane.ERROR_MESSAGE,new ImageIcon("oh.gif"));    
            
        }
       
    }//GEN-LAST:event_cerca2ActionPerformed

    private void tipo_nonEdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipo_nonEdActionPerformed
        
    }//GEN-LAST:event_tipo_nonEdActionPerformed

    private void clear2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear2ActionPerformed
        id_cas.setSelectedIndex(-1);
        tipo_casella.setSelectedIndex(-1);
        posizione2.setText(null);
        importo2.setText(null);
        tipo_nonEd.setSelectedIndex(-1);
        tipo_colore.setSelectedIndex(-1);
        op3.setSelectedIndex(-1);
        id_p.setSelectedIndex(-1);
        id_m.setSelectedIndex(-1);
        id_g.setSelectedIndex(-1);
        turno.setText(null);
         Dati_Tabella.clearTable(ris1);
          Dati_Tabella.clearTable(ris2);
    }//GEN-LAST:event_clear2ActionPerformed

    private void cerca1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerca1ActionPerformed
       Dati_Tabella.clearTable(ris1);
        try{
            con = Database.getDefaultConnection();
         
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
        
        try{
          tur=Integer.parseInt(turno.getText());
            } catch(NumberFormatException e){
                tur=0;
            }
        
        query="SELECT * FROM CASELLA WHERE";
        
        int flag=0;
        if(id_cas.getSelectedIndex()!=-1){
            query=query+" CASELLA.ID_CASELLA="+id_cas.getSelectedItem()+" ";
            flag=1;
        }
        if(tipo_casella.getSelectedIndex()!=-1){
            if(flag==0){
            query=query+" CASELLA.TIPO_CASELLA LIKE '%"+tipo_casella.getSelectedItem()+"%'";
            flag=1;
            } else if(flag==1)
                query=query+" AND CASELLA.TIPO_CASELLA LIKE '%"+tipo_casella.getSelectedItem()+"%'";
        }
        if(pos!=0){
                if(flag==0){
                    query=query+" CASELLA.POSIZIONE = "+pos;
                    flag=1;
                }else if(flag==1)
                    query=query+" AND CASELLA.POSIZIONE ="+pos; 
        }
        if(prezzo!=0){
                if(flag==0){
                    query=query+" CASELLA.PREZZO"+op3.getSelectedItem()+prezzo;
                    flag=1;
                }else if(flag==1)
                    query=query+" AND CASELLA.PREZZO"+op3.getSelectedItem()+prezzo;
            }    
        if(tipo_nonEd.getSelectedIndex()!=-1){
                if(flag==0){
                    query=query+" CASELLA.TIPO_NONED ='"+tipo_nonEd.getSelectedItem()+"'";
                    flag=1;
                }else if(flag==1)
                    query=query+" AND CASELLA.TIPO_NONED ='"+tipo_nonEd.getSelectedItem()+"'";
            }
        if(tipo_colore.getSelectedIndex()!=-1){
                if(flag==0){
                    query=query+" CASELLA.COLORE ='"+tipo_colore.getSelectedItem()+"'";
                    flag=1;
                }else if(flag==1)
                    query=query+" AND CASELLA.COLORE ='"+tipo_colore.getSelectedItem()+"'";
            }
        
           query = query + " ORDER BY (ID_CASELLA) ASC";
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
            System.out.println(e); 
        UIManager.put("OptionPane.background",new ColorUIResource(193,255,193));
                UIManager.put("Panel.background",new ColorUIResource(193,255,193));
                UIManager.put("OptionPane.messageFont", new Font("ITC Kabel Std", Font.BOLD, 14));
                UIManager.put("OptionPane.buttonFont", new Font("AppleMyungjo", Font.ITALIC, 12));
                JOptionPane.showMessageDialog(this, "Inserire campi!", "Errore", JOptionPane.ERROR_MESSAGE,new ImageIcon("oh.gif"));    
            
        }
    }//GEN-LAST:event_cerca1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ricerca_Casella().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cerca1;
    private javax.swing.JButton cerca2;
    private javax.swing.JButton clear2;
    private javax.swing.JComboBox<String> id_cas;
    private javax.swing.JComboBox<String> id_g;
    private javax.swing.JComboBox<String> id_m;
    private javax.swing.JComboBox<String> id_p;
    private javax.swing.JTextPane importo2;
    private javax.swing.JButton indietro2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JComboBox<String> op3;
    private javax.swing.JScrollPane pImporto;
    private javax.swing.JTextPane posizione2;
    private javax.swing.JTable ris1;
    private javax.swing.JTable ris2;
    private javax.swing.JLabel testo1;
    private javax.swing.JLabel testo2;
    private javax.swing.JComboBox<String> tipo_casella;
    private javax.swing.JComboBox<String> tipo_colore;
    private javax.swing.JComboBox<String> tipo_nonEd;
    private javax.swing.JTextPane turno;
    // End of variables declaration//GEN-END:variables
}
