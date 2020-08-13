
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

public class Cancellazione_Mossa extends javax.swing.JFrame {
    Connection con = null;
    PreparedStatement pst;
    ResultSet rs;
    String query;
    int id_mossa, turno, ordine, tipo_m, dado1, dado2, tipo_p, p_dato, p_ric;
    int selection = 0;
    
    public Cancellazione_Mossa() {
         initComponents();
         setLocationRelativeTo(null);
         this.setResizable(false);
         
         try {
           con = Database.getDefaultConnection();
           query = "SELECT ID_MOSSA FROM MOSSA ORDER BY (ID_MOSSA) ASC";
           pst = con.prepareStatement(query);
           rs= pst.executeQuery();
           
           id_m.removeAllItems();
                   while(rs.next()){
                    id_m.addItem(""+rs.getInt(1));
                }
            id_m.setSelectedIndex(-1);
   
            con.close(); 
       }catch(SQLException e){ System.out.println(e);}
         
         id_m.setSelectedItem(""+Dati_Tabella.ID_Mossa);
         turno7.setText(""+Dati_Tabella.turno);
         ordine7.setText(""+Dati_Tabella.Ordine);
         tipo_m7.setSelectedItem(""+Dati_Tabella.Tipo_Mossa);
         selection=tipo_m7.getSelectedIndex();
         
         switch(selection) {
             case 0:
                 //Movimento
                 d1.setText(""+Dati_Tabella.Dado1);
                 d2.setText(""+Dati_Tabella.Dado2);
                 break;
         case 1:
            //Pagamento
             tipo_p7.setSelectedItem(""+Dati_Tabella.Tipo_Pagamento);
             p_dato7.setText(""+Dati_Tabella.Pagamento_dato);
             p_ric7.setText(""+Dati_Tabella.Pagamento_ricevuto);
         }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        indietro7 = new javax.swing.JButton();
        elimina7 = new javax.swing.JButton();
        clear7 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tipo_m7 = new javax.swing.JComboBox<>();
        id_m = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tipo_p7 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        turno7 = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        ordine7 = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        d2 = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        p_dato7 = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        p_ric7 = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        d1 = new javax.swing.JTextPane();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(550, 460));
        setMinimumSize(new java.awt.Dimension(550, 460));
        setPreferredSize(new java.awt.Dimension(550, 460));

        jPanel1.setBackground(new java.awt.Color(193, 255, 193));
        jPanel1.setMaximumSize(new java.awt.Dimension(550, 460));
        jPanel1.setMinimumSize(new java.awt.Dimension(550, 460));
        jPanel1.setPreferredSize(new java.awt.Dimension(550, 460));
        jPanel1.setSize(new java.awt.Dimension(550, 460));

        jLabel1.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel1.setText("ID_Mossa");

        jLabel2.setFont(new java.awt.Font("ITC Kabel Std", 1, 13)); // NOI18N
        jLabel2.setText("Riempire i campi di Mossa in base alla quale si vuole effettuare la cancellazione");

