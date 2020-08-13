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




public class Ricerca_Giocatore extends javax.swing.JFrame {
 Connection con = null;
    PreparedStatement pst;
    ResultSet rs;
    String query;
    int imp=0,np=0,mos=0,pos=0;
    

    public Ricerca_Giocatore() {
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
            query ="SELECT ID_GIOCATORE,NOME FROM GIOCATORE ORDER BY (ID_GIOCATORE) ASC";
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();
            
            nome.removeAllItems();
            id_g.removeAllItems();
             id_g1.removeAllItems();
            while(rs.next()){
                    id_g.addItem(""+rs.getInt(1));
                    id_g1.addItem(""+rs.getInt(1));
                    nome.addItem(rs.getString(2));
                }
            id_g.setSelectedIndex(-1);
             id_g1.setSelectedIndex(-1);
            nome.setSelectedIndex(-1);
   
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
        nome = new javax.swing.JComboBox<>();
        testo2 = new javax.swing.JLabel();
        cerca2 = new javax.swing.JButton();
        clear2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jscroll = new javax.swing.JScrollPane();
        conto = new javax.swing.JTextPane();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        id_p = new javax.swing.JComboBox<>();
        id_g = new javax.swing.JComboBox<>();
        cerca1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ris1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        ris2 = new javax.swing.JTable();
        op1 = new javax.swing.JComboBox<>();
        op3 = new javax.swing.JComboBox<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        mosse = new javax.swing.JTextPane();
        jscroll1 = new javax.swing.JScrollPane();
        num = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jl = new javax.swing.JLabel();
        op4 = new javax.swing.JComboBox<>();
        jscroll3 = new javax.swing.JScrollPane();
        possedimenti = new javax.swing.JTextPane();
        jLabel15 = new javax.swing.JLabel();
        id_g1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(870, 510));
        setMinimumSize(new java.awt.Dimension(870, 510));
        setSize(new java.awt.Dimension(870, 510));

        jPanel1.setBackground(new java.awt.Color(193, 255, 193));
        jPanel1.setMaximumSize(new java.awt.Dimension(0, 666));
        jPanel1.setPreferredSize(new java.awt.Dimension(510, 666));
        jPanel1.setSize(new java.awt.Dimension(510, 666));

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

        nome.setEditable(true);
        nome.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        nome.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", "5", "6" }));
        nome.setSelectedIndex(-1);

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

        jLabel4.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel4.setText("Nome");

        jLabel8.setFont(new java.awt.Font("ITC Kabel Std", 1, 13)); // NOI18N
        jLabel8.setText("o numero di:");

        jLabel14.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel14.setText("ID_Giocatore");

        id_p.setEditable(true);
        id_p.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N

