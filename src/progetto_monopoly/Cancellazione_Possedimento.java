
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
 
public class Cancellazione_Possedimento extends javax.swing.JFrame {
    int id_possedimento, t_poss;
    String query;
    Connection con = null;
    PreparedStatement pst;
    ResultSet rs;

    public Cancellazione_Possedimento() {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
          
       try {
           con = Database.getDefaultConnection();
           query = "SELECT ID_POSSEDIMENTO,NOME FROM POSSEDIMENTO ORDER BY (ID_POSSEDIMENTO) ASC";
           pst = con.prepareStatement(query);
           rs= pst.executeQuery();
           
           id6.removeAllItems();
           nome6.removeAllItems();
                   while(rs.next()){
                    id6.addItem(""+rs.getInt(1));
                    nome6.addItem(rs.getString(2));
                }
            id6.setSelectedIndex(-1);
            nome6.setSelectedIndex(-1);
   
            con.close(); 
    }catch(SQLException e){ System.out.println(e);}
       
       
       id6.setSelectedItem(""+Dati_Tabella.ID_Possedimento);
       nome6.setSelectedItem(""+Dati_Tabella.Nome_possedimento);
       tipo_p.setSelectedItem(""+Dati_Tabella.Tipo_possedimento);
       num6.setSelectedItem(""+Dati_Tabella.Num_casa);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        indietro6 = new javax.swing.JButton();
        elimina6 = new javax.swing.JButton();
        clear6 = new javax.swing.JButton();
        id6 = new javax.swing.JComboBox<>();
        tipo_p = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        num6 = new javax.swing.JComboBox<>();
        nome6 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 330));
        setMinimumSize(new java.awt.Dimension(600, 330));
        setSize(new java.awt.Dimension(600, 330));

        jPanel1.setBackground(new java.awt.Color(193, 255, 193));
        jPanel1.setMaximumSize(new java.awt.Dimension(600, 330));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 330));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 330));
        jPanel1.setSize(new java.awt.Dimension(600, 330));

        jLabel1.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel1.setText("ID_Possedimento");

        jLabel2.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel2.setText("Nome");

        jLabel3.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel3.setText("Tipo");

        jLabel4.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel4.setText("Numero Case");

        indietro6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progetto_monopoly/icone/back.png"))); // NOI18N
        indietro6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indietro6ActionPerformed(evt);
            }
        });

        elimina6.setFont(new java.awt.Font("Kabel", 2, 12)); // NOI18N
        elimina6.setText("Elimina");
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

        id6.setEditable(true);
        id6.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N

        tipo_p.setEditable(true);
        tipo_p.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        tipo_p.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SEMPLICE", "CASA", "ALBERGO", "IPOTECATA" }));
        tipo_p.setSelectedIndex(-1);

        jLabel5.setFont(new java.awt.Font("ITC Kabel Std", 1, 13)); // NOI18N
        jLabel5.setText("Riempire i campi in base alla quale si vuole effettuare la cancellazione");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progetto_monopoly/icone/mono5.png"))); // NOI18N

        num6.setEditable(true);
        num6.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        num6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        num6.setSelectedIndex(-1);

        nome6.setEditable(true);
        nome6.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(indietro6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(138, 138, 138)
                                .addComponent(clear6)
                                .addGap(37, 37, 37)
                                .addComponent(elimina6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(id6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(num6, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tipo_p, javax.swing.GroupLayout.Alignment.LEADING, 0, 122, Short.MAX_VALUE))
                                    .addComponent(nome6, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(2, 2, 2)
                        .addComponent(jLabel6))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(indietro6)
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel5)
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(id6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nome6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clear6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(elimina6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

    private void indietro6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indietro6ActionPerformed
       this.dispose();
       Classe obj = new Classe();
       obj.setVisible(true);
    }//GEN-LAST:event_indietro6ActionPerformed

    private void clear6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear6ActionPerformed
        id6.setSelectedIndex(-1);
        nome6.setSelectedIndex(-1);
        tipo_p.setSelectedIndex(-1);
        num6.setSelectedIndex(-1);
    }//GEN-LAST:event_clear6ActionPerformed

    private void elimina6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elimina6ActionPerformed
       try{
            con = Database.getDefaultConnection();
            
        try{
            id_possedimento=Integer.parseInt((String)id6.getSelectedItem());
         }catch(NumberFormatException e) {
             id_possedimento=0;
         }
        t_poss=tipo_p.getSelectedIndex();
        
        query="DELETE FROM POSSEDIMENTO WHERE";
        
        int flag=0;
        if(id_possedimento!=0){
            query=query+" ID_POSSEDIMENTO="+id_possedimento;
            flag=1;
        }
            if(t_poss!=-1){
                if(flag==0){
                query= query+ " TIPO_POSSEDIMENTO ='"+tipo_p.getSelectedItem()+"'";
                flag=1;
            }else if(flag==1)
                query=query+" AND TIPO_POSSEDIMENTO='"+tipo_p.getSelectedItem()+"'";
                
            }
            if(nome6.getSelectedIndex()!=-1){
                if(flag==0){
                query=query+ " NOME ='"+nome6.getSelectedItem()+"'";
                flag=1;
                }
            else if(flag==1)
                query=query+" AND NOME='"+nome6.getSelectedItem()+"'";
            }
            if(num6.getSelectedIndex()!=-1){
                if(flag==0){
                    query=query+" NUM_CASA ="+num6.getSelectedItem();
                    flag=1;
                }else if(flag==1)
                    query=query+" AND NUM_CASA ="+num6.getSelectedItem();
            }
           
          pst = con.prepareStatement(query);
                        
          if((pst.executeUpdate(query))== 0){
                UIManager.put("OptionPane.background",new ColorUIResource(193,255,193));
                UIManager.put("Panel.background",new ColorUIResource(193,255,193));
                UIManager.put("OptionPane.messageFont", new Font("ITC Kabel Std", Font.BOLD, 14));
                UIManager.put("OptionPane.buttonFont", new Font("AppleMyungjo", Font.ITALIC, 12));
                JOptionPane.showMessageDialog(this, "Il possedimento che si vuole cancellare non esiste!", "Errore", JOptionPane.ERROR_MESSAGE,new ImageIcon("oh.gif"));
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
    }//GEN-LAST:event_elimina6ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cancellazione_Possedimento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear6;
    private javax.swing.JButton elimina6;
    private javax.swing.JComboBox<String> id6;
    private javax.swing.JButton indietro6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> nome6;
    private javax.swing.JComboBox<String> num6;
    private javax.swing.JComboBox<String> tipo_p;
    // End of variables declaration//GEN-END:variables
}
