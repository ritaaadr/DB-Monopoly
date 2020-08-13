package progetto_monopoly;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import net.proteanit.sql.DbUtils;

public class Inserimento_Mossa extends javax.swing.JFrame {
    PreparedStatement pst;
    ResultSet rs;
    Connection con = null;
    static int cod_partita,cod_g,id_partenza,posP,conto;
    int tur=0;
    static String casellaP,tipoP;

    public Inserimento_Mossa() {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        testo.setEnabled(false);
        testo2.setEnabled(false);
        testo3.setEnabled(false);
        testo4.setEnabled(false);
        tab_m.setDefaultEditor(Object.class, null);
    m1.setVisible(false);
    m2.setVisible(false);
    m3.setVisible(false);
      
                try{
            con = Database.getDefaultConnection();
           String sql ="SELECT PARTITA.ID_PARTITA AS PARTITA,PARTITA.NUMGIOCATORI AS N_GIOCATORI,PARTITA_GIOCATORE.GIOCATORE,GIOCATORE.NOME,PARTITA_GIOCATORE.PEDINA,PARTITA_GIOCATORE.CONTO FROM (PARTITA JOIN PARTITA_GIOCATORE ON PARTITA.ID_PARTITA=PARTITA_GIOCATORE.PARTITA) JOIN GIOCATORE ON GIOCATORE.ID_GIOCATORE=PARTITA_GIOCATORE.GIOCATORE ORDER BY (PARTITA.ID_PARTITA) ASC,(GIOCATORE.ID_GIOCATORE) ASC";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
                    
            tab_m.setModel(DbUtils.resultSetToTableModel(rs));
            con.close(); 
            
            
        }catch(SQLException e){ System.out.println(e);}
           
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        indietro5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab_m = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        testo = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        testo2 = new javax.swing.JTextPane();
        m1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        testo3 = new javax.swing.JTextPane();
        m2 = new javax.swing.JButton();
        m3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        testo4 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(550, 540));
        setMinimumSize(new java.awt.Dimension(550, 540));
        setPreferredSize(new java.awt.Dimension(550, 540));
        setSize(new java.awt.Dimension(550, 540));

        jPanel1.setBackground(new java.awt.Color(193, 255, 193));
        jPanel1.setMaximumSize(new java.awt.Dimension(550, 540));
        jPanel1.setMinimumSize(new java.awt.Dimension(550, 540));
        jPanel1.setPreferredSize(new java.awt.Dimension(550, 540));
        jPanel1.setSize(new java.awt.Dimension(550, 540));
        jPanel1.setLayout(null);

