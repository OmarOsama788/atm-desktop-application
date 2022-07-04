package itproject;

import javax.swing.JOptionPane;

public class moreoptions extends javax.swing.JFrame  {

    public moreoptions() {
        initComponents();
         setResizable(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        m4 = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        r4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 255));
        jLabel1.setText("Enter the amount of money");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        m4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m4ActionPerformed(evt);
            }
        });
        getContentPane().add(m4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 205, 36));

        jToggleButton1.setBackground(new java.awt.Color(153, 153, 255));
        jToggleButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jToggleButton1.setText("Back");
        jToggleButton1.setFocusable(false);
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 128, 49));

        r4.setBackground(new java.awt.Color(153, 153, 255));
        r4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        r4.setText("Get");
        r4.setFocusable(false);
        r4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4ActionPerformed(evt);
            }
        });
        getContentPane().add(r4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, 126, 49));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mohamed Saad\\Documents\\NetBeansProjects\\ITProject 123\\ITProject\\ITProject\\getm.jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
      dispose();
      new Withdraw().setVisible(true);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void m4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m4ActionPerformed
 Main_form1 s2=new Main_form1();
   s2.setVisible(true);
    }//GEN-LAST:event_m4ActionPerformed

    private void r4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4ActionPerformed
        if(m4.getText().length()>0){
            try{
                Double money=login.getUser().getMoney();
                Double f=Double.parseDouble(m4.getText());
                if(money>=f){
                    login.getUser().setMoney(login.getUser().getMoney()-Double.parseDouble(m4.getText()));
                JOptionPane.showMessageDialog(this,"get Successfully");
                } else{
                     JOptionPane.showMessageDialog(this,"your money is smaller than you want");
                }
            }catch(Exception e){
//               System.exit(0);
               JOptionPane.showMessageDialog(null,"It should be a number");
            }

           

            }
        else{
            JOptionPane.showMessageDialog(this,"Add the number");
        }
   
    }//GEN-LAST:event_r4ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(moreoptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(moreoptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(moreoptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(moreoptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new moreoptions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField m4;
    private javax.swing.JButton r4;
    // End of variables declaration//GEN-END:variables
}
