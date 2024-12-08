/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Comp.Admin;

import Main.InsuranceModel;
import Model.Account.Account;
import Model.Account.Account.CustomerAccount;
import Model.Account.AccountCredentials;
import Model.Account.AccountCredentialsDirectory;
import Model.DatabaseConnection.DatabaseConnection;
import java.awt.CardLayout;
import javax.mail.Authenticator; // Correct
import javax.mail.PasswordAuthentication;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
import javax.swing.JOptionPane;

/**
 *
 * @author kishorebalaji
 */
public class AdminMainScreen extends javax.swing.JPanel {

    /**
     * Creates new form AdminMainScreen
     */
    InsuranceModel BIM;
    JPanel workPanel;
    Account account;

    public AdminMainScreen(InsuranceModel BIM, JPanel workPanel, Account account) {
        
        initComponents();
        this.BIM = BIM;
        this.workPanel = workPanel;
        this.account = account;
refreshAccountTable();
tblUserList.getSelectionModel().addListSelectionListener(event -> {
    int selectedRow = tblUserList.getSelectedRow();
    if (selectedRow >= 0) {
        // Use safe null-checking
        Object firstName = tblUserList.getValueAt(selectedRow, 0);
        Object lastName = tblUserList.getValueAt(selectedRow, 1);
        Object role = tblUserList.getValueAt(selectedRow, 2);
        Object emailId = tblUserList.getValueAt(selectedRow, 3);
        Object userId = tblUserList.getValueAt(selectedRow, 4);
        Object password = tblUserList.getValueAt(selectedRow, 5);

        FName.setText(firstName != null ? firstName.toString() : "");
        txtLName.setText(lastName != null ? lastName.toString() : "");
        Role.setText(role != null ? role.toString() : "");
        txtEmailId.setText(emailId != null ? emailId.toString() : "");
        txtUserId.setText(userId != null ? userId.toString() : "");
        txtPassword.setText(password != null ? password.toString() : "");
    }
});


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblUserList = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        FName = new javax.swing.JTextField();
        lblLName = new javax.swing.JLabel();
        txtLName = new javax.swing.JTextField();
        lblLName1 = new javax.swing.JLabel();
        txtEmailId = new javax.swing.JTextField();
        lblRole = new javax.swing.JLabel();
        Role = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        txtUserId = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("                                Admin Portal");

        btnLogout.setBackground(new java.awt.Color(204, 204, 204));
        btnLogout.setForeground(new java.awt.Color(0, 51, 102));
        btnLogout.setText("Log Out");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        tblUserList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "FName", "LName", "Role", "EmailID", "UserName", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblUserList);

        btnUpdate.setBackground(new java.awt.Color(204, 204, 204));
        btnUpdate.setForeground(new java.awt.Color(0, 51, 102));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setText("First Name");

