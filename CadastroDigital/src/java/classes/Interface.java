package classes;

/**
 *
 * @author matheus
 */
public class Interface extends javax.swing.JFrame {

    Arduino conn = new Arduino();
    
    public Interface() {
        initComponents();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnligar = new javax.swing.JButton();
        btndesligar = new javax.swing.JButton();
        btnsair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnligar.setText("LIGAR");
        btnligar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnligarMouseClicked(evt);
            }
        });
        btnligar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnligarActionPerformed(evt);
            }
        });

        btndesligar.setText("DESLIGAR");
        btndesligar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btndesligarMouseClicked(evt);
            }
        });
        btndesligar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndesligarActionPerformed(evt);
            }
        });

        btnsair.setText("SAIR");
        btnsair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsairMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btndesligar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnligar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnsair, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnligar)
                .addGap(31, 31, 31)
                .addComponent(btndesligar)
                .addGap(31, 31, 31)
                .addComponent(btnsair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btndesligarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndesligarActionPerformed
        
    }//GEN-LAST:event_btndesligarActionPerformed

    private void btnligarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnligarActionPerformed

    }//GEN-LAST:event_btnligarActionPerformed

    private void btnligarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnligarMouseClicked
        conn.comunicacaoArduino(btnligar);
    }//GEN-LAST:event_btnligarMouseClicked

    private void btndesligarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndesligarMouseClicked
        conn.comunicacaoArduino(btndesligar);
    }//GEN-LAST:event_btndesligarMouseClicked

    private void btnsairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsairMouseClicked
        conn.comunicacaoArduino(btnsair);
        System.exit(0);
    }//GEN-LAST:event_btnsairMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndesligar;
    private javax.swing.JButton btnligar;
    private javax.swing.JButton btnsair;
    // End of variables declaration//GEN-END:variables
}
