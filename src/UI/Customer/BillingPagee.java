/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Customer;

import Model.New.Customer.Customer;
import Model.DatabaseConnection.DatabaseConnection;
import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ABHINAVCHINTA
 */
public class BillingPagee extends javax.swing.JPanel {

    /**
     * Creates new form BillingPagee
     */
    private JPanel workPanel;
    private Customer customer;
    private String vehicleType;
    private String year;
    private String brand;
    private String model;
    private String vin;
    private String policyName;
    private String claimPercentage;
    private String policyAmount;
    private String premiumAmount;
    private String coveragePeriod;
    private String deductibleAmount;
    private String stage;
        private String policyNumber;

    public BillingPagee(JPanel workPanel, Customer customer, String vehicleType, String year, String brand, String model, String vin,
            String policyName, String claimPercentage, String policyAmount, String premiumAmount, String coveragePeriod, String deductibleAmount) {
        initComponents();
        this.workPanel = workPanel;
        this.customer = customer;
        this.vehicleType = vehicleType;
        this.year = year;
        this.brand = brand;
        this.model = model;
        this.vin = vin;
        this.policyName = policyName;
        this.claimPercentage = claimPercentage;
        this.policyAmount = policyAmount;
        this.premiumAmount = premiumAmount;
        this.coveragePeriod = coveragePeriod;
        this.deductibleAmount = deductibleAmount;
        
        this.policyNumber = generateRandomPolicyNumber();

        txtTotalAmount.setText(premiumAmount);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTotalAmount = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCardName = new javax.swing.JTextField();
        txtCardNumber = new javax.swing.JTextField();
        txtExpMonth = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtExpYear = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCVV = new javax.swing.JTextField();
        btnMakePayment = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 204, 255));

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Billing Page");

        jLabel2.setText("Total Amount");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Card Details");

        jLabel4.setText("Card Name");

        jLabel5.setText("Card Number");

        jLabel6.setText("Expiration Month");

        jLabel7.setText("Expiration Year");

        jLabel8.setText("CVV");

        btnMakePayment.setText("Make Payment");
        btnMakePayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMakePaymentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel4))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCardName)
                                            .addComponent(txtCardNumber)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(53, 53, 53)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(59, 59, 59)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtExpMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtExpYear, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCVV, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(btnMakePayment))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(254, 254, 254))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCardName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtExpMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtExpYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCVV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnMakePayment)
                .addContainerGap(121, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
 private String generateRandomPolicyNumber() {
        Random random = new Random();
        int randomNumber = 100000 + random.nextInt(900000); // Generates a 6-digit random number
        return "POL" + randomNumber;
    }
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        workPanel.remove(this);
        CardLayout layout = (CardLayout) workPanel.getLayout();
        layout.previous(workPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnMakePaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMakePaymentActionPerformed
        String cardName = txtCardName.getText().trim();
        String cardNumber = txtCardNumber.getText().trim();
        String expMonth = txtExpMonth.getText().trim();
        String expYear = txtExpYear.getText().trim();
        String cvv = txtCVV.getText().trim();

        if (cardName.isEmpty() || cardNumber.isEmpty() || expMonth.isEmpty() || expYear.isEmpty() || cvv.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields must be filled out.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        saveTransactionDetails(cardName, cardNumber, expMonth, expYear, cvv);
        sendPaymentConfirmationEmail(customer.getEmail(), customer.getUsername(), premiumAmount);

        JOptionPane.showMessageDialog(this, "Payment successful! Confirmation email sent.", "Success", JOptionPane.INFORMATION_MESSAGE);

        // Clear fields
        txtCardName.setText("");
        txtCardNumber.setText("");
        txtExpMonth.setText("");
        txtExpYear.setText("");
        txtCVV.setText("");
          workPanel.remove(this);
        CardLayout layout = (CardLayout) workPanel.getLayout();
        layout.previous(workPanel);
    }

    private void saveTransactionDetails(String cardName, String cardNumber, String expMonth, String expYear, String cvv) {
                String query = "INSERT INTO transactions (customer_name, customer_email, vehicle_type, year, brand, model, vin, policy_name, claim_percentage, policy_amount, premium_amount, coverage_period, deductible_amount, policy_number, card_name, card_number, expiration_month, expiration_year, cvv, stage) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, customer.getUsername());
            stmt.setString(2, customer.getEmail());
            stmt.setString(3, vehicleType);
            stmt.setString(4, year);
            stmt.setString(5, brand);
            stmt.setString(6, model);
            stmt.setString(7, vin);
            stmt.setString(8, policyName);
            stmt.setString(9, claimPercentage);
            stmt.setString(10, policyAmount);
            stmt.setString(11, premiumAmount);
            stmt.setString(12, coveragePeriod);
            stmt.setString(13, deductibleAmount);
            stmt.setString(14, policyNumber); // Save the generated policy number
            stmt.setString(15, cardName);
            stmt.setString(16, cardNumber);
            stmt.setString(17, expMonth);
            stmt.setString(18, expYear);
            stmt.setString(19, cvv);
            stmt.setString(20, "Payment Under Consideration"); // Default stage

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error saving transaction details: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    private void sendPaymentConfirmationEmail(String recipientEmail, String recipientName, String totalAmount) {
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
            protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                return new javax.mail.PasswordAuthentication(senderEmail, senderPassword);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(senderEmail));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientEmail));
            message.setSubject("Payment Confirmation");
            message.setText("Dear " + recipientName + ",\n\n"
                    + "Thank you for your payment.\n\n"
                    + "Policy Number: " + policyNumber + "\n"
                    + "Total Amount Paid: " + totalAmount + "\n\n"
                    + "Your payment is currently under consideration. We will notify you once it has been processed successfully.\n\n"
                    + "Regards,\nInsurance Portal");

            Transport.send(message);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error sending email: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnMakePaymentActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnMakePayment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtCVV;
    private javax.swing.JTextField txtCardName;
    private javax.swing.JTextField txtCardNumber;
    private javax.swing.JTextField txtExpMonth;
    private javax.swing.JTextField txtExpYear;
    private javax.swing.JTextField txtTotalAmount;
    // End of variables declaration//GEN-END:variables
}
