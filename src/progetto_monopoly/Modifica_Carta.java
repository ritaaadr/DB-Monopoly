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

public class Modifica_Carta extends javax.swing.JFrame {
    Connection con = null;
    PreparedStatement pst;
    ResultSet rs;
   
    public Modifica_Carta() {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        
        testo1.setText(Dati_Tabella.Testo_carta);
        importo1.setText("" + Dati_Tabella.Importo);
        tipo_carta.setSelectedItem(""+Dati_Tabella.Tipo_carta);
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
        modifica1 = new javax.swing.JButton();
        clear1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(550, 334));
        setMinimumSize(new java.awt.Dimension(550, 334));
        setPreferredSize(new java.awt.Dimension(550, 334));
        setSize(new java.awt.Dimension(550, 334));

        jPanel1.setBackground(new java.awt.Color(193, 255, 193));
        jPanel1.setMaximumSize(new java.awt.Dimension(550, 334));
        jPanel1.setMinimumSize(new java.awt.Dimension(550, 334));
        jPanel1.setPreferredSize(new java.awt.Dimension(550, 334));
        jPanel1.setSize(new java.awt.Dimension(550, 334));
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
        jLabel1.setText("Riempire i campi di Carta e premere Aggiorna per confermare");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(21, 56, 473, 17);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progetto_monopoly/icone/gift.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(380, 50, 150, 237);

        jLabel3.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel3.setText("Tipo");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(21, 87, 29, 19);

        tipo_carta.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        tipo_carta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IMPREVISTI", "PROBABILITÀ" }));
        tipo_carta.setSelectedIndex(-1);
        tipo_carta.setToolTipText("");
        tipo_carta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipo_cartaActionPerformed(evt);
            }
        });
        jPanel1.add(tipo_carta);
        tipo_carta.setBounds(100, 80, 129, 32);

        jLabel4.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel4.setText("Testo");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(21, 123, 37, 19);

        testo1.setBackground(new java.awt.Color(193, 255, 193));
        testo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        testo1.setFont(new java.awt.Font("ITC Kabel Std", 0, 16)); // NOI18N
        jScrollPane1.setViewportView(testo1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(106, 123, 235, 67);

        jLabel5.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel5.setText("Importo");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(21, 208, 53, 19);

        importo1.setBackground(new java.awt.Color(193, 255, 193));
        importo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        importo1.setFont(new java.awt.Font("ITC Kabel Std", 0, 14)); // NOI18N
        jScrollPane2.setViewportView(importo1);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(106, 202, 109, 24);

        modifica1.setFont(new java.awt.Font("Kabel", 2, 12)); // NOI18N
        modifica1.setText("Aggiorna");
        modifica1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifica1ActionPerformed(evt);
            }
        });
        jPanel1.add(modifica1);
        modifica1.setBounds(129, 260, 92, 39);

        clear1.setFont(new java.awt.Font("Kabel", 2, 12)); // NOI18N
        clear1.setText("Clear");
        clear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear1ActionPerformed(evt);
            }
        });
        jPanel1.add(clear1);
        clear1.setBounds(239, 260, 89, 39);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void indietro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indietro1ActionPerformed
        this.dispose();
        Classe obj = new Classe();
        obj.setVisible(true);
    }//GEN-LAST:event_indietro1ActionPerformed

    private void modifica1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifica1ActionPerformed
      try{
            con = Database.getDefaultConnection();
            int importo=Integer.parseInt(importo1.getText());

            String query = "UPDATE CARTA SET TIPO_CARTA= " + "'"+ (String)tipo_carta.getSelectedItem() + "'" + " WHERE ID_CARTA= " + Dati_Tabella.ID_Carta;
            String query2 = "UPDATE CARTA SET TESTO = " + "'"+ testo1.getText() + "'" +" WHERE ID_CARTA= " + Dati_Tabella.ID_Carta;
            String query1 = "UPDATE CARTA SET IMPORTO = " +importo +" WHERE ID_CARTA= " + Dati_Tabella.ID_Carta;

            pst = con.prepareStatement(query);
            pst = con.prepareStatement(query1);
            pst = con.prepareStatement(query2);

            pst.executeUpdate(query);
            pst.executeUpdate(query1);
            pst.executeUpdate(query2);
            con.close(); 
            
            UIManager.put("OptionPane.background",new ColorUIResource(193,255,193));
               UIManager.put("Panel.background",new ColorUIResource(193,255,193));
               UIManager.put("OptionPane.messageFont", new Font("ITC Kabel Std", Font.BOLD, 14));
               UIManager.put("OptionPane.buttonFont", new Font("AppleMyungjo", Font.ITALIC, 12));
               JOptionPane.showMessageDialog(this, "Modifica effettuata!", "", JOptionPane.INFORMATION_MESSAGE,new ImageIcon("pollice.gif"));
               
               this.dispose();
               Classe obj = new Classe();
               obj.setVisible(true);
                      
        }catch( SQLException | NumberFormatException t){
                UIManager.put("OptionPane.background",new ColorUIResource(193,255,193));
                UIManager.put("Panel.background",new ColorUIResource(193,255,193));
                UIManager.put("OptionPane.messageFont", new Font("ITC Kabel Std", Font.BOLD, 14));
                UIManager.put("OptionPane.buttonFont", new Font("AppleMyungjo", Font.ITALIC, 12));
                JOptionPane.showMessageDialog(this, "Inserire testo o importo! \n(In assenza di importo corrispondente inserire 0).", "Errore", JOptionPane.ERROR_MESSAGE,new ImageIcon("prigione.gif"));
      }
    }//GEN-LAST:event_modifica1ActionPerformed

    private void tipo_cartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipo_cartaActionPerformed
       
    }//GEN-LAST:event_tipo_cartaActionPerformed

    private void clear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear1ActionPerformed
       testo1.setText(null);
       importo1.setText(null);
       tipo_carta.setSelectedIndex(0);
    }//GEN-LAST:event_clear1ActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modifica_Carta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear1;
    private javax.swing.JTextPane importo1;
    private javax.swing.JButton indietro1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton modifica1;
    private javax.swing.JTextPane testo1;
    private javax.swing.JComboBox<String> tipo_carta;
    // End of variables declaration//GEN-END:variables
}
