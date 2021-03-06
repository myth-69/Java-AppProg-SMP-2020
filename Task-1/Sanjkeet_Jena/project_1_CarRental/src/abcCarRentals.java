/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * abcCarRentals.java
 *
 * Created on 19 Apr, 2020, 4:10:52 PM
 */

/**
 *
 * @author Sanjkeet
 */
import javax.swing.JOptionPane;
public class abcCarRentals extends javax.swing.JFrame {

    /** Creates new form abcCarRentals */
    public abcCarRentals() {
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
        deluxR = new javax.swing.JRadioButton();
        semiDeluxR = new javax.swing.JRadioButton();
        normalR = new javax.swing.JRadioButton();
        checkBoxGuide = new javax.swing.JCheckBox();
        AmountLabel = new javax.swing.JLabel();
        guideCharges = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        calulateButton = new javax.swing.JButton();
        clearCharges = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        AmountText = new javax.swing.JTextField();
        guideText = new javax.swing.JTextField();
        totalText = new javax.swing.JTextField();
        NumberOfDaysLabel = new javax.swing.JLabel();
        daysText = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        passField = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        okButton = new javax.swing.JButton();

        dashboard.setMinimumSize(new java.awt.Dimension(300, 400));

        buttonGroup1.add(deluxR);
        deluxR.setText("Delux Car(Cost-1000)");
        deluxR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deluxRActionPerformed(evt);
            }
        });

        buttonGroup1.add(semiDeluxR);
        semiDeluxR.setText("Semi Delux Car(Cost-800)");

        buttonGroup1.add(normalR);
        normalR.setText("Normal Car(Cost-500)");
        normalR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                normalRActionPerformed(evt);
            }
        });

        checkBoxGuide.setText("Guide Required(Cost-250)");
        checkBoxGuide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxGuideActionPerformed(evt);
            }
        });

        AmountLabel.setText("Amount:");

        guideCharges.setText("Guide Charges:");

        total.setText("Total Amount:");

        calulateButton.setText("Calculate");
        calulateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calulateButtonActionPerformed(evt);
            }
        });

        clearCharges.setText("Clear");
        clearCharges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearChargesActionPerformed(evt);
            }
        });

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        totalText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalTextActionPerformed(evt);
            }
        });

        NumberOfDaysLabel.setText("Number of Days:");

        daysText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daysTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dashboardLayout = new javax.swing.GroupLayout(dashboard.getContentPane());
        dashboard.getContentPane().setLayout(dashboardLayout);
        dashboardLayout.setHorizontalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deluxR)
                    .addComponent(normalR)
                    .addGroup(dashboardLayout.createSequentialGroup()
                        .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(semiDeluxR)
                            .addGroup(dashboardLayout.createSequentialGroup()
                                .addComponent(calulateButton)
                                .addGap(73, 73, 73)
                                .addComponent(exitButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                        .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkBoxGuide)
                            .addComponent(clearCharges)))
                    .addGroup(dashboardLayout.createSequentialGroup()
                        .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AmountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guideCharges)
                            .addComponent(total)
                            .addComponent(NumberOfDaysLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(daysText, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalText, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(guideText, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AmountText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        dashboardLayout.setVerticalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(deluxR)
                .addGap(18, 18, 18)
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(semiDeluxR)
                    .addComponent(checkBoxGuide))
                .addGap(18, 18, 18)
                .addComponent(normalR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NumberOfDaysLabel)
                    .addComponent(daysText, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calulateButton)
                    .addComponent(clearCharges)
                    .addComponent(exitButton))
                .addGap(38, 38, 38)
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AmountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AmountText, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guideCharges)
                    .addComponent(guideText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ABC Car Rentals");

        jLabel2.setText("Password");

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
                .addGap(66, 66, 66)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(165, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(188, Short.MAX_VALUE)
                .addComponent(okButton)
                .addGap(165, 165, 165))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(passField)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(64, 64, 64)
                .addComponent(okButton)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
                String pass=new String(passField.getPassword());
                if(pass.equals("Sanjkeet"))
                {
                    this.dispose();
                    dashboard.setVisible(true);
                }
                else
                {
                   JOptionPane.showMessageDialog(null, "No you arent allowed");
                }
    }//GEN-LAST:event_okButtonActionPerformed

    private void deluxRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deluxRActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_deluxRActionPerformed

    private void normalRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_normalRActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_normalRActionPerformed

    private void checkBoxGuideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxGuideActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_checkBoxGuideActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
    System.exit(0);
}//GEN-LAST:event_exitButtonActionPerformed

    private void totalTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalTextActionPerformed

    private void calulateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calulateButtonActionPerformed
      int amount=0;
      int guideCharges=0;
      int numberOfDays= Integer.parseInt(daysText.getText());
        if(deluxR.isSelected())
       {
           amount = numberOfDays* 1000;
       }
        else if(semiDeluxR.isSelected()){
            amount= numberOfDays* 800;
        }
        else if (normalR.isSelected()){
            amount=numberOfDays*500;
        }
      if(checkBoxGuide.isSelected()){
          guideCharges=numberOfDays*250;
      }
      int totalCharges=guideCharges+amount;

      AmountText.setText("" + amount);
      guideText.setText(""+ guideCharges);
     totalText.setText("" + totalCharges );
      
    }//GEN-LAST:event_calulateButtonActionPerformed

    private void clearChargesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearChargesActionPerformed
             buttonGroup1.clearSelection();
            checkBoxGuide.setSelected(false);
            AmountText.setText("");
            guideText.setText("");
            totalText.setText("");
    }//GEN-LAST:event_clearChargesActionPerformed

    private void daysTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daysTextActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_daysTextActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new abcCarRentals().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AmountLabel;
    private javax.swing.JTextField AmountText;
    private javax.swing.JLabel NumberOfDaysLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton calulateButton;
    private javax.swing.JCheckBox checkBoxGuide;
    private javax.swing.JButton clearCharges;
    private javax.swing.JFrame dashboard;
    private javax.swing.JTextField daysText;
    private javax.swing.JRadioButton deluxR;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel guideCharges;
    private javax.swing.JTextField guideText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton normalR;
    private javax.swing.JButton okButton;
    private javax.swing.JPasswordField passField;
    private javax.swing.JRadioButton semiDeluxR;
    private javax.swing.JLabel total;
    private javax.swing.JTextField totalText;
    // End of variables declaration//GEN-END:variables

}
