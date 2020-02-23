/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ephotostudio.photographer;
import java.sql.*;
/**
 *
 * @author Dell
 */
public class Photographer_View_Profile extends javax.swing.JFrame {

    /**
     * Creates new form Photographer_View_Profile
     */
    public Photographer_View_Profile() {
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

        tilte = new javax.swing.JLabel();
        first_name = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        last_name = new javax.swing.JLabel();
        shop_name = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        phone_number = new javax.swing.JLabel();
        middle_name = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        first_name_text = new javax.swing.JTextField();
        middle_name_text = new javax.swing.JTextField();
        last_name_text = new javax.swing.JTextField();
        shop_name_text = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        address_text = new javax.swing.JTextArea();
        email_text = new javax.swing.JTextField();
        phone_number_text = new javax.swing.JTextField();
        username_text = new javax.swing.JTextField();
        password_text = new javax.swing.JTextField();
        done = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("E-Photostudio(Photographer View Profile)");
        setLocation(new java.awt.Point(500, 200));
        setResizable(false);

        tilte.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        tilte.setText("View Profile");

        first_name.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        first_name.setText("First Name");

        email.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        email.setText("Email");

        last_name.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        last_name.setText("Last Name");

        shop_name.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        shop_name.setText("Shop Name");

        address.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        address.setText("Address");

        phone_number.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        phone_number.setText("Phone Number");

        middle_name.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        middle_name.setText("Middle Name");

        username.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        username.setText("User Name");

        password.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        password.setText("Password");

        first_name_text.setEditable(false);
        first_name_text.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N

        middle_name_text.setEditable(false);
        middle_name_text.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N

        last_name_text.setEditable(false);
        last_name_text.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N

        shop_name_text.setEditable(false);
        shop_name_text.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N

        address_text.setEditable(false);
        address_text.setColumns(20);
        address_text.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        address_text.setRows(5);
        jScrollPane1.setViewportView(address_text);

        email_text.setEditable(false);
        email_text.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        email_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_textActionPerformed(evt);
            }
        });

        phone_number_text.setEditable(false);
        phone_number_text.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N

        username_text.setEditable(false);
        username_text.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N

        password_text.setEditable(false);
        password_text.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N

        done.setFont(new java.awt.Font("Algerian", 1, 22)); // NOI18N
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(first_name))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(middle_name))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(last_name))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(shop_name))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(151, 151, 151)
                                .addComponent(email))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(phone_number))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(username))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(password)))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(first_name_text)
                            .addComponent(middle_name_text)
                            .addComponent(last_name_text)
                            .addComponent(shop_name_text)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(email_text)
                            .addComponent(phone_number_text)
                            .addComponent(username_text)
                            .addComponent(password_text)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(tilte))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(done)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tilte, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(first_name, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(first_name_text, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(middle_name_text)
                    .addComponent(middle_name, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(last_name_text)
                    .addComponent(last_name, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(shop_name_text)
                    .addComponent(shop_name, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email_text, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(phone_number_text)
                    .addComponent(phone_number, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(username_text)
                    .addComponent(username, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(password_text))
                .addGap(18, 18, 18)
                .addComponent(done)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void email_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_textActionPerformed

    private void doneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneActionPerformed
        Photographer_Main.main(new String[]{});
        dispose();
    }//GEN-LAST:event_doneActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Photographer_View_Profile().setVisible(true);
                try
                {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/e_photostudio","root","root");
                    Statement s=c.createStatement();
                    ResultSet rs=s.executeQuery("select * from details where id="+Photographer_Login.id);
                    while(rs.next())
                    {
                        first_name_text.setText(rs.getString("fn"));
                        middle_name_text.setText(rs.getString("mn"));
                        last_name_text.setText(rs.getString("ln"));
                        shop_name_text.setText(rs.getString("sn"));
                        address_text.setText(rs.getString("address"));
                        email_text.setText(rs.getString("email"));
                        phone_number_text.setText(rs.getString("phone"));
                        username_text.setText(rs.getString("un"));
                        password_text.setText(rs.getString("pw"));
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
    private javax.swing.JLabel address;
    private static javax.swing.JTextArea address_text;
    private javax.swing.JButton done;
    private javax.swing.JLabel email;
    private static javax.swing.JTextField email_text;
    private javax.swing.JLabel first_name;
    private static javax.swing.JTextField first_name_text;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel last_name;
    private static javax.swing.JTextField last_name_text;
    private javax.swing.JLabel middle_name;
    private static javax.swing.JTextField middle_name_text;
    private javax.swing.JLabel password;
    private static javax.swing.JTextField password_text;
    private javax.swing.JLabel phone_number;
    private static javax.swing.JTextField phone_number_text;
    private javax.swing.JLabel shop_name;
    private static javax.swing.JTextField shop_name_text;
    private javax.swing.JLabel tilte;
    private javax.swing.JLabel username;
    private static javax.swing.JTextField username_text;
    // End of variables declaration//GEN-END:variables
}