
package LoginUX;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.awt.Toolkit;
import java.awt.geom.RoundRectangle2D;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class AccountDky extends javax.swing.JFrame {
    
    int positionX = 0, positionY = 0;
    
    public AccountDky() {
        initComponents();
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 25, 25));
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("500.png")));       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        motheraccount = new javax.swing.JPanel();
        titlepanel = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        infopanel = new javax.swing.JPanel();
        cv = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        pass = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        them = new javax.swing.JButton();
        setpass = new javax.swing.JTextField();
        setuser = new javax.swing.JTextField();
        reset = new javax.swing.JButton();
        addtk = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        motheraccount.setBackground(new java.awt.Color(245, 247, 251));
        motheraccount.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                motheraccountMouseDragged(evt);
            }
        });
        motheraccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                motheraccountMousePressed(evt);
            }
        });

        titlepanel.setBackground(new java.awt.Color(55, 51, 52));

        title.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 28)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Thêm Tài khoản");

        javax.swing.GroupLayout titlepanelLayout = new javax.swing.GroupLayout(titlepanel);
        titlepanel.setLayout(titlepanelLayout);
        titlepanelLayout.setHorizontalGroup(
            titlepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titlepanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(title)
                .addGap(292, 292, 292))
        );
        titlepanelLayout.setVerticalGroup(
            titlepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlepanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(title)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        infopanel.setBackground(new java.awt.Color(247, 81, 81));
        infopanel.setForeground(new java.awt.Color(255, 255, 255));
        infopanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cv.setBackground(new java.awt.Color(255, 255, 255));
        cv.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 18)); // NOI18N
        cv.setForeground(new java.awt.Color(255, 255, 255));
        cv.setText("Chức vụ");
        infopanel.add(cv, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, -1, -1));

        username.setBackground(new java.awt.Color(255, 255, 255));
        username.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 18)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setText("Tên đăng nhập");
        infopanel.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        pass.setBackground(new java.awt.Color(255, 255, 255));
        pass.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 18)); // NOI18N
        pass.setForeground(new java.awt.Color(255, 255, 255));
        pass.setText("Mật khẩu");
        infopanel.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, -1, -1));

        cancel.setBackground(new java.awt.Color(247, 81, 81));
        cancel.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 16)); // NOI18N
        cancel.setForeground(new java.awt.Color(255, 255, 255));
        cancel.setText("Thoát");
        cancel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        cancel.setFocusable(false);
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
        });
        infopanel.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, 170, 50));

        them.setBackground(new java.awt.Color(63, 171, 174));
        them.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 16)); // NOI18N
        them.setForeground(new java.awt.Color(255, 255, 255));
        them.setText("Thêm");
        them.setBorder(null);
        them.setFocusable(false);
        them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themActionPerformed(evt);
            }
        });
        infopanel.add(them, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 170, 50));

        setpass.setBackground(new java.awt.Color(247, 81, 81));
        setpass.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        setpass.setForeground(new java.awt.Color(255, 255, 255));
        setpass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        infopanel.add(setpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 200, 39));

        setuser.setBackground(new java.awt.Color(247, 81, 81));
        setuser.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        setuser.setForeground(new java.awt.Color(255, 255, 255));
        setuser.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        infopanel.add(setuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 200, 39));

        reset.setBackground(new java.awt.Color(255, 185, 86));
        reset.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 16)); // NOI18N
        reset.setForeground(new java.awt.Color(255, 255, 255));
        reset.setText("Đặt lại");
        reset.setBorder(null);
        reset.setFocusable(false);
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        infopanel.add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 170, 50));

        addtk.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        addtk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quản lý", "Nhân viên" }));
        infopanel.add(addtk, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 94, 200, 40));

        javax.swing.GroupLayout motheraccountLayout = new javax.swing.GroupLayout(motheraccount);
        motheraccount.setLayout(motheraccountLayout);
        motheraccountLayout.setHorizontalGroup(
            motheraccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlepanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(motheraccountLayout.createSequentialGroup()
                .addComponent(infopanel, javax.swing.GroupLayout.PREFERRED_SIZE, 845, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        motheraccountLayout.setVerticalGroup(
            motheraccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(motheraccountLayout.createSequentialGroup()
                .addComponent(titlepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(infopanel, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(motheraccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 380));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void motheraccountMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_motheraccountMouseDragged
        setLocation(evt.getXOnScreen()-positionX, evt.getYOnScreen()-positionY);    
    }//GEN-LAST:event_motheraccountMouseDragged

    private void motheraccountMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_motheraccountMousePressed
        positionX = evt.getX();
        positionY = evt.getY();    
    }//GEN-LAST:event_motheraccountMousePressed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        setuser.setText("");
        setpass.setText("");
    }//GEN-LAST:event_resetActionPerformed

    private void themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themActionPerformed

        if (setuser.getText().equals("")
            || setpass.getText().equals("")) {

            noticanhbao noti = new noticanhbao();
            noti.setVisible(true);
        }
        else {

            SQLServerDataSource ds = new SQLServerDataSource();
            ds.setUser ("sa");
            ds.setPassword ("123456");
            ds.setServerName("LAPTOP-CPS4PJ7N\\SQLEXPRESS");
            ds.setPortNumber(1433);
            ds.setDatabaseName("Computer");
            
            String chucvu = addtk.getSelectedItem().toString();
            if(chucvu.equals("Quản lý")) {
                try (Connection conn = ds.getConnection()) {
                String them = "insert into Login (username, password) values (?,?)";
                PreparedStatement addnv = conn.prepareStatement(them);

                addnv.setString (1, setuser.getText());              
                addnv.setString (2, setpass.getText());
                
                addnv.executeUpdate();
                notisuccess suc = new notisuccess();
                suc.setVisible(true);

                addnv.close();
                conn.close();

                }
                catch (Exception e) {
                    System.out.println (e);
                }
            }
            else {
                try (Connection conn = ds.getConnection()) {
                String them = "insert into AccountNV (username, pass) values (?,?)";
                PreparedStatement addnv = conn.prepareStatement(them);

                addnv.setString (1, setuser.getText());              
                addnv.setString (2, setpass.getText());               
                
                addnv.executeUpdate();
                notisuccess suc = new notisuccess();
                suc.setVisible(true);

                addnv.close();
                conn.close();

                }
                catch (Exception e) {
                    System.out.println (e);
                } 
            }

            
        }
    }//GEN-LAST:event_themActionPerformed

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
        dispose ();
    }//GEN-LAST:event_cancelMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AccountDky.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccountDky.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccountDky.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccountDky.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccountDky().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> addtk;
    private javax.swing.JButton cancel;
    private javax.swing.JLabel cv;
    private javax.swing.JPanel infopanel;
    private javax.swing.JPanel motheraccount;
    private javax.swing.JLabel pass;
    private javax.swing.JButton reset;
    private javax.swing.JTextField setpass;
    private javax.swing.JTextField setuser;
    private javax.swing.JButton them;
    private javax.swing.JLabel title;
    private javax.swing.JPanel titlepanel;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
