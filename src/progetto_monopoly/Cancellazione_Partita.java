

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
class Cancellazione_Partita extends javax.swing.JFrame {
        Connection con = null;
        int id_partita, num;
        PreparedStatement pst;
        ResultSet rs;
        String query;

    public Cancellazione_Partita() {
      initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        
          try {
           con = Database.getDefaultConnection();
           query = "SELECT ID_PARTITA FROM PARTITA ORDER BY (ID_PARTITA) ASC";
           pst = con.prepareStatement(query);
           rs= pst.executeQuery();
           
           id5.removeAllItems();
                   while(rs.next()){
                    id5.addItem(""+rs.getInt(1));
                }
            id5.setSelectedIndex(-1);
   
            con.close(); 
       }catch(SQLException e){ System.out.println(e);}
          
          id5.setSelectedItem(""+Dati_Tabella.ID_Partita);
          ng.setSelectedItem(""+Dati_Tabella.numero_giocatori);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        indietro5 = new javax.swing.JButton();
        elimina5 = new javax.swing.JButton();
        clear5 = new javax.swing.JButton();
        id5 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        ng = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(530, 220));
        setMinimumSize(new java.awt.Dimension(530, 220));
        setSize(new java.awt.Dimension(530, 220));

        jPanel1.setBackground(new java.awt.Color(193, 255, 193));
        jPanel1.setMaximumSize(new java.awt.Dimension(530, 220));
        jPanel1.setMinimumSize(new java.awt.Dimension(530, 220));
        jPanel1.setPreferredSize(new java.awt.Dimension(530, 220));
        jPanel1.setSize(new java.awt.Dimension(530, 220));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel1.setText("Partita");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(17, 93, 42, 19);

        jLabel2.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel2.setText("Numero Giocatori");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(17, 129, 117, 19);

        jLabel3.setFont(new java.awt.Font("ITC Kabel Std", 1, 13)); // NOI18N
        jLabel3.setText("Riempire i campi in base alla quale si vuole effettuare la cancellazione");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(17, 59, 405, 17);

        indietro5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progetto_monopoly/icone/back.png"))); // NOI18N
        indietro5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indietro5ActionPerformed(evt);
            }
        });
        jPanel1.add(indietro5);
        indietro5.setBounds(17, 16, 84, 31);

        elimina5.setFont(new java.awt.Font("Kabel", 2, 12)); // NOI18N
        elimina5.setText("Elimina");
        elimina5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elimina5ActionPerformed(evt);
            }
        });
        jPanel1.add(elimina5);
        elimina5.setBounds(260, 170, 90, 37);

        clear5.setFont(new java.awt.Font("Kabel", 2, 12)); // NOI18N
        clear5.setText("Clear");
        clear5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear5ActionPerformed(evt);
            }
        });
        jPanel1.add(clear5);
        clear5.setBounds(150, 170, 90, 37);

        id5.setEditable(true);
        id5.setFont(new java.awt.Font("ITC Kabel Std", 0, 14)); // NOI18N
        jPanel1.add(id5);
        id5.setBounds(159, 88, 114, 28);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progetto_monopoly/icone/ops.jpg"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(380, 60, 130, 158);

        ng.setEditable(true);
        ng.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        ng.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", "5", "6" }));
        ng.setSelectedIndex(-1);
        jPanel1.add(ng);
        ng.setBounds(159, 122, 114, 27);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void indietro5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indietro5ActionPerformed
        this.dispose();
       Classe obj = new Classe();
       obj.setVisible(true);
    }//GEN-LAST:event_indietro5ActionPerformed

    private void elimina5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elimina5ActionPerformed
       try{
            con = Database.getDefaultConnection();
        
            query="DELETE FROM PARTITA WHERE ";
        
             int flag=0;
            if(id5.getSelectedIndex()!=-1){
                query=query+" ID_PARTITA="+id5.getSelectedItem();
                flag=1;
            }
            if(ng.getSelectedIndex()!=-1){
                if(flag==0){
                    query=query+" NUMGIOCATORI ="+ng.getSelectedItem();
                }else if(flag==1)
                    query=query+" AND NUMGIOCATORI= "+ng.getSelectedItem();
            }
            
            pst = con.prepareStatement(query);
          if((pst.executeUpdate(query))== 0){
                UIManager.put("OptionPane.background",new ColorUIResource(193,255,193));
                UIManager.put("Panel.background",new ColorUIResource(193,255,193));
                UIManager.put("OptionPane.messageFont", new Font("ITC Kabel Std", Font.BOLD, 14));
                UIManager.put("OptionPane.buttonFont", new Font("AppleMyungjo", Font.ITALIC, 12));
                JOptionPane.showMessageDialog(this, "La partita che si vuole cancellare non esiste!", "Errore", JOptionPane.ERROR_MESSAGE,new ImageIcon("oh.gif"));
            } else{
                UIManager.put("OptionPane.background",new ColorUIResource(193,255,193));
                UIManager.put("Panel.background",new ColorUIResource(193,255,193));
                UIManager.put("OptionPane.messageFont", new Font("ITC Kabel Std", Font.BOLD, 14));
                UIManager.put("OptionPane.buttonFont", new Font("AppleMyungjo", Font.ITALIC, 12));
                JOptionPane.showMessageDialog(this, "Cancellazione effettuata!", "", JOptionPane.INFORMATION_MESSAGE,new ImageIcon("pollice.gif"));
            
                con.close();
                
                this.dispose();
                Classe obj = new Classe();
                obj.setVisible(true);
          }
            }catch(SQLException e){ 
            UIManager.put("OptionPane.background",new ColorUIResource(193,255,193));
                UIManager.put("Panel.background",new ColorUIResource(193,255,193));
                UIManager.put("OptionPane.messageFont", new Font("ITC Kabel Std", Font.BOLD, 14));
                UIManager.put("OptionPane.buttonFont", new Font("AppleMyungjo", Font.ITALIC, 12));
                JOptionPane.showMessageDialog(this, "Riempi almeno un campo!", "", JOptionPane.INFORMATION_MESSAGE,new ImageIcon("seleziona.gif"));
    }
    }//GEN-LAST:event_elimina5ActionPerformed

    private void clear5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear5ActionPerformed
        id5.setSelectedIndex(-1);
        ng.setSelectedIndex(-1);
    }//GEN-LAST:event_clear5ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cancellazione_Partita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear5;
    private javax.swing.JButton elimina5;
    private javax.swing.JComboBox<String> id5;
    private javax.swing.JButton indietro5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> ng;
    // End of variables declaration//GEN-END:variables

}
