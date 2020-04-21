import javax.swing.JOptionPane;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ABCCarRentals.java
 *
 * Created on 19 Apr, 2020, 4:09:56 PM
 */

/**
 *
 * @author Saish Mendke
 */
public class ABCCarRentals extends javax.swing.JFrame {

    /** Creates new form ABCCarRentals */
    public ABCCarRentals() {
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
        Deluxeradio = new javax.swing.JRadioButton();
        SemiDeluxeradio = new javax.swing.JRadioButton();
        Ordinaryradio = new javax.swing.JRadioButton();
        Guidecheckbox = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        daysfield = new javax.swing.JTextField();
        clearbutton = new javax.swing.JButton();
        exitbutton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Amountfield = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        guidefield = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        totalfield = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        passfield = new javax.swing.JPasswordField();
        OkButton = new javax.swing.JButton();

        dashboard.setMinimumSize(new java.awt.Dimension(600, 400));

        buttonGroup1.add(Deluxeradio);
        Deluxeradio.setText("Deluxe Car");
        Deluxeradio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeluxeradioActionPerformed(evt);
            }
        });

        buttonGroup1.add(SemiDeluxeradio);
        SemiDeluxeradio.setText("Semi Deluxe Car");

        buttonGroup1.add(Ordinaryradio);
        Ordinaryradio.setText("Ordinary Car");

        Guidecheckbox.setText("Guide required");

        jLabel3.setText("Car required for no. of days:");

        daysfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daysfieldActionPerformed(evt);
            }
        });

        clearbutton.setText(" Clear");
        clearbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbuttonActionPerformed(evt);
            }
        });

        exitbutton.setText("Exit");
        exitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbuttonActionPerformed(evt);
            }
        });

        jLabel4.setText("Amount:");

        jLabel5.setText("Guide Charges:");

        guidefield.setText(" ");

        jLabel6.setText("Total");

        totalfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalfieldActionPerformed(evt);
            }
        });

        jButton1.setText("Calculate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dashboardLayout = new javax.swing.GroupLayout(dashboard.getContentPane());
        dashboard.getContentPane().setLayout(dashboardLayout);
        dashboardLayout.setHorizontalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardLayout.createSequentialGroup()
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Deluxeradio)
                    .addComponent(Ordinaryradio))
                .addContainerGap(465, Short.MAX_VALUE))
            .addGroup(dashboardLayout.createSequentialGroup()
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SemiDeluxeradio, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, dashboardLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jButton1)
                        .addGap(110, 110, 110)
                        .addComponent(clearbutton))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, dashboardLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(daysfield, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dashboardLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(Guidecheckbox)
                        .addGap(62, 62, 62))
                    .addGroup(dashboardLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(exitbutton)
                        .addContainerGap())))
            .addGroup(dashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(64, 64, 64)
                .addComponent(totalfield, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addGap(337, 337, 337))
            .addGroup(dashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Amountfield, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                    .addComponent(guidefield, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                .addGap(337, 337, 337))
        );
        dashboardLayout.setVerticalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardLayout.createSequentialGroup()
                .addComponent(Deluxeradio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Guidecheckbox)
                    .addComponent(SemiDeluxeradio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Ordinaryradio)
                .addGap(41, 41, 41)
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(daysfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(clearbutton)
                    .addComponent(exitbutton))
                .addGap(30, 30, 30)
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Amountfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(guidefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(totalfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ABC Car Rentals");

        jLabel2.setText("Enter password:");

        OkButton.setText(" OK");
        OkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passfield, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(OkButton)))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(passfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(OkButton)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkButtonActionPerformed
        // TODO add your handling code here:
        String password = new String(passfield.getPassword());
        if(password.equals("let me in!")){
            this.dispose();
            dashboard.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "Wrong password! Please try again");
        }
}//GEN-LAST:event_OkButtonActionPerformed

    private void DeluxeradioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeluxeradioActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_DeluxeradioActionPerformed

    private void clearbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbuttonActionPerformed
        buttonGroup1.clearSelection();
        Deluxeradio.setSelected(false);
        SemiDeluxeradio.setSelected(false);
        Ordinaryradio.setSelected(false);
        Guidecheckbox.setSelected(false);
        daysfield.setText("");
        Amountfield.setText("");
        guidefield.setText("");
        totalfield.setText("");
}//GEN-LAST:event_clearbuttonActionPerformed

    private void totalfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalfieldActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_totalfieldActionPerformed

    private void exitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbuttonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitbuttonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int numberOfDays = Integer.parseInt(daysfield.getText());
        int amount = 0;
        if(Deluxeradio.isSelected()){
            amount = numberOfDays * 1000;
        }
        else if(SemiDeluxeradio.isSelected())
        {
            amount = numberOfDays * 800;
        }
        else if(Ordinaryradio.isSelected()){
            amount = numberOfDays * 700;
        }
        int guideCharges = 0;
        if(Guidecheckbox.isSelected()){
            guideCharges = numberOfDays*500;
        }
        int total = amount + guideCharges;
        Amountfield.setText(""+amount);
        guidefield.setText(""+guideCharges);
        totalfield.setText(""+total);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void daysfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daysfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_daysfieldActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ABCCarRentals().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Amountfield;
    private javax.swing.JRadioButton Deluxeradio;
    private javax.swing.JCheckBox Guidecheckbox;
    private javax.swing.JButton OkButton;
    private javax.swing.JRadioButton Ordinaryradio;
    private javax.swing.JRadioButton SemiDeluxeradio;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clearbutton;
    private javax.swing.JFrame dashboard;
    private javax.swing.JTextField daysfield;
    private javax.swing.JButton exitbutton;
    private javax.swing.JTextField guidefield;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField passfield;
    private javax.swing.JTextField totalfield;
    // End of variables declaration//GEN-END:variables

}
