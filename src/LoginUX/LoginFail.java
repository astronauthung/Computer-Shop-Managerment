
package LoginUX;

import java.awt.Toolkit;
import java.awt.geom.RoundRectangle2D;

public class LoginFail extends javax.swing.JFrame {

    int positionX = 0, positionY = 0;
    
    public LoginFail() {
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

        jPanel1 = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        warning = new javax.swing.JLabel();
        notice = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(245, 247, 251));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 211, 234));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exit.setBackground(new java.awt.Color(250, 250, 250));
        exit.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 24)); // NOI18N
        exit.setText("X");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        warning.setForeground(new java.awt.Color(245, 247, 251));
        warning.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_warning_shield_50px.png"))); // NOI18N
        jPanel1.add(warning, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 60, 60));

        notice.setFont(new java.awt.Font("Poppins ExtraBold", 1, 18)); // NOI18N
        notice.setText("       Username or Password incorrect");
        jPanel1.add(notice, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 360, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 190));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        dispose ();
    }//GEN-LAST:event_exitMouseClicked

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        positionX = evt.getX();
        positionY = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        setLocation(evt.getXOnScreen()-positionX, evt.getYOnScreen()-positionY);
    }//GEN-LAST:event_jPanel1MouseDragged

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel exit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel notice;
    private javax.swing.JLabel warning;
    // End of variables declaration//GEN-END:variables
}
