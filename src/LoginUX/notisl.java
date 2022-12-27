
package LoginUX;

import java.awt.Toolkit;
import java.awt.geom.RoundRectangle2D;

public class notisl extends javax.swing.JFrame {

    int positionX = 0, positionY = 0;
    
    public notisl() {
        initComponents();
        icon();
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 25, 25));
    }
    private void icon () {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("500.png")));
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mothernoti = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        mothernoti.setBackground(new java.awt.Color(255, 211, 234));
        mothernoti.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                mothernotiMouseDragged(evt);
            }
        });
        mothernoti.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mothernotiMousePressed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_error_50px.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 16)); // NOI18N
        jLabel2.setText("Thông tin chưa đầy đủ hoặc");

        jLabel3.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 24)); // NOI18N
        jLabel3.setText("X");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 16)); // NOI18N
        jLabel4.setText("Đã hiểu");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel4)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 16)); // NOI18N
        jLabel5.setText("        Số lượng, giá sản phẩm phải lớn hơn 0");

        javax.swing.GroupLayout mothernotiLayout = new javax.swing.GroupLayout(mothernoti);
        mothernoti.setLayout(mothernotiLayout);
        mothernotiLayout.setHorizontalGroup(
            mothernotiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mothernotiLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(161, 161, 161)
                .addComponent(jLabel3)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mothernotiLayout.createSequentialGroup()
                .addGap(0, 96, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
            .addGroup(mothernotiLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(mothernotiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mothernotiLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        mothernotiLayout.setVerticalGroup(
            mothernotiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mothernotiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mothernotiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mothernotiLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mothernotiLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27)))
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(mothernotiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mothernotiLayout.createSequentialGroup()
                    .addContainerGap(137, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addGap(76, 76, 76)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mothernoti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mothernoti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        dispose();
    }//GEN-LAST:event_jPanel1MouseClicked

    private void mothernotiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mothernotiMousePressed
        positionX = evt.getX();
        positionY = evt.getY();
    }//GEN-LAST:event_mothernotiMousePressed

    private void mothernotiMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mothernotiMouseDragged
        setLocation(evt.getXOnScreen()-positionX, evt.getYOnScreen()-positionY);
    }//GEN-LAST:event_mothernotiMouseDragged

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new notisl().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel mothernoti;
    // End of variables declaration//GEN-END:variables
}
