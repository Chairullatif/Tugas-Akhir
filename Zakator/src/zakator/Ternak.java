/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zakator;

/**
 *
 * @author windows
 */

public class Ternak extends javax.swing.JFrame {

    /**
     * Creates new form Pertanian
     */
    int pilihan, jumlah;
    public Ternak() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jCjenis = new javax.swing.JComboBox<>();
        jLket = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTjumlah = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLhasil = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLcek = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 262, -1, -1));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Zakat Maal");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 549, -1));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Binatang Ternak");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 38, 549, -1));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel3.setText("Pilih Binatang Ternak:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 74, -1, -1));

        jCjenis.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jCjenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Unta", "Sapi", "Kambing" }));
        jCjenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCjenisActionPerformed(evt);
            }
        });
        getContentPane().add(jCjenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 94, 103, -1));

        jLket.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLket.setText("Nisab minimal unta adalah 5 ekor");
        getContentPane().add(jLket, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 94, 436, 20));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel4.setText("Jumlah Ternak Anda:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 125, 120, -1));

        jTjumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTjumlahActionPerformed(evt);
            }
        });
        getContentPane().add(jTjumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 145, 103, -1));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Jumlah zakat binatang ternak yang harus anda tunaikan:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 183, 549, -1));

        jLhasil.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLhasil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLhasil.setText("-");
        getContentPane().add(jLhasil, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 203, 549, -1));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 223, 549, 20));

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton1.setText("Hitung Zakat");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 262, -1, -1));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 145, 25, 9));

        jLcek.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jLcek, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 160, 20));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zakator/13081-01-gradient-designs-powerpoint-backgrounds-16x9-1.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-9, -3, 570, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Maal maal = new Maal();
        maal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jCjenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCjenisActionPerformed
        // TODO add your handling code here:
        pilihan = jCjenis.getSelectedIndex();
        
        if (pilihan == 0){
            jLket.setText("Nisab minimal unta adalah 5 ekor");
        }else if (pilihan == 1){
            jLket.setText("Nisab minimal sapi adalah 30 ekor");
        }else{
            jLket.setText("Nisab minimal kambing adalah 40 ekor");
        }
    }//GEN-LAST:event_jCjenisActionPerformed

    private void jTjumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTjumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTjumlahActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:  
        if (!jTjumlah.getText().matches("[0-9]*")){
            jLcek.setText("Masukan harus angka"); 
            jLcek.setVisible(true);
        }else {
            jLcek.setVisible(false);
        }
        Nisab nisab = new Nisab();
        jumlah = Integer.parseInt(jTjumlah.getText());
        pilihan = jCjenis.getSelectedIndex();
        
        if (pilihan==0){
            jLhasil.setText(nisab.unta(jumlah));
        }else if (pilihan==1){
            jLhasil.setText(nisab.sapi(jumlah));
        }else{
            jLhasil.setText(nisab.kambing(jumlah));
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Ternak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ternak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ternak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ternak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ternak().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jCjenis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLcek;
    private javax.swing.JLabel jLhasil;
    private javax.swing.JLabel jLket;
    private javax.swing.JTextField jTjumlah;
    // End of variables declaration//GEN-END:variables
}