        id_g.setEditable(true);
        id_g.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N

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
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
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
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addContainerGap())
        );

        op1.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        op1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<", "<=", "=", ">", ">=", "<>" }));
        op1.setSelectedIndex(2);
        op1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op1ActionPerformed(evt);
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

        num.setBackground(new java.awt.Color(193, 255, 193));
        num.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        num.setFont(new java.awt.Font("ITC Kabel Std", 0, 16)); // NOI18N
        num.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jscroll1.setViewportView(num);

        jLabel2.setFont(new java.awt.Font("ITC Kabel Std", 1, 14)); // NOI18N
        jLabel2.setText("Partite");

        jLabel3.setFont(new java.awt.Font("ITC Kabel Std", 1, 13)); // NOI18N
        jLabel3.setText("giocate");

        jl.setFont(new java.awt.Font("ITC Kabel Std", 1, 13)); // NOI18N
        jl.setText("Possedimenti");

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
        jscroll3.setViewportView(possedimenti);

        jLabel15.setFont(new java.awt.Font("ITC Kabel Std", 1, 13)); // NOI18N
        jLabel15.setText("rispetto al Giocatore");

        id_g1.setEditable(true);
        id_g1.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(indietro2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(testo1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(id_p, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(op1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(jscroll, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(171, 171, 171)
                                        .addComponent(cerca1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(testo2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(id_g, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pedina, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(clear2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3))
                                        .addGap(6, 6, 6)
                                        .addComponent(op, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jscroll1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel6)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel15)
                                                .addGap(18, 18, 18)
                                                .addComponent(id_g1, 0, 1, Short.MAX_VALUE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jl)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(op3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(op4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jscroll3)
                                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cerca2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(indietro2)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addComponent(testo1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(id_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(op1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jscroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addComponent(cerca1))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(testo2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(id_g, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(pedina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel7))
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jscroll1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jLabel3))
                                    .addComponent(op, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jscroll3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(op3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(op4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jl))))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(id_g1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(cerca2))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clear2)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            mos=Integer.parseInt(mosse.getText());
            }catch(NumberFormatException e) {
                mos=0;
            }
          
       try{
            np=Integer.parseInt(num.getText());
            }catch(NumberFormatException e) {
                np=0;
            }
       
       try{
            pos=Integer.parseInt(possedimenti.getText());
            }catch(NumberFormatException e) {
                pos=0;
            }
       
       int flag=0;
     query="SELECT MOSSA.ID_GIOCATORE,COUNT(DISTINCT MOSSA.ID_PARTITA) AS P_GIOCATE,COUNT(DISTINCT MOSSA.ID_MOSSA) AS NUM_MOSSE,COUNT(DISTINCT POSSEDIMENTO.NOME) AS NUM_POSSEDIMENTI FROM MOSSA LEFT JOIN POSSEDIMENTO ON MOSSA.ID_POSSEDIMENTO=POSSEDIMENTO.ID_POSSEDIMENTO ";
     
       if(id_g1.getSelectedIndex()!=-1){
            query=query+" WHERE MOSSA.ID_GIOCATORE="+id_g1.getSelectedItem()+" GROUP BY (MOSSA.ID_GIOCATORE)";
            flag=1;
        }
       
        if(mos!=0){
            if(flag==0){
            query=query+" GROUP BY (MOSSA.ID_GIOCATORE) HAVING (COUNT(DISTINCT MOSSA.ID_MOSSA)"+op3.getSelectedItem()+mos+")";
            flag=2;
            } else if(flag==1){
            query=query+" HAVING (COUNT(DISTINCT MOSSA.ID_MOSSA)"+op3.getSelectedItem()+mos+")";
            flag=2;
         }
        }     
        
        if(pos!=0){
                if(flag==0){
                    query=query+" GROUP BY (MOSSA.ID_GIOCATORE) HAVING (COUNT(DISTINCT POSSEDIMENTO.NOME)"+op4.getSelectedItem()+pos+")";
                   flag=2;
                }else if(flag==2)
                    query=query+" AND (COUNT(DISTINCT POSSEDIMENTO.NOME)"+op4.getSelectedItem()+pos+")"; 
                else if(flag==1){
                    query=query+" HAVING (COUNT(DISTINCT POSSEDIMENTO.NOME)"+op4.getSelectedItem()+pos+")"; 
                    flag=2;
                }
                
        }
        
        if(np!=0){
                if(flag==0){
                    query=query +" GROUP BY (MOSSA.ID_GIOCATORE) HAVING (COUNT(DISTINCT MOSSA.ID_PARTITA)"+op.getSelectedItem()+np+")";
                }else if(flag==2)
                    query=query+" AND (COUNT(DISTINCT MOSSA.ID_PARTITA)"+op.getSelectedItem()+np+")"; 
                else if(flag==1)
                    query=query+" HAVING (COUNT(DISTINCT MOSSA.ID_PARTITA)"+op.getSelectedItem()+np+")"; 
       
        }
        
            query = query + " ORDER BY (MOSSA.ID_GIOCATORE) ASC";
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

    private void pedinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedinaActionPerformed
        
    }//GEN-LAST:event_pedinaActionPerformed

    private void clear2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear2ActionPerformed
        conto.setText(null);
        mosse.setText(null);
        pedina.setSelectedIndex(-1);
        id_p.setSelectedIndex(-1);
        id_g1.setSelectedIndex(-1);
        id_g.setSelectedIndex(-1);
        nome.setSelectedIndex(-1);
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
        
        query="SELECT GIOCATORE.ID_GIOCATORE,GIOCATORE.NOME,PARTITA_GIOCATORE.PARTITA,PARTITA_GIOCATORE.PEDINA,PARTITA_GIOCATORE.CONTO FROM GIOCATORE JOIN PARTITA_GIOCATORE ON GIOCATORE.ID_GIOCATORE=PARTITA_GIOCATORE.GIOCATORE ";
        int flag=0;
        if(id_g.getSelectedIndex()!=-1){
            query=query+" WHERE GIOCATORE.ID_GIOCATORE="+id_g.getSelectedItem()+" ";
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
        if(id_p.getSelectedIndex()!=-1){
                if(flag==0){
                    query=query+" WHERE PARTITA_GIOCATORE.PARTITA ='"+id_p.getSelectedItem()+"'";
                    flag=1;
                }else if(flag==1)
                    query=query+" AND PARTITA_GIOCATORE.PARTITA ='"+id_p.getSelectedItem()+"'";
            }
        if(nome.getSelectedIndex()!=-1){
                if(flag==0){
                    query=query+" WHERE GIOCATORE.NOME LIKE '%"+nome.getSelectedItem()+"%'";
                    flag=1;
                }else if(flag==1)
                    query=query+" AND GIOCATORE.NOME LIKE '%"+nome.getSelectedItem()+"%'";
            }
        
           query = query + "ORDER BY (GIOCATORE.ID_GIOCATORE) ASC";
           
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

    private void op3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_op3ActionPerformed

    private void op4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_op4ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ricerca_Giocatore().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cerca1;
    private javax.swing.JButton cerca2;
    private javax.swing.JButton clear2;
    private javax.swing.JTextPane conto;
    private javax.swing.JComboBox<String> id_g;
    private javax.swing.JComboBox<String> id_g1;
    private javax.swing.JComboBox<String> id_p;
    private javax.swing.JButton indietro2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel jl;
    private javax.swing.JScrollPane jscroll;
    private javax.swing.JScrollPane jscroll1;
    private javax.swing.JScrollPane jscroll3;
    private javax.swing.JTextPane mosse;
    private javax.swing.JComboBox<String> nome;
    private javax.swing.JTextPane num;
    private javax.swing.JComboBox<String> op;
    private javax.swing.JComboBox<String> op1;
    private javax.swing.JComboBox<String> op3;
    private javax.swing.JComboBox<String> op4;
    private javax.swing.JComboBox<String> pedina;
    private javax.swing.JTextPane possedimenti;
    private javax.swing.JTable ris1;
    private javax.swing.JTable ris2;
    private javax.swing.JLabel testo1;
    private javax.swing.JLabel testo2;
    // End of variables declaration//GEN-END:variables
}
