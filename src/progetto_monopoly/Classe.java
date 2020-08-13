package progetto_monopoly;

import java.awt.Font;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import net.proteanit.sql.DbUtils;
import static progetto_monopoly.Home.flag;

public class Classe extends javax.swing.JFrame {
    String sql = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    Connection con = null;

    
    
    public Classe() {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        tab.setDefaultEditor(Object.class, null);
        tab.setRowHeight(20);
        try{
            switch(flag){
            case 1:
                 tabella.setText("Carta");
                 tabella.setEnabled(false);
                 con = Database.getDefaultConnection();
                 sql ="SELECT * FROM CARTA ORDER BY (ID_CARTA) ASC";
                 pst = con.prepareStatement(sql);
                 rs = pst.executeQuery();
                    
                tab.setModel(DbUtils.resultSetToTableModel(rs));
                con.close(); 
                break;
            case 2:
                tabella.setText("Casella");
                con = Database.getDefaultConnection();
                 sql ="SELECT * FROM CASELLA ORDER BY (CASELLA.ID_CASELLA) ASC";
                 pst = con.prepareStatement(sql);
                 rs = pst.executeQuery();
                    
                tab.setModel(DbUtils.resultSetToTableModel(rs));
                con.close(); 
                break;
            case 3:
                tabella.setText("Contratto");
                 tabella.setEnabled(false);
                con = Database.getDefaultConnection();
                 sql ="SELECT ID_Contratto, Nome, Tipo_Contratto, ValIpotecario, Colore, RenditaSemplice, Rendita1Casa, Rendita2Case, Rendita3Case, Rendita4Case, RenditaAlbergo, PrezzoAcquistoEd, Tipo_NonEd, Rendita2Stazioni, Rendita3Stazioni, Rendita4Stazioni, Rendita2Societa, Prezzo, Testo1Societa,Testo2Societa FROM CONTRATTO ORDER BY (ID_CONTRATTO) ASC";
                 pst = con.prepareStatement(sql);
                 rs = pst.executeQuery();
                    
                tab.setModel(DbUtils.resultSetToTableModel(rs));
                con.close();
                break;
            case 4:
                tabella.setText("Giocatore");
                 tabella.setEnabled(false);
                con = Database.getDefaultConnection();
                 sql ="SELECT * FROM GIOCATORE ORDER BY (ID_GIOCATORE) ASC";
                 pst = con.prepareStatement(sql);
                 rs = pst.executeQuery();
                    
                tab.setModel(DbUtils.resultSetToTableModel(rs));
                con.close();
                break;
            case 5:
                tabella.setText("Mossa");
                 tabella.setEnabled(false);
                con = Database.getDefaultConnection();
                sql ="SELECT ID_Mossa, Turno, Ordine, Tipo_Mossa, Dado1, Dado2, Tipo_Pagamento, Pagamento_dato, Pagamento_ricevuto FROM MOSSA ORDER BY (MOSSA.ID_MOSSA) ASC";  
                pst = con.prepareStatement(sql);
                 rs = pst.executeQuery();
                    
                tab.setModel(DbUtils.resultSetToTableModel(rs));
                con.close();
                break;
            case 6:
                tabella.setText("Partita");
                 tabella.setEnabled(false);
                con = Database.getDefaultConnection();
                sql ="SELECT * FROM PARTITA ORDER BY ID_PARTITA ";
                pst = con.prepareStatement(sql);
                 rs = pst.executeQuery();
                    
                tab.setModel(DbUtils.resultSetToTableModel(rs));
                con.close();
                break;
            case 7:
                tabella.setText("Possedimento");
                 tabella.setEnabled(false);
                con = Database.getDefaultConnection();
               sql ="SELECT ID_Possedimento, Nome, Tipo_Possedimento, Num_Casa FROM POSSEDIMENTO ORDER BY (ID_POSSEDIMENTO) ASC";
                pst = con.prepareStatement(sql);
                rs = pst.executeQuery();
                    
                tab.setModel(DbUtils.resultSetToTableModel(rs));
                con.close(); 
                break;
        }
       } catch(SQLException e){ System.out.println(e);}
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cModifica = new javax.swing.JButton();
        cElimina = new javax.swing.JButton();
        cRicerca = new javax.swing.JButton();
        cInserisci = new javax.swing.JButton();
        cIndietro = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabella = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 600));
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setPreferredSize(new java.awt.Dimension(1000, 600));
        setSize(new java.awt.Dimension(1000, 600));

        jPanel1.setBackground(new java.awt.Color(193, 255, 193));
        jPanel1.setMaximumSize(new java.awt.Dimension(1000, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 600));
        jPanel1.setSize(new java.awt.Dimension(1000, 600));

        jLabel1.setFont(new java.awt.Font("ITC Kabel Std", 1, 13)); // NOI18N
        jLabel1.setText("Selezionare l'operazione che si desidera effettuare su");

        cModifica.setFont(new java.awt.Font("Kabel", 2, 12)); // NOI18N
        cModifica.setText("Modifica");
        cModifica.setMaximumSize(new java.awt.Dimension(105, 50));
        cModifica.setMinimumSize(new java.awt.Dimension(105, 50));
        cModifica.setPreferredSize(new java.awt.Dimension(105, 50));
        cModifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cModificaActionPerformed(evt);
            }
        });

        cElimina.setFont(new java.awt.Font("Kabel", 2, 12)); // NOI18N
        cElimina.setText("Elimina");
        cElimina.setMaximumSize(new java.awt.Dimension(125, 50));
        cElimina.setMinimumSize(new java.awt.Dimension(125, 50));
        cElimina.setPreferredSize(new java.awt.Dimension(125, 50));
        cElimina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cEliminaActionPerformed(evt);
            }
        });

        cRicerca.setFont(new java.awt.Font("Kabel", 2, 12)); // NOI18N
        cRicerca.setText("Ricerca");
        cRicerca.setToolTipText("");
        cRicerca.setPreferredSize(new java.awt.Dimension(105, 50));
        cRicerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cRicercaActionPerformed(evt);
            }
        });

        cInserisci.setFont(new java.awt.Font("Kabel", 2, 12)); // NOI18N
        cInserisci.setText("Inserisci");
        cInserisci.setMaximumSize(new java.awt.Dimension(105, 50));
        cInserisci.setMinimumSize(new java.awt.Dimension(105, 50));
        cInserisci.setPreferredSize(new java.awt.Dimension(105, 50));
        cInserisci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cInserisciActionPerformed(evt);
            }
        });

        cIndietro.setBackground(new java.awt.Color(204, 0, 0));
        cIndietro.setFont(new java.awt.Font("Kabel", 2, 12)); // NOI18N
        cIndietro.setForeground(new java.awt.Color(153, 0, 0));
        cIndietro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progetto_monopoly/icone/back.png"))); // NOI18N
        cIndietro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cIndietroActionPerformed(evt);
            }
        });

        jScrollPane2.setBackground(new java.awt.Color(193, 255, 193));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(193, 255, 193), 0));
        jScrollPane2.setForeground(new java.awt.Color(193, 255, 193));

        tabella.setBackground(new java.awt.Color(193, 255, 193));
        tabella.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(193, 255, 193), 0));
        tabella.setFont(new java.awt.Font("ITC Kabel Std", 3, 18)); // NOI18N
        tabella.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(tabella);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progetto_monopoly/icone/p4.jpg"))); // NOI18N

        jPanel2.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N

        jScrollPane1.setBackground(new java.awt.Color(193, 255, 193));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        jScrollPane1.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N

        tab.setBackground(new java.awt.Color(193, 255, 193));
        tab.setFont(new java.awt.Font("ITC Kabel Std", 1, 12)); // NOI18N
        tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tab.setBounds(new java.awt.Rectangle(0, 0, 0, 15));
        tab.setSelectionBackground(new java.awt.Color(204, 0, 0));
        tab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tab);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progetto_monopoly/icone/icona.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("ITC Kabel Std", 0, 14)); // NOI18N
        jLabel4.setText("Prima di cliccare su Modifica  o Elimina seleziona riga.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(cIndietro))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cInserisci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cModifica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cRicerca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cElimina, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel3)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(cIndietro)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1)
                        .addGap(3, 3, 3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(cInserisci, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(cModifica, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(cRicerca, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(cElimina, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel3))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1006, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cInserisciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cInserisciActionPerformed
        switch (flag) {
           case 1 :
                this.dispose();
                Inserimento_Carta obj = new Inserimento_Carta();
                obj.setVisible(true);
                break;
            case 2 :
                this.dispose();
                Inserimento_Casella obj2 = new Inserimento_Casella();
                obj2.setVisible(true);
                break;
            case 3 :
                this.dispose();
                Inserimento_Contratto obj3 = new Inserimento_Contratto();
                obj3.setVisible(true);
                break;
            case 4 :
                this.dispose();
                Scelta_Partita obj4 = new Scelta_Partita();
                obj4.setVisible(true);
                break;
            case 5 :
                this.dispose();
                Inserimento_Mossa obj5 = new Inserimento_Mossa();
                obj5.setVisible(true);
                break;
            case 6 :
                this.dispose();
                Inserimento_Partita obj6 = new Inserimento_Partita();
                obj6.setVisible(true);
                break;   
            case 7 :
                this.dispose();
                Inserimento_Possedimento obj7 = new Inserimento_Possedimento();
                obj7.setVisible(true);
       }
    }//GEN-LAST:event_cInserisciActionPerformed

    private void cIndietroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cIndietroActionPerformed
        this.dispose();
        Home obj = new Home();
        obj.setVisible(true);
    }//GEN-LAST:event_cIndietroActionPerformed

    private void cModificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cModificaActionPerformed
     if(tab.getSelectedRow()!=-1){//se non hai selezionato niente
           switch (flag) {
            case 1:
                   this.dispose();
                    Modifica_Carta obj = null;
                    try {
                        obj = new Modifica_Carta();
                    } catch (Exception ex) {
                        Logger.getLogger(Classe.class.getName()).log(Level.SEVERE, null, ex);
                    } 
                        obj.setVisible(true);
                        break;
            case 2 :
                this.dispose();
                Modifica_Casella obj2 = null;
                try {
                      obj2 = new Modifica_Casella();
                } catch (Exception ex) {
                    Logger.getLogger(Class.class.getName()).log(Level.SEVERE, null, ex);
                } 
                obj2.setVisible(true);
                break;
            case 3 :
                this.dispose();
                Modifica_Contratto obj3 = null;
                    try {
                        obj3 = new Modifica_Contratto();
                    } catch (Exception ex) {
                        Logger.getLogger(Class.class.getName()).log(Level.SEVERE, null, ex);
                    }
                obj3.setVisible(true);
                break;
            case 4 :
                this.dispose();
               Modifica_Giocatore obj4 = null;
                try {
                    obj4 = new Modifica_Giocatore();
                } catch (Exception ex) {
                    Logger.getLogger(Class.class.getName()).log(Level.SEVERE, null, ex);
                }
                obj4.setVisible(true);
                break; 
            case 5 :
                this.dispose();
               Modifica_Mossa obj5 = null;
                try {
                    obj5 = new Modifica_Mossa();
                } catch (Exception ex) {
                    Logger.getLogger(Class.class.getName()).log(Level.SEVERE, null, ex);
                }
                obj5.setVisible(true);
                break; 
            case 6 :
                this.dispose();
               Modifica_Partita obj6 = null;
                try {
                    obj6 = new Modifica_Partita();
                } catch (Exception ex) {
                    Logger.getLogger(Class.class.getName()).log(Level.SEVERE, null, ex);
                }
                obj6.setVisible(true);
                break; 
            case 7 :
                this.dispose();
               Modifica_Possedimento obj7 = null;
                try {
                    obj7 = new Modifica_Possedimento();
                } catch (Exception ex) {
                    Logger.getLogger(Class.class.getName()).log(Level.SEVERE, null, ex);
                }
                obj7.setVisible(true);
                break; 
      }
     }else {
        UIManager.put("OptionPane.background",new ColorUIResource(193,255,193));
                UIManager.put("Panel.background",new ColorUIResource(193,255,193));
                UIManager.put("OptionPane.messageFont", new Font("ITC Kabel Std", Font.BOLD, 14));
                UIManager.put("OptionPane.buttonFont", new Font("AppleMyungjo", Font.ITALIC, 12));
                JOptionPane.showMessageDialog(this, "Seleziona riga!", "Errore", JOptionPane.ERROR_MESSAGE,new ImageIcon("seleziona.gif"));
       }
     
   
     
    }//GEN-LAST:event_cModificaActionPerformed

    private void cEliminaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cEliminaActionPerformed
         if(tab.getSelectedRow()!=-1){//se non hai selezionato niente
        switch (flag) {
        case 1 :
       
                   this.dispose();
                   Cancellazione_Carta obj = null;
                    try {
                        obj = new Cancellazione_Carta();
                    } catch (Exception ex) {
                        Logger.getLogger(Classe.class.getName()).log(Level.SEVERE, null, ex);
                    } 
                        obj.setVisible(true);
                        break;
            
                case 2 :
                this.dispose();
                Cancellazione_Casella obj2 = null;
                try {
                      obj2 = new Cancellazione_Casella();
                } catch (Exception ex) {
                    System.out.println(ex);
                    Logger.getLogger(Class.class.getName()).log(Level.SEVERE, null, ex);
                } 
                obj2.setVisible(true);
                break;
            case 3 :
                this.dispose();
                Cancellazione_Contratto obj3 = null;
                    try {
                        obj3 = new Cancellazione_Contratto();
                    } catch (Exception ex) {
                        Logger.getLogger(Class.class.getName()).log(Level.SEVERE, null, ex);
                    }
                obj3.setVisible(true);
                break;
            case 4 :
                this.dispose();
               Cancellazione_Giocatore obj4 = null;
                try {
                    obj4 = new Cancellazione_Giocatore();
                } catch (Exception ex) {
                    Logger.getLogger(Class.class.getName()).log(Level.SEVERE, null, ex);
                }
                obj4.setVisible(true);
                break; 
            case 5 :
                this.dispose();
               Cancellazione_Mossa obj5 = null;
                try {
                    obj5 = new Cancellazione_Mossa();
                } catch (Exception ex) {
                    Logger.getLogger(Class.class.getName()).log(Level.SEVERE, null, ex);
                }
                obj5.setVisible(true);
                break; 
            case 6 :
                this.dispose();
               Cancellazione_Partita obj6 = null;
                try {
                    obj6 = new Cancellazione_Partita();
                } catch (Exception ex) {
                    Logger.getLogger(Class.class.getName()).log(Level.SEVERE, null, ex);
                }
                obj6.setVisible(true);
                break; 
            case 7 :
                this.dispose();
               Cancellazione_Possedimento obj7 = null;
                try {
                    obj7 = new Cancellazione_Possedimento();
                } catch (Exception ex) {
                    Logger.getLogger(Class.class.getName()).log(Level.SEVERE, null, ex);
                }
                obj7.setVisible(true);
                break; 
      }
         }else {
        UIManager.put("OptionPane.background",new ColorUIResource(193,255,193));
                UIManager.put("Panel.background",new ColorUIResource(193,255,193));
                UIManager.put("OptionPane.messageFont", new Font("ITC Kabel Std", Font.BOLD, 14));
                UIManager.put("OptionPane.buttonFont", new Font("AppleMyungjo", Font.ITALIC, 12));
                JOptionPane.showMessageDialog(this, "Seleziona riga!", "Errore", JOptionPane.ERROR_MESSAGE,new ImageIcon("seleziona.gif"));
       }
     
    }//GEN-LAST:event_cEliminaActionPerformed

    private void tabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabMouseClicked
             switch (flag) {
            case 1: 
                    Dati_Tabella.ID_Carta=(Number)tab.getValueAt(tab.getSelectedRow(),0);
                    Dati_Tabella.Tipo_carta=(String)tab.getValueAt(tab.getSelectedRow(),1);
                    Dati_Tabella.Testo_carta=(String)tab.getValueAt(tab.getSelectedRow(),2);
                    Dati_Tabella.Importo=(BigDecimal)tab.getValueAt(tab.getSelectedRow(),3);
                    break;
            case 2:  
                    Dati_Tabella.ID_Casella=(Number)tab.getValueAt(tab.getSelectedRow(),0);
                    Dati_Tabella.nome_casella=(String)tab.getValueAt(tab.getSelectedRow(),1);
                    Dati_Tabella.posizione=(BigDecimal)tab.getValueAt(tab.getSelectedRow(),2);
                    Dati_Tabella.Tipo_casella=(String)tab.getValueAt(tab.getSelectedRow(),3);
                    Dati_Tabella.Tipo_non_edificabile=(String)tab.getValueAt(tab.getSelectedRow(),4);
                    Dati_Tabella.colore=(String)tab.getValueAt(tab.getSelectedRow(),5);
                    Dati_Tabella.testo_casella=(String)tab.getValueAt(tab.getSelectedRow(),6);
                    Dati_Tabella.prezzo=(BigDecimal)tab.getValueAt(tab.getSelectedRow(),7);
                    break;
            case 3: 
                    Dati_Tabella.ID_Contratto=(Number)tab.getValueAt(tab.getSelectedRow(),0);
                    Dati_Tabella.Nome_contratto=(String)tab.getValueAt(tab.getSelectedRow(),1);
                    Dati_Tabella.Tipo_Contratto=(String)tab.getValueAt(tab.getSelectedRow(),2);
                    Dati_Tabella.ValIpotecario=(BigDecimal)tab.getValueAt(tab.getSelectedRow(),3);
                    Dati_Tabella.Colore=(String)tab.getValueAt(tab.getSelectedRow(),4);
                    Dati_Tabella.RenditaSemplice=(BigDecimal)tab.getValueAt(tab.getSelectedRow(),5);
                    Dati_Tabella.Rendita1Casa=(BigDecimal)tab.getValueAt(tab.getSelectedRow(),6);
                    Dati_Tabella.Rendita2Case=(BigDecimal)tab.getValueAt(tab.getSelectedRow(),7);
                    Dati_Tabella.Rendita3Case=(BigDecimal)tab.getValueAt(tab.getSelectedRow(),8);
                    Dati_Tabella.Rendita4Case=(BigDecimal)tab.getValueAt(tab.getSelectedRow(),9);
                    Dati_Tabella.RenditaAlbergo=(BigDecimal)tab.getValueAt(tab.getSelectedRow(),10);
                    Dati_Tabella.PrezzoAcquistoEd=(BigDecimal)tab.getValueAt(tab.getSelectedRow(),11);
                    Dati_Tabella.Tipo_NonEd=(String)tab.getValueAt(tab.getSelectedRow(),12);
                    Dati_Tabella.Rendita2Stazioni=(BigDecimal)tab.getValueAt(tab.getSelectedRow(),13);
                    Dati_Tabella.Rendita3Stazioni=(BigDecimal)tab.getValueAt(tab.getSelectedRow(),14);
                    Dati_Tabella.Rendita4Stazioni=(BigDecimal)tab.getValueAt(tab.getSelectedRow(),15);
                    Dati_Tabella.Rendita2Società=(BigDecimal)tab.getValueAt(tab.getSelectedRow(),16);
                    Dati_Tabella.Prezzo=(BigDecimal)tab.getValueAt(tab.getSelectedRow(),17);
                    Dati_Tabella.Testo1Società=(String)tab.getValueAt(tab.getSelectedRow(),18);
                    Dati_Tabella.Testo2Società=(String)tab.getValueAt(tab.getSelectedRow(),19);
                    break;
            case 4:       
                    Dati_Tabella.ID_Giocatore=(Number)tab.getValueAt(tab.getSelectedRow(),0);
                    Dati_Tabella.nome_giocatore=(String)tab.getValueAt(tab.getSelectedRow(),1);
                    break;
            case 5:       
                    Dati_Tabella.ID_Mossa=(Number)tab.getValueAt(tab.getSelectedRow(),0);
                    Dati_Tabella.turno=(BigDecimal)tab.getValueAt(tab.getSelectedRow(),1);
                    Dati_Tabella.Ordine=(BigDecimal)tab.getValueAt(tab.getSelectedRow(),2);
                    Dati_Tabella.Tipo_Mossa=(String)tab.getValueAt(tab.getSelectedRow(),3);
                    Dati_Tabella.Dado1=(BigDecimal)tab.getValueAt(tab.getSelectedRow(),4);
                    Dati_Tabella.Dado2=(BigDecimal)tab.getValueAt(tab.getSelectedRow(),5);
                    Dati_Tabella.Tipo_Pagamento=(String)tab.getValueAt(tab.getSelectedRow(),6);
                    Dati_Tabella.Pagamento_dato=(BigDecimal)tab.getValueAt(tab.getSelectedRow(),7);
                    Dati_Tabella.Pagamento_ricevuto=(BigDecimal)tab.getValueAt(tab.getSelectedRow(),8);
                    break;
            case 6:       
                    Dati_Tabella.ID_Partita=(Number)tab.getValueAt(tab.getSelectedRow(),0);
                    Dati_Tabella.numero_giocatori=(BigDecimal)tab.getValueAt(tab.getSelectedRow(),1);
                    break;
            case 7:       
                    Dati_Tabella.ID_Possedimento=(Number)tab.getValueAt(tab.getSelectedRow(),0);
                    Dati_Tabella.Num_casa=(BigDecimal)tab.getValueAt(tab.getSelectedRow(),3);
                    Dati_Tabella.Tipo_possedimento=(String)tab.getValueAt(tab.getSelectedRow(),2);
                    Dati_Tabella.Nome_possedimento=(String)tab.getValueAt(tab.getSelectedRow(),1);
                    break;
                    
        }
    }//GEN-LAST:event_tabMouseClicked

    private void cRicercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cRicercaActionPerformed
         switch (flag) {
           case 1 :
                this.dispose();
                Ricerca_Carta obj = new Ricerca_Carta();
                obj.setVisible(true);
                break;
            case 2 :
                this.dispose();
                Ricerca_Casella obj2 = new Ricerca_Casella();
                obj2.setVisible(true);
                break;
            case 3 :
                this.dispose();
                Ricerca_Contratto obj3 = new Ricerca_Contratto();
                obj3.setVisible(true);
                break;
            case 4 :
                this.dispose();
                Ricerca_Giocatore obj4 = new Ricerca_Giocatore();
                obj4.setVisible(true);
                break;
            case 5 :
                this.dispose();
                Ricerca_Mossa obj5 = new Ricerca_Mossa();
                obj5.setVisible(true);
                break;
            case 6 :
                this.dispose();
                Ricerca_Partita obj6 = new Ricerca_Partita();
                obj6.setVisible(true);
                break;   
            case 7 :
                this.dispose();
                Ricerca_Possedimento obj7 = new Ricerca_Possedimento();
                obj7.setVisible(true);
       }
    }//GEN-LAST:event_cRicercaActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Classe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cElimina;
    private javax.swing.JButton cIndietro;
    private javax.swing.JButton cInserisci;
    private javax.swing.JButton cModifica;
    private javax.swing.JButton cRicerca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tab;
    private javax.swing.JTextPane tabella;
    // End of variables declaration//GEN-END:variables
}