        FName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FNameActionPerformed(evt);
            }
        });

        lblLName.setForeground(new java.awt.Color(0, 51, 102));
        lblLName.setText("Last Name");

        txtLName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLNameActionPerformed(evt);
            }
        });

        lblLName1.setForeground(new java.awt.Color(0, 51, 102));
        lblLName1.setText("Email Id");

        txtEmailId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailIdActionPerformed(evt);
            }
        });

        lblRole.setForeground(new java.awt.Color(0, 51, 102));
        lblRole.setText("Role");

        Role.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoleActionPerformed(evt);
            }
        });

        lblPassword.setForeground(new java.awt.Color(0, 51, 102));
        lblPassword.setText("Password");

        lblUserName.setForeground(new java.awt.Color(0, 51, 102));
        lblUserName.setText("UserName");

        txtUserId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserIdActionPerformed(evt);
            }
        });

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(204, 204, 204));
        btnAdd.setForeground(new java.awt.Color(0, 51, 102));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(204, 204, 204));
        btnDelete.setForeground(new java.awt.Color(0, 51, 102));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/admin.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblLName1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEmailId))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblRole, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Role, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblLName, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLName))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FName, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPassword))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(btnUpdate)
                            .addGap(18, 18, 18)
                            .addComponent(btnDelete))
                        .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addGap(43, 43, 43))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(btnLogout))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel3)
                        .addGap(73, 73, 73)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUpdate)
                            .addComponent(btnDelete))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(FName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLName)
                            .addComponent(txtLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRole)
                            .addComponent(Role, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLName1)
                            .addComponent(txtEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUserName)
                            .addComponent(txtUserId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPassword)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnAdd)))
                .addGap(78, 78, 78))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        workPanel.remove(this);
        CardLayout layout = (CardLayout) workPanel.getLayout();
        layout.previous(workPanel);

    }//GEN-LAST:event_btnLogoutActionPerformed

    private void FNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FNameActionPerformed

    private void txtLNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLNameActionPerformed

    private void txtEmailIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailIdActionPerformed

    private void RoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RoleActionPerformed

    private void txtUserIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserIdActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

    int selectedRowIndex = tblUserList.getSelectedRow();
    if (selectedRowIndex == -1) {
        JOptionPane.showMessageDialog(this, "Please select a user to update.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    String firstName = FName.getText();
    String lastName = txtLName.getText();
    String role = Role.getText();
    String email = txtEmailId.getText();
    String username = txtUserId.getText();
    String password = txtPassword.getText();

    // Validate if any field is empty
    if (firstName.isEmpty() || lastName.isEmpty() || role.isEmpty() || email.isEmpty() || username.isEmpty() || password.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Debug prints
    System.out.println("First Name: " + firstName);
    System.out.println("Last Name: " + lastName);
    System.out.println("Role: " + role);
    System.out.println("Email: " + email);
    System.out.println("Username: " + username);
    System.out.println("Password: " + password);

    String query = "UPDATE users SET FName = ?, LName = ?, role = ?, EmailID = ?, password = ? WHERE username = ?";
    try (Connection conn = DatabaseConnection.getConnection();
         PreparedStatement stmt = conn.prepareStatement(query)) {

        stmt.setString(1, firstName);
        stmt.setString(2, lastName);
        stmt.setString(3, role);
        stmt.setString(4, email);
        stmt.setString(5, password);
        stmt.setString(6, username);

        int rowsUpdated = stmt.executeUpdate();
        if (rowsUpdated > 0) {
            JOptionPane.showMessageDialog(this, "User updated successfully!");
            refreshAccountTable(); // Refresh table
        } else {
            JOptionPane.showMessageDialog(this, "No rows updated. Please check the username.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Database error while updating user: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }

    // Clear fields after update
    FName.setText("");
    txtLName.setText("");
    Role.setText("");
    txtEmailId.setText("");
    txtUserId.setText("");
    txtPassword.setText("");
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String firstName = FName.getText();
        String lastName = txtLName.getText();
        String role = Role.getText();
        String email = txtEmailId.getText();
        String username = txtUserId.getText();
        String password = txtPassword.getText();

        if (firstName.isEmpty() || lastName.isEmpty() || role.isEmpty() || email.isEmpty() || username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String query = "INSERT INTO users (username, password, role, FName, LName, EmailID) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, username);
            stmt.setString(2, password);
            stmt.setString(3, role);
            stmt.setString(4, firstName);
            stmt.setString(5, lastName);
            stmt.setString(6, email);

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "User added successfully!");

            sendEmail(email, firstName); // Send email notification
            refreshAccountTable();

            FName.setText("");
            txtLName.setText("");
            Role.setText("");
            txtEmailId.setText("");
            txtUserId.setText("");
            txtPassword.setText("");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error adding user to the database", "Error", JOptionPane.ERROR_MESSAGE);
        }
        

    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblUserList.getSelectedRow();

    if (selectedRowIndex == -1) {
        JOptionPane.showMessageDialog(this, "Please select a user to delete.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    DefaultTableModel model = (DefaultTableModel) tblUserList.getModel();
    String username = (String) model.getValueAt(selectedRowIndex, 4); // Assuming 'username' is in the 5th column

    int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete the user: " + username + "?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);

    if (confirm == JOptionPane.YES_OPTION) {
        String query = "DELETE FROM users WHERE username = ?";

        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, username);

            int rowsDeleted = stmt.executeUpdate();
            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(this, "User deleted successfully!");
                refreshAccountTable(); // Refresh the table after deletion
            } else {
                JOptionPane.showMessageDialog(this, "Failed to delete user. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_btnDeleteActionPerformed
private void sendEmail(String recipientEmail, String recipientName) {
     final String senderEmail = "rajumighty432@gmail.com"; // Replace with your email
    final String senderPassword = "bqff vybd eclw pxdf"; // Replace with your App Password

    Properties properties = new Properties();
    properties.put("mail.smtp.auth", "true");
    properties.put("mail.smtp.starttls.enable", "true");
    properties.put("mail.smtp.host", "smtp.gmail.com");
    properties.put("mail.smtp.port", "587");
    properties.put("mail.smtp.ssl.protocols", "TLSv1.2");

    Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
        @Override
        protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(senderEmail, senderPassword);
        }
    });

    try {
        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(senderEmail));
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientEmail));
        message.setSubject("Welcome to Insurance Portal");
        message.setText("Dear " + recipientName + ",\n\nYour account has been successfully created.\n\nRegards,\nAdmin Team");

        Transport.send(message);
        JOptionPane.showMessageDialog(this, "Email sent to " + recipientEmail);
    } catch (MessagingException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Failed to send email: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FName;
    private javax.swing.JTextField Role;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblLName;
    private javax.swing.JLabel lblLName1;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JTable tblUserList;
    private javax.swing.JTextField txtEmailId;
    private javax.swing.JTextField txtLName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUserId;
    // End of variables declaration//GEN-END:variables

    private void refreshAccountTable() {

        DefaultTableModel model = (DefaultTableModel) tblUserList.getModel();
        model.setRowCount(0); // Clear existing rows

        String query = "SELECT username, password, role, FName, LName, EmailID FROM users";

        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                String username = rs.getString("username");
                String password = rs.getString("password");
                String role = rs.getString("role");
                String firstName = rs.getString("FName");
                String lastName = rs.getString("LName");
                String emailId = rs.getString("EmailID");

                // Add the data to the table model
                model.addRow(new Object[]{firstName, lastName, role, emailId, username, password});
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error fetching users from the database", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
