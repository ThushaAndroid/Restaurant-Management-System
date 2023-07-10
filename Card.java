/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Inf;

import Codes.DBconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author user
 */
public class Card extends javax.swing.JFrame {

   Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    
    public Card() {
        initComponents();
         conn=DBconnect.connect();
         
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        confirmbtn = new javax.swing.JButton();
        cvcbox = new javax.swing.JTextField();
        namebox = new javax.swing.JTextField();
        cnumberbox = new javax.swing.JTextField();
        exbox = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        amobox = new javax.swing.JTextField();
        pay = new javax.swing.JButton();

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Card details");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("4. CVC");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("1. Card Holder's Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("2. Card Number");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("3. Expiry");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        confirmbtn.setBackground(new java.awt.Color(204, 255, 51));
        confirmbtn.setText("Confirm");
        confirmbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmbtnActionPerformed(evt);
            }
        });
        jPanel1.add(confirmbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 80, 30));

        cvcbox.setToolTipText("Enter CVC");
        cvcbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cvcboxActionPerformed(evt);
            }
        });
        jPanel1.add(cvcbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 242, 120, 30));

        namebox.setToolTipText("Enter your Name");
        namebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameboxActionPerformed(evt);
            }
        });
        jPanel1.add(namebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 82, 320, 30));

        cnumberbox.setToolTipText("Enter card number");
        cnumberbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnumberboxActionPerformed(evt);
            }
        });
        jPanel1.add(cnumberbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 162, 320, 30));

        exbox.setToolTipText("Enter expiry date");
        exbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exboxActionPerformed(evt);
            }
        });
        jPanel1.add(exbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 242, 120, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("4. Amount");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        amobox.setToolTipText("Enter card number");
        amobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amoboxActionPerformed(evt);
            }
        });
        jPanel1.add(amobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 320, 30));

        pay.setBackground(new java.awt.Color(204, 255, 51));
        pay.setText("Pay");
        pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payActionPerformed(evt);
            }
        });
        jPanel1.add(pay, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 80, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cvcboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cvcboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cvcboxActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void nameboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameboxActionPerformed

    private void cnumberboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnumberboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnumberboxActionPerformed

    private void exboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exboxActionPerformed

    private void confirmbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmbtnActionPerformed
       
        
       String name=namebox.getText();
        String card=cnumberbox.getText();
        String ex=exbox.getText();
        String cvc=cvcbox.getText();
        
       
        
        
        if((name.equals(""))||(card.equals(""))||(ex.equals(""))||(cvc.equals(""))){
            
        JOptionPane.showMessageDialog(null, "invalid");
        namebox.setText("");
        cnumberbox.setText("");
        exbox.setText("");
        cvcbox.setText("");
      
        
            
        }else{
            
           JOptionPane.showMessageDialog(null, "Your order has been successed");
       
        }
         
        confirm(); 
        
         
    }//GEN-LAST:event_confirmbtnActionPerformed

    private void amoboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amoboxActionPerformed
        
        
    }//GEN-LAST:event_amoboxActionPerformed

    private void payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payActionPerformed
       
        int amo;
     
     try{
        
        amo=Integer.valueOf(amobox.getText());
        
        String sql="INSERT INTO amo(amount) VALUES ('"+amo+"')";
        pst=conn.prepareStatement(sql);
        pst.execute();
        
         }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
       
    }//GEN-LAST:event_payActionPerformed
   
    
    /*public void recept(){
        
        int a=Integer.valueOf(amobox.getText());
         Receipt r2=new Receipt();
         r2.amount(a);
         this.setVisible(true);
         
    }*/
    
    
    
   public void confirm(){
   
        Receipt r1=new Receipt();
        r1.setVisible(true);
        this.dispose();
        
}

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
            java.util.logging.Logger.getLogger(Card.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Card.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Card.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Card.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Card().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amobox;
    private javax.swing.JTextField cnumberbox;
    private javax.swing.JButton confirmbtn;
    private javax.swing.JTextField cvcbox;
    private javax.swing.JTextField exbox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField namebox;
    private javax.swing.JButton pay;
    // End of variables declaration//GEN-END:variables
}