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
import static progetto_monopoly.Inserimento_Mossa.cod_g;
import static progetto_monopoly.Inserimento_Mossa.cod_partita;
import static progetto_monopoly.Inserimento_Mossa.id_partenza;
import static progetto_monopoly.Inserimento_Mossa.posP;
import static progetto_monopoly.Inserimento_Mossa.casellaP;
import static progetto_monopoly.Inserimento_Mossa.conto;

public class IMossa_Movimento extends javax.swing.JFrame {
    PreparedStatement pst;
    ResultSet rs;
    Connection con = null;
    int d1,d2,posA,via,id_arrivo,flag;
    String casellaA,tipoA,testo1;
    int turno=0,ordine=0;
    int ID_Mossa,id_carta;
    String query,query2;

    public IMossa_Movimento() {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        testo.setText(""+cod_partita);
        testo2.setText(""+cod_g);
        testo3.setText(""+casellaP);
        testo.setEnabled(false);
        testo2.setEnabled(false);
        testo3.setEnabled(false);
        testo6.setText(conto+"$");
        testo6.setEnabled(false);
        dado1.setEnabled(false);
        dado2.setEnabled(false);
        
        pesca.setEnabled(false);
        testo5.setEnabled(false);
        testo4.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        indietro5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        testo = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        testo2 = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        dadi = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        dado1 = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        dado2 = new javax.swing.JTextPane();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        testo3 = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        testo4 = new javax.swing.JTextPane();
        jLabel7 = new javax.swing.JLabel();
        pesca = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        testo5 = new javax.swing.JTextPane();
        aggiungi5 = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        testo6 = new javax.swing.JTextPane();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(720, 430));
        setMinimumSize(new java.awt.Dimension(720, 430));
        setSize(new java.awt.Dimension(720, 430));

        jPanel1.setBackground(new java.awt.Color(193, 255, 193));
        jPanel1.setMaximumSize(new java.awt.Dimension(720, 430));
        jPanel1.setMinimumSize(new java.awt.Dimension(720, 430));
        jPanel1.setPreferredSize(new java.awt.Dimension(720, 430));
        jPanel1.setSize(new java.awt.Dimension(720, 430));
        jPanel1.setLayout(null);

