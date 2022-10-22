


public class calculater extends javax.swing.JFrame {

    public calculater() {
        initComponents();


    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtnum1 = new javax.swing.JTextField();
        txtnum2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtans = new javax.swing.JTextField();
        btnadd = new javax.swing.JButton();
        btnmul = new javax.swing.JButton();
        btnmin = new javax.swing.JButton();
        btndiv = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculater");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(51, 51, 51)));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Num 1");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Num 2");

        txtnum1.setBackground(new java.awt.Color(0, 102, 102));
        txtnum1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtnum1.setForeground(new java.awt.Color(255, 255, 255));
        txtnum1.setBorder(null);
        txtnum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnum1ActionPerformed(evt);
            }
        });

        txtnum2.setBackground(new java.awt.Color(0, 102, 102));
        txtnum2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtnum2.setForeground(new java.awt.Color(255, 255, 255));
        txtnum2.setBorder(null);

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Answer");

        txtans.setBackground(new java.awt.Color(0, 102, 102));
        txtans.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtans.setForeground(new java.awt.Color(255, 255, 255));
        txtans.setBorder(null);

        btnadd.setBackground(new java.awt.Color(153, 153, 153));
        btnadd.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnadd.setText("+");
        btnadd.setActionCommand("btn+");
        btnadd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btnmul.setBackground(new java.awt.Color(153, 153, 153));
        btnmul.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnmul.setText("*");
        btnmul.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        btnmul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmulActionPerformed(evt);
            }
        });

        btnmin.setBackground(new java.awt.Color(153, 153, 153));
        btnmin.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnmin.setText("-");
        btnmin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        btnmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnminActionPerformed(evt);
            }
        });

        btndiv.setBackground(new java.awt.Color(153, 153, 153));
        btndiv.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btndiv.setText("/");
        btndiv.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        btndiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndivActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(54, 54, 54)
                                                .addComponent(txtans))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jLabel2))
                                                .addGap(59, 59, 59)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtnum2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtnum1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(btnmul, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(btnmin, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                                .addGap(34, 34, 34)
                                .addComponent(btndiv, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel1)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(txtnum1)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(25, 25, 25))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(txtnum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(txtans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(46, 46, 46)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnadd)
                                        .addComponent(btnmul)
                                        .addComponent(btnmin)
                                        .addComponent(btndiv))
                                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }
    // </editor-fold>//GEN-END:initComponents


    CalDisplay cal=new CalDisplay();


    private void btnmulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmulActionPerformed
        // TODO add your handling code here:
        String n1=txtnum1.getText();
        String n2=txtnum2.getText();
        int x= Integer.parseInt(n1);
        int y= Integer.parseInt(n2);

        int tot= x*y;
        txtans.setText(""+tot);
        cal.setVisible(true);
        String Text1=txtnum1.getText();
        String Text2=txtnum2.getText();
        String Text3=txtans.getText();
        cal.txtno1.setText(Text1);
        cal.txtno2.setText(Text2);
        cal.txtOutputAns.setText(Text3);
        //System.out.println("tot");
    }//GEN-LAST:event_btnmulActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        // TODO add your handling code here:

        String n1=txtnum1.getText();
        String n2=txtnum2.getText();
        int x= Integer.parseInt(n1);
        int y= Integer.parseInt(n2);

        int tot= x+y;
        txtans.setText(""+tot);

        //CalDisplay cal=new CalDisplay();
        cal.setVisible(true);
        String Text1=txtnum1.getText();
        String Text2=txtnum2.getText();
        String Text3=txtans.getText();
        cal.txtno1.setText(Text1);
        cal.txtno2.setText(Text2);
        cal.txtOutputAns.setText(Text3);





        // Integer i=new Integer(x);
        //cal.txtno1.setText(i.toString());
        //cal.txtno1.setText();

    }//GEN-LAST:event_btnaddActionPerformed

    private void btnminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnminActionPerformed
        // TODO add your handling code here:
        String n1=txtnum1.getText();
        String n2=txtnum2.getText();
        int x= Integer.parseInt(n1);
        int y= Integer.parseInt(n2);

        int tot= x-y;
        txtans.setText(""+tot);


        cal.setVisible(true);
        String Text1=txtnum1.getText();
        String Text2=txtnum2.getText();
        String Text3=txtans.getText();
        cal.txtno1.setText(Text1);
        cal.txtno2.setText(Text2);
        cal.txtOutputAns.setText(Text3);
        // System.out.println("tot");
    }//GEN-LAST:event_btnminActionPerformed

    private void btndivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndivActionPerformed
        // TODO add your handling code here:
        String n1=txtnum1.getText();
        String n2=txtnum2.getText();
        int x= Integer.parseInt(n1);
        int y= Integer.parseInt(n2);

        int tot= x/y;
        txtans.setText(""+tot);
        cal.setVisible(true);
        String Text1=txtnum1.getText();
        String Text2=txtnum2.getText();
        String Text3=txtans.getText();
        cal.txtno1.setText(Text1);
        cal.txtno2.setText(Text2);
        cal.txtOutputAns.setText(Text3);
        //System.out.println("tot");
    }//GEN-LAST:event_btndivActionPerformed

    private void txtnum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnum1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnum1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])/*throws Exception*/ {
        /* Set the Nimbus look and feel */


        //Class c= Class.forName("first.app.CalDisplay");
        //Object o=c.newInstance();
        // Method m=c.getDeclaredMethod("txtno1ActionPerformed", null);
        //m.setAccessible(true);
        //m.invoke(o,null);







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
            java.util.logging.Logger.getLogger(calculater.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculater.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculater.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculater.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculater().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btndiv;
    private javax.swing.JButton btnmin;
    private javax.swing.JButton btnmul;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtans;
    public javax.swing.JTextField txtnum1;
    private javax.swing.JTextField txtnum2;
    // End of variables declaration//GEN-END:variables
}


//
//
//
//
//
//
//
//
//
//

//cal Display class


