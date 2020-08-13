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




public class Ricerca_Partita extends javax.swing.JFrame {
 Connection con = null;
    PreparedStatement pst;
    ResultSet rs;
    String query;
    int imp=0,tur=0,mos=0,pos=0;
    

    public Ricerca_Partita() {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
         
        ris1.setDefaultEditor(Object.class, null);
        ris2.setDefaultEditor(Object.class, null);

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
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        indietro2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        op = new javax.swing.JComboBox<>();
        pedina = new javax.swing.JComboBox<>();
        testo1 = new javax.swing.JLabel();
        num = new javax.swing.JComboBox<>();
        testo2 = new javax.swing.JLabel();
        cerca2 = new javax.swing.JButton();
        clear2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jscroll = new javax.swing.JScrollPane();
        conto = new javax.swing.JTextPane();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        id_p = new javax.swing.JComboBox<>();
        id_g = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        turni = new javax.swing.JTextPane();
        cerca1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ris1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        ris2 = new javax.swing.JTable();
        op1 = new javax.swing.JComboBox<>();
        op2 = new javax.swing.JComboBox<>();
        op3 = new javax.swing.JComboBox<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        mosse = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        op4 = new javax.swing.JComboBox<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        possedimenti = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(870, 500));
        setMinimumSize(new java.awt.Dimension(870, 500));
        setSize(new java.awt.Dimension(870, 500));

        jPanel1.setBackground(new java.awt.Color(193, 255, 193));
        jPanel1.setMaximumSize(new java.awt.Dimension(870, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(870, 500));
        jPanel1.setSize(new java.awt.Dimension(870, 500));

        indietro2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progetto_monopoly/icone/back.png"))); // NOI18N
        indietro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indietro2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("ITC Kabel Std", 1, 13)); // NOI18N
        jLabel1.setText("Ricerca per caratteristica: ");

