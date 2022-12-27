
package LoginUX;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.geom.RoundRectangle2D;
import java.sql.Statement;
import java.sql.*;
import java.sql.ResultSet;


public class Login extends javax.swing.JFrame {
    
    
    int positionX = 0, positionY = 0;

    public Login() {
        initComponents();
        icon ();
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 25, 25));
    }
    private void icon () {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("500.png")));
    }
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MotherUI = new javax.swing.JPanel();
        bannerleft = new javax.swing.JPanel();
        namestore = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        bannerright = new javax.swing.JPanel();
        user = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        iconuser = new javax.swing.JLabel();
        iconpass = new javax.swing.JLabel();
        namepass = new javax.swing.JLabel();
        nameuser = new javax.swing.JLabel();
        exitbtn = new javax.swing.JLabel();
        signin = new javax.swing.JButton();
        welcome = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Harem Computer Management");
        setUndecorated(true);

        MotherUI.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MotherUIMouseDragged(evt);
            }
        });
        MotherUI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MotherUIMousePressed(evt);
            }
        });

        bannerleft.setBackground(new java.awt.Color(132, 217, 255));
        bannerleft.setForeground(new java.awt.Color(255, 255, 255));
        bannerleft.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                bannerleftMouseDragged(evt);
            }
        });
        bannerleft.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bannerleftMousePressed(evt);
            }
        });

        namestore.setFont(new java.awt.Font("Montserrat Black", 1, 32)); // NOI18N
        namestore.setForeground(new java.awt.Color(255, 255, 255));
        namestore.setText("VKU COMPUTER");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Untitled-1.png"))); // NOI18N

        javax.swing.GroupLayout bannerleftLayout = new javax.swing.GroupLayout(bannerleft);
        bannerleft.setLayout(bannerleftLayout);
        bannerleftLayout.setHorizontalGroup(
            bannerleftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bannerleftLayout.createSequentialGroup()
                .addGroup(bannerleftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bannerleftLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel1))
                    .addGroup(bannerleftLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(namestore)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        bannerleftLayout.setVerticalGroup(
            bannerleftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bannerleftLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel1)
                .addGap(56, 56, 56)
                .addComponent(namestore)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bannerright.setBackground(new java.awt.Color(245, 247, 251));
        bannerright.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        user.setBackground(new java.awt.Color(245, 247, 251));
        user.setFont(new java.awt.Font("Poppins Light", 0, 18)); // NOI18N
        user.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        bannerright.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 260, 33));

        pass.setBackground(new java.awt.Color(245, 247, 251));
        pass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        bannerright.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 260, 30));

        iconuser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_user_20px.png"))); // NOI18N
        bannerright.add(iconuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 20, 20));

        iconpass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_lock_20px.png"))); // NOI18N
        bannerright.add(iconpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 20, 20));

        namepass.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        namepass.setText("Password");
        namepass.setToolTipText("");
        bannerright.add(namepass, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 80, -1));

        nameuser.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        nameuser.setText("Username");
        bannerright.add(nameuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        exitbtn.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 24)); // NOI18N
        exitbtn.setForeground(new java.awt.Color(132, 217, 255));
        exitbtn.setText("X");
        exitbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitbtnMouseClicked(evt);
            }
        });
        bannerright.add(exitbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 20, -1));

        signin.setBackground(new java.awt.Color(245, 247, 251));
        signin.setFont(new java.awt.Font("Poppins Medium", 0, 16)); // NOI18N
        signin.setText("Sign in");
        signin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        signin.setFocusable(false);
        signin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinActionPerformed(evt);
            }
        });
        bannerright.add(signin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 260, 40));

        welcome.setFont(new java.awt.Font("Poppins Medium", 1, 36)); // NOI18N
        welcome.setForeground(new java.awt.Color(132, 217, 255));
        welcome.setText("WELCOME");
        bannerright.add(welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel2.setText("Forgot your password?");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        bannerright.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, -1, -1));

        javax.swing.GroupLayout MotherUILayout = new javax.swing.GroupLayout(MotherUI);
        MotherUI.setLayout(MotherUILayout);
        MotherUILayout.setHorizontalGroup(
            MotherUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MotherUILayout.createSequentialGroup()
                .addComponent(bannerleft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(bannerright, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE))
        );
        MotherUILayout.setVerticalGroup(
            MotherUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bannerleft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bannerright, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MotherUI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MotherUI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitbtnMouseClicked
        System.exit (0);
    }//GEN-LAST:event_exitbtnMouseClicked

    private void bannerleftMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bannerleftMousePressed
        
        positionX = evt.getX();
        positionY = evt.getY();
    }//GEN-LAST:event_bannerleftMousePressed

    private void bannerleftMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bannerleftMouseDragged
        
        setLocation(evt.getXOnScreen()-positionX, evt.getYOnScreen()-positionY);
    }//GEN-LAST:event_bannerleftMouseDragged

    private void signinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signinActionPerformed
        
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser ("sa");
        ds.setPassword ("123456");
        ds.setServerName("LAPTOP-CPS4PJ7N\\SQLEXPRESS");
        ds.setPortNumber(1433);
        ds.setDatabaseName("Computer");
        
        try (Connection conn = ds.getConnection()) {
            
            String us = user.getText();
            String pas = pass.getText();
            Statement sm = conn.createStatement();
            
            String db = "select * from Login where username='"+ us +"' and password= '" + pas +"'";
            ResultSet rs = sm.executeQuery(db);

            if (rs.next()) {
                dispose ();
                MainUX main = new MainUX();
                main.setVisible (true);
            }
            else {
                LoginFail fail = new LoginFail();
                fail.setVisible (true);
            }            
        }
        catch (Exception e) {
            System.out.println(e);
        }
        
        
 
        
    }//GEN-LAST:event_signinActionPerformed

    private void MotherUIMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MotherUIMousePressed
        positionX = evt.getX();
        positionY = evt.getY();
    }//GEN-LAST:event_MotherUIMousePressed

    private void MotherUIMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MotherUIMouseDragged
        setLocation(evt.getXOnScreen()-positionX, evt.getYOnScreen()-positionY);
    }//GEN-LAST:event_MotherUIMouseDragged

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        notiquenmk mk = new notiquenmk();
        mk.setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked
    
    

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MotherUI;
    private javax.swing.JPanel bannerleft;
    private javax.swing.JPanel bannerright;
    private javax.swing.JLabel exitbtn;
    private javax.swing.JLabel iconpass;
    private javax.swing.JLabel iconuser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel namepass;
    private javax.swing.JLabel namestore;
    private javax.swing.JLabel nameuser;
    private javax.swing.JPasswordField pass;
    private javax.swing.JButton signin;
    private javax.swing.JTextField user;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
