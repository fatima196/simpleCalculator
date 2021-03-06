
package mycalc;


public class MyCalc_Form extends javax.swing.JFrame {

    /**
     * Creates new form MyCalc_Form
     */
    public MyCalc_Form() {
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

        jBtDiv = new javax.swing.JButton();
        jBtMod = new javax.swing.JButton();
        jBtExit = new javax.swing.JButton();
        txtRes = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNum1 = new javax.swing.JTextField();
        txtNum2 = new javax.swing.JTextField();
        jBtAdd = new javax.swing.JButton();
        jBtSub = new javax.swing.JButton();
        jBtMul = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBtDiv.setText("/");
        jBtDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtDivActionPerformed(evt);
            }
        });

        jBtMod.setText("mod");
        jBtMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtModActionPerformed(evt);
            }
        });

        jBtExit.setText("Exit");
        jBtExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtExitActionPerformed(evt);
            }
        });

        txtRes.setText("0");

        jLabel1.setBackground(new java.awt.Color(255, 255, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("My Calculator");

        jLabel2.setText("num 1 :");

        jLabel3.setText("num 2 :");

        jBtAdd.setText("+");
        jBtAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtAddActionPerformed(evt);
            }
        });

        jBtSub.setText("-");
        jBtSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtSubActionPerformed(evt);
            }
        });

        jBtMul.setText("×");
        jBtMul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtMulActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(110, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBtAdd)
                        .addGap(33, 33, 33)
                        .addComponent(jBtSub)
                        .addGap(34, 34, 34)
                        .addComponent(jBtMul)
                        .addGap(40, 40, 40)
                        .addComponent(jBtDiv)
                        .addGap(41, 41, 41)
                        .addComponent(jBtMod)
                        .addGap(96, 96, 96))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(201, 201, 201)
                            .addComponent(txtRes, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(43, 43, 43)
                            .addComponent(jBtExit))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2))
                            .addGap(32, 32, 32)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(82, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtAdd)
                    .addComponent(jBtSub)
                    .addComponent(jBtMul)
                    .addComponent(jBtDiv)
                    .addComponent(jBtMod))
                .addGap(110, 110, 110))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(76, 76, 76)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(txtNum1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(86, 86, 86)
                    .addComponent(txtRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtExit)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     private double calc (String Ope){
        double num1 = Double.parseDouble(txtNum1.getText());
        double num2 = Double.parseDouble(txtNum2.getText());
       
        double res=0;
        
        if (Ope.equals("+")){
            res =num1+num2;
        }
        if (Ope.equals("-")){
            res =num1-num2;
        }
        if (Ope.equals("*")){
            res =num1*num2;
        }
        if (Ope.equals("/")){
            res =num1/num2;
        }
        if (Ope.equals("%")){
            res =num1%num2;
        }
        
        return res;
    }
    private void jBtDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtDivActionPerformed
        
        txtRes.setText(String.valueOf(calc("/")));
    }//GEN-LAST:event_jBtDivActionPerformed

    private void jBtModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtModActionPerformed
        
        txtRes.setText(String.valueOf(calc("%")));
    }//GEN-LAST:event_jBtModActionPerformed

    private void jBtExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBtExitActionPerformed

    private void jBtAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtAddActionPerformed
        
        txtRes.setText(String.valueOf(calc("+")));
    }//GEN-LAST:event_jBtAddActionPerformed

    private void jBtSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtSubActionPerformed
      
        txtRes.setText(String.valueOf(calc("-")));
    }//GEN-LAST:event_jBtSubActionPerformed

    private void jBtMulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtMulActionPerformed
        
        txtRes.setText(String.valueOf(calc("*")));
    }//GEN-LAST:event_jBtMulActionPerformed

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
            java.util.logging.Logger.getLogger(MyCalc_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyCalc_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyCalc_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyCalc_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyCalc_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtAdd;
    private javax.swing.JButton jBtDiv;
    private javax.swing.JButton jBtExit;
    private javax.swing.JButton jBtMod;
    private javax.swing.JButton jBtMul;
    private javax.swing.JButton jBtSub;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtNum1;
    private javax.swing.JTextField txtNum2;
    private javax.swing.JTextField txtRes;
    // End of variables declaration//GEN-END:variables
}
