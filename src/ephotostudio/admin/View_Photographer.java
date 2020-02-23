/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ephotostudio.admin;

import ephotostudio.photographer.Photographer_Login;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Dell
 */
public class View_Photographer extends javax.swing.JFrame {

    /**
     * Creates new form View_Photographer
     */
    public View_Photographer() {
        initComponents();
        bindMyCustomers();
    }
     public void bindMyCustomers() {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/e_photostudio", "root", "root");
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery("SELECT fn AS 'First Name',mn AS 'Middle Name',ln AS 'Last Name',sn AS 'Shop Name',address AS 'Address',email AS 'Email ID',phone AS 'Contact No.',un AS 'User Name',pw AS 'Password' from details");
            /*while(rs.next()){
            System.out.println("Hello");
            System.out.println(rs.getString(0));
            }*/
            table.setModel(DbUtils.resultSetToTableModel(rs));
            s.close();
            c.close();
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("e_photostudio?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        detailsQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT d FROM Details d");
        detailsList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : detailsQuery.getResultList();
        detailsQuery1 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT d FROM Details d");
        detailsList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : detailsQuery1.getResultList();
        detailsQuery2 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT d FROM Details d");
        detailsList2 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : detailsQuery2.getResultList();
        title = new javax.swing.JLabel();
        done = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("E-Photostudio(View Photographer)");
        setLocation(new java.awt.Point(500, 200));
        setResizable(false);

        title.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        title.setText("All Photographers");

        done.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        done.setText("DONE");
        done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneActionPerformed(evt);
            }
        });

        table.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "null", "null", "null", "null", "null"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(348, Short.MAX_VALUE)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(270, 270, 270)
                .addComponent(done)
                .addGap(50, 50, 50))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(done, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void doneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneActionPerformed
            Admin_Main.main(new String[]{});
            dispose();
    }//GEN-LAST:event_doneActionPerformed

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
            java.util.logging.Logger.getLogger(View_Photographer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_Photographer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_Photographer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_Photographer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_Photographer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.util.List<ephotostudio.admin.Details> detailsList;
    private java.util.List<ephotostudio.admin.Details> detailsList1;
    private java.util.List<ephotostudio.admin.Details> detailsList2;
    private javax.persistence.Query detailsQuery;
    private javax.persistence.Query detailsQuery1;
    private javax.persistence.Query detailsQuery2;
    private javax.swing.JButton done;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
