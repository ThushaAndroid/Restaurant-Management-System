/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Inf;

import Codes.DBconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author user
 */
public class Table extends javax.swing.JFrame {

    Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    
    public Table() {
        initComponents();
        conn=DBconnect.connect();
         tableload();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        exitbtn = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        updatebtn = new javax.swing.JButton();
        bookbtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        cearbtn = new javax.swing.JButton();
        searchbox = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pnumberbox = new javax.swing.JTextField();
        nicbox = new javax.swing.JTextField();
        datebox = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        namebox = new javax.swing.JTextField();
        tnumberbox = new javax.swing.JComboBox<>();
        timebox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Table Reserved");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Inf/table.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, -10, 460, 400));

        exitbtn.setBackground(new java.awt.Color(204, 255, 51));
        exitbtn.setText("Exit");
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });
        jPanel1.add(exitbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, -1, -1));

        backbtn.setBackground(new java.awt.Color(204, 255, 51));
        backbtn.setText("Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });
        jPanel1.add(backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        Table.setBackground(new java.awt.Color(204, 204, 204));
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMouseClicked(evt);
            }
        });
        Table.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(Table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 440, 170));

        updatebtn.setBackground(new java.awt.Color(204, 255, 51));
        updatebtn.setText("UPDATE");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });
        jPanel1.add(updatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, -1));

        bookbtn.setBackground(new java.awt.Color(204, 255, 51));
        bookbtn.setText("BOOK");
        bookbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookbtnActionPerformed(evt);
            }
        });
        jPanel1.add(bookbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, -1, -1));

        deletebtn.setBackground(new java.awt.Color(204, 255, 51));
        deletebtn.setText("DELETE");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });
        jPanel1.add(deletebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, -1, -1));

        cearbtn.setBackground(new java.awt.Color(204, 255, 51));
        cearbtn.setText("CLEAR");
        cearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cearbtnActionPerformed(evt);
            }
        });
        jPanel1.add(cearbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, -1, -1));

        searchbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchboxKeyReleased(evt);
            }
        });
        jPanel1.add(searchbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, 180, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Search");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 0, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Date");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Name");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Phone Number");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));
        jPanel2.add(pnumberbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 130, -1));
        jPanel2.add(nicbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 110, -1));
        jPanel2.add(datebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 130, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("NIC");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Time");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Table Number");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, -1, -1));
        jPanel2.add(namebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 130, -1));

        tnumberbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" }));
        jPanel2.add(tnumberbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 120, 70, -1));

        timebox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9.00 AM", "10.00 AM", "11.00 AM", "12.00 PM", "1.00 PM", "2.00 PM", "3.00 PM", "4.00 PM", "5.00 PM", "6.00 PM", "7.00 PM", "8.00 PM", "9.00 PM" }));
        jPanel2.add(timebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 70, 70, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 440, 170));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        
        String name=namebox.getText();
        String pnumber=pnumberbox.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
        String date=sdf.format(datebox.getDate());
        String nic=nicbox.getText();
        String time=timebox.getSelectedItem().toString();
        String rnumber=tnumberbox.getSelectedItem().toString();
        String avb="BOOK";
        
        try{
        String sql="UPDATE tab SET tname='"+name+"',tpnumber='"+pnumber+"',tdate='"+date+"',tnic='"+nic+"',ttime='"+time+"',tnumber='"+rnumber+"',avb='"+avb+"' WHERE tnumber='"+rnumber+"'";
        pst=conn.prepareStatement(sql);
        pst.execute();
        JOptionPane.showMessageDialog(null, "Updated");
    } catch(Exception e){
         JOptionPane.showMessageDialog(null, e);
    }
        
    tableload();
    }//GEN-LAST:event_updatebtnActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
       
        int check=JOptionPane.showConfirmDialog(null, "Do you want to delete!");

        if(check==0){

            String rno=tnumberbox.getSelectedItem().toString();

            try{
                String sql="DELETE FROM tab WHERE tnumber='"+rno+"'";
                pst=conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Deleted");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }

        }
        tableload();
        clear();
    }//GEN-LAST:event_deletebtnActionPerformed
