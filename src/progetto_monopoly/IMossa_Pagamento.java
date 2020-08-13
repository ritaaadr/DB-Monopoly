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


import static progetto_monopoly.Inserimento_Mossa.cod_g;
import static progetto_monopoly.Inserimento_Mossa.cod_partita;
import static progetto_monopoly.Inserimento_Mossa.id_partenza;
import static progetto_monopoly.Inserimento_Mossa.casellaP;   
import static progetto_monopoly.Inserimento_Mossa.conto;
import static progetto_monopoly.Inserimento_Mossa.tipoP;

public class IMossa_Pagamento extends javax.swing.JFrame {
    PreparedStatement pst,pst4,pst2,pst1;
    ResultSet rs;
    Connection con = null;
    int turno,ordine=0,ID_Mossa,prezzo,TP,ID_Poss,id_contrP;
     Integer ID_G[]=new Integer[1000];
     int id_g2=0;
     


    public IMossa_Pagamento() {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        
        testo.setText(""+cod_partita);
        testo2.setText(""+cod_g);
        testo3.setText(""+casellaP);
        testo.setEnabled(false);
        testo2.setEnabled(false);
        testo3.setEnabled(false);
        testo4.setText(conto+"$");
        testo4.setEnabled(false);
        tab_m.setDefaultEditor(Object.class, null);
        
        g_2.setEnabled(false);
        
         try{
            con = Database.getDefaultConnection();
           String sql ="SELECT TURNO,ORDINE,TIPO_MOSSA,ID_GIOCATORE FROM MOSSA WHERE MOSSA.ID_PARTITA="+cod_partita+" ORDER BY (TURNO) ASC,(ORDINE) ASC";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            tab_m.setModel(DbUtils.resultSetToTableModel(rs));
                
            
            turno1.removeAllItems();
         }catch(SQLException| NullPointerException e){ System.out.println(e);}
                
              try  {
                con = Database.getDefaultConnection();
                String query="SELECT DISTINCT TURNO FROM MOSSA WHERE ID_PARTITA="+cod_partita+" GROUP BY ID_PARTITA,TURNO ORDER BY (TURNO) ASC";
                pst = con.prepareStatement(query);
                rs = pst.executeQuery();
                while(rs.next()){
                    turno1.addItem(""+rs.getInt(1));
                }
                turno1.setSelectedIndex(-1);
              }catch(SQLException| NullPointerException e){ System.out.println(e);}
            
        
         
        tipo_p.removeAllItems();
         tipo_p.addItem("PAGAMENTO GENERICO DATO");
          tipo_p.addItem("PAGAMENTO GENERICO RICEVUTO");
           tipo_p.addItem("PAGAMENTO EFFETTUATO VERSO BANCA");
            tipo_p.addItem("PAGAMENTO RICEVUTO DALLA BANCA");
             tipo_p.addItem("PAGAMENTO EFFETTUATO VERSO GIOCATORE");
              tipo_p.addItem("PAGAMENTO RICEVUTO DA GIOCATORE");
            
     
         
         if(tipoP.equals("TERRITORIO") | tipoP.equals("NON EDIFICABILE")){
            try{ 
                 String query2="SELECT POSSEDIMENTO.ID_GIOCATORE FROM (POSSEDIMENTO JOIN MOSSA ON POSSEDIMENTO.ID_POSSEDIMENTO=MOSSA.ID_POSSEDIMENTO) JOIN CONTRATTO ON CONTRATTO.ID_CONTRATTO=POSSEDIMENTO.ID_CONTRATTO WHERE CONTRATTO.ID_CASELLA="+id_partenza+" AND MOSSA.ID_PARTITA="+cod_partita;
                pst = con.prepareStatement(query2);
                rs = pst.executeQuery();
                while(rs.next()){
                    id_g2=rs.getInt(1);
                }
                if(id_g2==0 | id_g2==cod_g){
                    tipo_p.addItem("ACQUISTA CONTRATTO");
                    tipo_p.addItem("ACQUISTA PRIMA CASA");
                    tipo_p.addItem("ACQUISTA SECONDA CASA");
                    tipo_p.addItem("ACQUISTA TERZA CASA");
                    tipo_p.addItem("ACQUISTA QUARTA CASA");
                    tipo_p.addItem("ACQUISTA ALBERGO");
                    tipo_p.addItem("IPOTECA");
                }
            }catch(SQLException e){ System.out.println(e);}
         }
           tipo_p.setSelectedIndex(-1);
        
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
        aggiungi5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        testo3 = new javax.swing.JTextPane();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        importo = new javax.swing.JTextPane();
        jLabel13 = new javax.swing.JLabel();
        g_2 = new javax.swing.JComboBox<>();
        tipo_p = new javax.swing.JComboBox<>();
        turno1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        testo4 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(730, 580));
        setMinimumSize(new java.awt.Dimension(730, 580));
        setSize(new java.awt.Dimension(730, 580));

