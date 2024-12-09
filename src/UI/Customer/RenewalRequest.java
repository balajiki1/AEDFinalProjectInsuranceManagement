/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Customer;

import Model.New.Customer.Customer;
import java.awt.CardLayout;
import javax.swing.JPanel;
import Model.DatabaseConnection.DatabaseConnection;
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
import javax.mail.Authenticator; // Correct
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.swing.JOptionPane;

/**
 *
 * @author kishorebalaji
 */
public class RenewalRequest extends javax.swing.JPanel {

    /**
     * Creates new form RenewalRequest
     */
    private Customer customer;
    private JPanel workPanel;

    public RenewalRequest(JPanel workPanel, Customer customer) {
        initComponents();
        this.workPanel = workPanel;
        this.customer = customer;

        txtCustomerEmail.setText(customer.getEmail());
        txtCustomerName.setText(customer.getUsername());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblPolicyNumber = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        txtPolicyNumber = new javax.swing.JTextField();
        txtReasonForRequest = new javax.swing.JTextField();
        lblReasonforRequest = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        lblCustomerEmail = new javax.swing.JLabel();
        txtCustomerEmail = new javax.swing.JTextField();
        txtCustomerName = new javax.swing.JTextField();
        lblCustomerEmail1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Claim Request");

        lblPolicyNumber.setText("Policy Number");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtPolicyNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPolicyNumberActionPerformed(evt);
            }
        });

        txtReasonForRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReasonForRequestActionPerformed(evt);
            }
        });

        lblReasonforRequest.setText("Reson for Request");

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        lblCustomerEmail.setText("Customer Email");

        txtCustomerEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustomerEmailActionPerformed(evt);
            }
        });

        lblCustomerEmail1.setText("Customer Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSubmit)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCustomerEmail)
                                    .addComponent(lblPolicyNumber)
                                    .addComponent(lblCustomerEmail1)
                                    .addComponent(lblReasonforRequest))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtCustomerEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPolicyNumber, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtReasonForRequest, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 82, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(btnBack)
                .addGap(5, 5, 5)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCustomerEmail1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustomerEmail)
                    .addComponent(txtCustomerEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPolicyNumber)
                    .addComponent(txtPolicyNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtReasonForRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblReasonforRequest))
                .addGap(18, 18, 18)
                .addComponent(btnSubmit)
                .addContainerGap(46, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtReasonForRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReasonForRequestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReasonForRequestActionPerformed

    private void txtPolicyNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPolicyNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPolicyNumberActionPerformed
    private void sendClaimEmail(String recipientEmail, String recipientName, String policyNumber, String reason) {
          final String senderEmail = "rajumighty432@gmail.com"; // Replace with your email
    final String senderPassword = "bqff vybd eclw pxdf"; // Replace with your App Password
 // Replace with your App Password
// Replace with your App Password

    Properties properties = new Properties();
    properties.put("mail.smtp.auth", "true");
    properties.put("mail.smtp.starttls.enable", "true");
    properties.put("mail.smtp.host", "smtp.gmail.com");
    properties.put("mail.smtp.port", "587");
    properties.put("mail.smtp.ssl.protocols", "TLSv1.2");

    Session session = Session.getInstance(properties, new Authenticator() {
        @Override
        protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(senderEmail, senderPassword);
        }
    });

    try {
        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(senderEmail));
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientEmail));
        message.setSubject("Claim Request Confirmation");
        message.setText("Dear " + recipientName + ",\n\n" +
                "Your claim request has been received and is currently in process.\n\n" +
                "Policy Number: " + policyNumber + "\n" +
                "Reason: " + reason + "\n" +
                "Stage: In Process\n\n" +
                "Our team will get back to you shortly.\n\n" +
                "Regards,\nInsurance Portal");

        Transport.send(message);
        JOptionPane.showMessageDialog(this, "Confirmation email sent to " + recipientEmail, "Success", JOptionPane.INFORMATION_MESSAGE);
    } catch (MessagingException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Failed to send email: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }

    private void txtCustomerEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomerEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustomerEmailActionPerformed
    private void saveClaimRequest(String customerName, String customerEmail, String policyNumber, String reason) {
        String query = "INSERT INTO claim_requests (customer_name, customer_email, policy_number, reason_for_request, stage) VALUES (?, ?, ?, ?, ?)";

    try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
        stmt.setString(1, customerName);
        stmt.setString(2, customerEmail);
        stmt.setString(3, policyNumber);
        stmt.setString(4, reason);
        stmt.setString(5, "In Process"); // Set stage as "In Process"

        stmt.executeUpdate();
        JOptionPane.showMessageDialog(this, "Claim request submitted successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error saving claim request: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        workPanel.remove(this);
        CardLayout layout = (CardLayout) workPanel.getLayout();
        layout.previous(workPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        String customerName = txtCustomerName.getText().trim();
        String customerEmail = txtCustomerEmail.getText().trim();
        String policyNumber = txtPolicyNumber.getText().trim();
        String reason = txtReasonForRequest.getText().trim();

        if (customerName.isEmpty() || customerEmail.isEmpty() || policyNumber.isEmpty() || reason.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields must be filled out.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Save claim request
        saveClaimRequest(customerName, customerEmail, policyNumber, reason);

        // Send confirmation email
        sendClaimEmail(customerEmail, customerName, policyNumber, reason);

        // Clear form fields
        txtPolicyNumber.setText("");
        txtReasonForRequest.setText("");
    }//GEN-LAST:event_btnSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCustomerEmail;
    private javax.swing.JLabel lblCustomerEmail1;
    private javax.swing.JLabel lblPolicyNumber;
    private javax.swing.JLabel lblReasonforRequest;
    private javax.swing.JTextField txtCustomerEmail;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextField txtPolicyNumber;
    private javax.swing.JTextField txtReasonForRequest;
    // End of variables declaration//GEN-END:variables
}