package progetto_monopoly;

public class Home extends javax.swing.JFrame {
    public static int flag = 0;

    public Home() {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        img1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        hCarta = new javax.swing.JButton();
        hCasella = new javax.swing.JButton();
        hGiocatore = new javax.swing.JButton();
        hMossa = new javax.swing.JButton();
        hContratto = new javax.swing.JButton();
        hPartita = new javax.swing.JButton();
        hPossedimento = new javax.swing.JButton();
        logout = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 0));
        setMaximumSize(new java.awt.Dimension(600, 500));
        setMinimumSize(new java.awt.Dimension(600, 500));
        setSize(new java.awt.Dimension(600, 500));

        jPanel1.setBackground(new java.awt.Color(193, 255, 193));
        jPanel1.setMaximumSize(new java.awt.Dimension(600, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 500));
        jPanel1.setSize(new java.awt.Dimension(600, 500));

        img1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progetto_monopoly/icone/logo.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("ITC Kabel Std", 1, 14)); // NOI18N
        jLabel1.setText("Seleziona la tabella sulla quale effettuare un'operazione :");

        hCarta.setBackground(new java.awt.Color(255, 0, 51));
        hCarta.setFont(new java.awt.Font("Kabel", 2, 12)); // NOI18N
        hCarta.setText("Carta");
        hCarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hCartaActionPerformed(evt);
            }
        });

        hCasella.setFont(new java.awt.Font("Kabel", 2, 12)); // NOI18N
        hCasella.setText("Casella");
        hCasella.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hCasellaActionPerformed(evt);
            }
        });

        hGiocatore.setFont(new java.awt.Font("Kabel", 2, 12)); // NOI18N
        hGiocatore.setText("Giocatore");
        hGiocatore.setToolTipText("");
        hGiocatore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hGiocatoreActionPerformed(evt);
            }
        });

        hMossa.setFont(new java.awt.Font("Kabel", 2, 12)); // NOI18N
        hMossa.setText("Mossa");
        hMossa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hMossaActionPerformed(evt);
            }
        });

        hContratto.setFont(new java.awt.Font("Kabel", 2, 12)); // NOI18N
        hContratto.setText("Contratto");
        hContratto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hContrattoActionPerformed(evt);
            }
        });

        hPartita.setFont(new java.awt.Font("Kabel", 2, 12)); // NOI18N
        hPartita.setText("Partita");
        hPartita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hPartitaActionPerformed(evt);
            }
        });

        hPossedimento.setFont(new java.awt.Font("Kabel", 2, 12)); // NOI18N
        hPossedimento.setText("Possedimento");
        hPossedimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hPossedimentoActionPerformed(evt);
            }
        });

        logout.setFont(new java.awt.Font("ITC Kabel Std", 1, 14)); // NOI18N
        logout.setText("Logout");
        logout.setSize(new java.awt.Dimension(70, 30));
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(logout)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(img1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(hCarta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(hCasella, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(hContratto)
                        .addGap(30, 30, 30)
                        .addComponent(hGiocatore))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(hMossa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(hPartita, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(hPossedimento))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(img1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hCarta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hCasella, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hContratto, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hGiocatore, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hMossa, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hPartita, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hPossedimento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hCartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hCartaActionPerformed
        //Carta ->1
        flag = 1;    
        this.dispose();
        Classe obj = new Classe ();
        obj.setVisible(true);
    }//GEN-LAST:event_hCartaActionPerformed

    private void hGiocatoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hGiocatoreActionPerformed
        //Giocatore ->4
        flag = 4;    
        this.dispose();
        Classe obj = new Classe ();
        obj.setVisible(true);
    }//GEN-LAST:event_hGiocatoreActionPerformed

    private void hCasellaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hCasellaActionPerformed
        //Casella ->2
        flag=2;   
        this.dispose();
        Classe obj = new Classe ();
        obj.setVisible(true);
    }//GEN-LAST:event_hCasellaActionPerformed

    private void hMossaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hMossaActionPerformed
        //Mossa ->5
        flag=5;
        this.dispose();
        Classe obj = new Classe ();
        obj.setVisible(true);
    }//GEN-LAST:event_hMossaActionPerformed

    private void hPossedimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hPossedimentoActionPerformed
        //Possedimento ->7
        flag=7;
        this.dispose();
        Classe obj = new Classe ();
        obj.setVisible(true);
    }//GEN-LAST:event_hPossedimentoActionPerformed

    private void hContrattoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hContrattoActionPerformed
        //Contratto ->3
        flag=3;
        this.dispose();
        Classe obj = new Classe ();
        obj.setVisible(true);
    }//GEN-LAST:event_hContrattoActionPerformed

    private void hPartitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hPartitaActionPerformed
        //Partita ->6
        flag=6;
        this.dispose();
        Classe obj = new Classe ();
        obj.setVisible(true);
    }//GEN-LAST:event_hPartitaActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
       this.dispose();
        Login l = new Login(null,true); 
        l.setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton hCarta;
    private javax.swing.JButton hCasella;
    private javax.swing.JButton hContratto;
    private javax.swing.JButton hGiocatore;
    private javax.swing.JButton hMossa;
    private javax.swing.JButton hPartita;
    private javax.swing.JButton hPossedimento;
    private javax.swing.JLabel img1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logout;
    // End of variables declaration//GEN-END:variables
}
