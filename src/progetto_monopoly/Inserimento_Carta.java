package progetto_monopoly;

import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;

public class Inserimento_Carta extends javax.swing.JFrame {
    Connection con = null;
    String testo;
    String imp;
    int ID_Carta,importo;
    PreparedStatement pst,pst1;
    ResultSet rs;
    int selection=0;
   
    public Inserimento_Carta() {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        indietro1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tipo_carta = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        testo1 = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        importo1 = new javax.swing.JTextPane();
        aggiungi1 = new javax.swing.JButton();
        clear1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(680, 420));
        setMinimumSize(new java.awt.Dimension(680, 420));
        setSize(new java.awt.Dimension(680, 420));

        jPanel1.setBackground(new java.awt.Color(193, 255, 193));
        jPanel1.setMaximumSize(new java.awt.Dimension(680, 420));
        jPanel1.setPreferredSize(new java.awt.Dimension(680, 420));
        jPanel1.setSize(new java.awt.Dimension(680, 420));
        jPanel1.setLayout(null);

        indietro1.setFont(new java.awt.Font("Kabel", 2, 12)); // NOI18N
        indietro1.setForeground(new java.awt.Color(153, 0, 0));
        indietro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progetto_monopoly/icone/back.png"))); // NOI18N
        indietro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indietro1ActionPerformed(evt);
            }
        });
        jPanel1.add(indietro1);
        indietro1.setBounds(21, 15, 81, 31);

        jLabel1.setFont(new java.awt.Font("ITC Kabel Std", 1, 13)); // NOI18N
        jLabel1.setText("Riempire i campi di Carta e premere Aggiungi per confermare");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(21, 56, 473, 17);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progetto_monopoly/icone/imprevisti.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(440, 50, 218, 354);

        jLabel3.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel3.setText("Seleziona tipo*");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(21, 99, 99, 19);

        tipo_carta.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        tipo_carta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IMPREVISTI", "PROBABILITÀ" }));
        tipo_carta.setToolTipText("");
        tipo_carta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipo_cartaActionPerformed(evt);
            }
        });
        jPanel1.add(tipo_carta);
        tipo_carta.setBounds(147, 91, 129, 32);

        jLabel4.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel4.setText("Testo*");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 130, 44, 19);

        testo1.setBackground(new java.awt.Color(193, 255, 193));
        testo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        testo1.setFont(new java.awt.Font("ITC Kabel Std", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(testo1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(147, 129, 290, 98);

        jLabel5.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel5.setText("Importo*");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(21, 250, 60, 19);

        importo1.setBackground(new java.awt.Color(193, 255, 193));
        importo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        importo1.setFont(new java.awt.Font("ITC Kabel Std", 0, 14)); // NOI18N
        jScrollPane2.setViewportView(importo1);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(147, 245, 109, 24);

        aggiungi1.setFont(new java.awt.Font("Kabel", 2, 12)); // NOI18N
        aggiungi1.setText("Aggiungi");
        aggiungi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aggiungi1ActionPerformed(evt);
            }
        });
        jPanel1.add(aggiungi1);
        aggiungi1.setBounds(84, 301, 107, 39);

        clear1.setFont(new java.awt.Font("Kabel", 2, 12)); // NOI18N
        clear1.setText("Clear");
        clear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear1ActionPerformed(evt);
            }
        });
        jPanel1.add(clear1);
        clear1.setBounds(231, 301, 107, 39);

        jLabel7.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        jLabel7.setText("*I campi contrassegnati con (*) sono obbligatori");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(21, 384, 317, 17);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void indietro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indietro1ActionPerformed
        this.dispose();
        Classe obj = new Classe();
        obj.setVisible(true);
    }//GEN-LAST:event_indietro1ActionPerformed

    private void aggiungi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aggiungi1ActionPerformed
        try{
                con = Database.getDefaultConnection();
                
                testo=testo1.getText();
                imp=importo1.getText();
                importo=Integer.parseInt(imp);
                
                String query="SELECT MAX(ID_CARTA) FROM DB_MONO.CARTA";
                pst1 = con.prepareStatement(query);
                rs = pst1.executeQuery();
                while(rs.next()){
                    ID_Carta = rs.getInt(1);
                }
                
                String query1="INSERT INTO CARTA(ID_CARTA,TIPO_CARTA,TESTO,IMPORTO) VALUES (?,?,?,?)";
                
                pst = con.prepareStatement(query1);
                pst.setInt(1,(ID_Carta+1));
                switch(selection){
                     case 0:
                         pst.setString(2,"IMPREVISTI");
                         break;
                     case 1:
                         pst.setString(2, "PROBABILITÀ");
                         break;
                }
                pst.setString(3,testo);
                pst.setInt(4,importo);
                
                pst.executeUpdate();
                con.close();
               UIManager.put("OptionPane.background",new ColorUIResource(193,255,193));
               UIManager.put("Panel.background",new ColorUIResource(193,255,193));
               UIManager.put("OptionPane.messageFont", new Font("ITC Kabel Std", Font.BOLD, 14));
               UIManager.put("OptionPane.buttonFont", new Font("AppleMyungjo", Font.ITALIC, 12));
               JOptionPane.showMessageDialog(this, "Inserimento riuscito!", "", JOptionPane.INFORMATION_MESSAGE,new ImageIcon("pollice.gif"));
               
               
                   this.dispose();
                   Classe obj = new Classe();
                   obj.setVisible(true);
                   
        }catch( NumberFormatException | SQLIntegrityConstraintViolationException t){
                UIManager.put("OptionPane.background",new ColorUIResource(193,255,193));
                UIManager.put("Panel.background",new ColorUIResource(193,255,193));
                UIManager.put("OptionPane.messageFont", new Font("ITC Kabel Std", Font.BOLD, 14));
                UIManager.put("OptionPane.buttonFont", new Font("AppleMyungjo", Font.ITALIC, 12));
                JOptionPane.showMessageDialog(this, "Inserire testo o importo! \n(In assenza di importo corrispondente inserire 0).", "Errore", JOptionPane.ERROR_MESSAGE,new ImageIcon("prigione.gif"));}
        catch(SQLException e){ System.out.println(e);
        }
    }//GEN-LAST:event_aggiungi1ActionPerformed

    private void tipo_cartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipo_cartaActionPerformed
        selection=tipo_carta.getSelectedIndex();
    }//GEN-LAST:event_tipo_cartaActionPerformed

    private void clear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear1ActionPerformed
       testo1.setText(null);
       importo1.setText(null);
       tipo_carta.setSelectedIndex(0);
    }//GEN-LAST:event_clear1ActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inserimento_Carta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aggiungi1;
    private javax.swing.JButton clear1;
    private javax.swing.JTextPane importo1;
    private javax.swing.JButton indietro1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane testo1;
    private javax.swing.JComboBox<String> tipo_carta;
    // End of variables declaration//GEN-END:variables
}
