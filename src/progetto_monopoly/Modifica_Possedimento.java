
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
 
public class Modifica_Possedimento extends javax.swing.JFrame {
    int id_possedimento, t_poss;
    Connection con = null;
    PreparedStatement pst;
    ResultSet rs;

    public Modifica_Possedimento() {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
          
       
        try{
            con = Database.getDefaultConnection();
           String query ="SELECT NOME FROM CONTRATTO";
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();
            nome1.removeAllItems();
            while(rs.next()){
                    nome1.addItem(rs.getString(1));
                }
   
            con.close(); 
         } catch(SQLException e){ System.out.println(e);}
         
        
       nome1.setSelectedItem(""+Dati_Tabella.Nome_possedimento);
       tipo_p.setSelectedItem(""+Dati_Tabella.Tipo_possedimento);
       num6.setSelectedItem(""+Dati_Tabella.Num_casa);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        indietro6 = new javax.swing.JButton();
        elimina6 = new javax.swing.JButton();
        clear6 = new javax.swing.JButton();
        tipo_p = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        num6 = new javax.swing.JComboBox<>();
        nome1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 330));
        setMinimumSize(new java.awt.Dimension(600, 330));
        setSize(new java.awt.Dimension(600, 330));

        jPanel1.setBackground(new java.awt.Color(193, 255, 193));
        jPanel1.setMaximumSize(new java.awt.Dimension(600, 330));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 330));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 330));
        jPanel1.setSize(new java.awt.Dimension(600, 330));

        jLabel2.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel2.setText("Nome");

        jLabel3.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel3.setText("Tipo");

        jLabel4.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel4.setText("Numero Casa");

        indietro6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progetto_monopoly/icone/back.png"))); // NOI18N
        indietro6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indietro6ActionPerformed(evt);
            }
        });

        elimina6.setFont(new java.awt.Font("Kabel", 2, 12)); // NOI18N
        elimina6.setText("Aggiorna");
        elimina6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elimina6ActionPerformed(evt);
            }
        });

        clear6.setFont(new java.awt.Font("Kabel", 2, 12)); // NOI18N
        clear6.setText("Clear");
        clear6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear6ActionPerformed(evt);
            }
        });

        tipo_p.setEditable(true);
        tipo_p.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        tipo_p.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SEMPLICE", "CASA", "ALBERGO", "IPOTECATA" }));
        tipo_p.setSelectedIndex(-1);

        jLabel5.setFont(new java.awt.Font("ITC Kabel Std", 1, 13)); // NOI18N
        jLabel5.setText("Riempire i campi di Possedimento e premere Aggiorna per confermare");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progetto_monopoly/icone/mr4.png"))); // NOI18N

        num6.setEditable(true);
        num6.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        num6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        num6.setSelectedIndex(-1);

        nome1.setEditable(true);
        nome1.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(indietro6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addGap(51, 51, 51)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(nome1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tipo_p, javax.swing.GroupLayout.Alignment.LEADING, 0, 117, Short.MAX_VALUE)
                                    .addComponent(num6, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(clear6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(elimina6))))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(indietro6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nome1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel3))
                            .addComponent(tipo_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(num6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(elimina6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clear6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void indietro6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indietro6ActionPerformed
       this.dispose();
       Classe obj = new Classe();
       obj.setVisible(true);
    }//GEN-LAST:event_indietro6ActionPerformed

    private void clear6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear6ActionPerformed
        nome1.setSelectedIndex(-1);
        tipo_p.setSelectedIndex(-1);
        num6.setSelectedIndex(-1);
    }//GEN-LAST:event_clear6ActionPerformed

    private void elimina6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elimina6ActionPerformed
       try{
            con = Database.getDefaultConnection();

            String query = "UPDATE POSSEDIMENTO SET TIPO_POSSEDIMENTO= " + "'"+tipo_p.getSelectedItem() + "',NUM_CASA="+num6.getSelectedItem()+ " WHERE ID_POSSEDIMENTO= " + Dati_Tabella.ID_Possedimento;
            String query2 = "UPDATE POSSEDIMENTO SET NOME= " + "'"+ nome1.getSelectedItem() + "'" +" WHERE ID_POSSEDIMENTO= " + Dati_Tabella.ID_Possedimento;
          
            pst = con.prepareStatement(query);
            pst = con.prepareStatement(query2);

            pst.executeUpdate(query);
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
                      
        }catch( SQLException t){
                UIManager.put("OptionPane.background",new ColorUIResource(193,255,193));
                UIManager.put("Panel.background",new ColorUIResource(193,255,193));
                UIManager.put("OptionPane.messageFont", new Font("ITC Kabel Std", Font.BOLD, 14));
                UIManager.put("OptionPane.buttonFont", new Font("AppleMyungjo", Font.ITALIC, 12));
                JOptionPane.showMessageDialog(this, "La combinazione scelta non è corretta!", "Errore", JOptionPane.ERROR_MESSAGE,new ImageIcon("prigione.gif"));
      }
    }//GEN-LAST:event_elimina6ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modifica_Possedimento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear6;
    private javax.swing.JButton elimina6;
    private javax.swing.JButton indietro6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> nome1;
    private javax.swing.JComboBox<String> num6;
    private javax.swing.JComboBox<String> tipo_p;
    // End of variables declaration//GEN-END:variables
}
