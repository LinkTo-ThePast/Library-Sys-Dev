
package librarysysdev.GUI.registerNewMember;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import librarysysdev.logic.Controller;
import librarysysdev.logic.validation.EmailValidator;
import librarysysdev.logic.validation.PhoneNumberValidator;
import librarysysdev.test.TNameValidator;

/**
 *
 * @author Luis_
 */
public class RegisterNewMember extends javax.swing.JFrame {

  /**
   * Creates new form registerNewMember
   */
  public RegisterNewMember() {
    initComponents();
    
  }
  
  private Controller controller = new Controller();
  
  
  public String getUserFirstName() {
    String userFirstName = this.txtFirstName.getText();
    return userFirstName;
  }
  public String getUserLastName() {
    String userLastName = this.txtLastName.getText();
    return userLastName;
  }
  
  public int getUserAge() {
    String userAgeString = this.txtAge.getText();
    int userAge = Integer.parseInt(userAgeString);
    return userAge;
  }
  
  public String getUserEmail() {
    String userEmail = this.txtEmail.getText();
    return userEmail;
  }
  
  public String getUserPhoneNumber() {
    String userPhoneNumber = this.txtPhoneNumber.getText();
    return userPhoneNumber;
  }
  
  public String getUserMembershipType() {
    String userMembershipType = this.txtMembershipType.getSelectedItem().toString();
    return userMembershipType;
  }
  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    loginView = new javax.swing.JPanel();
    userPersonalNameLabel = new javax.swing.JLabel();
    txtLastName = new javax.swing.JTextField();
    userLastNameLabel = new javax.swing.JLabel();
    registerBtn = new javax.swing.JButton();
    iconLoginView = new javax.swing.JLabel();
    userAgeLabel = new javax.swing.JLabel();
    userEmailLabel = new javax.swing.JLabel();
    txtFirstName = new javax.swing.JTextField();
    txtEmail = new javax.swing.JTextField();
    txtAge = new javax.swing.JTextField();
    userPhoneNumberLabel = new javax.swing.JLabel();
    userMembershipTypeLabel = new javax.swing.JLabel();
    txtPhoneNumber = new javax.swing.JTextField();
    txtMembershipType = new javax.swing.JComboBox<>();
    firstNameError = new javax.swing.JLabel();
    ageError = new javax.swing.JLabel();
    lastNameError = new javax.swing.JLabel();
    emailText = new javax.swing.JLabel();
    phoneError = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    loginView.setBackground(new java.awt.Color(238, 229, 233));

    userPersonalNameLabel.setBackground(new java.awt.Color(241, 191, 152));
    userPersonalNameLabel.setFont(new java.awt.Font("MS UI Gothic", 0, 18)); // NOI18N
    userPersonalNameLabel.setForeground(new java.awt.Color(0, 0, 0));
    userPersonalNameLabel.setText("Given name(s):");

