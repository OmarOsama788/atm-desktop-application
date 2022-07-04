package itproject;

import java.util.*;
import javax.swing.JOptionPane;

public class sign_in_form extends javax.swing.JFrame {
public static void s2(){
    user one=new user("Mohamed Saad" , "mohamedsaad@icloud.com" , "1234567890" ,0,"29/5/2004");
        users.add(one);
}
public boolean isValidEmail(String a){
    boolean r =false;
    for(int i=0 ; i<a.length();i++){
        if(a.charAt(i)=='@'){
            r=true;
            break;
        }
    }
    return r;
}
    private static ArrayList<user> users= new ArrayList<>();
    public static ArrayList<user> getUsers(){
        return users;
    }
    public sign_in_form() {
         setResizable(false);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jPasswordField5 = new javax.swing.JPasswordField();
        buttonGroup = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        N1 = new javax.swing.JTextField();
        E1 = new javax.swing.JTextField();
        m1 = new javax.swing.JTextField();
        P1 = new javax.swing.JPasswordField();
        P2 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jLabel4.setText("password");

        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });

        jPasswordField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField5ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("sign in");
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 440, 147, 52));

        jButton2.setBackground(new java.awt.Color(153, 153, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Back");
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 147, 52));

        N1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N1ActionPerformed(evt);
            }
        });
        getContentPane().add(N1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 210, 29));

        E1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E1ActionPerformed(evt);
            }
        });
        getContentPane().add(E1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 210, 29));

        m1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m1ActionPerformed(evt);
            }
        });
        getContentPane().add(m1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 210, 30));

        P1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P1ActionPerformed(evt);
            }
        });
        getContentPane().add(P1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 210, 28));

        P2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P2ActionPerformed(evt);
            }
        });
        getContentPane().add(P2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 210, 28));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 255));
        jLabel1.setText("Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 255));
        jLabel3.setText("Confirm Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 255));
        jLabel5.setText("Password");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 83, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 255));
        jLabel2.setText("E-mail");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 255));
        jLabel7.setText("Date of birth");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 100, -1));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mohamed Saad\\Documents\\NetBeansProjects\\ITProject 123\\ITProject\\ITProject\\sign in.jpg")); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-470, -50, 1270, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
      
    }//GEN-LAST:event_jPasswordField2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        new login().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void E1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_E1ActionPerformed

    private void jPasswordField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String name=N1.getText();
        String Email=E1.getText();
        String password=re(P1.getPassword());
        String confPass=re(P2.getPassword());
        String BirthDay=m1.getText();
            if(name.length()>0  &&  Email.length()>0&& password.length()>0 && confPass.length()>0 && BirthDay.length()>0){
            if(password.equals(confPass)){
                if(isValidEmail(Email)){
                    if(isValid(password)){
                        user i= new user(name,Email,password,0,BirthDay);
                        users.add(i);
                        JOptionPane.showMessageDialog(this, "Added");
                     }else{
                        JOptionPane.showMessageDialog(this, "Not Strong password");
                             }
                }else{
                    JOptionPane.showMessageDialog(this, "Ivalid Email");
                }
                    
            }else{
                JOptionPane.showMessageDialog(this, "check the password please");
            }
        }else{
            JOptionPane.showMessageDialog(this, "Fill the blanks");
        }

       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void P2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P2ActionPerformed

    }//GEN-LAST:event_P2ActionPerformed

    private void P1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P1ActionPerformed

    }//GEN-LAST:event_P1ActionPerformed

    private void m1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m1ActionPerformed

    private void N1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_N1ActionPerformed
    private String re(char [] u){
        String y="";
        for(int i=0;i<u.length;i++){
            y=y+u[i];
        }
        return y;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(sign_in_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sign_in_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sign_in_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sign_in_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run() {
                new sign_in_form().setVisible(true);
            }
        });
    }
    private boolean isValid(String  a){
        boolean r=a.length()>5;
        int chars =0;
        int numbers=0;
        int elseo=0;
        for(int i=0; i<a.length();i++){
            if(isChar(a.charAt(i))){
                chars++;
            }else if(isNumber(a.charAt(i))){
                numbers++;
            }else{
                elseo++;
            }
        }
        if(r){
            r=0<=numbers && elseo>0 && chars>0;
        }
        return r;
    }
    private boolean isChar(char a){
        a=Character.toUpperCase(a);
        
        return a>='A' && a<='Z';
    }
    private boolean  isNumber(char a){
        return a>='1'&&a<='9';
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField E1;
    private javax.swing.JTextField N1;
    private javax.swing.JPasswordField P1;
    private javax.swing.JPasswordField P2;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField5;
    private javax.swing.JTextField m1;
    // End of variables declaration//GEN-END:variables
}