        indietro7.setFont(new java.awt.Font("ITC Kabel Std", 1, 14)); // NOI18N
        indietro7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progetto_monopoly/icone/back.png"))); // NOI18N
        indietro7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indietro7ActionPerformed(evt);
            }
        });

        elimina7.setFont(new java.awt.Font("Kabel", 2, 12)); // NOI18N
        elimina7.setText("Elimina");
        elimina7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elimina7ActionPerformed(evt);
            }
        });

        clear7.setFont(new java.awt.Font("Kabel", 2, 12)); // NOI18N
        clear7.setText("Clear");
        clear7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear7ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel3.setText("Turno");

        jLabel4.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel4.setText("Tipo");

        jLabel5.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel5.setText("Dado 1");

        tipo_m7.setEditable(true);
        tipo_m7.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        tipo_m7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MOVIMENTO", "PAGAMENTO" }));
        tipo_m7.setSelectedIndex(-1);

        id_m.setEditable(true);
        id_m.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N

        jLabel6.setFont(new java.awt.Font("ITC Kabel Std", 1, 14)); // NOI18N
        jLabel6.setText("Pagamento");

        jLabel7.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel7.setText("Dado 2");

        jLabel8.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel8.setText("Ordine");

        tipo_p7.setEditable(true);
        tipo_p7.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        tipo_p7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GENERICO", "VERSO BANCA", "VERSO GIOCATORE" }));
        tipo_p7.setSelectedIndex(-1);

        jLabel9.setFont(new java.awt.Font("ITC Kabel Std", 1, 14)); // NOI18N
        jLabel9.setText("Pagamento Dato");

        jLabel10.setFont(new java.awt.Font("ITC Kabel Std", 1, 14)); // NOI18N
        jLabel10.setText("Pagamento Ricevuto");

        turno7.setBackground(new java.awt.Color(193, 255, 193));
        turno7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        turno7.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        jScrollPane1.setViewportView(turno7);

        ordine7.setBackground(new java.awt.Color(193, 255, 193));
        ordine7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        ordine7.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        jScrollPane2.setViewportView(ordine7);

        d2.setBackground(new java.awt.Color(193, 255, 193));
        d2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        d2.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        jScrollPane4.setViewportView(d2);

        p_dato7.setBackground(new java.awt.Color(193, 255, 193));
        p_dato7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        p_dato7.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        jScrollPane5.setViewportView(p_dato7);

        p_ric7.setBackground(new java.awt.Color(193, 255, 193));
        p_ric7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        p_ric7.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        jScrollPane6.setViewportView(p_ric7);

        d1.setBackground(new java.awt.Color(193, 255, 193));
        d1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        d1.setFont(new java.awt.Font("ITC Kabel Std", 0, 13)); // NOI18N
        jScrollPane7.setViewportView(d1);

        jLabel11.setFont(new java.awt.Font("ITC Kabel Std", 1, 14)); // NOI18N
        jLabel11.setText("Tipo");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progetto_monopoly/icone/wu.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(indietro7)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel8))
                                .addGap(60, 60, 60)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(id_m, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(tipo_m7, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addGap(123, 123, 123)
                                            .addComponent(tipo_p7, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel11)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel5)))
                                        .addGap(98, 98, 98)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane7)
                                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel10))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane5)
                                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                .addComponent(jLabel12))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(clear7, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(elimina7)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(indietro7)
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(id_m, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(tipo_m7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5))
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel6))
                            .addComponent(tipo_p7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel10))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clear7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(elimina7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void indietro7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indietro7ActionPerformed
       this.dispose();
       Classe obj = new Classe();
       obj.setVisible(true);
    }//GEN-LAST:event_indietro7ActionPerformed

    private void clear7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear7ActionPerformed
        id_m.setSelectedIndex(-1);
        turno7.setText(null);
        ordine7.setText(null);
        tipo_m7.setSelectedIndex(-1);
        d1.setText(null);
        d2.setText(null);
        tipo_p7.setSelectedIndex(-1);
        p_dato7.setText(null);
        p_ric7.setText(null);
    }//GEN-LAST:event_clear7ActionPerformed

    private void elimina7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elimina7ActionPerformed
       try{
            con = Database.getDefaultConnection();
            
        try{
            id_mossa=Integer.parseInt((String)id_m.getSelectedItem());
         }catch(NumberFormatException e) {
             id_mossa=0;
         }
        try{
            turno=Integer.parseInt(turno7.getText());
            }catch(NumberFormatException e) {
                turno=0;
            }
        try{
            ordine=Integer.parseInt(ordine7.getText());
        }catch(NumberFormatException e){
            ordine=0;
        }
        try{
            dado1=Integer.parseInt(d1.getText());
            }catch(NumberFormatException e) {
                dado1=0;
            }
        try{
            dado2=Integer.parseInt(d2.getText());
        }catch(NumberFormatException e){
            dado2=0;
        }
        try{
            p_dato=Integer.parseInt(p_dato7.getText());
            }catch(NumberFormatException e) {
                p_dato=0;
            }
        try{
            p_ric=Integer.parseInt(p_ric7.getText());
        }catch(NumberFormatException e){
            p_ric=0;
        }
        
        tipo_m = tipo_m7.getSelectedIndex();
        tipo_p = tipo_p7.getSelectedIndex();
        query="DELETE FROM MOSSA WHERE ";
        
        int flag=0;
        if(id_mossa!=0){
            query=query+" ID_MOSSA="+id_mossa;
            flag=1;
        }
            if(turno!=0){
                if(flag==0){
                query=query+" TURNO="+turno;
                flag=1;
            }else if(flag==1)
                    query=query+" AND TURNO="+turno;
            }
            if(ordine!=0){
                if(flag==0){
                    query=query+" ORDINE="+ordine;
                    flag=1;
                } else if(flag==1)
                    query=query+" AND ORDINE="+ordine;
            }
            if(tipo_m!=-1){
                if(flag==0){
                    query=query+" TIPO_MOSSA='"+tipo_m7.getSelectedItem()+"'";
                    flag=1;
                }else if(flag==1)
                    query=query+" AND TIPO_MOSSA='"+tipo_m7.getSelectedItem()+"'";   
            }
            if(dado1!=0){
                if(flag==0){
                    query=query+" DADO1="+dado1;
                    flag=1;
                }else if(flag==1)
                    query=query+" AND DADO1="+dado1;
            }
            if(dado2!=0){
                if(flag==0){
                    query=query+" DADO2="+dado2;
                    flag=1;
                }else if(flag==1)
                    query=query+" AND DADO2="+dado2;
            }
            if(tipo_p!=-1){
                if(flag==0){
                    query=query+" TIPO_PAGAMENTO='"+tipo_p7.getSelectedItem()+"'";
                    flag=1;
                }else if(flag==1)
                    query=query+" AND TIPO_PAGAMENTO='"+tipo_p7.getSelectedItem()+"'";
            }
            if(p_dato!=0){
                if(flag==0){
                    query=query+" PAGAMENTO_DATO="+p_dato;
                    flag=1;
                }else if(flag==1)
                    query=query+" AND PAGAMENTO_DATO="+p_dato;
            }
            if(p_ric!=0){
                if(flag==0){
                    query=query+" PAGAMENTO_RICEVUTO="+p_ric;
                    flag=1;
                }else if(flag==1)
                    query=query+" AND PAGAMENTO_RICEVUTO="+p_ric;
            }
       
        
        pst = con.prepareStatement(query);
          if((pst.executeUpdate(query))== 0){
                UIManager.put("OptionPane.background",new ColorUIResource(193,255,193));
                UIManager.put("Panel.background",new ColorUIResource(193,255,193));
                UIManager.put("OptionPane.messageFont", new Font("ITC Kabel Std", Font.BOLD, 14));
                UIManager.put("OptionPane.buttonFont", new Font("AppleMyungjo", Font.ITALIC, 12));
                JOptionPane.showMessageDialog(this, "La mossa che si vuole cancellare non esiste!", "Errore", JOptionPane.ERROR_MESSAGE,new ImageIcon("oh.gif"));
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
    }//GEN-LAST:event_elimina7ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cancellazione_Mossa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear7;
    private javax.swing.JTextPane d1;
    private javax.swing.JTextPane d2;
    private javax.swing.JButton elimina7;
    private javax.swing.JComboBox<String> id_m;
    private javax.swing.JButton indietro7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextPane ordine7;
    private javax.swing.JTextPane p_dato7;
    private javax.swing.JTextPane p_ric7;
    private javax.swing.JComboBox<String> tipo_m7;
    private javax.swing.JComboBox<String> tipo_p7;
    private javax.swing.JTextPane turno7;
    // End of variables declaration//GEN-END:variables
}
