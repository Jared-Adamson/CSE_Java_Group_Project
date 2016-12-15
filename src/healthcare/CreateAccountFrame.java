/*
 * This class create a JFrame for user to create a account
 */
package healthcare;

import javax.swing.*;

/**
 *
 * @author Jing Liang
 */
public class CreateAccountFrame extends javax.swing.JFrame {

    private final JFrame previousFrame;

    /**
     * Creates new form CreateAccountFrame
     *
     * @param previousFrame
     */
    public CreateAccountFrame(JFrame previousFrame) {
        initComponents();
        btnGroup.add(btnPatient);
        btnGroup.add(btnDoctor);
        this.previousFrame = previousFrame;
        this.previousFrame.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        createNewAccountLabel = new javax.swing.JLabel();
        btnPatient = new javax.swing.JRadioButton();
        btnDoctor = new javax.swing.JRadioButton();
        usenameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        confirmPasswordLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        phoneLabel = new javax.swing.JLabel();
        txtPassword1 = new javax.swing.JPasswordField();
        txtPassword2 = new javax.swing.JPasswordField();
        txtAge = new javax.swing.JTextField();
        cobGender = new javax.swing.JComboBox();
        hospitalLabel = new javax.swing.JLabel();
        txtHospital = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtEmailAddress = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtPhone = new javax.swing.JTextField();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        createNewAccountLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        createNewAccountLabel.setText("Create New Account");

        btnPatient.setSelected(true);
        btnPatient.setText("Patient");
        btnPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientActionPerformed(evt);
            }
        });

        btnDoctor.setText("Doctor");
        btnDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoctorActionPerformed(evt);
            }
        });

        usenameLabel.setText("Choose your username");

        passwordLabel.setText("Create a password");

        confirmPasswordLabel.setText("Comfirm your password");

        ageLabel.setText("Age");

        genderLabel.setText("Gender");

        emailLabel.setText("Email Address");

        phoneLabel.setText("Mobile Phone");

        cobGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "I am...", "Female", "Male", "Other" }));

        hospitalLabel.setText("Hospital");

        txtHospital.setEnabled(false);

        nameLabel.setText("Name");

        jButton1.setText("Create Account");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnPatient)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDoctor))
                            .addComponent(createNewAccountLabel)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(confirmPasswordLabel)
                                    .addComponent(genderLabel)
                                    .addComponent(emailLabel)
                                    .addComponent(phoneLabel)
                                    .addComponent(hospitalLabel)
                                    .addComponent(nameLabel)
                                    .addComponent(ageLabel))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPassword2)
                                    .addComponent(txtHospital)
                                    .addComponent(txtEmailAddress)
                                    .addComponent(txtName)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cobGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtPhone)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(usenameLabel)
                                    .addComponent(passwordLabel))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(createNewAccountLabel)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPatient)
                    .addComponent(btnDoctor))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usenameLabel)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(txtPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmPasswordLabel)
                    .addComponent(txtPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderLabel)
                    .addComponent(cobGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(txtEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLabel)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hospitalLabel)
                    .addComponent(txtHospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        previousFrame.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void btnDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoctorActionPerformed
        txtHospital.setEnabled(true);
    }//GEN-LAST:event_btnDoctorActionPerformed

    private void btnPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientActionPerformed
        txtHospital.setText("");
        txtHospital.setEnabled(false);
    }//GEN-LAST:event_btnPatientActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //get user inputs
        String username = txtUsername.getText();
        String password1 = txtPassword1.getText();
        String password2 = txtPassword2.getText();
        String name = txtName.getText();
        int age;
        String gender = (String) cobGender.getSelectedItem();
        String emailAddress = txtEmailAddress.getText();
        String phone = txtPhone.getText();
        String hospital = txtHospital.getText();
        
        //check user inputs
        try {
            age = Integer.parseInt(txtAge.getText());
            if (username.equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter the user name.");
            } else if (password1.equals("") || password2.equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter the password.");
            } else if (!password1.equals(password2)) {
                JOptionPane.showMessageDialog(this, "Password do not match.");
            } else if (name.equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter the name.");
            } else if (gender.equals("I am...")) {
                JOptionPane.showMessageDialog(this, "Please select the gender.");
            } else if (emailAddress.equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter the Email Address.");
            } else if (phone.equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter the phone number.");
            } else if (btnDoctor.isSelected() && hospital.equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter the hospital.");
            } else {
                //check whether he is a patient or doctor
                if (btnPatient.isSelected()) {
                    Patient patient = new Patient(username, password1, name, gender, age, emailAddress, phone);
                    User user = DataAccessor.getUser(username);
                    //check if the username already exist
                    if (user == null) {
                        DataAccessor.storeUser(patient);
                    } else {
                        JOptionPane.showMessageDialog(this, "Duplicate username.");
                        return;
                    }
                } else {
                    Doctor doctor = new Doctor(username, password1, name, gender, age, emailAddress, phone);
                    doctor.setHospital(hospital);
                    DataAccessor.storeUser(doctor);
                }
                JOptionPane.showMessageDialog(this, "Create Account successfully.");
                this.setVisible(false);
                previousFrame.setVisible(true);
            }
        } catch (java.lang.NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter correct age.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnDoctor;
    private javax.swing.ButtonGroup btnGroup;
    private javax.swing.JRadioButton btnPatient;
    private javax.swing.JComboBox cobGender;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel createNewAccountLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel usenameLabel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel confirmPasswordLabel;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JLabel hospitalLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEmailAddress;
    private javax.swing.JTextField txtHospital;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword1;
    private javax.swing.JTextField txtPassword2;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
