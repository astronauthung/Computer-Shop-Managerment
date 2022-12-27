
package LoginUX;


import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class AddSP extends javax.swing.JFrame {

    int positionX = 0, positionY = 0;
    
    public AddSP() {
        initComponents();
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 25, 25));
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("500.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        motheraddsp = new javax.swing.JPanel();
        titlepanel = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        infopanel = new javax.swing.JPanel();
        price = new javax.swing.JLabel();
        xuatxu = new javax.swing.JLabel();
        masp = new javax.swing.JLabel();
        tensp = new javax.swing.JLabel();
        sl = new javax.swing.JLabel();
        ncc = new javax.swing.JLabel();
        cancelsp = new javax.swing.JButton();
        themsp = new javax.swing.JButton();
        setprice = new javax.swing.JTextField();
        setnamesp = new javax.swing.JTextField();
        setmasp = new javax.swing.JTextField();
        setsl = new javax.swing.JTextField();
        resetsp = new javax.swing.JButton();
        setxuatxu = new javax.swing.JTextField();
        setncc = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        motheraddsp.setBackground(new java.awt.Color(245, 247, 251));
        motheraddsp.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                motheraddspMouseDragged(evt);
            }
        });
        motheraddsp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                motheraddspMousePressed(evt);
            }
        });

        titlepanel.setBackground(new java.awt.Color(55, 51, 52));

        title.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 28)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Thêm Sản phẩm");

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

        price.setBackground(new java.awt.Color(255, 255, 255));
        price.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 18)); // NOI18N
        price.setForeground(new java.awt.Color(255, 255, 255));
        price.setText("Giá");
        infopanel.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, -1, -1));

        xuatxu.setBackground(new java.awt.Color(255, 255, 255));
        xuatxu.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 18)); // NOI18N
        xuatxu.setForeground(new java.awt.Color(255, 255, 255));
        xuatxu.setText("Xuất xứ");
        infopanel.add(xuatxu, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, -1, -1));

        masp.setBackground(new java.awt.Color(255, 255, 255));
        masp.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 18)); // NOI18N
        masp.setForeground(new java.awt.Color(255, 255, 255));
        masp.setText("Mã SP");
        infopanel.add(masp, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        tensp.setBackground(new java.awt.Color(255, 255, 255));
        tensp.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 18)); // NOI18N
        tensp.setForeground(new java.awt.Color(255, 255, 255));
        tensp.setText("Tên SP");
        infopanel.add(tensp, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, -1, -1));

        sl.setBackground(new java.awt.Color(255, 255, 255));
        sl.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 18)); // NOI18N
        sl.setForeground(new java.awt.Color(255, 255, 255));
        sl.setText("Số lượng");
        infopanel.add(sl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        ncc.setBackground(new java.awt.Color(255, 255, 255));
        ncc.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 18)); // NOI18N
        ncc.setForeground(new java.awt.Color(255, 255, 255));
        ncc.setText("Nhà cung cấp");
        infopanel.add(ncc, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, -1, -1));

        cancelsp.setBackground(new java.awt.Color(247, 81, 81));
        cancelsp.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 16)); // NOI18N
        cancelsp.setForeground(new java.awt.Color(255, 255, 255));
        cancelsp.setText("Thoát");
        cancelsp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        cancelsp.setFocusable(false);
        cancelsp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelspMouseClicked(evt);
            }
        });
        infopanel.add(cancelsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 340, 170, 50));

        themsp.setBackground(new java.awt.Color(63, 171, 174));
        themsp.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 16)); // NOI18N
        themsp.setForeground(new java.awt.Color(255, 255, 255));
        themsp.setText("Thêm");
        themsp.setBorder(null);
        themsp.setFocusable(false);
        themsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themspActionPerformed(evt);
            }
        });
        infopanel.add(themsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 170, 50));

        setprice.setBackground(new java.awt.Color(247, 81, 81));
        setprice.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        setprice.setForeground(new java.awt.Color(255, 255, 255));
        setprice.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        infopanel.add(setprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, 200, 39));

        setnamesp.setBackground(new java.awt.Color(247, 81, 81));
        setnamesp.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        setnamesp.setForeground(new java.awt.Color(255, 255, 255));
        setnamesp.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        infopanel.add(setnamesp, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 200, 39));

        setmasp.setBackground(new java.awt.Color(247, 81, 81));
        setmasp.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        setmasp.setForeground(new java.awt.Color(255, 255, 255));
        setmasp.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        infopanel.add(setmasp, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 200, 39));

        setsl.setBackground(new java.awt.Color(247, 81, 81));
        setsl.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        setsl.setForeground(new java.awt.Color(255, 255, 255));
        setsl.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        infopanel.add(setsl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 200, 39));

        resetsp.setBackground(new java.awt.Color(255, 185, 86));
        resetsp.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 16)); // NOI18N
        resetsp.setForeground(new java.awt.Color(255, 255, 255));
        resetsp.setText("Đặt lại");
        resetsp.setBorder(null);
        resetsp.setFocusable(false);
        resetsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetspActionPerformed(evt);
            }
        });
        infopanel.add(resetsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 170, 50));

        setxuatxu.setBackground(new java.awt.Color(247, 81, 81));
        setxuatxu.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        setxuatxu.setForeground(new java.awt.Color(255, 255, 255));
        setxuatxu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        infopanel.add(setxuatxu, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, 200, 39));

        setncc.setBackground(new java.awt.Color(247, 81, 81));
        setncc.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        setncc.setForeground(new java.awt.Color(255, 255, 255));
        setncc.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        infopanel.add(setncc, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 200, 39));

        javax.swing.GroupLayout motheraddspLayout = new javax.swing.GroupLayout(motheraddsp);
        motheraddsp.setLayout(motheraddspLayout);
        motheraddspLayout.setHorizontalGroup(
            motheraddspLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlepanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(motheraddspLayout.createSequentialGroup()
                .addComponent(infopanel, javax.swing.GroupLayout.PREFERRED_SIZE, 845, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        motheraddspLayout.setVerticalGroup(
            motheraddspLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(motheraddspLayout.createSequentialGroup()
                .addComponent(titlepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE)
                .addComponent(infopanel, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 845, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(motheraddsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(motheraddsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelspMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelspMouseClicked
        dispose ();
    }//GEN-LAST:event_cancelspMouseClicked

    private void themspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themspActionPerformed
        

        if (setmasp.getText().equals("")
            || setnamesp.getText().equals("") || setprice.getText().equals("")
            || setsl.getText().equals("") || setncc.getText().equals("")
            || setxuatxu.getText().equals("")) {

            notisl canhbao = new notisl();
            canhbao.setVisible(true);
        
        }
        
        else {
            int sl = Integer.parseInt(setsl.getText());
            int gia = Integer.parseInt(setprice.getText());
            if (sl < 0 || gia < 0) {
                notisl canhbao = new notisl();
                canhbao.setVisible(true);
            }
            else {
            SQLServerDataSource ds = new SQLServerDataSource();
            ds.setUser ("sa");
            ds.setPassword ("123456");
            ds.setServerName("LAPTOP-CPS4PJ7N\\SQLEXPRESS");
            ds.setPortNumber(1433);
            ds.setDatabaseName("Computer");

            try (Connection conn = ds.getConnection()) {
                String them = "insert into sanpham (id_sp, tensp, price, sl, nhacungcap, xuatxu) values (?,?,?,?,?,?)";
                PreparedStatement addnv = conn.prepareStatement(them);
               
                addnv.setString (1, setmasp.getText());
                addnv.setString (2, setnamesp.getText());
                addnv.setString (3, setprice.getText());
                addnv.setString (4, setsl.getText());
                addnv.setString (5, setncc.getText());
                addnv.setString (6, setxuatxu.getText());

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
    }//GEN-LAST:event_themspActionPerformed

    private void resetspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetspActionPerformed
        setmasp.setText("");
        setnamesp.setText("");
        setprice.setText("");
        setncc.setText("");
        setsl.setText("");
        setxuatxu.setText("");
    }//GEN-LAST:event_resetspActionPerformed

    private void motheraddspMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_motheraddspMouseDragged
        setLocation(evt.getXOnScreen()-positionX, evt.getYOnScreen()-positionY);
    }//GEN-LAST:event_motheraddspMouseDragged

    private void motheraddspMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_motheraddspMousePressed
        positionX = evt.getX();
        positionY = evt.getY();
    }//GEN-LAST:event_motheraddspMousePressed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddSP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelsp;
    private javax.swing.JPanel infopanel;
    private javax.swing.JLabel masp;
    private javax.swing.JPanel motheraddsp;
    private javax.swing.JLabel ncc;
    private javax.swing.JLabel price;
    private javax.swing.JButton resetsp;
    private javax.swing.JTextField setmasp;
    private javax.swing.JTextField setnamesp;
    private javax.swing.JTextField setncc;
    private javax.swing.JTextField setprice;
    private javax.swing.JTextField setsl;
    private javax.swing.JTextField setxuatxu;
    private javax.swing.JLabel sl;
    private javax.swing.JLabel tensp;
    private javax.swing.JButton themsp;
    private javax.swing.JLabel title;
    private javax.swing.JPanel titlepanel;
    private javax.swing.JLabel xuatxu;
    // End of variables declaration//GEN-END:variables
}