        indietro5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progetto_monopoly/icone/back.png"))); // NOI18N
        indietro5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indietro5ActionPerformed(evt);
            }
        });
        jPanel1.add(indietro5);
        indietro5.setBounds(28, 15, 81, 31);

        jLabel1.setFont(new java.awt.Font("ITC Kabel Std", 1, 13)); // NOI18N
        jLabel1.setText("Tira i dadi e premi Aggiungi per confermare");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(28, 58, 251, 17);

        jLabel2.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel2.setText("Partita");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(28, 86, 42, 19);

        jLabel3.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel3.setText("Giocatore");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(28, 115, 66, 19);

        testo.setBackground(new java.awt.Color(193, 255, 193));
        testo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        testo.setFont(new java.awt.Font("ITC Kabel Std", 0, 14)); // NOI18N
        testo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(testo);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(168, 81, 129, 24);

        testo2.setBackground(new java.awt.Color(193, 255, 193));
        testo2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        testo2.setFont(new java.awt.Font("ITC Kabel Std", 0, 14)); // NOI18N
        testo2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane3.setViewportView(testo2);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(168, 110, 129, 24);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progetto_monopoly/icone/mr.jpg"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(427, 6, 258, 340);

        dadi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progetto_monopoly/icone/dado.jpg.gif"))); // NOI18N
        dadi.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/progetto_monopoly/icone/dado.jpg.gif"))); // NOI18N
        dadi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dadiActionPerformed(evt);
            }
        });
        jPanel1.add(dadi);
        dadi.setBounds(28, 204, 80, 56);

        dado1.setBackground(new java.awt.Color(193, 255, 193));
        dado1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        dado1.setFont(new java.awt.Font("ITC Kabel Std", 0, 24)); // NOI18N
        dado1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane4.setViewportView(dado1);

        jPanel1.add(jScrollPane4);
        jScrollPane4.setBounds(176, 220, 46, 36);

        dado2.setBackground(new java.awt.Color(193, 255, 193));
        dado2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        dado2.setFont(new java.awt.Font("ITC Kabel Std", 0, 24)); // NOI18N
        dado2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane5.setViewportView(dado2);

        jPanel1.add(jScrollPane5);
        jScrollPane5.setBounds(259, 220, 46, 36);

        jLabel6.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel6.setText("Posizione");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(28, 141, 62, 26);

        testo3.setBackground(new java.awt.Color(193, 255, 193));
        testo3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        testo3.setFont(new java.awt.Font("ITC Kabel Std", 0, 14)); // NOI18N
        testo3.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane6.setViewportView(testo3);

        jPanel1.add(jScrollPane6);
        jScrollPane6.setBounds(168, 141, 170, 24);

        testo4.setBackground(new java.awt.Color(193, 255, 193));
        testo4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        testo4.setFont(new java.awt.Font("ITC Kabel Std", 0, 14)); // NOI18N
        testo4.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane7.setViewportView(testo4);

        jPanel1.add(jScrollPane7);
        jScrollPane7.setBounds(156, 272, 170, 24);

        jLabel7.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel7.setText("Casella Arrivo");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(28, 277, 88, 19);

        pesca.setFont(new java.awt.Font("ITC Kabel Std", 1, 13)); // NOI18N
        pesca.setText("Pesca");
        pesca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pescaActionPerformed(evt);
            }
        });
        jPanel1.add(pesca);
        pesca.setBounds(28, 308, 78, 36);

        testo5.setBackground(new java.awt.Color(193, 255, 193));
        testo5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        testo5.setFont(new java.awt.Font("ITC Kabel Std", 0, 14)); // NOI18N
        testo5.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane8.setViewportView(testo5);

        jPanel1.add(jScrollPane8);
        jScrollPane8.setBounds(156, 308, 265, 57);

        aggiungi5.setFont(new java.awt.Font("Kabel", 2, 12)); // NOI18N
        aggiungi5.setText("Aggiungi");
        aggiungi5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aggiungi5ActionPerformed(evt);
            }
        });
        jPanel1.add(aggiungi5);
        aggiungi5.setBounds(489, 364, 107, 43);

        testo6.setBackground(new java.awt.Color(193, 255, 193));
        testo6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        testo6.setFont(new java.awt.Font("ITC Kabel Std", 0, 14)); // NOI18N
        testo6.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane9.setViewportView(testo6);

        jPanel1.add(jScrollPane9);
        jScrollPane9.setBounds(170, 170, 102, 24);

        jLabel8.setFont(new java.awt.Font("ITC Kabel Std", 1, 15)); // NOI18N
        jLabel8.setText("Conto");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(28, 172, 39, 26);

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

    private void dadiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dadiActionPerformed
     flag=0;
     testo5.setText("");
     pesca.setEnabled(false);
     d1=(int) (Math.random() * 5)+1;
     dado1.setText("  "+d1);
     d2=(int) (Math.random() * 5)+1;
     dado2.setText("  "+d2);
     int somma=d1+d2;
     posA=posP;
     
     while(somma>0){
        if(posA==40){
           posA=1;
           //passaggio per il via
           via=1;
            } else 
            posA=posA+1;
        somma--;
    }
     
     try{
         con = Database.getDefaultConnection();
         query="SELECT ID_CASELLA,NOME,TIPO_CASELLA,TESTO FROM CASELLA WHERE POSIZIONE="+posA;
                pst = con.prepareStatement(query);
                rs = pst.executeQuery();
                while(rs.next()){
                   id_arrivo=rs.getInt(1);
                   casellaA=rs.getString(2);
                   tipoA=rs.getString(3);
                   testo1=rs.getString(4);
                }
                
                testo4.setText(casellaA);
                
                
         if(tipoA.equals("IMPREVISTI")){
              flag=2;
              pesca.setEnabled(true);
         }else if(tipoA.equals("PROBABILITÀ")){
             flag=3;
             pesca.setEnabled(true);
         } else if(tipoA.equals("SPECIALE")){
             testo5.setText(testo1);
             testo5.setEnabled(false);
         }
                
                
     }catch(SQLException e){ System.out.println(e);}
           
           
     
     
    }//GEN-LAST:event_dadiActionPerformed

    private void pescaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pescaActionPerformed
      switch(flag){
          case 2:
              try {
           con = Database.getDefaultConnection();
           id_carta=(int)(Math.random()*8)+10;
           query="SELECT TESTO FROM CARTA WHERE ID_CARTA="+id_carta;
           pst = con.prepareStatement(query);
           rs = pst.executeQuery();
           while(rs.next()){
               testo5.setText(rs.getString("testo"));
           }
           testo5.setEnabled(false);
           con.close();   
        }catch(SQLException e){ System.out.println(e);}
              break;
          case 3:
              try {
           con = Database.getDefaultConnection();
           id_carta=(int)(Math.random()*8)+1;
           query="SELECT TESTO FROM CARTA WHERE ID_CARTA="+id_carta;
           pst = con.prepareStatement(query);
           rs = pst.executeQuery();
           while(rs.next()){
               testo5.setText(rs.getString("testo"));
           }
           testo5.setEnabled(false);
           con.close();   
        }catch(SQLException e){ System.out.println(e);}
              break;            
              
              
      }
        
    }//GEN-LAST:event_pescaActionPerformed

    private void aggiungi5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aggiungi5ActionPerformed
        try{ 
                
                con = Database.getDefaultConnection();
                query="SELECT MAX(TURNO) FROM DB_MONO.MOSSA WHERE ID_PARTITA="+cod_partita+" AND ID_GIOCATORE="+cod_g+" GROUP BY ID_PARTITA";
                pst = con.prepareStatement(query);
                rs = pst.executeQuery();
                while(rs.next()){
                    turno = rs.getInt(1);
                }
                
                query="SELECT MAX(ORDINE) FROM DB_MONO.MOSSA WHERE ID_PARTITA="+cod_partita+" AND TURNO="+(turno+1)+" GROUP BY ID_PARTITA,TURNO";
                pst = con.prepareStatement(query);
                rs = pst.executeQuery();
                while(rs.next()){
                    ordine = rs.getInt(1);
                }
            
                //inserire turno+1 e ordine+1
        
             query="SELECT MAX(ID_MOSSA) FROM MOSSA";
              pst = con.prepareStatement(query);
                rs = pst.executeQuery();
                while(rs.next()){
                    ID_Mossa = rs.getInt(1);
                }
        
                if(flag==2 | flag==3){
                 query2="INSERT INTO MOSSA(ID_MOSSA,TURNO,ORDINE,TIPO_MOSSA,DADO1,DADO2,ID_PARTITA,ID_GIOCATORE,CASELLA_ARRIVO,CASELLA_PARTENZA,ID_CARTA) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
                } else 
                   query2="INSERT INTO MOSSA(ID_MOSSA,TURNO,ORDINE,TIPO_MOSSA,DADO1,DADO2,ID_PARTITA,ID_GIOCATORE,CASELLA_ARRIVO,CASELLA_PARTENZA) VALUES(?,?,?,?,?,?,?,?,?,?)";
                pst = con.prepareStatement(query2);
                pst.setInt(1,(ID_Mossa+1));
                pst.setInt(2,turno+1);
                pst.setInt(3,ordine+1);
                pst.setString(4,"MOVIMENTO");
                pst.setInt(5, d1);
                pst.setInt(6,d2);
                pst.setInt(7, cod_partita);
                pst.setInt(8,cod_g);
                pst.setInt(9,id_arrivo);
                pst.setInt(10,id_partenza);
                if(flag==2|flag==3)
                    pst.setInt(11,id_carta);
                pst.executeUpdate();
                
                
                if(via==1){
                    query2="INSERT INTO MOSSA(ID_MOSSA,TURNO,ORDINE,TIPO_MOSSA,TIPO_PAGAMENTO,PAGAMENTO_DATO,PAGAMENTO_RICEVUTO,ID_PARTITA,ID_GIOCATORE) VALUES (?,?,?,?,?,?,?,?,?)";
                pst = con.prepareStatement(query2);
                pst.setInt(1,(ID_Mossa+2));
                pst.setInt(2,turno+1);
                pst.setInt(3,ordine+2);
                pst.setString(4,"PAGAMENTO");
                pst.setString(5, "VERSO BANCA");
                pst.setInt(6,0);
                pst.setInt(7,200);
                pst.setInt(8, cod_partita);
                pst.setInt(9,cod_g);
                pst.executeUpdate();
                
                query2="UPDATE PARTITA_GIOCATORE SET CONTO=CONTO+200 WHERE PARTITA="+cod_partita+" AND GIOCATORE="+cod_g;
                pst = con.prepareStatement(query2);
                pst.executeUpdate(query2);
                }
                 
               
                con.close();
               UIManager.put("OptionPane.background",new ColorUIResource(193,255,193));
               UIManager.put("Panel.background",new ColorUIResource(193,255,193));
               UIManager.put("OptionPane.messageFont", new Font("ITC Kabel Std", Font.BOLD, 14));
               UIManager.put("OptionPane.buttonFont", new Font("AppleMyungjo", Font.ITALIC, 12));
               JOptionPane.showMessageDialog(this, "Inserimento riuscito!", "", JOptionPane.INFORMATION_MESSAGE,new ImageIcon("pollice.gif"));
               
               
                this.dispose();
                Inserimento_Mossa obj = new Inserimento_Mossa();
                obj.setVisible(true);
          }catch(SQLException e){
                UIManager.put("OptionPane.background",new ColorUIResource(193,255,193));
                UIManager.put("Panel.background",new ColorUIResource(193,255,193));
                UIManager.put("OptionPane.messageFont", new Font("ITC Kabel Std", Font.BOLD, 14));
                UIManager.put("OptionPane.buttonFont", new Font("AppleMyungjo", Font.ITALIC, 12));
                JOptionPane.showMessageDialog(this, "Tira i dadi e/o pesca!", "Errore", JOptionPane.ERROR_MESSAGE,new ImageIcon("prigione.gif"));
      }
        
    }//GEN-LAST:event_aggiungi5ActionPerformed

    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IMossa_Movimento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aggiungi5;
    private javax.swing.JButton dadi;
    private javax.swing.JTextPane dado1;
    private javax.swing.JTextPane dado2;
    private javax.swing.JButton indietro5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JButton pesca;
    private javax.swing.JTextPane testo;
    private javax.swing.JTextPane testo2;
    private javax.swing.JTextPane testo3;
    private javax.swing.JTextPane testo4;
    private javax.swing.JTextPane testo5;
    private javax.swing.JTextPane testo6;
    // End of variables declaration//GEN-END:variables
}