        indietro5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progetto_monopoly/icone/back.png"))); // NOI18N
        indietro5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indietro5ActionPerformed(evt);
            }
        });
        jPanel1.add(indietro5);
        indietro5.setBounds(28, 15, 81, 31);

        jLabel1.setFont(new java.awt.Font("ITC Kabel Std", 1, 13)); // NOI18N
        jLabel1.setText("Seleziona :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 110, 63, 17);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));

        tab_m.setBackground(new java.awt.Color(193, 255, 193));
        tab_m.setFont(new java.awt.Font("ITC Kabel Std", 1, 12)); // NOI18N
        tab_m.setSelectionBackground(new java.awt.Color(204, 0, 0));
        tab_m.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab_mMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tab_m);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(30, 140, 380, 187);

        jLabel2.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel2.setText("Partita");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 340, 50, 30);

        jLabel3.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel3.setText("Giocatore");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 370, 66, 19);

        testo.setBackground(new java.awt.Color(193, 255, 193));
        testo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        testo.setFont(new java.awt.Font("ITC Kabel Std", 0, 14)); // NOI18N
        testo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(testo);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(110, 340, 129, 24);

        testo2.setBackground(new java.awt.Color(193, 255, 193));
        testo2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        testo2.setFont(new java.awt.Font("ITC Kabel Std", 0, 14)); // NOI18N
        testo2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane3.setViewportView(testo2);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(110, 370, 129, 24);

        m1.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        m1.setText("Che mossa vuoi inserire?");
        jPanel1.add(m1);
        m1.setBounds(30, 460, 161, 27);

        jLabel6.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel6.setText("Posizione");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 400, 62, 26);

        testo3.setBackground(new java.awt.Color(193, 255, 193));
        testo3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        testo3.setFont(new java.awt.Font("ITC Kabel Std", 0, 14)); // NOI18N
        testo3.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane6.setViewportView(testo3);

        jPanel1.add(jScrollPane6);
        jScrollPane6.setBounds(110, 400, 170, 24);

        m2.setFont(new java.awt.Font("ITC Kabel Std", 1, 13)); // NOI18N
        m2.setText("Movimento");
        m2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m2ActionPerformed(evt);
            }
        });
        jPanel1.add(m2);
        m2.setBounds(210, 460, 106, 29);

        m3.setFont(new java.awt.Font("ITC Kabel Std", 1, 13)); // NOI18N
        m3.setText("Pagamento");
        m3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m3ActionPerformed(evt);
            }
        });
        jPanel1.add(m3);
        m3.setBounds(340, 460, 108, 29);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progetto_monopoly/icone/mr1.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(370, 0, 170, 240);

        jLabel7.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel7.setText("Conto");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 430, 39, 26);

        testo4.setBackground(new java.awt.Color(193, 255, 193));
        testo4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        testo4.setFont(new java.awt.Font("ITC Kabel Std", 0, 14)); // NOI18N
        testo4.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane7.setViewportView(testo4);

        jPanel1.add(jScrollPane7);
        jScrollPane7.setBounds(110, 430, 130, 24);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void indietro5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indietro5ActionPerformed
        this.dispose();
        Classe obj = new Classe();
        obj.setVisible(true);
    }//GEN-LAST:event_indietro5ActionPerformed

    private void tab_mMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_mMouseClicked
    //scelto partita
    //scelgo giocatore
    cod_partita=Integer.parseInt(""+(tab_m.getValueAt(tab_m.getSelectedRow(), 0)));
    testo.setText(""+cod_partita);
    testo.setEnabled(false);
    cod_g=Integer.parseInt(""+(tab_m.getValueAt(tab_m.getSelectedRow(), 2)));
    testo2.setText(""+cod_g);
    testo2.setEnabled(false);
    conto=Integer.parseInt(""+(tab_m.getValueAt(tab_m.getSelectedRow(), 5)));
    testo4.setText(conto+"$");
    testo4.setEnabled(false);
    
    try{ 
             con = Database.getDefaultConnection();
              
           String query="SELECT MAX(TURNO) FROM MOSSA WHERE CASELLA_ARRIVO IS NOT NULL AND ID_PARTITA="+cod_partita+" AND ID_GIOCATORE="+cod_g;
               
                pst = con.prepareStatement(query);
                rs = pst.executeQuery();
                while(rs.next()){
                   tur = rs.getInt(1);
                }
           if(tur==0){
               id_partenza=40;
               posP=0;
               casellaP="VIA!";
               testo3.setText("VIA!");
           } else{
          query="SELECT MOSSA.CASELLA_ARRIVO,CASELLA.POSIZIONE,CASELLA.NOME,CASELLA.TIPO_CASELLA FROM (MOSSA JOIN CASELLA ON MOSSA.CASELLA_ARRIVO=CASELLA.ID_CASELLA)  WHERE MOSSA.ID_PARTITA="+cod_partita+" AND MOSSA.ID_GIOCATORE="+cod_g+" AND MOSSA.TURNO="+tur;
          pst = con.prepareStatement(query);
          rs = pst.executeQuery();
          while(rs.next()){
                    id_partenza = rs.getInt(1);
                    posP=rs.getInt(2);
                    casellaP=rs.getString(3);
                    tipoP=rs.getString(4);
          }
           testo3.setText(casellaP);
           testo3.setEnabled(false);
           }
           con.close();
           }catch(SQLException e){ System.out.println(e);}
    
                
    m1.setVisible(true);
    m2.setVisible(true);
    m3.setVisible(true);
      
        
    }//GEN-LAST:event_tab_mMouseClicked

    private void m2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m2ActionPerformed
               this.dispose();
                IMossa_Movimento obj3 = new IMossa_Movimento();
                obj3.setVisible(true);
                
    }//GEN-LAST:event_m2ActionPerformed

    private void m3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m3ActionPerformed
             this.dispose();
                IMossa_Pagamento obj3 = new IMossa_Pagamento();
                obj3.setVisible(true);
    }//GEN-LAST:event_m3ActionPerformed

    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inserimento_Mossa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton indietro5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JLabel m1;
    private javax.swing.JButton m2;
    private javax.swing.JButton m3;
    private javax.swing.JTable tab_m;
    private javax.swing.JTextPane testo;
    private javax.swing.JTextPane testo2;
    private javax.swing.JTextPane testo3;
    private javax.swing.JTextPane testo4;
    // End of variables declaration//GEN-END:variables
}