        jPanel1.setBackground(new java.awt.Color(193, 255, 193));
        jPanel1.setMaximumSize(new java.awt.Dimension(730, 580));
        jPanel1.setMinimumSize(new java.awt.Dimension(730, 580));
        jPanel1.setPreferredSize(new java.awt.Dimension(730, 580));
        jPanel1.setSize(new java.awt.Dimension(730, 580));

        indietro5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progetto_monopoly/icone/back.png"))); // NOI18N
        indietro5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indietro5ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("ITC Kabel Std", 1, 13)); // NOI18N
        jLabel1.setText("Riempi i campi di Mossa e premi Aggiungi per confermare");

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel2.setText("Partita");

        jLabel3.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel3.setText("Giocatore");

        testo.setBackground(new java.awt.Color(193, 255, 193));
        testo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        testo.setFont(new java.awt.Font("ITC Kabel Std", 0, 14)); // NOI18N
        testo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(testo);

        testo2.setBackground(new java.awt.Color(193, 255, 193));
        testo2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        testo2.setFont(new java.awt.Font("ITC Kabel Std", 0, 14)); // NOI18N
        testo2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane3.setViewportView(testo2);

        aggiungi5.setFont(new java.awt.Font("Kabel", 2, 12)); // NOI18N
        aggiungi5.setText("Aggiungi");
        aggiungi5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aggiungi5ActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progetto_monopoly/icone/money.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel6.setText("Posizione");

        testo3.setBackground(new java.awt.Color(193, 255, 193));
        testo3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        testo3.setFont(new java.awt.Font("ITC Kabel Std", 0, 14)); // NOI18N
        testo3.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane6.setViewportView(testo3);

        jLabel8.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel8.setText("Seleziona");

        jLabel10.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel10.setText("Importo");

        importo.setBackground(new java.awt.Color(193, 255, 193));
        importo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        importo.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        jScrollPane10.setViewportView(importo);

        jLabel13.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel13.setText("Giocatore coinvolto");

        g_2.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N

        tipo_p.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        tipo_p.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PAGAMENTO GENERICO DATO", "PAGAMENTO GENERICO RICEVUTO", "PAGAMENTO EFFETTUATO VERSO BANCA", "PAGAMENTO RICEVUTO DALLA BANCA", "PAGAMENTO EFFETTUATO VERSO GIOCATORE", "PAGAMENTO RICEVUTO DA GIOCATORE" }));
        tipo_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipo_pActionPerformed(evt);
            }
        });

        turno1.setEditable(true);
        turno1.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N

        jLabel4.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel4.setText("Turno");

        jLabel7.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel7.setText("Conto");

        testo4.setBackground(new java.awt.Color(193, 255, 193));
        testo4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        testo4.setFont(new java.awt.Font("ITC Kabel Std", 0, 14)); // NOI18N
        testo4.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane4.setViewportView(testo4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(g_2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(164, 164, 164)
                        .addComponent(aggiungi5))
                    .addComponent(indietro5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel1)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(98, 98, 98))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(70, 70, 70)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel6)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel4))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                    .addGap(6, 6, 6)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(turno1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(82, 82, 82))
                                .addComponent(tipo_p, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(indietro5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(turno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tipo_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(g_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(aggiungi5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void indietro5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indietro5ActionPerformed
        this.dispose();
        Inserimento_Mossa obj = new Inserimento_Mossa();
        obj.setVisible(true);
    }//GEN-LAST:event_indietro5ActionPerformed

    private void tab_mMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_mMouseClicked
        
    }//GEN-LAST:event_tab_mMouseClicked

    private void aggiungi5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aggiungi5ActionPerformed
         
       try{ 
               con = Database.getDefaultConnection();
               
               try{
            turno=Integer.parseInt((String)turno1.getSelectedItem());
            }catch(NumberFormatException e) {
                turno=1;
            }
                String query="SELECT MAX(ORDINE) FROM DB_MONO.MOSSA WHERE ID_PARTITA="+cod_partita+" AND TURNO="+turno;
                pst = con.prepareStatement(query);
                rs = pst.executeQuery();
                while(rs.next()){
                    ordine = rs.getInt(1);
                }
                
                
                query="SELECT ID_CONTRATTO FROM CONTRATTO WHERE ID_CASELLA="+id_partenza;
                pst1 = con.prepareStatement(query);
                rs = pst1.executeQuery();
                while(rs.next()){
                    id_contrP = rs.getInt(1);
                }
           
                //inserire turno e ordine+1
        
              query="SELECT MAX(ID_MOSSA) FROM MOSSA";
              pst = con.prepareStatement(query);
                rs = pst.executeQuery();
                while(rs.next()){
                    ID_Mossa = rs.getInt(1);
                }
        
                String query2;
                
                TP=tipo_p.getSelectedIndex();
                prezzo=Integer.parseInt(importo.getText());
                if(TP==0){
                 query2="INSERT INTO MOSSA(ID_MOSSA,TURNO,ORDINE,TIPO_MOSSA,ID_PARTITA,ID_GIOCATORE,TIPO_PAGAMENTO,PAGAMENTO_DATO,PAGAMENTO_RICEVUTO) VALUES(?,?,?,?,?,?,?,?,?)";
                  pst = con.prepareStatement(query2);
                pst.setInt(1,(ID_Mossa+1));
                pst.setInt(2,turno);
                pst.setInt(3,ordine+1);
                pst.setString(4,"PAGAMENTO");
                pst.setInt(5, cod_partita);
                pst.setInt(6,cod_g);
                pst.setString(7, "GENERICO");
                pst.setInt(8,prezzo);
                pst.setInt(9, 0);
                
                String query4="UPDATE PARTITA_GIOCATORE SET CONTO=CONTO-"+prezzo+"WHERE PARTITA="+cod_partita+" AND GIOCATORE="+cod_g;
                pst4 = con.prepareStatement(query4);
                pst4.executeUpdate(query4);
                
                } else if(TP==1){
                
                 query2="INSERT INTO MOSSA(ID_MOSSA,TURNO,ORDINE,TIPO_MOSSA,ID_PARTITA,ID_GIOCATORE,TIPO_PAGAMENTO,PAGAMENTO_DATO,PAGAMENTO_RICEVUTO) VALUES(?,?,?,?,?,?,?,?,?)";
                  pst = con.prepareStatement(query2);
                pst.setInt(1,(ID_Mossa+1));
                pst.setInt(2,turno);
                pst.setInt(3,ordine+1);
                pst.setString(4,"PAGAMENTO");
                pst.setInt(5, cod_partita);
                pst.setInt(6,cod_g);
                pst.setString(7, "GENERICO");
                pst.setInt(9,prezzo);
                pst.setInt(8, 0);
                
                
                String query4="UPDATE PARTITA_GIOCATORE SET CONTO=CONTO+"+prezzo+"WHERE PARTITA="+cod_partita+" AND GIOCATORE="+cod_g;
                pst4 = con.prepareStatement(query4);
                pst4.executeUpdate(query4);
                
                }else if(TP==2){
                 query2="INSERT INTO MOSSA(ID_MOSSA,TURNO,ORDINE,TIPO_MOSSA,ID_PARTITA,ID_GIOCATORE,TIPO_PAGAMENTO,PAGAMENTO_DATO,PAGAMENTO_RICEVUTO) VALUES(?,?,?,?,?,?,?,?,?)";
                  pst = con.prepareStatement(query2);
                pst.setInt(1,(ID_Mossa+1));
                pst.setInt(2,turno);
                pst.setInt(3,ordine+1);
                pst.setString(4,"PAGAMENTO");
                pst.setInt(5, cod_partita);
                pst.setInt(6,cod_g);
                pst.setString(7, "VERSO BANCA");
                pst.setInt(8,prezzo);
                pst.setInt(9, 0);
                
                String query4="UPDATE PARTITA_GIOCATORE SET CONTO=CONTO-"+prezzo+"WHERE PARTITA="+cod_partita+" AND GIOCATORE="+cod_g;
                pst4 = con.prepareStatement(query4);
                pst4.executeUpdate(query4);
                
                
                } else if(TP==3){
                    query2="INSERT INTO MOSSA(ID_MOSSA,TURNO,ORDINE,TIPO_MOSSA,ID_PARTITA,ID_GIOCATORE,TIPO_PAGAMENTO,PAGAMENTO_DATO,PAGAMENTO_RICEVUTO) VALUES(?,?,?,?,?,?,?,?,?)";
                  pst = con.prepareStatement(query2);
                pst.setInt(1,(ID_Mossa+1));
                pst.setInt(2,turno);
                pst.setInt(3,ordine+1);
                pst.setString(4,"PAGAMENTO");
                pst.setInt(5, cod_partita);
                pst.setInt(6,cod_g);
                pst.setString(7, "VERSO BANCA");
                pst.setInt(9,prezzo);
                pst.setInt(8, 0);
                
                String query4="UPDATE PARTITA_GIOCATORE SET CONTO=CONTO+"+prezzo+"WHERE PARTITA="+cod_partita+" AND GIOCATORE="+cod_g;
                pst4 = con.prepareStatement(query4);
                pst4.executeUpdate(query4);
                
                } else if(TP==4){
                    query2="INSERT INTO MOSSA(ID_MOSSA,TURNO,ORDINE,TIPO_MOSSA,ID_PARTITA,ID_GIOCATORE,TIPO_PAGAMENTO,PAGAMENTO_DATO,PAGAMENTO_RICEVUTO) VALUES(?,?,?,?,?,?,?,?,?)";
                  pst = con.prepareStatement(query2);
                pst.setInt(1,(ID_Mossa+1));
                pst.setInt(2,turno);
                pst.setInt(3,ordine+1);
                pst.setString(4,"PAGAMENTO");
                pst.setInt(5, cod_partita);
                pst.setInt(6,cod_g);
                pst.setString(7, "VERSO GIOCATORE");
                pst.setInt(8,prezzo);
                pst.setInt(9, 0);
                //aggiungere PAGAMENTO_GIOCATORE
                
                
                String query4="UPDATE PARTITA_GIOCATORE SET CONTO=CONTO-"+prezzo+"WHERE PARTITA="+cod_partita+" AND GIOCATORE="+cod_g;
                pst4 = con.prepareStatement(query4);
                pst4.executeUpdate(query4);
                
                
                } else if(TP==5){
                    query2="INSERT INTO MOSSA(ID_MOSSA,TURNO,ORDINE,TIPO_MOSSA,ID_PARTITA,ID_GIOCATORE,TIPO_PAGAMENTO,PAGAMENTO_DATO,PAGAMENTO_RICEVUTO) VALUES(?,?,?,?,?,?,?,?,?)";
                  pst = con.prepareStatement(query2);
                pst.setInt(1,(ID_Mossa+1));
                pst.setInt(2,turno);
                pst.setInt(3,ordine+1);
                pst.setString(4,"PAGAMENTO");
                pst.setInt(5, cod_partita);
                pst.setInt(6,cod_g);
                pst.setString(7, "VERSO GIOCATORE");
                pst.setInt(9,prezzo);
                pst.setInt(8, 0);
                //aggiungere PAGAMENTO_GIOCATORE
                
                String query4="UPDATE PARTITA_GIOCATORE SET CONTO=CONTO+"+prezzo+"WHERE PARTITA="+cod_partita+" AND GIOCATORE="+cod_g;
                pst4 = con.prepareStatement(query4);
                pst4.executeUpdate(query4);
                
                } else if(TP==6){
                    query2="INSERT INTO MOSSA(ID_MOSSA,TURNO,ORDINE,TIPO_MOSSA,ID_PARTITA,ID_GIOCATORE,TIPO_PAGAMENTO,PAGAMENTO_DATO,PAGAMENTO_RICEVUTO,ID_POSSEDIMENTO) VALUES(?,?,?,?,?,?,?,?,?,?)";
                  pst = con.prepareStatement(query2);
                pst.setInt(1,(ID_Mossa+1));
                pst.setInt(2,turno);
                pst.setInt(3,ordine+1);
                pst.setString(4,"PAGAMENTO");
                pst.setInt(5, cod_partita);
                pst.setInt(6,cod_g);
                pst.setString(7, "VERSO BANCA");
                pst.setInt(8,prezzo);
                pst.setInt(9, 0);
                
                String query4="UPDATE PARTITA_GIOCATORE SET CONTO=CONTO-"+prezzo+"WHERE PARTITA="+cod_partita+" AND GIOCATORE="+cod_g;
                pst4 = con.prepareStatement(query4);
                pst4.executeUpdate(query4);
                    
                
                query="SELECT MAX(ID_POSSEDIMENTO) FROM POSSEDIMENTO";
                pst1 = con.prepareStatement(query);
                rs = pst1.executeQuery();
                while(rs.next()){
                    ID_Poss = rs.getInt(1);
                }
                  
                 String query3="INSERT INTO POSSEDIMENTO(ID_POSSEDIMENTO,NOME,TIPO_POSSEDIMENTO,NUM_CASA,ID_CONTRATTO,ID_GIOCATORE) VALUES(?,?,?,?,?,?)";
                    pst2 = con.prepareStatement(query3);
                    pst2.setInt(1, ID_Poss+1);
                    pst2.setString(2,casellaP);
                    pst2.setString(3, "SEMPLICE");
                    pst2.setInt(4,0);
                    pst2.setInt(5,id_contrP);
                    pst2.setInt(6,cod_g);
                    
                    pst2.executeUpdate();
                    
                    pst.setInt(10,ID_Poss+1);
                }  else if(TP==7){
                    query2="INSERT INTO MOSSA(ID_MOSSA,TURNO,ORDINE,TIPO_MOSSA,ID_PARTITA,ID_GIOCATORE,TIPO_PAGAMENTO,PAGAMENTO_DATO,PAGAMENTO_RICEVUTO,ID_POSSEDIMENTO) VALUES(?,?,?,?,?,?,?,?,?,?)";
                  pst = con.prepareStatement(query2);
                pst.setInt(1,(ID_Mossa+1));
                pst.setInt(2,turno);
                pst.setInt(3,ordine+1);
                pst.setString(4,"PAGAMENTO");
                pst.setInt(5, cod_partita);
                pst.setInt(6,cod_g);
                pst.setString(7, "VERSO BANCA");
                pst.setInt(8,prezzo);
                pst.setInt(9, 0);
                
                String query4="UPDATE PARTITA_GIOCATORE SET CONTO=CONTO-"+prezzo+"WHERE PARTITA="+cod_partita+" AND GIOCATORE="+cod_g;
                pst4 = con.prepareStatement(query4);
                pst4.executeUpdate(query4);
                    
                
                query="SELECT MAX(ID_POSSEDIMENTO) FROM POSSEDIMENTO";
                pst1 = con.prepareStatement(query);
                rs = pst1.executeQuery();
                while(rs.next()){
                    ID_Poss = rs.getInt(1);
                }
                  
                 String query3="INSERT INTO POSSEDIMENTO(ID_POSSEDIMENTO,NOME,TIPO_POSSEDIMENTO,NUM_CASA,ID_CONTRATTO,ID_GIOCATORE) VALUES(?,?,?,?,?,?)";
                    pst2 = con.prepareStatement(query3);
                    pst2.setInt(1, ID_Poss+1);
                    pst2.setString(2,casellaP);
                    pst2.setString(3, "CASA");
                    pst2.setInt(4,1);
                    pst2.setInt(5,id_contrP);
                    pst2.setInt(6,cod_g);
                    
                    pst2.executeUpdate();
                    
                    pst.setInt(10,ID_Poss+1);
                } else if(TP==8){
                    query2="INSERT INTO MOSSA(ID_MOSSA,TURNO,ORDINE,TIPO_MOSSA,ID_PARTITA,ID_GIOCATORE,TIPO_PAGAMENTO,PAGAMENTO_DATO,PAGAMENTO_RICEVUTO,ID_POSSEDIMENTO) VALUES(?,?,?,?,?,?,?,?,?,?)";
                  pst = con.prepareStatement(query2);
                pst.setInt(1,(ID_Mossa+1));
                pst.setInt(2,turno);
                pst.setInt(3,ordine+1);
                pst.setString(4,"PAGAMENTO");
                pst.setInt(5, cod_partita);
                pst.setInt(6,cod_g);
                pst.setString(7, "VERSO BANCA");
                pst.setInt(8,prezzo);
                pst.setInt(9, 0);
                    
                String query4="UPDATE PARTITA_GIOCATORE SET CONTO=CONTO-"+prezzo+"WHERE PARTITA="+cod_partita+" AND GIOCATORE="+cod_g;
                pst4 = con.prepareStatement(query4);
                pst4.executeUpdate(query4);
                
                query="SELECT MAX(ID_POSSEDIMENTO) FROM POSSEDIMENTO";
                pst1 = con.prepareStatement(query);
                rs = pst1.executeQuery();
                while(rs.next()){
                    ID_Poss = rs.getInt(1);
                }
                
                 String query3="INSERT INTO POSSEDIMENTO(ID_POSSEDIMENTO,NOME,TIPO_POSSEDIMENTO,NUM_CASA,ID_CONTRATTO,ID_GIOCATORE) VALUES(?,?,?,?,?,?)";
                    pst2 = con.prepareStatement(query3);
                    pst2.setInt(1, ID_Poss+1);
                    pst2.setString(2,casellaP);
                    pst2.setString(3, "CASA");
                    pst2.setInt(4,2);
                    pst2.setInt(5,id_contrP);
                    pst2.setInt(6,cod_g);
                    
                    pst2.executeUpdate();
                    
                    pst.setInt(10,ID_Poss+1);
                } else if(TP==9){
                    query2="INSERT INTO MOSSA(ID_MOSSA,TURNO,ORDINE,TIPO_MOSSA,ID_PARTITA,ID_GIOCATORE,TIPO_PAGAMENTO,PAGAMENTO_DATO,PAGAMENTO_RICEVUTO,ID_POSSEDIMENTO) VALUES(?,?,?,?,?,?,?,?,?,?)";
                  pst = con.prepareStatement(query2);
                pst.setInt(1,(ID_Mossa+1));
                pst.setInt(2,turno);
                pst.setInt(3,ordine+1);
                pst.setString(4,"PAGAMENTO");
                pst.setInt(5, cod_partita);
                pst.setInt(6,cod_g);
                pst.setString(7, "VERSO BANCA");
                pst.setInt(8,prezzo);
                pst.setInt(9, 0);
                    
                
                String query4="UPDATE PARTITA_GIOCATORE SET CONTO=CONTO-"+prezzo+"WHERE PARTITA="+cod_partita+" AND GIOCATORE="+cod_g;
                pst4 = con.prepareStatement(query4);
                pst4.executeUpdate(query4);
                
                query="SELECT MAX(ID_POSSEDIMENTO) FROM POSSEDIMENTO";
                pst1 = con.prepareStatement(query);
                rs = pst1.executeQuery();
                while(rs.next()){
                    ID_Poss = rs.getInt(1);
                }
                  
                 String query3="INSERT INTO POSSEDIMENTO(ID_POSSEDIMENTO,NOME,TIPO_POSSEDIMENTO,NUM_CASA,ID_CONTRATTO,ID_GIOCATORE) VALUES(?,?,?,?,?,?)";
                    pst2 = con.prepareStatement(query3);
                    pst2.setInt(1, ID_Poss+1);
                    pst2.setString(2,casellaP);
                    pst2.setString(3, "CASA");
                    pst2.setInt(4,3);
                    pst2.setInt(5,id_contrP);
                    pst2.setInt(6,cod_g);
                    
                    pst2.executeUpdate();
                    
                    pst.setInt(10,ID_Poss+1);
                } else if(TP==10){
                    query2="INSERT INTO MOSSA(ID_MOSSA,TURNO,ORDINE,TIPO_MOSSA,ID_PARTITA,ID_GIOCATORE,TIPO_PAGAMENTO,PAGAMENTO_DATO,PAGAMENTO_RICEVUTO,ID_POSSEDIMENTO) VALUES(?,?,?,?,?,?,?,?,?,?)";
                  pst = con.prepareStatement(query2);
                pst.setInt(1,(ID_Mossa+1));
                pst.setInt(2,turno);
                pst.setInt(3,ordine+1);
                pst.setString(4,"PAGAMENTO");
                pst.setInt(5, cod_partita);
                pst.setInt(6,cod_g);
                pst.setString(7, "VERSO BANCA");
                pst.setInt(8,prezzo);
                pst.setInt(9, 0);
                    
                String query4="UPDATE PARTITA_GIOCATORE SET CONTO=CONTO-"+prezzo+"WHERE PARTITA="+cod_partita+" AND GIOCATORE="+cod_g;
                pst4 = con.prepareStatement(query4);
                pst4.executeUpdate(query4);
                
                query="SELECT MAX(ID_POSSEDIMENTO) FROM POSSEDIMENTO";
                pst1 = con.prepareStatement(query);
                rs = pst1.executeQuery();
                while(rs.next()){
                    ID_Poss = rs.getInt(1);
                }
                  
                 String query3="INSERT INTO POSSEDIMENTO(ID_POSSEDIMENTO,NOME,TIPO_POSSEDIMENTO,NUM_CASA,ID_CONTRATTO,ID_GIOCATORE) VALUES(?,?,?,?,?,?)";
                    pst2 = con.prepareStatement(query3);
                    pst2.setInt(1, ID_Poss+1);
                    pst2.setString(2,casellaP);
                    pst2.setString(3, "CASA");
                    pst2.setInt(4,4);
                    pst2.setInt(5,id_contrP);
                    pst2.setInt(6,cod_g);
                    
                    pst2.executeUpdate();
                    
                    pst.setInt(10,ID_Poss+1);
                } else if(TP==11){
                    query2="INSERT INTO MOSSA(ID_MOSSA,TURNO,ORDINE,TIPO_MOSSA,ID_PARTITA,ID_GIOCATORE,TIPO_PAGAMENTO,PAGAMENTO_DATO,PAGAMENTO_RICEVUTO,ID_POSSEDIMENTO) VALUES(?,?,?,?,?,?,?,?,?,?)";
                  pst = con.prepareStatement(query2);
                pst.setInt(1,(ID_Mossa+1));
                pst.setInt(2,turno);
                pst.setInt(3,ordine+1);
                pst.setString(4,"PAGAMENTO");
                pst.setInt(5, cod_partita);
                pst.setInt(6,cod_g);
                pst.setString(7, "VERSO BANCA");
                pst.setInt(8,prezzo);
                pst.setInt(9, 0);
                    
                
                String query4="UPDATE PARTITA_GIOCATORE SET CONTO=CONTO-"+prezzo+"WHERE PARTITA="+cod_partita+" AND GIOCATORE="+cod_g;
                pst4 = con.prepareStatement(query4);
                pst4.executeUpdate(query4);
                
                
                query="SELECT MAX(ID_POSSEDIMENTO) FROM POSSEDIMENTO";
                pst1 = con.prepareStatement(query);
                rs = pst1.executeQuery();
                while(rs.next()){
                    ID_Poss = rs.getInt(1);
                }
                  
                 String query3="INSERT INTO POSSEDIMENTO(ID_POSSEDIMENTO,NOME,TIPO_POSSEDIMENTO,NUM_CASA,ID_CONTRATTO,ID_GIOCATORE) VALUES(?,?,?,?,?,?)";
                    pst2 = con.prepareStatement(query3);
                    pst2.setInt(1, ID_Poss+1);
                    pst2.setString(2,casellaP);
                    pst2.setString(3, "ALBERGO");
                    pst2.setInt(4,0);
                    pst2.setInt(5,id_contrP);
                    pst2.setInt(6,cod_g);
                    
                    pst2.executeUpdate();
                    
                    pst.setInt(10,ID_Poss+1);
                } else if(TP==12){
                    query2="INSERT INTO MOSSA(ID_MOSSA,TURNO,ORDINE,TIPO_MOSSA,ID_PARTITA,ID_GIOCATORE,TIPO_PAGAMENTO,PAGAMENTO_DATO,PAGAMENTO_RICEVUTO,ID_POSSEDIMENTO) VALUES(?,?,?,?,?,?,?,?,?,?)";
                  pst = con.prepareStatement(query2);
                pst.setInt(1,(ID_Mossa+1));
                pst.setInt(2,turno);
                pst.setInt(3,ordine+1);
                pst.setString(4,"PAGAMENTO");
                pst.setInt(5, cod_partita);
                pst.setInt(6,cod_g);
                pst.setString(7, "VERSO BANCA");
                pst.setInt(8,prezzo);
                pst.setInt(9, 0);
                  
                String query4="UPDATE PARTITA_GIOCATORE SET CONTO=CONTO+"+prezzo+"WHERE PARTITA="+cod_partita+" AND GIOCATORE="+cod_g;
                pst4 = con.prepareStatement(query4);
                pst4.executeUpdate(query4);
                
                query="SELECT MAX(ID_POSSEDIMENTO) FROM POSSEDIMENTO";
                pst1 = con.prepareStatement(query);
                rs = pst1.executeQuery();
                while(rs.next()){
                    ID_Poss = rs.getInt(1);
                }
                  
                 String query3="INSERT INTO POSSEDIMENTO(ID_POSSEDIMENTO,NOME,TIPO_POSSEDIMENTO,NUM_CASA,ID_CONTRATTO,ID_GIOCATORE) VALUES(?,?,?,?,?,?)";
                    pst2 = con.prepareStatement(query3);
                    pst2.setInt(1, ID_Poss+1);
                    pst2.setString(2,casellaP);
                    pst2.setString(3, "IPOTECATA");
                    pst2.setInt(4,0);
                    pst2.setInt(5,id_contrP);
                    pst2.setInt(6,cod_g);
                    
                    pst2.executeUpdate();
                    
                    pst.setInt(10,ID_Poss+1);
                }
                
                
                
                pst.executeUpdate();
                if(TP==4){
                    query2="INSERT INTO PAGAMENTO_GIOCATORE(ID_MOSSA,ID_GIOCATORE) VALUES (?,?)";
                    pst = con.prepareStatement(query2);
                    pst.setInt(1,(ID_Mossa+1));
                    pst.setInt(2, ID_G[g_2.getSelectedIndex()]);
                    pst.executeUpdate();
                    
                    String query4="UPDATE PARTITA_GIOCATORE SET CONTO=CONTO+"+prezzo+"WHERE PARTITA="+cod_partita+" AND GIOCATORE="+ ID_G[g_2.getSelectedIndex()];
                    pst4 = con.prepareStatement(query4);
                    pst4.executeUpdate(query4);
                }
                
                if(TP==5){
                     query2="INSERT INTO PAGAMENTO_GIOCATORE(ID_MOSSA,ID_GIOCATORE) VALUES (?,?)";
                    pst = con.prepareStatement(query2);
                    pst.setInt(1,(ID_Mossa+1));
                    pst.setInt(2, ID_G[g_2.getSelectedIndex()]);
                    pst.executeUpdate();
                    
                    String query4="UPDATE PARTITA_GIOCATORE SET CONTO=CONTO+"+prezzo+"WHERE PARTITA="+cod_partita+" AND GIOCATORE="+ ID_G[g_2.getSelectedIndex()];
                    pst4 = con.prepareStatement(query4);
                    pst4.executeUpdate(query4);
                }
               
                con.close();
               UIManager.put("OptionPane.background",new ColorUIResource(193,255,193));
               UIManager.put("Panel.background",new ColorUIResource(193,255,193));
               UIManager.put("OptionPane.messageFont", new Font("ITC Kabel Std", Font.BOLD, 14));
               UIManager.put("OptionPane.buttonFont", new Font("AppleMyungjo", Font.ITALIC, 12));
               JOptionPane.showMessageDialog(this, "Inserimento riuscito!", "", JOptionPane.INFORMATION_MESSAGE,new ImageIcon("pollice.gif"));
               
               
               this.dispose();
               Inserimento_Mossa obj1 = new Inserimento_Mossa();
               obj1.setVisible(true);
        } catch(SQLException | NumberFormatException e){ 
            UIManager.put("OptionPane.background",new ColorUIResource(193,255,193));
                UIManager.put("Panel.background",new ColorUIResource(193,255,193));
                UIManager.put("OptionPane.messageFont", new Font("ITC Kabel Std", Font.BOLD, 14));
                UIManager.put("OptionPane.buttonFont", new Font("AppleMyungjo", Font.ITALIC, 12));
                JOptionPane.showMessageDialog(this, "Inserire tutti i campi!", "Errore", JOptionPane.ERROR_MESSAGE,new ImageIcon("prigione.gif"));}
       

    }//GEN-LAST:event_aggiungi5ActionPerformed

    private void tipo_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipo_pActionPerformed
       if (tipo_p.getSelectedIndex()==4 | tipo_p.getSelectedIndex()==5){
            g_2.setEnabled(true);
             try{
            con = Database.getDefaultConnection();
            String sql ="SELECT GIOCATORE.ID_GIOCATORE,GIOCATORE.NOME FROM GIOCATORE JOIN PARTITA_GIOCATORE ON GIOCATORE.ID_GIOCATORE=PARTITA_GIOCATORE.GIOCATORE WHERE GIOCATORE.ID_GIOCATORE<>"+cod_g+" AND PARTITA_GIOCATORE.PARTITA="+cod_partita+" ORDER BY (GIOCATORE.ID_GIOCATORE) ASC";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            int k=0;
            g_2.removeAllItems();
            while(rs.next()){
                if(cod_g!=rs.getInt(1)){
                    g_2.addItem(""+rs.getInt(1)+" - "+rs.getString(2));
                    ID_G[k]= rs.getInt(1);
                    k++;
                }
            }
            con.close(); 
         } catch(SQLException e){ System.out.println(e);}
         
        } else 
            g_2.setEnabled(false);
    }//GEN-LAST:event_tipo_pActionPerformed

    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IMossa_Pagamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aggiungi5;
    private javax.swing.JComboBox<String> g_2;
    private javax.swing.JTextPane importo;
    private javax.swing.JButton indietro5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable tab_m;
    private javax.swing.JTextPane testo;
    private javax.swing.JTextPane testo2;
    private javax.swing.JTextPane testo3;
    private javax.swing.JTextPane testo4;
    private javax.swing.JComboBox<String> tipo_p;
    private javax.swing.JComboBox<String> turno1;
    // End of variables declaration//GEN-END:variables
}
