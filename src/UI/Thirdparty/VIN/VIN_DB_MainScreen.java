/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Thirdparty.VIN;

import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Model.DatabaseConnection.DatabaseConnection;

/**
 *
 * @author ABHINAVCHINTA
 */
public class VIN_DB_MainScreen extends javax.swing.JPanel {

    /**
     * Creates new form VIN_DB_MainScreen
     */
    private JPanel workPanel;

    public VIN_DB_MainScreen(JPanel workPanel) {
        initComponents();
        this.workPanel = workPanel;
        tblVIN.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{}, // No initial data
                new String[]{"VIN Number"} // Single column
        ));
        loadTableData();

    }

    private void loadTableData() {
        DefaultTableModel model = (DefaultTableModel) tblVIN.getModel();
        model.setRowCount(0); // Clear existing rows

        String query = "SELECT vin_number FROM VINDatabase"; // Only fetch VIN numbers
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                model.addRow(new Object[]{rs.getString("vin_number")}); // Add only the VIN number
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error loading VIN data: " + e.getMessage());
        }
    }

    private void addVIN(String vinNumber) {
        String query = "INSERT INTO VINDatabase (vin_number) VALUES (?)";
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, vinNumber);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "VIN added successfully.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error adding VIN: " + e.getMessage());
        }
    }

    private void deleteVIN(int vinId) {
        String query = "DELETE FROM VINDatabase WHERE vin_id = ?";
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, vinId);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "VIN deleted successfully.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error deleting VIN: " + e.getMessage());
        }
    }

    private void updateVIN(int vinId, String vinNumber) {
        String query = "UPDATE VINDatabase SET vin_number = ? WHERE vin_id = ?";
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, vinNumber);
            stmt.setInt(2, vinId);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "VIN updated successfully.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error updating VIN: " + e.getMessage());
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

        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVIN = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        txtVIN = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VIN Directory");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tblVIN.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Vin Database"
            }
        ));
        jScrollPane1.setViewportView(tblVIN);

        jLabel2.setText("Vechile Identification Number");

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        txtVIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVINActionPerformed(evt);
            }
        });

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnAdd)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(txtVIN, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(0, 155, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDelete)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtVIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAdd)
                .addContainerGap(84, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int selectedRow = tblVIN.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a VIN to delete.");
            return;
        }

        String vinNumber = (String) tblVIN.getValueAt(selectedRow, 0); // Get the VIN number from the selected row

        String query = "DELETE FROM VINDatabase WHERE vin_number = ?"; // Use vin_number to delete
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, vinNumber); // Bind the VIN number to the query
            int rowsDeleted = stmt.executeUpdate();

            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(this, "VIN deleted successfully.");
            } else {
                JOptionPane.showMessageDialog(this, "Failed to delete VIN. Please try again.");
            }

            loadTableData(); // Refresh the table after deletion
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error deleting VIN: " + e.getMessage());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String vinNumber = txtVIN.getText().trim();
        if (vinNumber.isEmpty() || vinNumber.length() != 17 || !vinNumber.matches("[A-Z0-9]+")) {
            JOptionPane.showMessageDialog(this, "Invalid VIN format. Must be 17 alphanumeric characters.");
            return;
        }

        addVIN(vinNumber);
        loadTableData();
        txtVIN.setText("");
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtVINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVINActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVINActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        workPanel.remove(this);
        CardLayout layout = (CardLayout) workPanel.getLayout();
        layout.previous(workPanel);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblVIN;
    private javax.swing.JTextField txtVIN;
    // End of variables declaration//GEN-END:variables
}