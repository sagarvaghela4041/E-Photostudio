/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ephotostudio.photographer;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Dell
 */
public class Photographer_Edit_Customer extends javax.swing.JFrame {

    /**
     * Creates new form Photographer_Edit_Customer
     */
    public Photographer_Edit_Customer() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        email = new javax.swing.JLabel();
        email_text = new javax.swing.JTextField();
        order_status = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        first_name = new javax.swing.JLabel();
        first_name_text = new javax.swing.JTextField();
        bill = new javax.swing.JLabel();
        last_name = new javax.swing.JLabel();
        bill_text = new javax.swing.JTextField();
        last_name_text = new javax.swing.JTextField();
        edit = new javax.swing.JButton();
        mobile_number = new javax.swing.JLabel();
        done = new javax.swing.JButton();
        mobile_number_text = new javax.swing.JTextField();
        completed = new javax.swing.JRadioButton();
        pending = new javax.swing.JRadioButton();
        canceled = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("E-Photostudio(Edit Customer)");
        setLocation(new java.awt.Point(500, 200));
        setResizable(false);

        email.setFont(new java.awt.Font("Algerian", 1, 20)); // NOI18N
        email.setText("Email");

        email_text.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        order_status.setFont(new java.awt.Font("Algerian", 1, 20)); // NOI18N
        order_status.setText("Order status");

        title.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        title.setText("Edit Customers");

        first_name.setFont(new java.awt.Font("Algerian", 1, 20)); // NOI18N
        first_name.setText("First Name");

        first_name_text.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        first_name_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                first_name_textActionPerformed(evt);
            }
        });

        bill.setFont(new java.awt.Font("Algerian", 1, 20)); // NOI18N
        bill.setText("Bill");

        last_name.setFont(new java.awt.Font("Algerian", 1, 20)); // NOI18N
        last_name.setText("Last Name");

        bill_text.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bill_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bill_textActionPerformed(evt);
            }
        });

        last_name_text.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        edit.setFont(new java.awt.Font("Algerian", 1, 20)); // NOI18N
        edit.setText("Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        mobile_number.setFont(new java.awt.Font("Algerian", 1, 20)); // NOI18N
        mobile_number.setText("Mobile Number");

        done.setFont(new java.awt.Font("Algerian", 1, 20)); // NOI18N
        done.setText("Done");
        done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneActionPerformed(evt);
            }
        });

        mobile_number_text.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        buttonGroup1.add(completed);
        completed.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        completed.setText("Completed");

        buttonGroup1.add(pending);
        pending.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        pending.setText("Pending");

        buttonGroup1.add(canceled);
        canceled.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        canceled.setText("Canceled");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(edit)
                                .addGap(38, 38, 38)
                                .addComponent(done))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bill)
                                .addGap(26, 26, 26)
                                .addComponent(bill_text, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(mobile_number)
                                    .addComponent(last_name)
                                    .addComponent(first_name)
                                    .addComponent(email)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(order_status)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(completed)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pending)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(canceled))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(mobile_number_text, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                                .addComponent(last_name_text, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(first_name_text, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(email_text)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(first_name, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(first_name_text, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(last_name_text, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(last_name, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mobile_number, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(mobile_number_text, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email_text, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(order_status, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(completed)
                    .addComponent(pending)
                    .addComponent(canceled))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bill)
                    .addComponent(bill_text, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edit)
                    .addComponent(done))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bill_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bill_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bill_textActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        String order_status1=null;
        if(completed.isSelected())
        {
            order_status1="Completed";
        }
        else if(pending.isSelected())
        {
            order_status1="Pending";
        }
        else
        {
            order_status1="Canceled";
        }
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/e_photostudio","root","root");
            Statement s=c.createStatement();
            s.executeUpdate("update customers set first_name='"+first_name_text.getText()+"',last_name='"+last_name_text.getText()+"',mobile_no='"+mobile_number_text.getText()+"',email_id='"+email_text.getText()+"'"
                            + ",order_status='"+order_status1+"',bill='"+bill_text.getText()+"' where id="+Photographer_Identify_Customer.id);
            JOptionPane.showMessageDialog(edit,"Customer Edited Successfullly");
            
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(edit,"Sorry Can't Edit Customer!!!");
                    }
    }//GEN-LAST:event_editActionPerformed

    private void doneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneActionPerformed
        Photographer_Main.main(new String[]{});
        dispose();
    }//GEN-LAST:event_doneActionPerformed

    private void first_name_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_first_name_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_first_name_textActionPerformed

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
            java.util.logging.Logger.getLogger(Photographer_Edit_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Photographer_Edit_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Photographer_Edit_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Photographer_Edit_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Photographer_Edit_Customer().setVisible(true);
                try
                {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/e_photostudio","root","root");
                    Statement s=c.createStatement();
                    ResultSet rs=s.executeQuery("select * from customers where id="+Photographer_Identify_Customer.id);
                    while(rs.next())
                    {
                        first_name_text.setText(rs.getString("first_name"));
                        last_name_text.setText(rs.getString("last_name"));
                        mobile_number_text.setText(rs.getString("mobile_no"));
                        email_text.setText(rs.getString("email_id"));
                        if(rs.getString("order_status").equals("Canceled"))
                        {
                            canceled.setSelected(true);
                        }
                        if(rs.getString("order_status").equals("Completed"))
                        {
                            completed.setSelected(true);
                        }
                        if(rs.getString("order_status").equals("Pending"))
                        {
                            pending.setSelected(true);
                        }
                        bill_text.setText((rs.getString("bill")));
                        
                            
                    }
                }
                catch(Exception e)
                {
                    System.out.println(e.getMessage());
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bill;
    private static javax.swing.JTextField bill_text;
    private javax.swing.ButtonGroup buttonGroup1;
    private static javax.swing.JRadioButton canceled;
    private static javax.swing.JRadioButton completed;
    private javax.swing.JButton done;
    private javax.swing.JButton edit;
    private javax.swing.JLabel email;
    private static javax.swing.JTextField email_text;
    private javax.swing.JLabel first_name;
    private static javax.swing.JTextField first_name_text;
    private javax.swing.JLabel last_name;
    private static javax.swing.JTextField last_name_text;
    private javax.swing.JLabel mobile_number;
    private static javax.swing.JTextField mobile_number_text;
    private javax.swing.JLabel order_status;
    private static javax.swing.JRadioButton pending;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}