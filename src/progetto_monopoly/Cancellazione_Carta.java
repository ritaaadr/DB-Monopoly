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

public class Cancellazione_Carta extends javax.swing.JFrame {
    Connection con = null;
    PreparedStatement pst;
    ResultSet rs;
    String query,testo;
    int tc,id,imp;

   
    public Cancellazione_Carta() {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        
        
        try{
            con = Database.getDefaultConnection();
            query ="SELECT ID_CARTA FROM CARTA ORDER BY (ID_CARTA) ASC";
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();
            
            id_c.removeAllItems();
            while(rs.next()){
                    id_c.addItem(""+rs.getInt(1));
                }
            con.close(); 
         } catch(SQLException e){ System.out.println(e);}
        
        
        id_c.setSelectedItem(""+Dati_Tabella.ID_Carta);
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
        clear1 = new javax.swing.JButton();
        Elimina1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        id_c = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 360));
        setMinimumSize(new java.awt.Dimension(600, 360));
        setPreferredSize(new java.awt.Dimension(600, 360));
        setSize(new java.awt.Dimension(600, 360));

        jPanel1.setBackground(new java.awt.Color(193, 255, 193));
        jPanel1.setMaximumSize(new java.awt.Dimension(600, 360));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 360));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 360));
        jPanel1.setSize(new java.awt.Dimension(600, 360));

        indietro1.setFont(new java.awt.Font("Kabel", 2, 12)); // NOI18N
        indietro1.setForeground(new java.awt.Color(153, 0, 0));
        indietro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progetto_monopoly/icone/back.png"))); // NOI18N
        indietro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indietro1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("ITC Kabel Std", 1, 13)); // NOI18N
        jLabel1.setText("Riempire i campi di Carta in base alla quale si vuole effettuare la cancellazione");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progetto_monopoly/icone/valigia.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel3.setText("Tipo Carta");

        tipo_carta.setEditable(true);
        tipo_carta.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        tipo_carta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IMPREVISTI", "PROBABILITÀ" }));
        tipo_carta.setSelectedIndex(-1);
        tipo_carta.setToolTipText("");
        tipo_carta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipo_cartaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel4.setText("Testo");

        testo1.setBackground(new java.awt.Color(193, 255, 193));
        testo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        testo1.setFont(new java.awt.Font("ITC Kabel Std", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(testo1);

        jLabel5.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel5.setText("Importo");

        importo1.setBackground(new java.awt.Color(193, 255, 193));
        importo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        importo1.setFont(new java.awt.Font("ITC Kabel Std", 0, 14)); // NOI18N
        jScrollPane2.setViewportView(importo1);

        clear1.setFont(new java.awt.Font("Kabel", 2, 12)); // NOI18N
        clear1.setText("Clear");
        clear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear1ActionPerformed(evt);
            }
        });

        Elimina1.setFont(new java.awt.Font("Kabel", 2, 12)); // NOI18N
        Elimina1.setText("Elimina");
        Elimina1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Elimina1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel6.setText("ID Carta");

        id_c.setEditable(true);
        id_c.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        id_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_cActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(indietro1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(31, 31, 31)
                                        .addComponent(id_c, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tipo_carta, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 11, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(clear1)
                                .addGap(10, 10, 10)
                                .addComponent(Elimina1)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(30, 30, 30))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(indietro1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(id_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tipo_carta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel5))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clear1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Elimina1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void indietro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indietro1ActionPerformed
        this.dispose();
        Classe obj = new Classe();
        obj.setVisible(true);
    }//GEN-LAST:event_indietro1ActionPerformed

    private void tipo_cartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipo_cartaActionPerformed
        
    }//GEN-LAST:event_tipo_cartaActionPerformed

    private void clear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear1ActionPerformed
        id_c.setSelectedIndex(-1);
        testo1.setText(null);
       importo1.setText(null);
       tipo_carta.setSelectedIndex(-1);
    }//GEN-LAST:event_clear1ActionPerformed

    private void Elimina1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Elimina1ActionPerformed

        try{
            con= Database.getDefaultConnection(); 
            
            try{
          id=Integer.parseInt((String)id_c.getSelectedItem());
            } catch(NumberFormatException e){
                id=0;
             }
            try{
          imp=Integer.parseInt(importo1.getText());
            } catch(NumberFormatException e){
                imp=0;
              }
         
            tc=tipo_carta.getSelectedIndex();
            testo=testo1.getText();
            query="DELETE FROM CARTA WHERE ";
            
            
            int flag=0;
           if(id!=0){
               query=query+"ID_CARTA="+id;
               flag=1;
            }
           
            if(tc!=-1){
                if(flag==0){
                    query=query+" TIPO_CARTA="+"'"+tipo_carta.getSelectedItem()+"'";
                    flag=1;
                } else if(flag==1)
                    query=query+" AND TIPO_CARTA="+"'"+tipo_carta.getSelectedItem()+"'";  
            }
            
            if(imp!=0){
                if(flag==0){
                    query=query+" IMPORTO="+imp;
                    flag=1;
                } else if(flag==1)
                    query=query+" AND IMPORTO="+imp;
            }
            
            if(!(testo.equals(""))){
                    if(flag==0)
                        query=query+"TESTO="+"'"+testo+"'";
                    else if(flag==1)
                        query=query+" AND TESTO="+"'"+testo1.getText()+"'";
            }
           
        
            pst = con.prepareStatement(query);
            if((pst.executeUpdate(query))== 0){
                UIManager.put("OptionPane.background",new ColorUIResource(193,255,193));
                UIManager.put("Panel.background",new ColorUIResource(193,255,193));
                UIManager.put("OptionPane.messageFont", new Font("ITC Kabel Std", Font.BOLD, 14));
                UIManager.put("OptionPane.buttonFont", new Font("AppleMyungjo", Font.ITALIC, 12));
                JOptionPane.showMessageDialog(this, "La carta che si vuole cancellare non esiste!", "Errore", JOptionPane.ERROR_MESSAGE,new ImageIcon("oh.gif"));
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
        
        
        
    }//GEN-LAST:event_Elimina1ActionPerformed

    private void id_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_cActionPerformed
     
    }//GEN-LAST:event_id_cActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cancellazione_Carta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Elimina1;
    private javax.swing.JButton clear1;
    private javax.swing.JComboBox<String> id_c;
    private javax.swing.JTextPane importo1;
    private javax.swing.JButton indietro1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane testo1;
    private javax.swing.JComboBox<String> tipo_carta;
    // End of variables declaration//GEN-END:variables
}
