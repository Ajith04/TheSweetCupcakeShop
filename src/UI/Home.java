package UI;

import Models.User;
import javax.swing.JOptionPane;

public class Home extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Home.class.getName());
    private User user;
    
    public Home(User user) {
        initComponents();
        lblUserName.setText(user.UserName);
        lblRole.setText(user.Role);
        this.user = user;
    }
    
     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnAddCupcake = new javax.swing.JButton();
        btnViewCupcakes = new javax.swing.JButton();
        btnCreateCashier = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        lblUserName = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "The Sweet Cupcake Shop", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 36), new java.awt.Color(0, 204, 0))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnAddCupcake.setBackground(new java.awt.Color(0, 204, 0));
        btnAddCupcake.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAddCupcake.setForeground(new java.awt.Color(255, 255, 255));
        btnAddCupcake.setText("Add a  New Cupcake");
        btnAddCupcake.addActionListener(this::btnAddCupcakeActionPerformed);

        btnViewCupcakes.setBackground(new java.awt.Color(255, 102, 51));
        btnViewCupcakes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnViewCupcakes.setForeground(new java.awt.Color(255, 255, 255));
        btnViewCupcakes.setText("View all Cupcakes");
        btnViewCupcakes.addActionListener(this::btnViewCupcakesActionPerformed);

        btnCreateCashier.setBackground(new java.awt.Color(0, 153, 204));
        btnCreateCashier.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCreateCashier.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateCashier.setText("Create a New User");
        btnCreateCashier.addActionListener(this::btnCreateCashierActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(btnAddCupcake)
                        .addGap(109, 109, 109)
                        .addComponent(btnViewCupcakes, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(btnCreateCashier, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddCupcake, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewCupcakes, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(btnCreateCashier, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        btnLogout.setBackground(new java.awt.Color(255, 51, 51));
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("Logout");
        btnLogout.setToolTipText("");
        btnLogout.addActionListener(this::btnLogoutActionPerformed);

        lblUserName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUserName.setText("User name");
        lblUserName.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        lblRole.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblRole.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRole.setText("Role");
        lblRole.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(557, 557, 557)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRole, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLogout))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(lblUserName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRole)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddCupcakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCupcakeActionPerformed
        this.setVisible(false);
        AddNewCupcake addNewCupcake = new AddNewCupcake(this);
        addNewCupcake.setVisible(true);
    }//GEN-LAST:event_btnAddCupcakeActionPerformed

    private void btnViewCupcakesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCupcakesActionPerformed
        this.setVisible(false);
        ViewAllCupcakes viewAllCupcakes = new ViewAllCupcakes(this);
        viewAllCupcakes.setVisible(true);
        
    }//GEN-LAST:event_btnViewCupcakesActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        this.dispose();
        Login login = new Login();
        login.setVisible(true);
        
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnCreateCashierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateCashierActionPerformed
        
        if(this.user.Role.equalsIgnoreCase("Manager")){
        this.setVisible(false);
        CreateNewCashier createNewCashier = new CreateNewCashier(this);
        createNewCashier.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(this, "You haven't access!");
        }
        
    }//GEN-LAST:event_btnCreateCashierActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCupcake;
    private javax.swing.JButton btnCreateCashier;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnViewCupcakes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblRole;
    public javax.swing.JLabel lblUserName;
    // End of variables declaration//GEN-END:variables
}
