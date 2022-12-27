
package LoginUX;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.awt.Toolkit;
import java.awt.geom.RoundRectangle2D;
import java.sql.Connection;
import java.sql.PreparedStatement;


public class AddPeople extends javax.swing.JFrame {

    int positionX = 0, positionY = 0;

    public AddPeople() {
        initComponents();
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 25, 25));
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("500.png")));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        motheradd = new javax.swing.JPanel();
        titlepanel = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        infopanel = new javax.swing.JPanel();
        gioitinh = new javax.swing.JLabel();
        sdt = new javax.swing.JLabel();
        hoten = new javax.swing.JLabel();
        ngaysinh = new javax.swing.JLabel();
        manv = new javax.swing.JLabel();
        chucvu = new javax.swing.JLabel();
        diachi = new javax.swing.JLabel();
        setidnv = new javax.swing.JTextField();
        cancel = new javax.swing.JButton();
        them = new javax.swing.JButton();
        setgt = new javax.swing.JTextField();
        setns = new javax.swing.JTextField();
        setht = new javax.swing.JTextField();
        reset = new javax.swing.JButton();
        setsdt = new javax.swing.JTextField();
        setdc = new javax.swing.JTextField();
        chucvuset = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Them Nhan Vien");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        motheradd.setBackground(new java.awt.Color(245, 247, 251));
        motheradd.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                motheraddMouseDragged(evt);
            }
        });
        motheradd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                motheraddMousePressed(evt);
            }
        });

        titlepanel.setBackground(new java.awt.Color(55, 51, 52));

        title.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 28)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Thêm Nhân Viên");

        javax.swing.GroupLayout titlepanelLayout = new javax.swing.GroupLayout(titlepanel);
        titlepanel.setLayout(titlepanelLayout);
        titlepanelLayout.setHorizontalGroup(
            titlepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titlepanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(title)
                .addGap(286, 286, 286))
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

        gioitinh.setBackground(new java.awt.Color(255, 255, 255));
        gioitinh.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 18)); // NOI18N
        gioitinh.setForeground(new java.awt.Color(255, 255, 255));
        gioitinh.setText("Giới tính");
        infopanel.add(gioitinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, -1, -1));

        sdt.setBackground(new java.awt.Color(255, 255, 255));
        sdt.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 18)); // NOI18N
        sdt.setForeground(new java.awt.Color(255, 255, 255));
        sdt.setText("SDT");
        infopanel.add(sdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, -1, -1));

        hoten.setBackground(new java.awt.Color(255, 255, 255));
        hoten.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 18)); // NOI18N
        hoten.setForeground(new java.awt.Color(255, 255, 255));
        hoten.setText("Họ tên");
        infopanel.add(hoten, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        ngaysinh.setBackground(new java.awt.Color(255, 255, 255));
        ngaysinh.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 18)); // NOI18N
        ngaysinh.setForeground(new java.awt.Color(255, 255, 255));
        ngaysinh.setText("Ngày sinh");
        infopanel.add(ngaysinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, -1, -1));

        manv.setBackground(new java.awt.Color(255, 255, 255));
        manv.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 18)); // NOI18N
        manv.setForeground(new java.awt.Color(255, 255, 255));
        manv.setText("Mã NV");
        infopanel.add(manv, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        chucvu.setBackground(new java.awt.Color(255, 255, 255));
        chucvu.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 18)); // NOI18N
        chucvu.setForeground(new java.awt.Color(255, 255, 255));
        chucvu.setText("Chức vụ");
        infopanel.add(chucvu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        diachi.setBackground(new java.awt.Color(255, 255, 255));
        diachi.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 18)); // NOI18N
        diachi.setForeground(new java.awt.Color(255, 255, 255));
        diachi.setText("Địa chỉ");
        infopanel.add(diachi, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, -1, -1));

        setidnv.setBackground(new java.awt.Color(247, 81, 81));
        setidnv.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        setidnv.setForeground(new java.awt.Color(255, 255, 255));
        setidnv.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        infopanel.add(setidnv, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 760, 39));

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
        infopanel.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, 170, 50));

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
        infopanel.add(them, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 170, 50));

        setgt.setBackground(new java.awt.Color(247, 81, 81));
        setgt.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        setgt.setForeground(new java.awt.Color(255, 255, 255));
        setgt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        infopanel.add(setgt, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, 200, 39));

        setns.setBackground(new java.awt.Color(247, 81, 81));
        setns.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        setns.setForeground(new java.awt.Color(255, 255, 255));
        setns.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        infopanel.add(setns, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 200, 39));

        setht.setBackground(new java.awt.Color(247, 81, 81));
        setht.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        setht.setForeground(new java.awt.Color(255, 255, 255));
        setht.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        infopanel.add(setht, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 200, 39));

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
        infopanel.add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 170, 50));

        setsdt.setBackground(new java.awt.Color(247, 81, 81));
        setsdt.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        setsdt.setForeground(new java.awt.Color(255, 255, 255));
        setsdt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        infopanel.add(setsdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 270, 200, 39));

        setdc.setBackground(new java.awt.Color(247, 81, 81));
        setdc.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        setdc.setForeground(new java.awt.Color(255, 255, 255));
        setdc.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        infopanel.add(setdc, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 200, 39));

        chucvuset.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        chucvuset.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quản lý", "Nhân viên" }));
        infopanel.add(chucvuset, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 272, 200, 40));

        javax.swing.GroupLayout motheraddLayout = new javax.swing.GroupLayout(motheradd);
        motheradd.setLayout(motheraddLayout);
        motheraddLayout.setHorizontalGroup(
            motheraddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlepanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(motheraddLayout.createSequentialGroup()
                .addComponent(infopanel, javax.swing.GroupLayout.PREFERRED_SIZE, 845, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        motheraddLayout.setVerticalGroup(
            motheraddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(motheraddLayout.createSequentialGroup()
                .addComponent(titlepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(infopanel, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        getContentPane().add(motheradd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        setidnv.setText("");
        setht.setText("");
        setns.setText("");
        setgt.setText("");
        setdc.setText("");
        setsdt.setText("");
    }//GEN-LAST:event_resetActionPerformed

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
        dispose ();
    }//GEN-LAST:event_cancelMouseClicked

    private void motheraddMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_motheraddMousePressed
        positionX = evt.getX();
        positionY = evt.getY();

    }//GEN-LAST:event_motheraddMousePressed

    private void motheraddMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_motheraddMouseDragged
        setLocation(evt.getXOnScreen()-positionX, evt.getYOnScreen()-positionY);
    }//GEN-LAST:event_motheraddMouseDragged

    private void themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themActionPerformed
        
        if (setidnv.getText().equals("") || setht.getText().equals("")
            || setns.getText().equals("") || setgt.getText().equals("") 
            || setdc.getText().equals("") || setsdt.getText().equals("")) {
            
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
            
            String chucvu = chucvuset.getSelectedItem().toString();
            
            try (Connection conn = ds.getConnection()) {
                String them = "insert into nhanvien (id_nv, name, date, gt, chucvu, dc, sdt) values (?,?,?,?,?,?,?)";
                PreparedStatement addnv = conn.prepareStatement(them);

                addnv.setString (1, setidnv.getText());
                addnv.setString (2, setht.getText());
                addnv.setString (3, setns.getText());
                addnv.setString (4, setgt.getText());
                addnv.setString (5, chucvu);             
                addnv.setString (6, setdc.getText());
                addnv.setString (7, setsdt.getText());

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
    }//GEN-LAST:event_themActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddPeople().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JLabel chucvu;
    private javax.swing.JComboBox<String> chucvuset;
    private javax.swing.JLabel diachi;
    private javax.swing.JLabel gioitinh;
    private javax.swing.JLabel hoten;
    private javax.swing.JPanel infopanel;
    private javax.swing.JLabel manv;
    private javax.swing.JPanel motheradd;
    private javax.swing.JLabel ngaysinh;
    private javax.swing.JButton reset;
    private javax.swing.JLabel sdt;
    private javax.swing.JTextField setdc;
    private javax.swing.JTextField setgt;
    private javax.swing.JTextField setht;
    private javax.swing.JTextField setidnv;
    private javax.swing.JTextField setns;
    private javax.swing.JTextField setsdt;
    private javax.swing.JButton them;
    private javax.swing.JLabel title;
    private javax.swing.JPanel titlepanel;
    // End of variables declaration//GEN-END:variables
}
