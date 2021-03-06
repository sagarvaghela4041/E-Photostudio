/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ephotostudio.photographer;

/**
 *
 * @author Dell
 */
public class Photographer_Gallary extends javax.swing.JFrame {

    /**
     * Creates new form Photographer_Gallary
     */
    public Photographer_Gallary() {
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

        wedding_title = new javax.swing.JLabel();
        nature = new javax.swing.JButton();
        wildlife = new javax.swing.JButton();
        wildlife_title = new javax.swing.JLabel();
        nature_title = new javax.swing.JLabel();
        wedding = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        done = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("E-Photostudio(Gallary)");
        setLocation(new java.awt.Point(500, 200));
        setResizable(false);

        wedding_title.setFont(new java.awt.Font("Algerian", 1, 20)); // NOI18N
        wedding_title.setText("Weddings");

        nature.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ephotostudio/Photos/title_nature.jpg"))); // NOI18N
        nature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                natureActionPerformed(evt);
            }
        });

        wildlife.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ephotostudio/Photos/title_wildlife.jpg"))); // NOI18N
        wildlife.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wildlifeActionPerformed(evt);
            }
        });

        wildlife_title.setFont(new java.awt.Font("Algerian", 1, 20)); // NOI18N
        wildlife_title.setText("Wild-Life");

        nature_title.setFont(new java.awt.Font("Algerian", 1, 20)); // NOI18N
        nature_title.setText("Nature");

        wedding.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ephotostudio/Photos/tilte_wedding.jpg"))); // NOI18N
        wedding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weddingActionPerformed(evt);
            }
        });

        title.setFont(new java.awt.Font("Algerian", 1, 28)); // NOI18N
        title.setText("Gallary");

        done.setFont(new java.awt.Font("Algerian", 1, 20)); // NOI18N
        done.setText("Done");
        done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(wedding_title)
                        .addGap(207, 207, 207)
                        .addComponent(wildlife_title))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(wedding, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(wildlife, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(nature, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(nature_title)
                        .addGap(96, 96, 96)))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(400, 400, 400)
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(done)
                .addGap(93, 93, 93))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(done, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nature, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(wedding, javax.swing.GroupLayout.PREFERRED_SIZE, 272, Short.MAX_VALUE))
                    .addComponent(wildlife, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wedding_title, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wildlife_title)
                    .addComponent(nature_title))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void natureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_natureActionPerformed
        Photographer_Gallary_Nature.main(new String[]{});
        dispose();
    }//GEN-LAST:event_natureActionPerformed

    private void weddingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weddingActionPerformed
        Photographer_Gallary_Weddings.main(new String[]{});
        dispose();
    }//GEN-LAST:event_weddingActionPerformed

    private void wildlifeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wildlifeActionPerformed
        Photographer_Gallary_Wildlife.main(new String[]{});
        dispose();
    }//GEN-LAST:event_wildlifeActionPerformed

    private void doneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneActionPerformed
        Photographer_Main.main(new String[]{});
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
            java.util.logging.Logger.getLogger(Photographer_Gallary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Photographer_Gallary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Photographer_Gallary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Photographer_Gallary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Photographer_Gallary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton done;
    private javax.swing.JButton nature;
    private javax.swing.JLabel nature_title;
    private javax.swing.JLabel title;
    private javax.swing.JButton wedding;
    private javax.swing.JLabel wedding_title;
    private javax.swing.JButton wildlife;
    private javax.swing.JLabel wildlife_title;
    // End of variables declaration//GEN-END:variables
}
