import javax.swing.JOptionPane;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * carRental.java
 *
 * Created on Apr 19, 2020, 4:09:59 PM
 */

/**
 *
 * @author Chaitanya
 */
public class carRental extends javax.swing.JFrame {
    private boolean True;

    /** Creates new form carRental */
    public carRental() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dashboard = new javax.swing.JFrame();
        dRad = new javax.swing.JRadioButton();
        sdRad = new javax.swing.JRadioButton();
        oRad = new javax.swing.JRadioButton();
        guideCheck = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        daysField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        calculateButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        amountField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        guideChargeField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        totalField = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        passField = new javax.swing.JPasswordField();
        okButton = new javax.swing.JButton();

        dashboard.setMinimumSize(new java.awt.Dimension(700, 400));

        buttonGroup1.add(dRad);
        dRad.setText("Deluxe Car");
        dRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dRadActionPerformed(evt);
            }
        });

        buttonGroup1.add(sdRad);
        sdRad.setText("Semi Deluxe Car");

        buttonGroup1.add(oRad);
        oRad.setText("Ordinary Car");

        guideCheck.setText("Guide Required");
        guideCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guideCheckActionPerformed(evt);
            }
        });

        jLabel3.setText("Car required for ");

        jLabel4.setText("days");

        calculateButton.setText("Calculate");
        calculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateButtonActionPerformed(evt);
            }
        });

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("Amount:");

        amountField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountFieldActionPerformed(evt);
            }
        });

        jLabel6.setText("Guide Charges:");

        jLabel7.setText("Total:");

        totalField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dashboardLayout = new javax.swing.GroupLayout(dashboard.getContentPane());
        dashboard.getContentPane().setLayout(dashboardLayout);
        dashboardLayout.setHorizontalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardLayout.createSequentialGroup()
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dashboardLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(oRad))
                    .addGroup(dashboardLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(calculateButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clearButton)
                        .addGap(18, 18, 18)
                        .addComponent(exitButton))
                    .addGroup(dashboardLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(totalField)
                            .addComponent(amountField)
                            .addComponent(guideChargeField, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)))
                    .addGroup(dashboardLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(dRad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 312, Short.MAX_VALUE)
                        .addComponent(guideCheck))
                    .addGroup(dashboardLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(sdRad))
                    .addGroup(dashboardLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(daysField, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)))
                .addContainerGap())
        );
        dashboardLayout.setVerticalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dRad)
                    .addComponent(guideCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sdRad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(oRad)
                .addGap(23, 23, 23)
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(daysField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(26, 26, 26)
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calculateButton)
                    .addComponent(clearButton)
                    .addComponent(exitButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(amountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(guideChargeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(totalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ABC Car Rentals");

        jLabel2.setText("Enter Pasword:");

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(okButton)
                            .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel1)
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(okButton)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        String password=new String(passField.getPassword());
        if(password.equals("hello")){
            this.dispose();
            dashboard.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null,"Wrong Password! Please try again.");
        }
}//GEN-LAST:event_okButtonActionPerformed

    private void guideCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guideCheckActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_guideCheckActionPerformed

    private void calculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateButtonActionPerformed
        int days = Integer.parseInt(daysField.getText());
        int amount=0;
        if(dRad.isSelected()){
            amount = days*1000;
        }
        else if(sdRad.isSelected()){
            amount = days*800;
        }
        else if(oRad.isSelected()){
            amount = days*700;
        }
        int guide=0;
        if(guideCheck.isSelected()){
            guide=days*500;
        }
        int total=amount+guide;
        amountField.setText(amount+"");
        guideChargeField.setText(guide+"");
        totalField.setText(total+"");
        
}//GEN-LAST:event_calculateButtonActionPerformed

    private void dRadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dRadActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_dRadActionPerformed

    private void totalFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalFieldActionPerformed

    private void amountFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountFieldActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        buttonGroup1.clearSelection();
        dRad.setSelected(false);
        sdRad.setSelected(false);
        oRad.setSelected(false);
        guideCheck.setSelected(false);
        daysField.setText("");
        guideChargeField.setText("");
        amountField.setText("");
        totalField.setText("");
}//GEN-LAST:event_clearButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new carRental().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountField;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton calculateButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JRadioButton dRad;
    private javax.swing.JFrame dashboard;
    private javax.swing.JTextField daysField;
    private javax.swing.JButton exitButton;
    private javax.swing.JTextField guideChargeField;
    private javax.swing.JCheckBox guideCheck;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JRadioButton oRad;
    private javax.swing.JButton okButton;
    private javax.swing.JPasswordField passField;
    private javax.swing.JRadioButton sdRad;
    private javax.swing.JTextField totalField;
    // End of variables declaration//GEN-END:variables

}