    txtLastName.setBackground(new java.awt.Color(241, 191, 152));
    txtLastName.setForeground(new java.awt.Color(0, 0, 0));
    txtLastName.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtLastNameActionPerformed(evt);
      }
    });

    userLastNameLabel.setBackground(new java.awt.Color(241, 191, 152));
    userLastNameLabel.setFont(new java.awt.Font("MS UI Gothic", 0, 18)); // NOI18N
    userLastNameLabel.setForeground(new java.awt.Color(0, 0, 0));
    userLastNameLabel.setText("Last name:");

    registerBtn.setBackground(new java.awt.Color(255, 255, 102));
    registerBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    registerBtn.setForeground(new java.awt.Color(0, 0, 0));
    registerBtn.setText("Register");
    registerBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    registerBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
    registerBtn.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        registerBtnActionPerformed(evt);
      }
    });

    iconLoginView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librarysysdev/GUI/icons/iconLoginView.png"))); // NOI18N

    userAgeLabel.setBackground(new java.awt.Color(241, 191, 152));
    userAgeLabel.setFont(new java.awt.Font("MS UI Gothic", 0, 18)); // NOI18N
    userAgeLabel.setForeground(new java.awt.Color(0, 0, 0));
    userAgeLabel.setText("Age");

    userEmailLabel.setBackground(new java.awt.Color(241, 191, 152));
    userEmailLabel.setFont(new java.awt.Font("MS UI Gothic", 0, 18)); // NOI18N
    userEmailLabel.setForeground(new java.awt.Color(0, 0, 0));
    userEmailLabel.setText("Email:");

    txtFirstName.setBackground(new java.awt.Color(241, 191, 152));
    txtFirstName.setForeground(new java.awt.Color(0, 0, 0));
    txtFirstName.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtFirstNameActionPerformed(evt);
      }
    });

    txtEmail.setBackground(new java.awt.Color(241, 191, 152));
    txtEmail.setForeground(new java.awt.Color(0, 0, 0));
    txtEmail.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtEmailActionPerformed(evt);
      }
    });

    txtAge.setBackground(new java.awt.Color(241, 191, 152));
    txtAge.setForeground(new java.awt.Color(0, 0, 0));
    txtAge.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtAgeActionPerformed(evt);
      }
    });

    userPhoneNumberLabel.setBackground(new java.awt.Color(241, 191, 152));
    userPhoneNumberLabel.setFont(new java.awt.Font("MS UI Gothic", 0, 18)); // NOI18N
    userPhoneNumberLabel.setForeground(new java.awt.Color(0, 0, 0));
    userPhoneNumberLabel.setText("Phone number");

    userMembershipTypeLabel.setBackground(new java.awt.Color(241, 191, 152));
    userMembershipTypeLabel.setFont(new java.awt.Font("MS UI Gothic", 0, 18)); // NOI18N
    userMembershipTypeLabel.setForeground(new java.awt.Color(0, 0, 0));
    userMembershipTypeLabel.setText("Membership type");

    txtPhoneNumber.setBackground(new java.awt.Color(241, 191, 152));
    txtPhoneNumber.setForeground(new java.awt.Color(0, 0, 0));
    txtPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtPhoneNumberActionPerformed(evt);
      }
    });

    txtMembershipType.setBackground(new java.awt.Color(241, 191, 152));
    txtMembershipType.setForeground(new java.awt.Color(0, 0, 0));
    txtMembershipType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Regular", "Student", "Premium" }));

    javax.swing.GroupLayout loginViewLayout = new javax.swing.GroupLayout(loginView);
    loginView.setLayout(loginViewLayout);
    loginViewLayout.setHorizontalGroup(
      loginViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginViewLayout.createSequentialGroup()
        .addGroup(loginViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(loginViewLayout.createSequentialGroup()
            .addGap(43, 43, 43)
            .addGroup(loginViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(userLastNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(userAgeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGroup(loginViewLayout.createSequentialGroup()
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(emailText))
              .addComponent(userEmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGroup(loginViewLayout.createSequentialGroup()
                .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ageError))
              .addComponent(userPersonalNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGroup(loginViewLayout.createSequentialGroup()
                .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(firstNameError))
              .addGroup(loginViewLayout.createSequentialGroup()
                .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lastNameError))))
          .addGroup(loginViewLayout.createSequentialGroup()
            .addGap(295, 295, 295)
            .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(loginViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(userPhoneNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(userMembershipTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(txtPhoneNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
          .addGroup(loginViewLayout.createSequentialGroup()
            .addGap(22, 22, 22)
            .addComponent(iconLoginView))
          .addComponent(txtMembershipType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGap(18, 18, 18)
        .addComponent(phoneError)
        .addGap(53, 53, 53))
    );
    loginViewLayout.setVerticalGroup(
      loginViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(loginViewLayout.createSequentialGroup()
        .addGap(73, 73, 73)
        .addGroup(loginViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(loginViewLayout.createSequentialGroup()
            .addComponent(userPhoneNumberLabel)
            .addGap(18, 18, 18)
            .addGroup(loginViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(phoneError)))
          .addGroup(loginViewLayout.createSequentialGroup()
            .addComponent(userPersonalNameLabel)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(loginViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(firstNameError))))
        .addGroup(loginViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(loginViewLayout.createSequentialGroup()
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(registerBtn)
            .addGap(75, 75, 75))
          .addGroup(loginViewLayout.createSequentialGroup()
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(loginViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addGroup(loginViewLayout.createSequentialGroup()
                .addComponent(userMembershipTypeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtMembershipType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(loginViewLayout.createSequentialGroup()
                .addComponent(userLastNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(loginViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(lastNameError))))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(userAgeLabel)
            .addGroup(loginViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(loginViewLayout.createSequentialGroup()
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(loginViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(ageError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userEmailLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(loginViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(emailText)))
              .addGroup(loginViewLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(iconLoginView, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(112, Short.MAX_VALUE))))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(loginView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(loginView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed

  }//GEN-LAST:event_txtLastNameActionPerformed

  private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
    
    String userFirstName = this.getUserFirstName();
    String userLastName = this.getUserLastName();
    int userAge = this.getUserAge();
    String userEmail = this.getUserEmail();
    String userPhoneNumber = this.getUserPhoneNumber();
    String userMembershipType = this.getUserMembershipType();
    // , userLastName, userAge, userEmail, userPhoneNumber
 
    if(controller.validateUser(userFirstName, userLastName, userAge, userEmail, userPhoneNumber)) {
      showMessageDialog(null, "Your data is correct!");
    } else {
      Map<String, String> errorList = new HashMap<>(controller.errorList(userFirstName, userLastName, userAge, userEmail, userPhoneNumber));
      showMessageDialog(null, errorList.toString());
    }
  }//GEN-LAST:event_registerBtnActionPerformed

  private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtFirstNameActionPerformed

  private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtEmailActionPerformed

  private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtAgeActionPerformed

  private void txtPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNumberActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtPhoneNumberActionPerformed

  /**
   * @param args the command line arguments
   */


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel ageError;
  private javax.swing.JLabel emailText;
  private javax.swing.JLabel firstNameError;
  private javax.swing.JLabel iconLoginView;
  private javax.swing.JLabel lastNameError;
  private javax.swing.JPanel loginView;
  private javax.swing.JLabel phoneError;
  private javax.swing.JButton registerBtn;
  private javax.swing.JTextField txtAge;
  private javax.swing.JTextField txtEmail;
  private javax.swing.JTextField txtFirstName;
  private javax.swing.JTextField txtLastName;
  private javax.swing.JComboBox<String> txtMembershipType;
  private javax.swing.JTextField txtPhoneNumber;
  private javax.swing.JLabel userAgeLabel;
  private javax.swing.JLabel userEmailLabel;
  private javax.swing.JLabel userLastNameLabel;
  private javax.swing.JLabel userMembershipTypeLabel;
  private javax.swing.JLabel userPersonalNameLabel;
  private javax.swing.JLabel userPhoneNumberLabel;
  // End of variables declaration//GEN-END:variables
}
