package Interface;

public class robo_car extends javax.swing.JFrame {

    public robo_car() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanel_Main = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_up = new javax.swing.JButton();
        btn_down = new javax.swing.JButton();
        btn_left = new javax.swing.JButton();
        btn_right = new javax.swing.JButton();
        btn_stop = new javax.swing.JButton();
        btn_rotate_left = new javax.swing.JButton();
        btn_light = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btn_rotate_right = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JPanel_Main.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Arduino car controller", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Yu Gothic UI", 1, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel1.setText("Bluetooth Remote");

        btn_up.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Forward Arrow.png"))); // NOI18N
        btn_up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_upActionPerformed(evt);
            }
        });

        btn_down.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Backward Arrow.png"))); // NOI18N
        btn_down.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_downActionPerformed(evt);
            }
        });

        btn_left.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Left Side Arrow.png"))); // NOI18N
        btn_left.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_leftActionPerformed(evt);
            }
        });

        btn_right.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Right Side Arrow.png"))); // NOI18N
        btn_right.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rightActionPerformed(evt);
            }
        });

        btn_stop.setBackground(new java.awt.Color(255, 0, 0));
        btn_stop.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btn_stop.setText("Stop");
        btn_stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_stopActionPerformed(evt);
            }
        });

        btn_rotate_left.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btn_rotate_left.setText("Rotate Left");
        btn_rotate_left.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rotate_leftActionPerformed(evt);
            }
        });

        btn_light.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/On_Bulb.png"))); // NOI18N
        btn_light.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lightActionPerformed(evt);
            }
        });

        jLabel2.setText("Designed By Pasindu Bhathiya");

        btn_rotate_right.setFont(new java.awt.Font("Yu Gothic UI", 1, 13)); // NOI18N
        btn_rotate_right.setText("Rotate Right");
        btn_rotate_right.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rotate_rightActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPanel_MainLayout = new javax.swing.GroupLayout(JPanel_Main);
        JPanel_Main.setLayout(JPanel_MainLayout);
        JPanel_MainLayout.setHorizontalGroup(
            JPanel_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_MainLayout.createSequentialGroup()
                .addGroup(JPanel_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanel_MainLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(JPanel_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_down)
                            .addComponent(btn_up)))
                    .addGroup(JPanel_MainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_left)
                        .addGap(55, 55, 55)
                        .addComponent(btn_right)))
                .addGap(110, 110, 110)
                .addGroup(JPanel_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_light, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(btn_stop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(JPanel_MainLayout.createSequentialGroup()
                        .addComponent(btn_rotate_right)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btn_rotate_left, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanel_MainLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132))
            .addGroup(JPanel_MainLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPanel_MainLayout.setVerticalGroup(
            JPanel_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_MainLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(JPanel_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanel_MainLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btn_up))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanel_MainLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_light)
                        .addGap(25, 25, 25)))
                .addGroup(JPanel_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_right)
                    .addGroup(JPanel_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(JPanel_MainLayout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(btn_left))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanel_MainLayout.createSequentialGroup()
                            .addComponent(btn_rotate_left)
                            .addGap(16, 16, 16))))
                .addGap(7, 7, 7)
                .addGroup(JPanel_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(JPanel_MainLayout.createSequentialGroup()
                        .addComponent(btn_rotate_right)
                        .addGap(18, 18, 18)
                        .addComponent(btn_stop)
                        .addGap(25, 25, 25))
                    .addGroup(JPanel_MainLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_down)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanel_Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanel_Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_lightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lightActionPerformed
        javainstitute.io.BluetoothDevice.connect("002109004DDF");
        javainstitute.io.BluetoothDevice.send("6");
    }//GEN-LAST:event_btn_lightActionPerformed

    private void btn_upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_upActionPerformed
        javainstitute.io.BluetoothDevice.connect("002109004DDF");
        javainstitute.io.BluetoothDevice.send("1");
    }//GEN-LAST:event_btn_upActionPerformed

    private void btn_downActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_downActionPerformed
        javainstitute.io.BluetoothDevice.connect("002109004DDF");
        javainstitute.io.BluetoothDevice.send("2");
    }//GEN-LAST:event_btn_downActionPerformed

    private void btn_rightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rightActionPerformed
        javainstitute.io.BluetoothDevice.connect("002109004DDF");
        javainstitute.io.BluetoothDevice.send("3");
    }//GEN-LAST:event_btn_rightActionPerformed

    private void btn_leftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_leftActionPerformed
        javainstitute.io.BluetoothDevice.connect("002109004DDF");
        javainstitute.io.BluetoothDevice.send("4");
    }//GEN-LAST:event_btn_leftActionPerformed

    private void btn_stopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_stopActionPerformed
        javainstitute.io.BluetoothDevice.connect("002109004DDF");
        javainstitute.io.BluetoothDevice.send("0");
    }//GEN-LAST:event_btn_stopActionPerformed

    private void btn_rotate_leftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rotate_leftActionPerformed
        javainstitute.io.BluetoothDevice.connect("002109004DDF");
        javainstitute.io.BluetoothDevice.send("5");
    }//GEN-LAST:event_btn_rotate_leftActionPerformed

    private void btn_rotate_rightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rotate_rightActionPerformed
        javainstitute.io.BluetoothDevice.connect("002109004DDF");
        javainstitute.io.BluetoothDevice.send("7");
    }//GEN-LAST:event_btn_rotate_rightActionPerformed

   
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
            java.util.logging.Logger.getLogger(robo_car.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(robo_car.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(robo_car.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(robo_car.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new robo_car().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanel_Main;
    private javax.swing.JButton btn_down;
    private javax.swing.JButton btn_left;
    private javax.swing.JButton btn_light;
    private javax.swing.JButton btn_right;
    private javax.swing.JButton btn_rotate_left;
    private javax.swing.JButton btn_rotate_right;
    private javax.swing.JButton btn_stop;
    private javax.swing.JButton btn_up;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
