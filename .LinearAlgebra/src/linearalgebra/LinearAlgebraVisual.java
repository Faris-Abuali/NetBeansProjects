/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearalgebra;

/**
 *
 * @author Fares Abu Ali
 */
public class LinearAlgebraVisual extends javax.swing.JFrame {

    /**
     * Creates new form LinearAlgebraVisual
     */
    public LinearAlgebraVisual() {
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

        pnlMain = new javax.swing.JPanel();
        pnlHead = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        pnlParent = new javax.swing.JPanel();
        pnlOne = new javax.swing.JPanel();
        pnlTwo = new javax.swing.JPanel();
        pnlThree = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlMain.setBackground(new java.awt.Color(255, 255, 255));
        pnlMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlHead.setBackground(new java.awt.Color(153, 255, 255));

        btn1.setText("jButton1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setText("jButton1");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setText("jButton1");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlHeadLayout = new javax.swing.GroupLayout(pnlHead);
        pnlHead.setLayout(pnlHeadLayout);
        pnlHeadLayout.setHorizontalGroup(
            pnlHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeadLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(281, Short.MAX_VALUE))
        );
        pnlHeadLayout.setVerticalGroup(
            pnlHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeadLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnlHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pnlMain.add(pnlHead, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, -1));

        pnlParent.setBackground(new java.awt.Color(102, 102, 102));
        pnlParent.setLayout(new java.awt.CardLayout());

        pnlOne.setBackground(new java.awt.Color(255, 255, 102));

        javax.swing.GroupLayout pnlOneLayout = new javax.swing.GroupLayout(pnlOne);
        pnlOne.setLayout(pnlOneLayout);
        pnlOneLayout.setHorizontalGroup(
            pnlOneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );
        pnlOneLayout.setVerticalGroup(
            pnlOneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );

        pnlParent.add(pnlOne, "card4");

        pnlTwo.setBackground(new java.awt.Color(255, 102, 51));

        javax.swing.GroupLayout pnlTwoLayout = new javax.swing.GroupLayout(pnlTwo);
        pnlTwo.setLayout(pnlTwoLayout);
        pnlTwoLayout.setHorizontalGroup(
            pnlTwoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );
        pnlTwoLayout.setVerticalGroup(
            pnlTwoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );

        pnlParent.add(pnlTwo, "card2");

        pnlThree.setBackground(new java.awt.Color(0, 0, 153));

        javax.swing.GroupLayout pnlThreeLayout = new javax.swing.GroupLayout(pnlThree);
        pnlThree.setLayout(pnlThreeLayout);
        pnlThreeLayout.setHorizontalGroup(
            pnlThreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );
        pnlThreeLayout.setVerticalGroup(
            pnlThreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );

        pnlParent.add(pnlThree, "card3");

        pnlMain.add(pnlParent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 770, 330));

        getContentPane().add(pnlMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        pnlParent.removeAll(); // remove all components from pnlParent 
        pnlParent.add(pnlOne);
        pnlParent.repaint();
        pnlParent.revalidate();
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        pnlParent.removeAll(); // remove all components from pnlParent 
        pnlParent.add(pnlTwo);
        pnlParent.repaint();
        pnlParent.revalidate();
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        pnlParent.removeAll(); // remove all components from pnlParent 
        pnlParent.add(pnlThree);
        pnlParent.repaint();
        pnlParent.revalidate();
    }//GEN-LAST:event_btn3ActionPerformed

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
            java.util.logging.Logger.getLogger(LinearAlgebraVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LinearAlgebraVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LinearAlgebraVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LinearAlgebraVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LinearAlgebraVisual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JPanel pnlHead;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlOne;
    private javax.swing.JPanel pnlParent;
    private javax.swing.JPanel pnlThree;
    private javax.swing.JPanel pnlTwo;
    // End of variables declaration//GEN-END:variables
}