public void clear(){
    
            namebox.setText("");
            pnumberbox.setText("");
            datebox.setDateFormatString("");
            nicbox.setText("");
            timebox.setSelectedIndex(0);
            tnumberbox.setSelectedIndex(0);
    
}
public void search(){
     
     String srh=searchbox.getText();
     
     try{
         String sql="SELECT tname AS Name,tpnumber AS Phone_no,tdate AS Date,tnic AS NIC,ttime AS Time,tnumber AS Table_no,avb AS Availability FROM tab WHERE tnumber LIKE'%"+srh+"%'";
         pst=conn.prepareStatement(sql);
         rs=pst.executeQuery();
         Table.setModel(DbUtils.resultSetToTableModel(rs));  
     }
     catch(Exception e){
         JOptionPane.showMessageDialog(null,e);
         
     }
}
    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        Mainframe m1= new Mainframe();
        m1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backbtnActionPerformed

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
       System.exit(0);
    }//GEN-LAST:event_exitbtnActionPerformed

    private void bookbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookbtnActionPerformed
        
        String name;
        String pnumber;
        String date;
        String nic;
        String time;
        int rnumber;
        String avb;
        
        try{
            name=namebox.getText();
            pnumber=pnumberbox.getText();
            SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
            date=sdf.format(datebox.getDate());
            nic=nicbox.getText();
            time=timebox.getSelectedItem().toString();
            rnumber=Integer.parseInt(tnumberbox.getSelectedItem().toString());
            avb="BOOK";
            
            String sql="INSERT INTO tab(tname,tpnumber,tdate,tnic,ttime,tnumber,avb) VALUES ('"+name+"','"+pnumber+"','"+date+"','"+nic+"','"+time+"','"+rnumber+"','"+avb+"')";
            pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Inserted");
        
    }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        tableload();
        
      
    }//GEN-LAST:event_bookbtnActionPerformed

    private void TableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TableKeyReleased
        tabledata();
    }//GEN-LAST:event_TableKeyReleased

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
        tabledata();
    }//GEN-LAST:event_TableMouseClicked

    private void cearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cearbtnActionPerformed
        clear();
    }//GEN-LAST:event_cearbtnActionPerformed

    private void searchboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchboxKeyReleased
        search();
    }//GEN-LAST:event_searchboxKeyReleased
public void tableload(){

            try{
                String sql="SELECT tname AS Name,tpnumber AS Phone_no,tdate AS Date,tnic AS NIC,ttime AS Time,tnumber AS Table_no,avb AS Availability FROM tab";
                pst=conn.prepareStatement(sql);
                rs=pst.executeQuery();
                Table.setModel(DbUtils.resultSetToTableModel(rs));

            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
        }

public void tabledata(){

            int r=Table.getSelectedRow();

            String name= Table.getValueAt(r, 0).toString();
            String pnumber=  Table.getValueAt(r, 1).toString();
            String date= Table.getValueAt(r, 2).toString();
            String nic=  Table.getValueAt(r, 3).toString();
            String time=  Table.getValueAt(r, 4).toString();
            String rnumber=  Table.getValueAt(r, 5).toString();
            String avb=  Table.getValueAt(r, 6).toString();
            


            namebox.setText(name);
            pnumberbox.setText(pnumber);
            datebox.setDateFormatString(date);
            nicbox.setText(nic);
            timebox.setSelectedItem(time);
            tnumberbox.setSelectedItem(rnumber);
            
            
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
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Table().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JButton backbtn;
    private javax.swing.JButton bookbtn;
    private javax.swing.JButton cearbtn;
    private com.toedter.calendar.JDateChooser datebox;
    private javax.swing.JButton deletebtn;
    private javax.swing.JButton exitbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField namebox;
    private javax.swing.JTextField nicbox;
    private javax.swing.JTextField pnumberbox;
    private javax.swing.JTextField searchbox;
    private javax.swing.JComboBox<String> timebox;
    private javax.swing.JComboBox<String> tnumberbox;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}
