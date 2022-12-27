
package LoginUX;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.awt.Toolkit;
import java.awt.geom.RoundRectangle2D;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class AddKH extends javax.swing.JFrame {

    int positionX = 0, positionY = 0;
    
    public AddKH() {
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
        makh = new javax.swing.JLabel();
        setidkh = new javax.swing.JTextField();
        hotenkh = new javax.swing.JLabel();
        sethtkh = new javax.swing.JTextField();
        sdtkh = new javax.swing.JLabel();
        setsdtkh = new javax.swing.JTextField();
        setdckh = new javax.swing.JTextField();
        diachikh = new javax.swing.JLabel();
        resetkh = new javax.swing.JButton();
        themkh = new javax.swing.JButton();
        kh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jLabel1.setText("Thêm Khách Hàng");

        javax.swing.GroupLayout addnvLayout = new javax.swing.GroupLayout(addnv);
        addnv.setLayout(addnvLayout);
        addnvLayout.setHorizontalGroup(
            addnvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addnvLayout.createSequentialGroup()
                .addGap(283, 283, 283)
                .addComponent(jLabel1)
                .addContainerGap(282, Short.MAX_VALUE))
        );
        addnvLayout.setVerticalGroup(
            addnvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addnvLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        mother.add(addnv, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, -1));

        bottompanel.setBackground(new java.awt.Color(247, 81, 81));
        bottompanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        makh.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 18)); // NOI18N
        makh.setForeground(new java.awt.Color(255, 255, 255));
        makh.setText("Mã KH");
        bottompanel.add(makh, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, -1, -1));

        setidkh.setBackground(new java.awt.Color(247, 81, 81));
        setidkh.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        setidkh.setForeground(new java.awt.Color(255, 255, 255));
        setidkh.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        bottompanel.add(setidkh, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 200, 39));

        hotenkh.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 18)); // NOI18N
        hotenkh.setForeground(new java.awt.Color(255, 255, 255));
        hotenkh.setText("Họ tên");
        bottompanel.add(hotenkh, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, -1, -1));

        sethtkh.setBackground(new java.awt.Color(247, 81, 81));
        sethtkh.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        sethtkh.setForeground(new java.awt.Color(255, 255, 255));
        sethtkh.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        bottompanel.add(sethtkh, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 200, 39));

        sdtkh.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 18)); // NOI18N
        sdtkh.setForeground(new java.awt.Color(255, 255, 255));
        sdtkh.setText("SDT");
        bottompanel.add(sdtkh, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, -1, -1));

        setsdtkh.setBackground(new java.awt.Color(247, 81, 81));
        setsdtkh.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        setsdtkh.setForeground(new java.awt.Color(255, 255, 255));
        setsdtkh.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        bottompanel.add(setsdtkh, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 200, 39));

        setdckh.setBackground(new java.awt.Color(247, 81, 81));
        setdckh.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        setdckh.setForeground(new java.awt.Color(255, 255, 255));
        setdckh.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        bottompanel.add(setdckh, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 200, 39));

        diachikh.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 18)); // NOI18N
        diachikh.setForeground(new java.awt.Color(255, 255, 255));
        diachikh.setText("Địa chỉ");
        bottompanel.add(diachikh, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, -1, -1));

        resetkh.setBackground(new java.awt.Color(255, 185, 86));
        resetkh.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 16)); // NOI18N
        resetkh.setForeground(new java.awt.Color(255, 255, 255));
        resetkh.setText("Đặt lại");
        resetkh.setBorder(null);
        resetkh.setFocusable(false);
        resetkh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetkhActionPerformed(evt);
            }
        });
        bottompanel.add(resetkh, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 170, 50));

        themkh.setBackground(new java.awt.Color(63, 171, 174));
        themkh.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 16)); // NOI18N
        themkh.setForeground(new java.awt.Color(255, 255, 255));
        themkh.setText("Thêm");
        themkh.setBorder(null);
        themkh.setFocusable(false);
        themkh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themkhActionPerformed(evt);
            }
        });
        bottompanel.add(themkh, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 170, 50));

        kh.setBackground(new java.awt.Color(247, 81, 81));
        kh.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 16)); // NOI18N
        kh.setForeground(new java.awt.Color(255, 255, 255));
        kh.setText("Thoát");
        kh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        kh.setFocusable(false);
        kh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                khMouseClicked(evt);
            }
        });
        bottompanel.add(kh, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, 170, 50));

        mother.add(bottompanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 850, 440));

        getContentPane().add(mother, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void resetkhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetkhActionPerformed
        setidkh.setText("");
        sethtkh.setText("");
        setdckh.setText("");
        setsdtkh.setText("");
    }//GEN-LAST:event_resetkhActionPerformed

    private void khMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_khMouseClicked
        dispose ();
    }//GEN-LAST:event_khMouseClicked

    private void motherMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_motherMousePressed
        positionX = evt.getX();
        positionY = evt.getY();
    }//GEN-LAST:event_motherMousePressed

    private void motherMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_motherMouseDragged
        setLocation(evt.getXOnScreen()-positionX, evt.getYOnScreen()-positionY);
    }//GEN-LAST:event_motherMouseDragged

    private void themkhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themkhActionPerformed
        
        if (setidkh.getText().equals("") || sethtkh.getText().equals("")
            || setdckh.getText().equals("") || setsdtkh.getText().equals("")) 
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
                String themkh = "insert into khachhang (id_kh, htkh, diachikh, sdtkh) values (?,?,?,?)";
                PreparedStatement addkh = conn.prepareStatement(themkh);

                addkh.setString (1, setidkh.getText());
                addkh.setString (2, sethtkh.getText());
                addkh.setString (3, setdckh.getText());
                addkh.setString (4, setsdtkh.getText());

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
    }//GEN-LAST:event_themkhActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddKH().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addnv;
    private javax.swing.JPanel bottompanel;
    private javax.swing.JLabel diachikh;
    private javax.swing.JLabel hotenkh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton kh;
    private javax.swing.JLabel makh;
    private javax.swing.JPanel mother;
    private javax.swing.JButton resetkh;
    private javax.swing.JLabel sdtkh;
    private javax.swing.JTextField setdckh;
    private javax.swing.JTextField sethtkh;
    private javax.swing.JTextField setidkh;
    private javax.swing.JTextField setsdtkh;
    private javax.swing.JButton themkh;
    // End of variables declaration//GEN-END:variables
}
