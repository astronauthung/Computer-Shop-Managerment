
package LoginUX;

import java.awt.Toolkit;
import java.awt.geom.RoundRectangle2D;

public class notiquenmk extends javax.swing.JFrame {

    int positionX = 0, positionY = 0;
    
    public notiquenmk() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("500.png")));
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 25, 25));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mothernoti = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

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
        mothernoti.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_forgot_password_40px.png"))); // NOI18N
        mothernoti.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 24)); // NOI18N
        jLabel3.setText("X");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        mothernoti.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 16)); // NOI18N
        jLabel2.setText("Liên hệ 19001009 để được hỗ trợ");
        mothernoti.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mothernoti, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mothernoti, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void mothernotiMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mothernotiMouseDragged
        setLocation(evt.getXOnScreen()-positionX, evt.getYOnScreen()-positionY);
    }//GEN-LAST:event_mothernotiMouseDragged

    private void mothernotiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mothernotiMousePressed
        positionX = evt.getX();
        positionY = evt.getY();
    }//GEN-LAST:event_mothernotiMousePressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new notiquenmk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel mothernoti;
    // End of variables declaration//GEN-END:variables
}
