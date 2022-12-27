
package LoginUX;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.awt.Toolkit;
import java.awt.geom.RoundRectangle2D;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class AddNCC extends javax.swing.JFrame {

    int positionX = 0, positionY = 0;
    
    public AddNCC() {
        initComponents();
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 25, 25));
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("500.png")));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mother = new javax.swing.JPanel();
        addnv = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bottompanel = new javax.swing.JPanel();
        mancc = new javax.swing.JLabel();
        setidncc = new javax.swing.JTextField();
        tenncc = new javax.swing.JLabel();
        settenncc = new javax.swing.JTextField();
        sdtncc = new javax.swing.JLabel();
        setsdtncc = new javax.swing.JTextField();
        setdcncc = new javax.swing.JTextField();
        dcncc = new javax.swing.JLabel();
        resetncc = new javax.swing.JButton();
        themncc = new javax.swing.JButton();
        cancelncc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        mother.setPreferredSize(new java.awt.Dimension(845, 528));
        mother.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                motherMouseDragged(evt);
            }
        });
        mother.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                motherMousePressed(evt);
            }
        });
        mother.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addnv.setBackground(new java.awt.Color(55, 51, 52));
        addnv.setPreferredSize(new java.awt.Dimension(537, 86));

        jLabel1.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Thêm Nhà cung cấp");

        javax.swing.GroupLayout addnvLayout = new javax.swing.GroupLayout(addnv);
        addnv.setLayout(addnvLayout);
        addnvLayout.setHorizontalGroup(
            addnvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addnvLayout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(jLabel1)
                .addContainerGap(273, Short.MAX_VALUE))
        );
        addnvLayout.setVerticalGroup(
            addnvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addnvLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(24, 24, 24))
        );

        mother.add(addnv, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, -1));

        bottompanel.setBackground(new java.awt.Color(247, 81, 81));
        bottompanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mancc.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 18)); // NOI18N
        mancc.setForeground(new java.awt.Color(255, 255, 255));
        mancc.setText("Mã Nhà cung cấp");
        bottompanel.add(mancc, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, -1, -1));

        setidncc.setBackground(new java.awt.Color(247, 81, 81));
        setidncc.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        setidncc.setForeground(new java.awt.Color(255, 255, 255));
        setidncc.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        bottompanel.add(setidncc, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 200, 39));

        tenncc.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 18)); // NOI18N
        tenncc.setForeground(new java.awt.Color(255, 255, 255));
        tenncc.setText("Tên nhà cung cấp");
        bottompanel.add(tenncc, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, -1, -1));

        settenncc.setBackground(new java.awt.Color(247, 81, 81));
        settenncc.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        settenncc.setForeground(new java.awt.Color(255, 255, 255));
        settenncc.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        bottompanel.add(settenncc, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 200, 39));

        sdtncc.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 18)); // NOI18N
        sdtncc.setForeground(new java.awt.Color(255, 255, 255));
        sdtncc.setText("SDT");
        bottompanel.add(sdtncc, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, -1, -1));

        setsdtncc.setBackground(new java.awt.Color(247, 81, 81));
        setsdtncc.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        setsdtncc.setForeground(new java.awt.Color(255, 255, 255));
        setsdtncc.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        bottompanel.add(setsdtncc, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 200, 39));

        setdcncc.setBackground(new java.awt.Color(247, 81, 81));
        setdcncc.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        setdcncc.setForeground(new java.awt.Color(255, 255, 255));
        setdcncc.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        bottompanel.add(setdcncc, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 200, 39));

        dcncc.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 18)); // NOI18N
        dcncc.setForeground(new java.awt.Color(255, 255, 255));
        dcncc.setText("Địa chỉ");
        bottompanel.add(dcncc, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, -1, -1));

        resetncc.setBackground(new java.awt.Color(255, 185, 86));
        resetncc.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 16)); // NOI18N
        resetncc.setForeground(new java.awt.Color(255, 255, 255));
        resetncc.setText("Đặt lại");
        resetncc.setBorder(null);
        resetncc.setFocusable(false);
        resetncc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetnccActionPerformed(evt);
            }
        });
        bottompanel.add(resetncc, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 170, 50));

        themncc.setBackground(new java.awt.Color(63, 171, 174));
        themncc.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 16)); // NOI18N
        themncc.setForeground(new java.awt.Color(255, 255, 255));
        themncc.setText("Thêm");
        themncc.setBorder(null);
        themncc.setFocusable(false);
        themncc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themnccActionPerformed(evt);
            }
        });
        bottompanel.add(themncc, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 170, 50));

        cancelncc.setBackground(new java.awt.Color(247, 81, 81));
        cancelncc.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 16)); // NOI18N
        cancelncc.setForeground(new java.awt.Color(255, 255, 255));
        cancelncc.setText("Thoát");
        cancelncc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        cancelncc.setFocusable(false);
        cancelncc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelnccMouseClicked(evt);
            }
        });
        bottompanel.add(cancelncc, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, 170, 50));

        mother.add(bottompanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 850, 440));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(mother, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(mother, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void resetnccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetnccActionPerformed
        setidncc.setText("");
        settenncc.setText("");
        setdcncc.setText("");
        setsdtncc.setText("");
    }//GEN-LAST:event_resetnccActionPerformed

    private void themnccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themnccActionPerformed

        if (setidncc.getText().equals("") || settenncc.getText().equals("")
            || setdcncc.getText().equals("") || setsdtncc.getText().equals(""))
        {
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

            try (Connection conn = ds.getConnection()) {
                String themkh = "insert into nhacungcap (id_ncc, tenncc, dcncc, sdtncc) values (?,?,?,?)";
                PreparedStatement addkh = conn.prepareStatement(themkh);

                addkh.setString (1, setidncc.getText());
                addkh.setString (2, settenncc.getText());
                addkh.setString (3, setdcncc.getText());
                addkh.setString (4, setsdtncc.getText());

                addkh.executeUpdate();

                notisuccess suc = new notisuccess();
                suc.setVisible(true);

                addkh.close();
                conn.close();
            }
            catch (Exception e) {
                System.out.println (e);
            }
        }
    }//GEN-LAST:event_themnccActionPerformed

    private void cancelnccMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelnccMouseClicked
        dispose ();
    }//GEN-LAST:event_cancelnccMouseClicked

    private void motherMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_motherMouseDragged
        setLocation(evt.getXOnScreen()-positionX, evt.getYOnScreen()- positionY);
    }//GEN-LAST:event_motherMouseDragged

    private void motherMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_motherMousePressed
        positionX = evt.getX();
        positionY = evt.getY();
    }//GEN-LAST:event_motherMousePressed

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
            java.util.logging.Logger.getLogger(AddNCC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNCC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNCC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNCC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNCC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addnv;
    private javax.swing.JPanel bottompanel;
    private javax.swing.JButton cancelncc;
    private javax.swing.JLabel dcncc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel mancc;
    private javax.swing.JPanel mother;
    private javax.swing.JButton resetncc;
    private javax.swing.JLabel sdtncc;
    private javax.swing.JTextField setdcncc;
    private javax.swing.JTextField setidncc;
    private javax.swing.JTextField setsdtncc;
    private javax.swing.JTextField settenncc;
    private javax.swing.JLabel tenncc;
    private javax.swing.JButton themncc;
    // End of variables declaration//GEN-END:variables
}
