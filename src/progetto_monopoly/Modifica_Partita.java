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

public class Modifica_Partita extends javax.swing.JFrame {
    Connection con = null;
    PreparedStatement pst;
    ResultSet rs;
    
    
    public Modifica_Partita() {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        
        nG.setSelectedItem(""+Dati_Tabella.numero_giocatori);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        indietro6 = new javax.swing.JButton();
        nG = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        modifica6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(193, 255, 193));

        indietro6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progetto_monopoly/icone/back.png"))); // NOI18N
        indietro6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indietro6ActionPerformed(evt);
            }
        });

        nG.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", "5", "6" }));

        jLabel1.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel1.setText("Numero Giocatori");

        modifica6.setFont(new java.awt.Font("Kabel", 2, 12)); // NOI18N
        modifica6.setText("Aggiorna");
        modifica6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifica6ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progetto_monopoly/icone/gym.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(23, 23, 23)
                                .addComponent(nG, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(indietro6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(modifica6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)))
                .addComponent(jLabel2)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(indietro6)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(modifica6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void indietro6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indietro6ActionPerformed
      this.dispose();
       Classe obj = new Classe();
       obj.setVisible(true);
       
       
    }//GEN-LAST:event_indietro6ActionPerformed

    private void modifica6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifica6ActionPerformed
     try{
            con = Database.getDefaultConnection();

            String query = "UPDATE PARTITA SET NUMGIOCATORI= " + nG.getSelectedItem() + " WHERE ID_PARTITA= " + Dati_Tabella.ID_Partita;
            pst = con.prepareStatement(query);
            pst.executeUpdate(query);
          
              con.close(); 
            
               UIManager.put("OptionPane.background",new ColorUIResource(193,255,193));
               UIManager.put("Panel.background",new ColorUIResource(193,255,193));
               UIManager.put("OptionPane.messageFont", new Font("ITC Kabel Std", Font.BOLD, 14));
               UIManager.put("OptionPane.buttonFont", new Font("AppleMyungjo", Font.ITALIC, 12));
               JOptionPane.showMessageDialog(this, "Modifica effettuata!", "", JOptionPane.INFORMATION_MESSAGE,new ImageIcon("pollice.gif"));
               
               this.dispose();
               Classe obj = new Classe();
               obj.setVisible(true);
                      
        }catch( SQLException e){
               UIManager.put("OptionPane.background",new ColorUIResource(193,255,193));
                UIManager.put("Panel.background",new ColorUIResource(193,255,193));
                UIManager.put("OptionPane.messageFont", new Font("ITC Kabel Std", Font.BOLD, 14));
                UIManager.put("OptionPane.buttonFont", new Font("AppleMyungjo", Font.ITALIC, 12));
                JOptionPane.showMessageDialog(this, "Inserire numero!", "Errore", JOptionPane.ERROR_MESSAGE,new ImageIcon("prigione.gif"));
                        }
                          
    }//GEN-LAST:event_modifica6ActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modifica_Partita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton indietro6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton modifica6;
    private javax.swing.JComboBox<String> nG;
    // End of variables declaration//GEN-END:variables
}
