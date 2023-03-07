
package pms;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import java.io.IOException;
import javax.swing.ImageIcon;
import java.util.logging.Logger;
import java.util.logging.*;


/**
 *
 * @author Anella
 */
public class slider extends javax.swing.JFrame {

    /**
     * Creates new form slider
     */
    public slider() {
        initComponents();
        scaleImage();
        show(position);
    }
    public void scaleImage(){
      ImageIcon icon =new ImageIcon("C:\\Users\\Anella\\Downloads\\black.jpg");
      //scaling image til fit in jtable
      Image img = icon.getImage();
      Image imgScale = img.getScaledInstance(label1.getWidth(),label1.getHeight(),Image.SCALE_SMOOTH);
      ImageIcon scaledIcon = new ImageIcon(imgScale);
      label1.setIcon(scaledIcon);
       
   }

   public String[] takeimage(){
       File f = new File(getClass().getResource("/imagepath/").getFile());
       String[] Images = f.list();
       return Images;
   }
   public void show(int index)
   {
       String[]  Images = takeimage();
       String img = Images[index];

       ImageIcon icon = new ImageIcon(getClass().getResource("/imagepath/"+img));
       Image image = icon.getImage().getScaledInstance(label1.getWidth(),label1.getHeight(),Image.SCALE_SMOOTH);
       label1.setIcon(new ImageIcon(image));
   }
    @SuppressWarnings("unchecked")
    int position =0;
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        menu = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        backbtn = new javax.swing.JLabel();
        nextBtn = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setBackground(new java.awt.Color(204, 204, 204));
        menu.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        menu.setForeground(new java.awt.Color(0, 0, 0));
        menu.setText("Main Menu");
        menu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuMouseClicked(evt);
            }
        });
        jPanel1.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, -1));

        exit.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("X");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(927, 10, 20, 40));

        backbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pms/icons8-back-to-100.png"))); // NOI18N
        backbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backbtnMouseClicked(evt);
            }
        });
        jPanel1.add(backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 90, 70));

        nextBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pms/icons8-next-page-100.png"))); // NOI18N
        nextBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextBtnMouseClicked(evt);
            }
        });
        jPanel1.add(nextBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 220, 90, 70));
        jPanel1.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 770, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbtnMouseClicked
        new Thread();
        try {
            Thread.sleep(50);

        }catch(InterruptedException ex)
        {
            Logger.getLogger(slider.class.getName()).log(Level.SEVERE, null, ex);
        }
        //int p = this.label1.getX();

       /* if (p>-1)
        {
            Animacion.Animacion.mover_izquierda(900,100,1,2,label1);
        }
        position = position-1;
        if(position <0){
            position=0;
        }*/
        show(position);

    }//GEN-LAST:event_backbtnMouseClicked

    private void nextBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextBtnMouseClicked
        new Thread();
        try {
            Thread.sleep(40);

        }catch(InterruptedException ex)
        {
            Logger.getLogger(slider.class.getName()).log(Level.SEVERE, null, ex);
        }
        int p = this.label1.getX();

    /*   if (p>=1)
        {
            Animacion.Animacion.mover_izquierda(900,200,1,2,label1);
        }*/
        position = position+1;
        if(position >= takeimage().length){
            position=takeimage().length-1;
        }
        show(position);

    }//GEN-LAST:event_nextBtnMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
       System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseClicked
        new main().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuMouseClicked

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
            java.util.logging.Logger.getLogger(slider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(slider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(slider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(slider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new slider().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backbtn;
    private javax.swing.JLabel exit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel menu;
    private javax.swing.JLabel nextBtn;
    // End of variables declaration//GEN-END:variables
}
