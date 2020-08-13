package progetto_monopoly;

import java.awt.Font;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;

public class Login extends javax.swing.JDialog {

   public static final int PREMUTO_ANNULLA = 0;

   public static final int PREMUTO_LOGIN = 1;

   public Login(java.awt.Frame parent, boolean modal) {
      super(parent, modal);
      initComponents();
      setLocationRelativeTo(null);
      this.tHost.setText("127.0.0.1");
      this.tPorta.setText("" + Database.porta);
      this.tServizio.setText(Database.servizio);
      this.tSchema.setText("DB_MONO");
      this.tUser.setText("DB_MONO");
      this.tPassword.setText("mono");
      this.tUser.requestFocus();
   }

   private int premuto;

   public int getPremuto() {
      return premuto;
   }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        tPassword = new javax.swing.JPasswordField();
        tSchema = new javax.swing.JTextField();
        tUser = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tHost = new javax.swing.JTextField();
        tServizio = new javax.swing.JTextField();
        tPorta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        bAnnulla = new javax.swing.JButton();
        bLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(600, 350));
        setMinimumSize(new java.awt.Dimension(600, 350));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(193, 255, 193));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setMaximumSize(new java.awt.Dimension(600, 350));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 350));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 350));
        jPanel1.setSize(new java.awt.Dimension(600, 350));

        jLabel5.setFont(new java.awt.Font("ITC Kabel Std", 0, 14)); // NOI18N
        jLabel5.setText("Password");

        tPassword.setFont(new java.awt.Font("AppleMyungjo", 0, 14)); // NOI18N
        tPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));
        tPassword.setPreferredSize(new java.awt.Dimension(30, 20));
        tPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tPasswordActionPerformed(evt);
            }
        });

        tSchema.setFont(new java.awt.Font("AppleMyungjo", 0, 14)); // NOI18N
        tSchema.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tUser, org.jdesktop.beansbinding.ELProperty.create("${text}"), tSchema, org.jdesktop.beansbinding.BeanProperty.create("text"), "bindSchema");
        bindingGroup.addBinding(binding);

        tSchema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tSchemaActionPerformed(evt);
            }
        });

        tUser.setFont(new java.awt.Font("AppleMyungjo", 0, 14)); // NOI18N
        tUser.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));
        tUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tUserActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("ITC Kabel Std", 0, 14)); // NOI18N
        jLabel1.setText("Host");

        jLabel2.setFont(new java.awt.Font("ITC Kabel Std", 0, 14)); // NOI18N
        jLabel2.setText("Porta");

        jLabel3.setFont(new java.awt.Font("ITC Kabel Std", 0, 14)); // NOI18N
        jLabel3.setText("Servizio");

        jLabel7.setFont(new java.awt.Font("ITC Kabel Std", 0, 14)); // NOI18N
        jLabel7.setText("Schema");

        tHost.setFont(new java.awt.Font("AppleMyungjo", 0, 14)); // NOI18N
        tHost.setText("127.0.0.1");
        tHost.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));
        tHost.setDisabledTextColor(new java.awt.Color(236, 231, 231));
        tHost.setSelectionColor(new java.awt.Color(204, 204, 204));
        tHost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tHostActionPerformed(evt);
            }
        });

        tServizio.setFont(new java.awt.Font("AppleMyungjo", 0, 14)); // NOI18N
        tServizio.setText("XE");
        tServizio.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));

        tPorta.setFont(new java.awt.Font("AppleMyungjo", 0, 14)); // NOI18N
        tPorta.setText("1521");
        tPorta.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));

        jLabel4.setFont(new java.awt.Font("ITC Kabel Std", 0, 14)); // NOI18N
        jLabel4.setText("Utente");

        bAnnulla.setBackground(new java.awt.Color(52, 73, 94));
        bAnnulla.setFont(new java.awt.Font("ITC Kabel Std", 1, 14)); // NOI18N
        bAnnulla.setText("Annulla");
        bAnnulla.setDefaultCapable(false);
        bAnnulla.setMaximumSize(new java.awt.Dimension(70, 30));
        bAnnulla.setMinimumSize(new java.awt.Dimension(70, 30));
        bAnnulla.setPreferredSize(new java.awt.Dimension(70, 30));
        bAnnulla.setSize(new java.awt.Dimension(70, 30));
        bAnnulla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAnnullaActionPerformed(evt);
            }
        });

        bLogin.setBackground(new java.awt.Color(255, 0, 0));
        bLogin.setFont(new java.awt.Font("ITC Kabel Std", 1, 14)); // NOI18N
        bLogin.setText("Login");
        bLogin.setMaximumSize(new java.awt.Dimension(70, 30));
        bLogin.setMinimumSize(new java.awt.Dimension(70, 30));
        bLogin.setPreferredSize(new java.awt.Dimension(70, 30));
        bLogin.setSize(new java.awt.Dimension(70, 30));
        bLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLoginActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(213, 213, 213)
                        .add(bLogin, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(48, 48, 48)
                        .add(bAnnulla, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(160, 160, 160)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                .add(jLabel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(jLabel7, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(jLabel1)
                                .add(jLabel2))
                            .add(jLabel4)
                            .add(jLabel5))
                        .add(45, 45, 45)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(tPorta, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 180, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(tHost, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 180, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(tServizio, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 180, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(tSchema, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 180, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(tUser, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 180, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(tPassword, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 180, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .add(155, 155, 155))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(58, 58, 58)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(tHost, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(12, 12, 12)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(tPorta, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel2))
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(12, 12, 12)
                        .add(tServizio, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(18, 18, 18)
                        .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 19, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(9, 9, 9)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(1, 1, 1)
                        .add(jLabel7))
                    .add(tSchema, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(12, 12, 12)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(1, 1, 1)
                        .add(jLabel4))
                    .add(tUser, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(12, 12, 12)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(1, 1, 1)
                        .add(jLabel5))
                    .add(tPassword, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(bAnnulla, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(bLogin, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bindingGroup.bind();
    }// </editor-fold>//GEN-END:initComponents

    private void bLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLoginActionPerformed
      Database.host = tHost.getText();
        try {
            Database.porta = Integer.parseInt(tPorta.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "La porta dev'essere un numero", "ERRORE", JOptionPane.ERROR_MESSAGE,new ImageIcon("prigione.gif"));
        }
        Database.schema = tSchema.getText();
        Database.servizio = tServizio.getText();
        Database.user = tUser.getText();
        Database.password = new String(tPassword.getPassword());
        try {
            Database.setDefaultConnection(Database.nuovaConnessione());
            premuto = PREMUTO_LOGIN;
            dispose();
            Home obj = new Home ();
            obj.setVisible(true);
        } catch (SQLException e) {
            UIManager.put("OptionPane.background",new ColorUIResource(193,255,193));
               UIManager.put("Panel.background",new ColorUIResource(193,255,193));
               UIManager.put("OptionPane.messageFont", new Font("ITC Kabel Std", Font.BOLD, 14));
               UIManager.put("OptionPane.buttonFont", new Font("AppleMyungjo", Font.ITALIC, 12));
            JOptionPane.showMessageDialog(this, "Le credenziali inserite sono errate!", "ERRORE", JOptionPane.ERROR_MESSAGE,new ImageIcon("prigione.gif"));  
        }
      

    }//GEN-LAST:event_bLoginActionPerformed

    private void tHostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tHostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tHostActionPerformed

    private void tUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tUserActionPerformed

    private void tPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tPasswordActionPerformed

    private void bAnnullaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAnnullaActionPerformed
        premuto = PREMUTO_ANNULLA;
        dispose();
    }//GEN-LAST:event_bAnnullaActionPerformed

    private void tSchemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tSchemaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tSchemaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAnnulla;
    private javax.swing.JButton bLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tHost;
    private javax.swing.JPasswordField tPassword;
    private javax.swing.JTextField tPorta;
    private javax.swing.JTextField tSchema;
    private javax.swing.JTextField tServizio;
    private javax.swing.JTextField tUser;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