        op.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        op.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<", "<=", "=", ">", ">=", "<>" }));
        op.setSelectedIndex(2);
        op.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opActionPerformed(evt);
            }
        });

        pedina.setEditable(true);
        pedina.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        pedina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BARCA", "AUTOMOBILE", "CAPPELLO", "SCARPONE", "FERRO DA STIRO", "CANE", "CARRIOLA", "DITALE" }));
        pedina.setSelectedIndex(-1);
        pedina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedinaActionPerformed(evt);
            }
        });

        testo1.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        testo1.setText("Conto");

        num.setEditable(true);
        num.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        num.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", "5", "6" }));
        num.setSelectedIndex(-1);

        testo2.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        testo2.setText("Pedina");
        testo2.setToolTipText("");

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
        jLabel6.setText("Mosse");

        conto.setBackground(new java.awt.Color(193, 255, 193));
        conto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        conto.setFont(new java.awt.Font("ITC Kabel Std", 0, 16)); // NOI18N
        conto.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jscroll.setViewportView(conto);

        jLabel7.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel7.setText("ID_Partita");

        jLabel4.setFont(new java.awt.Font("ITC Kabel Std", 1, 13)); // NOI18N
        jLabel4.setText("Giocatori");

        jLabel5.setFont(new java.awt.Font("ITC Kabel Std", 1, 13)); // NOI18N
        jLabel5.setText("Numero");

        jLabel8.setFont(new java.awt.Font("ITC Kabel Std", 1, 13)); // NOI18N
        jLabel8.setText("e/o numero di:");

        jLabel13.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel13.setText("Turni");

        jLabel14.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel14.setText("ID_Giocatore");

        id_p.setEditable(true);
        id_p.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N

        id_g.setEditable(true);
        id_g.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N

        turni.setBackground(new java.awt.Color(193, 255, 193));
        turni.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        turni.setFont(new java.awt.Font("ITC Kabel Std", 0, 16)); // NOI18N
        turni.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane4.setViewportView(turni);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jScrollPane5)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        op1.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        op1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<", "<=", "=", ">", ">=", "<>" }));
        op1.setSelectedIndex(2);
        op1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op1ActionPerformed(evt);
            }
        });

        op2.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        op2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<", "<=", "=", ">", ">=", "<>" }));
        op2.setSelectedIndex(2);
        op2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op2ActionPerformed(evt);
            }
        });

        op3.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        op3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<", "<=", "=", ">", ">=", "<>" }));
        op3.setSelectedIndex(2);
        op3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op3ActionPerformed(evt);
            }
        });

        mosse.setBackground(new java.awt.Color(193, 255, 193));
        mosse.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        mosse.setFont(new java.awt.Font("ITC Kabel Std", 0, 16)); // NOI18N
        mosse.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane6.setViewportView(mosse);

        jLabel2.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel2.setText("Possedimenti");

        op4.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        op4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<", "<=", "=", ">", ">=", "<>" }));
        op4.setSelectedIndex(2);
        op4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op4ActionPerformed(evt);
            }
        });

        possedimenti.setBackground(new java.awt.Color(193, 255, 193));
        possedimenti.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        possedimenti.setFont(new java.awt.Font("ITC Kabel Std", 0, 16)); // NOI18N
        possedimenti.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane7.setViewportView(possedimenti);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(testo2)
                                        .addComponent(testo1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(id_g, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(id_p, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(op, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(num, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(pedina, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(op1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jscroll, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(248, 248, 248)
                                    .addComponent(cerca1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(clear2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cerca2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel2))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(op2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(op3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(op4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane6)
                                    .addComponent(jScrollPane4)
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(indietro2))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(indietro2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(4, 4, 4)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(id_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(id_g, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(op, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(pedina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(testo2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(op1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(testo1))
                                    .addComponent(jscroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cerca1))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(op2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(op3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(op4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33)
                        .addComponent(cerca2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clear2))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void indietro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indietro2ActionPerformed
       this.dispose();
       Classe obj = new Classe();
       obj.setVisible(true);
    }//GEN-LAST:event_indietro2ActionPerformed

    private void opActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opActionPerformed

           
    }//GEN-LAST:event_opActionPerformed

    private void cerca2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerca2ActionPerformed
         Dati_Tabella.clearTable(ris2);
        try{
            con = Database.getDefaultConnection();
         
        try{
            imp=Integer.parseInt(conto.getText());
            }catch(NumberFormatException e) {
                imp=0;
            }
        
         try{
            tur=Integer.parseInt(turni.getText());
            }catch(NumberFormatException e) {
                tur=0;
            }
         
          try{
            mos=Integer.parseInt(mosse.getText());
            }catch(NumberFormatException e) {
                mos=0;
            }
          
          try{
            pos=Integer.parseInt(possedimenti.getText());
            }catch(NumberFormatException e) {
                pos=0;
            }
        
        query="SELECT PARTITA.ID_PARTITA,COUNT(DISTINCT MOSSA.ID_MOSSA) AS NUM_MOSSE,MAX(MOSSA.TURNO) AS NUM_TURNI, COUNT(DISTINCT POSSEDIMENTO.NOME) AS NUM_POSSEDIMENTI FROM (PARTITA JOIN PARTITA_GIOCATORE ON PARTITA_GIOCATORE.PARTITA=PARTITA.ID_PARTITA) JOIN (MOSSA JOIN POSSEDIMENTO ON MOSSA.ID_POSSEDIMENTO=POSSEDIMENTO.ID_POSSEDIMENTO) ON MOSSA.ID_PARTITA=PARTITA.ID_PARTITA ";
       
        int flag=0;
        if(id_p.getSelectedIndex()!=-1){
            query=query+" WHERE PARTITA.ID_PARTITA="+id_p.getSelectedItem()+" ";
            flag=1;
        }
        if(pedina.getSelectedIndex()!=-1){
            if(flag==0){
            query=query+" WHERE PARTITA_GIOCATORE.PEDINA LIKE '%"+pedina.getSelectedItem()+"%'";
            flag=1;
            } else if(flag==1)
                query=query+" AND PARTITA_GIOCATORE.PEDINA LIKE '%"+pedina.getSelectedItem()+"%'";
        }
        if(imp!=0){
                if(flag==0){
                    query=query+" WHERE PARTITA_GIOCATORE.CONTO"+op1.getSelectedItem()+imp;
                    flag=1;
                }else if(flag==1)
                    query=query+" AND PARTITA_GIOCATORE.CONTO"+op1.getSelectedItem()+imp; 
        }
        if(id_g.getSelectedIndex()!=-1){
                if(flag==0){
                    query=query+" WHERE PARTITA_GIOCATORE.GIOCATORE ='"+id_g.getSelectedItem()+"'";
                    flag=1;
                }else if(flag==1)
                    query=query+" AND PARTITA_GIOCATORE.GIOCATORE ='"+id_g.getSelectedItem()+"'";
            }
        if(num.getSelectedIndex()!=-1){
                if(flag==0){
                    query=query+" WHERE PARTITA.NUMGIOCATORI"+op.getSelectedItem()+num.getSelectedItem();
                    flag=1;
                }else if(flag==1)
                    query=query+" AND PARTITA.NUMGIOCATORI"+op.getSelectedItem()+num.getSelectedItem();
            }
        
        if(tur!=0){
              query=query+" GROUP BY (PARTITA.ID_PARTITA) HAVING (MAX(MOSSA.TURNO)"+op2.getSelectedItem()+tur+")";
              flag=2;
              }
        if(mos!=0){
                if(flag==0 | flag==1){
                    query=query+" GROUP BY (PARTITA.ID_PARTITA) HAVING (COUNT(DISTINCT MOSSA.ID_MOSSA)"+op3.getSelectedItem()+mos+")";
                    flag=2;
                }else if(flag==2)
                    query=query+" AND (COUNT(DISTINCT MOSSA.ID_MOSSA)"+op3.getSelectedItem()+mos+")"; 
        }
        
        if(pos!=0){
                if(flag==0 | flag==1){
                    query=query+" GROUP BY (PARTITA.ID_PARTITA) HAVING (COUNT(DISTINCT POSSEDIMENTO.NOME)"+op4.getSelectedItem()+pos+")";
                   
                }else if(flag==2)
                    query=query+" AND (COUNT(DISTINCT POSSEDIMENTO.NOME)"+op4.getSelectedItem()+pos+")"; 
        }
        
        
          query = query + " ORDER BY (PARTITA.ID_PARTITA) ASC";
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
        
    }//GEN-LAST:event_cerca2ActionPerformed

    private void pedinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedinaActionPerformed
        
    }//GEN-LAST:event_pedinaActionPerformed

    private void clear2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear2ActionPerformed
        conto.setText(null);
        turni.setText(null);
        mosse.setText(null);
        possedimenti.setText(null);
        pedina.setSelectedIndex(-1);
        id_p.setSelectedIndex(-1);
        id_g.setSelectedIndex(-1);
        num.setSelectedIndex(-1);
        
        
        op.setSelectedIndex(2);
        op1.setSelectedIndex(2);
        op2.setSelectedIndex(2);
        op3.setSelectedIndex(2);
        op4.setSelectedIndex(2);
        
        Dati_Tabella.clearTable(ris1);
          Dati_Tabella.clearTable(ris2);
    }//GEN-LAST:event_clear2ActionPerformed

    private void cerca1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerca1ActionPerformed
        Dati_Tabella.clearTable(ris1);
        try{
            con = Database.getDefaultConnection();
         
        try{
            imp=Integer.parseInt(conto.getText());
            }catch(NumberFormatException e) {
                imp=0;
            }
        
        query="SELECT PARTITA.ID_PARTITA,PARTITA.NUMGIOCATORI,PARTITA_GIOCATORE.GIOCATORE,PARTITA_GIOCATORE.PEDINA,PARTITA_GIOCATORE.CONTO FROM PARTITA JOIN PARTITA_GIOCATORE ON PARTITA_GIOCATORE.PARTITA=PARTITA.ID_PARTITA WHERE";
        
        int flag=0;
        if(id_p.getSelectedIndex()!=-1){
            query=query+" PARTITA.ID_PARTITA="+id_p.getSelectedItem()+" ";
            flag=1;
        }
        if(pedina.getSelectedIndex()!=-1){
            if(flag==0){
            query=query+" PARTITA_GIOCATORE.PEDINA LIKE '%"+pedina.getSelectedItem()+"%'";
            flag=1;
            } else if(flag==1)
                query=query+" AND PARTITA_GIOCATORE.PEDINA LIKE '%"+pedina.getSelectedItem()+"%'";
        }
        if(imp!=0){
                if(flag==0){
                    query=query+" PARTITA_GIOCATORE.CONTO"+op1.getSelectedItem()+imp;
                    flag=1;
                }else if(flag==1)
                    query=query+" AND PARTITA_GIOCATORE.CONTO"+op1.getSelectedItem()+imp; 
        }
        if(id_g.getSelectedIndex()!=-1){
                if(flag==0){
                    query=query+" PARTITA_GIOCATORE.GIOCATORE ='"+id_g.getSelectedItem()+"'";
                    flag=1;
                }else if(flag==1)
                    query=query+" AND PARTITA_GIOCATORE.GIOCATORE ='"+id_g.getSelectedItem()+"'";
            }
        if(num.getSelectedIndex()!=-1){
                if(flag==0){
                    query=query+" PARTITA.NUMGIOCATORI"+op.getSelectedItem()+num.getSelectedItem();
                    flag=1;
                }else if(flag==1)
                    query=query+" AND PARTITA.NUMGIOCATORI"+op.getSelectedItem()+num.getSelectedItem();
            }
        
           query = query + " ORDER BY (PARTITA.ID_PARTITA) ASC";
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
        
             
    }//GEN-LAST:event_cerca1ActionPerformed

    private void op1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_op1ActionPerformed

    private void op2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_op2ActionPerformed

    private void op3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_op3ActionPerformed

    private void op4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_op4ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ricerca_Partita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cerca1;
    private javax.swing.JButton cerca2;
    private javax.swing.JButton clear2;
    private javax.swing.JTextPane conto;
    private javax.swing.JComboBox<String> id_g;
    private javax.swing.JComboBox<String> id_p;
    private javax.swing.JButton indietro2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jscroll;
    private javax.swing.JTextPane mosse;
    private javax.swing.JComboBox<String> num;
    private javax.swing.JComboBox<String> op;
    private javax.swing.JComboBox<String> op1;
    private javax.swing.JComboBox<String> op2;
    private javax.swing.JComboBox<String> op3;
    private javax.swing.JComboBox<String> op4;
    private javax.swing.JComboBox<String> pedina;
    private javax.swing.JTextPane possedimenti;
    private javax.swing.JTable ris1;
    private javax.swing.JTable ris2;
    private javax.swing.JLabel testo1;
    private javax.swing.JLabel testo2;
    private javax.swing.JTextPane turni;
    // End of variables declaration//GEN-END:variables
}
