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
public class Room extends javax.swing.JFrame {

    Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    
    public Room() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        namebox = new javax.swing.JTextField();
        idbox = new javax.swing.JTextField();
        rpbox = new javax.swing.JTextField();
        addressbox = new javax.swing.JTextField();
        rnbox = new javax.swing.JComboBox<>();
        datebox = new com.toedter.calendar.JDateChooser();
        exitbtn = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        updatebtn = new javax.swing.JButton();
        bookbtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        clearbtn = new javax.swing.JButton();
        searchbox = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Room Booking");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("One Day Room Service");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("ID Number");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Room Number");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Phone Number");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Address");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Date");

        rnbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" }));
        rnbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rnboxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(idbox, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(namebox, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(rpbox, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addressbox, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rnbox, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(69, 69, 69)
                                .addComponent(datebox, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(namebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(idbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rnbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rpbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(addressbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(datebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 290, 290));

        exitbtn.setBackground(new java.awt.Color(204, 255, 51));
        exitbtn.setText("Exit");
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });
        jPanel1.add(exitbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, -1, -1));

        backbtn.setBackground(new java.awt.Color(204, 255, 51));
        backbtn.setText("Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });
        jPanel1.add(backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 470, 340));

        updatebtn.setBackground(new java.awt.Color(204, 255, 51));
        updatebtn.setText("UPDATE");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });
        jPanel1.add(updatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, -1, -1));

        bookbtn.setBackground(new java.awt.Color(204, 255, 51));
        bookbtn.setText("BOOK");
        bookbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookbtnActionPerformed(evt);
            }
        });
        jPanel1.add(bookbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        deletebtn.setBackground(new java.awt.Color(204, 255, 51));
        deletebtn.setText("DELETE");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });
        jPanel1.add(deletebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, -1));

        clearbtn.setBackground(new java.awt.Color(204, 255, 51));
        clearbtn.setText("CLEAR");
        clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbtnActionPerformed(evt);
            }
        });
        jPanel1.add(clearbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, -1, -1));

        searchbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchboxActionPerformed(evt);
            }
        });
        searchbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchboxKeyReleased(evt);
            }
        });
        jPanel1.add(searchbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 50, 170, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Search");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitbtnActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        Mainframe m1= new Mainframe();
        m1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backbtnActionPerformed

    private void bookbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookbtnActionPerformed
        
        String name;
        String id;
        int rno;
        String pnumber;
        String address;
        String date;
        String book;
        
        try{
            
            name=namebox.getText();
            id=idbox.getText();
            rno=Integer.parseInt(rnbox.getSelectedItem().toString());
            pnumber=rpbox.getText();
            address=addressbox.getText();
            SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
            date=sdf.format(datebox.getDate());
            book="BOOK";
            
            String sql="INSERT INTO room(rname,rid,rrnumber,rpnumber,raddress,rdate,avb) VALUES ('"+name+"','"+id+"','"+rno+"','"+pnumber+"','"+address+"','"+date+"','"+book+"')";
            pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Inserted");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        tableload();
        
    }//GEN-LAST:event_bookbtnActionPerformed
public void tableload(){

            try{
                String sql="SELECT rname AS Name,rid AS ID,rrnumber AS Room,rpnumber AS Phone_number,raddress AS Address,rdate AS Date,avb AS Availability FROM room";
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
            String id=  Table.getValueAt(r, 1).toString();
            String rno= Table.getValueAt(r, 2).toString();
            String pnumber=  Table.getValueAt(r, 3).toString();
            String address=  Table.getValueAt(r, 4).toString();
            String date=  Table.getValueAt(r, 5).toString();
            String book=  Table.getValueAt(r, 6).toString();
            


            namebox.setText(name);
            idbox.setText(id);
            rnbox.setSelectedItem(rno);
            rpbox.setText(pnumber);
            addressbox.setText(address);
            datebox.setDateFormatString(date);
            
}
    private void rnboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rnboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rnboxActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        
        String name=namebox.getText();
        String id=idbox.getText();
        String rno=rnbox.getSelectedItem().toString();
        String pnumber=rpbox.getText();
        String address=addressbox.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
        String date=sdf.format(datebox.getDate());
        String book="BOOK";
        
        try{
        String sql="UPDATE room SET rname='"+name+"',rid='"+id+"',rrnumber='"+rno+"',rpnumber='"+pnumber+"',raddress='"+address+"',rdate='"+date+"',avb='"+book+"' WHERE rrnumber='"+rno+"'";
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

            String rno=rnbox.getSelectedItem().toString();

            try{
                String sql="DELETE FROM room WHERE rrnumber='"+rno+"'";
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

    private void clearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbtnActionPerformed
          clear();  
    }//GEN-LAST:event_clearbtnActionPerformed

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
        tabledata();
    }//GEN-LAST:event_TableMouseClicked

    private void TableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TableKeyReleased
        tabledata();
    }//GEN-LAST:event_TableKeyReleased

    private void searchboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchboxActionPerformed
        search();
    }//GEN-LAST:event_searchboxActionPerformed

    private void searchboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchboxKeyReleased
        search();
    }//GEN-LAST:event_searchboxKeyReleased
public void clear(){
            namebox.setText("");
            idbox.setText("");
            rnbox.setSelectedIndex(0);
            rpbox.setText("");
            addressbox.setText("");
            datebox.setDateFormatString("");
            searchbox.setText("");
    
}
public void search(){
     
     String srh=searchbox.getText();
     
     try{
         String sql="SELECT rname AS Name,rid AS ID,rrnumber AS Room,rpnumber AS Phone_number,raddress AS Address,rdate AS Date,avb AS Availability FROM room WHERE rrnumber LIKE'%"+srh+"%'";
         pst=conn.prepareStatement(sql);
         rs=pst.executeQuery();
         Table.setModel(DbUtils.resultSetToTableModel(rs));  
     }
     catch(Exception e){
         JOptionPane.showMessageDialog(null,e);
         
     }
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
            java.util.logging.Logger.getLogger(Room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Room().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JTextField addressbox;
    private javax.swing.JButton backbtn;
    private javax.swing.JButton bookbtn;
    private javax.swing.JButton clearbtn;
    private com.toedter.calendar.JDateChooser datebox;
    private javax.swing.JButton deletebtn;
    private javax.swing.JButton exitbtn;
    private javax.swing.JTextField idbox;
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
    private javax.swing.JComboBox<String> rnbox;
    private javax.swing.JTextField rpbox;
    private javax.swing.JTextField searchbox;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}
