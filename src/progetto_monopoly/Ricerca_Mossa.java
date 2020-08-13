
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

public class Ricerca_Mossa extends javax.swing.JFrame {
    Connection con = null;
    PreparedStatement pst;
    ResultSet rs;
    String query;
    int turno, dado1, dado2, p_dato, p_ric;
    int selection = 0;
    
    public Ricerca_Mossa() {
         initComponents();
         setLocationRelativeTo(null);
         this.setResizable(false);
         
         ris7.setDefaultEditor(Object.class, null);
         
         try {
           con = Database.getDefaultConnection();
           query = "SELECT DISTINCT ID_MOSSA FROM MOSSA ORDER BY (ID_MOSSA) ASC";
           pst = con.prepareStatement(query);
           rs= pst.executeQuery();
           
           id_m.removeAllItems();
                   while(rs.next()){
                    id_m.addItem(""+rs.getInt(1));
                }
            id_m.setSelectedIndex(-1);
   
            con.close(); 
       }catch(SQLException e){ System.out.println(e);}
         
         
           try{
            con = Database.getDefaultConnection();
            query ="SELECT DISTINCT ID_PARTITA FROM MOSSA ORDER BY (ID_PARTITA) ASC";
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
            query ="SELECT DISTINCT ID_POSSEDIMENTO FROM MOSSA ORDER BY (ID_POSSEDIMENTO) ASC";
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();
            
            id_po.removeAllItems();
            while(rs.next()){
                    id_po.addItem(""+rs.getInt(1));
                }
            id_po.setSelectedIndex(-1);
   
            con.close(); 
         } catch(SQLException e){ System.out.println(e);}
           
           try{
            con = Database.getDefaultConnection();
            query ="SELECT DISTINCT ID_CARTA FROM MOSSA ORDER BY (ID_CARTA) ASC";
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();
            
            id_ca.removeAllItems();
            while(rs.next()){
                    id_ca.addItem(""+rs.getInt(1));
                }
            id_ca.setSelectedIndex(-1);
   
            con.close(); 
         } catch(SQLException e){ System.out.println(e);}
         
         try{
            con = Database.getDefaultConnection();
            query ="SELECT DISTINCT ID_GIOCATORE FROM PAGAMENTO_GIOCATORE ORDER BY (ID_GIOCATORE) ASC";
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
            query ="SELECT DISTINCT ID_GIOCATORE FROM MOSSA ORDER BY (ID_GIOCATORE) ASC";
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();
            
            id_g1.removeAllItems();
            while(rs.next()){
                    id_g1.addItem(""+rs.getInt(1));
                }
            id_g1.setSelectedIndex(-1);
   
            con.close(); 
         } catch(SQLException e){ System.out.println(e);}
         
         try{
            con = Database.getDefaultConnection();
            query ="SELECT DISTINCT CASELLA.ID_CASELLA FROM CASELLA ORDER BY (ID_CASELLA) ASC";
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();
            
            id_c1.removeAllItems();
            id_c2.removeAllItems();
            while(rs.next()){
                    id_c1.addItem(""+rs.getInt(1));
                    id_c2.addItem(""+rs.getInt(1));
                }
            id_c2.setSelectedIndex(-1);
            id_c1.setSelectedIndex(-1);
   
            con.close(); 
         } catch(SQLException e){ System.out.println(e);}
         
         
         
         
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        indietro7 = new javax.swing.JButton();
        ricerca7 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tipo_m7 = new javax.swing.JComboBox<>();
        id_m = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tipo_p7 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        d2 = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        p_dato7 = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        p_ric7 = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        d1 = new javax.swing.JTextPane();
        jLabel12 = new javax.swing.JLabel();
        id_p = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        id_g = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        id_g1 = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        id_c1 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        id_po = new javax.swing.JComboBox<>();
        id_c2 = new javax.swing.JComboBox<>();
        id_ca = new javax.swing.JComboBox<>();
        jScrollPane8 = new javax.swing.JScrollPane();
        turno7 = new javax.swing.JTextPane();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        clear = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        ris7 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1050, 450));
        setMinimumSize(new java.awt.Dimension(1050, 450));
        setResizable(false);
        setSize(new java.awt.Dimension(1050, 450));

        jPanel1.setBackground(new java.awt.Color(193, 255, 193));
        jPanel1.setMaximumSize(new java.awt.Dimension(1050, 450));
        jPanel1.setMinimumSize(new java.awt.Dimension(1050, 450));
        jPanel1.setPreferredSize(new java.awt.Dimension(1050, 450));
        jPanel1.setSize(new java.awt.Dimension(1050, 450));

        jLabel1.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel1.setText("ID_Mossa");

        jLabel2.setFont(new java.awt.Font("ITC Kabel Std", 1, 14)); // NOI18N
        jLabel2.setText("Ricerca per caratteristica:");

        indietro7.setFont(new java.awt.Font("ITC Kabel Std", 1, 14)); // NOI18N
        indietro7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progetto_monopoly/icone/back.png"))); // NOI18N
        indietro7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indietro7ActionPerformed(evt);
            }
        });

        ricerca7.setFont(new java.awt.Font("ITC Kabel Std", 1, 14)); // NOI18N
        ricerca7.setText("Cerca");
        ricerca7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ricerca7ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel3.setText("Turno");

        jLabel4.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel4.setText("Tipo Mossa");

        jLabel5.setFont(new java.awt.Font("ITC Kabel Std", 1, 13)); // NOI18N
        jLabel5.setText("Dado 1");

        tipo_m7.setEditable(true);
        tipo_m7.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        tipo_m7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MOVIMENTO", "PAGAMENTO" }));
        tipo_m7.setSelectedIndex(-1);

        id_m.setEditable(true);
        id_m.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N

        jLabel6.setFont(new java.awt.Font("ITC Kabel Std", 1, 13)); // NOI18N
        jLabel6.setText("Pagamento");

        jLabel7.setFont(new java.awt.Font("ITC Kabel Std", 1, 13)); // NOI18N
        jLabel7.setText("Dado 2");

        tipo_p7.setEditable(true);
        tipo_p7.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        tipo_p7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GENERICO", "VERSO GIOCATORE", "VERSO BANCA" }));
        tipo_p7.setSelectedIndex(-1);

        jLabel9.setFont(new java.awt.Font("ITC Kabel Std", 1, 13)); // NOI18N
        jLabel9.setText("Pagamento Dato");

        jLabel10.setFont(new java.awt.Font("ITC Kabel Std", 1, 13)); // NOI18N
        jLabel10.setText("Pagamento Ricevuto");

        d2.setBackground(new java.awt.Color(193, 255, 193));
        d2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        d2.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        jScrollPane4.setViewportView(d2);

        p_dato7.setBackground(new java.awt.Color(193, 255, 193));
        p_dato7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        p_dato7.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        jScrollPane5.setViewportView(p_dato7);

        p_ric7.setBackground(new java.awt.Color(193, 255, 193));
        p_ric7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        p_ric7.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        jScrollPane6.setViewportView(p_ric7);

        d1.setBackground(new java.awt.Color(193, 255, 193));
        d1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        d1.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        jScrollPane3.setViewportView(d1);

        jLabel12.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel12.setText("ID_Partita");

        id_p.setEditable(true);
        id_p.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N

        jLabel13.setFont(new java.awt.Font("ITC Kabel Std", 1, 14)); // NOI18N
        jLabel13.setText("ID_Giocatore");

        id_g.setEditable(true);
        id_g.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N

        jLabel8.setFont(new java.awt.Font("ITC Kabel Std", 1, 13)); // NOI18N
        jLabel8.setText("Tipo");

        jLabel15.setFont(new java.awt.Font("ITC Kabel Std", 1, 13)); // NOI18N
        jLabel15.setText("Giocatore coinvolto");

        id_g1.setEditable(true);
        id_g1.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N

        jLabel17.setFont(new java.awt.Font("ITC Kabel Std", 1, 13)); // NOI18N
        jLabel17.setText("nel pagamento");

        id_c1.setEditable(true);
        id_c1.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N

        jLabel11.setFont(new java.awt.Font("ITC Kabel Std", 1, 13)); // NOI18N
        jLabel11.setText("Possedimento");

        id_po.setEditable(true);
        id_po.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N

        id_c2.setEditable(true);
        id_c2.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N

        id_ca.setEditable(true);
        id_ca.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        id_ca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_caActionPerformed(evt);
            }
        });

        turno7.setBackground(new java.awt.Color(193, 255, 193));
        turno7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        turno7.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        jScrollPane8.setViewportView(turno7);

        jLabel18.setFont(new java.awt.Font("ITC Kabel Std", 1, 13)); // NOI18N
        jLabel18.setText("Casella");

        jLabel19.setFont(new java.awt.Font("ITC Kabel Std", 1, 13)); // NOI18N
        jLabel19.setText("partenza");

        jLabel20.setFont(new java.awt.Font("ITC Kabel Std", 1, 13)); // NOI18N
        jLabel20.setText("Casella");

        jLabel21.setFont(new java.awt.Font("ITC Kabel Std", 1, 13)); // NOI18N
        jLabel21.setText("arrivo");

        jLabel22.setFont(new java.awt.Font("ITC Kabel Std", 1, 13)); // NOI18N
        jLabel22.setText("Carta");

        jLabel23.setFont(new java.awt.Font("ITC Kabel Std", 1, 13)); // NOI18N
        jLabel23.setText("pescata");

        clear.setFont(new java.awt.Font("ITC Kabel Std", 1, 14)); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));

        ris7.setBackground(new java.awt.Color(193, 255, 193));
        ris7.setFont(new java.awt.Font("ITC Kabel Std", 1, 12)); // NOI18N
        ris7.setSelectionBackground(new java.awt.Color(204, 0, 0));
        jScrollPane7.setViewportView(ris7);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(12, 12, 12)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel17))
                                .addGap(12, 12, 12)
                                .addComponent(id_g1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(46, 46, 46)
                                .addComponent(id_po, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tipo_m7, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(85, 85, 85)
                                    .addComponent(tipo_p7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1))
                                    .addGap(2, 2, 2)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(id_g, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(id_m, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(id_p, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(30, 30, 30)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(30, 30, 30)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel18))
                                .addGap(22, 22, 22)
                                .addComponent(id_c1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel21))
                                .addGap(32, 32, 32)
                                .addComponent(id_c2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel23))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(id_ca, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(clear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ricerca7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)))))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(indietro7)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(indietro7)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(id_m, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(id_g, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(tipo_m7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tipo_p7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(jLabel9))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(jLabel6))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel8)))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel15)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(13, 13, 13)
                                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(id_g1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(jLabel11))
                                    .addComponent(id_po, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel12))
                                    .addComponent(id_p, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jLabel3))
                                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel18)
                                    .addComponent(id_c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel20)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(id_c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(id_ca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ricerca7))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clear)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void indietro7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indietro7ActionPerformed
       this.dispose();
       Classe obj = new Classe();
       obj.setVisible(true);
    }//GEN-LAST:event_indietro7ActionPerformed

    private void ricerca7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ricerca7ActionPerformed
      Dati_Tabella.clearTable(ris7);
        try{
            con = Database.getDefaultConnection();
       
        try{
            turno=Integer.parseInt(turno7.getText());
            }catch(NumberFormatException e) {
                turno=0;
            }
        try{
            dado1=Integer.parseInt(d1.getText());
            }catch(NumberFormatException e) {
                dado1=0;
            }
        try{
            dado2=Integer.parseInt(d2.getText());
        }catch(NumberFormatException e){
            dado2=0;
        }
        try{
            p_dato=Integer.parseInt(p_dato7.getText());
            }catch(NumberFormatException e) {
                p_dato=0;
            }
        try{
            p_ric=Integer.parseInt(p_ric7.getText());
        }catch(NumberFormatException e){
            p_ric=0;
        }
        
        
        query="SELECT MOSSA.ID_MOSSA,MOSSA.ID_PARTITA,MOSSA.ID_GIOCATORE,MOSSA.TURNO,MOSSA.TIPO_MOSSA,MOSSA.DADO1,MOSSA.DADO2,MOSSA.CASELLA_PARTENZA,MOSSA.CASELLA_ARRIVO,MOSSA.TIPO_PAGAMENTO,MOSSA.PAGAMENTO_DATO,MOSSA.PAGAMENTO_RICEVUTO,MOSSA.ID_CARTA,MOSSA.ID_POSSEDIMENTO,PAGAMENTO_GIOCATORE.ID_GIOCATORE AS G_COINVOLTO FROM MOSSA FULL OUTER JOIN PAGAMENTO_GIOCATORE ON MOSSA.ID_MOSSA=PAGAMENTO_GIOCATORE.ID_MOSSA WHERE";
        
        int flag=0;
        if(id_m.getSelectedIndex()!=-1){
            query=query+" MOSSA.ID_MOSSA="+id_m.getSelectedItem()+ " ";
            flag=1;
        }
        
        if(id_g.getSelectedIndex()!=-1){
                if(flag==0){
                    query=query+" MOSSA.ID_GIOCATORE ="+id_g.getSelectedItem();
                    flag=1;
                }else if(flag==1)
                    query=query+" AND MOSSA.ID_GIOCATORE ="+id_g.getSelectedItem();
            }
        
        if(id_p.getSelectedIndex()!=-1){
                if(flag==0){
                    query=query+" MOSSA.ID_PARTITA="+id_p.getSelectedItem();
                    flag=1;
                }else if(flag==1)
                    query=query+" AND MOSSA.ID_PARTITA="+id_p.getSelectedItem();
            }
            if(turno!=0){
                if(flag==0){
                query=query+" MOSSA.TURNO="+turno;
                flag=1;
            }else if(flag==1)
                    query=query+" AND MOSSA.TURNO="+turno;
            }
            if(tipo_m7.getSelectedIndex()!=-1){
                if(flag==0){
                    query=query+" MOSSA.TIPO_MOSSA='"+tipo_m7.getSelectedItem()+"'";
                    flag=1;
                }else if(flag==1)
                    query=query+" AND MOSSA.TIPO_MOSSA='"+tipo_m7.getSelectedItem()+"'";   
            }
            if(dado1!=0){
                if(flag==0){
                    query=query+" MOSSA.DADO1="+dado1;
                    flag=1;
                }else if(flag==1)
                    query=query+" AND MOSSA.DADO1="+dado1;
            }
            if(dado2!=0){
                if(flag==0){
                    query=query+" MOSSA.DADO2="+dado2;
                    flag=1;
                }else if(flag==1)
                    query=query+" AND MOSSA.DADO2="+dado2;
            }
            if(tipo_p7.getSelectedIndex()!=-1){
                if(flag==0){
                    query=query+" MOSSA.TIPO_PAGAMENTO='"+tipo_p7.getSelectedItem()+"'";
                    flag=1;
                }else if(flag==1)
                    query=query+" AND MOSSA.TIPO_PAGAMENTO='"+tipo_p7.getSelectedItem()+"'";
            }
            if(p_dato!=0){
                if(flag==0){
                    query=query+" MOSSA.PAGAMENTO_DATO="+p_dato;
                    flag=1;
                }else if(flag==1)
                    query=query+" AND MOSSA.PAGAMENTO_DATO="+p_dato;
            }
            if(p_ric!=0){
                if(flag==0){
                    query=query+" MOSSA.PAGAMENTO_RICEVUTO="+p_ric;
                    flag=1;
                }else if(flag==1)
                    query=query+" AND MOSSA.PAGAMENTO_RICEVUTO="+p_ric;
            }
            if(id_g1.getSelectedIndex()!=-1){
                if(flag==0){
                    query=query+" AND PAGAMENTO_GIOCATORE.ID_GIOCATORE="+id_g1.getSelectedItem();
                    flag=1;
                }else if(flag==1)
                    query=query+" AND PAGAMENTO_GIOCATORE.ID_GIOCATORE="+id_g1.getSelectedItem();
            }
            
            if(id_po.getSelectedIndex()!=-1){
                if(flag==0){
                    query=query+" MOSSA.ID_POSSEDIMENTO="+id_po.getSelectedItem();
                    flag=1;
                }else if(flag==1)
                    query=query+" AND MOSSA.ID_POSSEDIMENTO="+id_po.getSelectedItem();
            }
            
            if(id_ca.getSelectedIndex()!=-1){
                if(flag==0){
                    query=query+" MOSSA.ID_CARTA="+id_ca.getSelectedItem();
                    flag=1;
                }else if(flag==1)
                    query=query+" AND MOSSA.ID_CARTA="+id_ca.getSelectedItem();
            }
            
            if(id_c2.getSelectedIndex()!=-1){
                if(flag==0){
                    query=query+" MOSSA.CASELLA_ARRIVO="+id_c2.getSelectedItem();
                    flag=1;
                }else if(flag==1)
                    query=query+" AND MOSSA.CASELLA_ARRIVO="+id_c2.getSelectedItem();
            }
            
            if(id_c1.getSelectedIndex()!=-1){
                if(flag==0){
                    query=query+" MOSSA.CASELLA_PARTENZA="+id_c1.getSelectedItem();
                    flag=1;
                }else if(flag==1)
                    query=query+" AND MOSSA.CASELLA_PARTENZA="+id_c1.getSelectedItem();
            }
       
        query = query + " ORDER BY (ID_MOSSA) ASC";
        pst = con.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);            
            rs = pst.executeQuery();
            ris7.setModel(DbUtils.resultSetToTableModel(rs));
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
    }//GEN-LAST:event_ricerca7ActionPerformed

    private void id_caActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_caActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_caActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        id_g1.setSelectedIndex(-1);
        id_c1.setSelectedIndex(-1);
        id_c2.setSelectedIndex(-1);
        id_m.setSelectedIndex(-1);
        id_p.setSelectedIndex(-1);
        id_po.setSelectedIndex(-1);
        id_ca.setSelectedIndex(-1);
        id_g.setSelectedIndex(-1);
        turno7.setText("");
        tipo_m7.setSelectedIndex(-1);
        tipo_p7.setSelectedIndex(-1);
        d1.setText("");
        d2.setText("");
        p_dato7.setText("");
        p_ric7.setText("");
        Dati_Tabella.clearTable(ris7);
    }//GEN-LAST:event_clearActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ricerca_Mossa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear;
    private javax.swing.JTextPane d1;
    private javax.swing.JTextPane d2;
    private javax.swing.JComboBox<String> id_c1;
    private javax.swing.JComboBox<String> id_c2;
    private javax.swing.JComboBox<String> id_ca;
    private javax.swing.JComboBox<String> id_g;
    private javax.swing.JComboBox<String> id_g1;
    private javax.swing.JComboBox<String> id_m;
    private javax.swing.JComboBox<String> id_p;
    private javax.swing.JComboBox<String> id_po;
    private javax.swing.JButton indietro7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTextPane p_dato7;
    private javax.swing.JTextPane p_ric7;
    private javax.swing.JButton ricerca7;
    private javax.swing.JTable ris7;
    private javax.swing.JComboBox<String> tipo_m7;
    private javax.swing.JComboBox<String> tipo_p7;
    private javax.swing.JTextPane turno7;
    // End of variables declaration//GEN-END:variables
}
