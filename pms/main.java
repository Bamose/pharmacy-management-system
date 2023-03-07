package pms;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import java.io.IOException;
import javax.swing.ImageIcon;


/**
 *
 * @author Anella
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public main() {
        initComponents();
        scaleImage();
    }

   public void scaleImage(){
      ImageIcon icon =new ImageIcon("C:\\Users\\Anella\\Downloads\\the-lore-com-rRBtKW_aw_U-unsplash.jpg");
      //scaling image til fit in jtable
      Image img = icon.getImage();
      Image imgScale = img.getScaledInstance(label1.getWidth(),label1.getHeight(),Image.SCALE_SMOOTH);
      ImageIcon scaledIcon = new ImageIcon(imgScale);
      label1.setIcon(scaledIcon);
       
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exi = new javax.swing.JLabel();
        comp = new javax.swing.JLabel();
        agent = new javax.swing.JLabel();
        zewd = new javax.swing.JLabel();
        devs = new javax.swing.JLabel();
        sellbtn = new javax.swing.JLabel();
        menu = new javax.swing.JLabel();
        med = new javax.swing.JLabel();
        galleryz = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pms/icons8-emergency-exit-50.png"))); // NOI18N
        exi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exiMouseClicked(evt);
            }
        });
        getContentPane().add(exi, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 50, 50));

        comp.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        comp.setText("Company");
        comp.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        comp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                compMouseClicked(evt);
            }
        });
        getContentPane().add(comp, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, 150, 30));

        agent.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        agent.setText("Agent");
        agent.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        agent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agentMouseClicked(evt);
            }
        });
        getContentPane().add(agent, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 150, -1));

        zewd.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        zewd.setText("Zewd Gallery");
        zewd.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        zewd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                zewdMouseClicked(evt);
            }
        });
        getContentPane().add(zewd, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, -1, -1));

        devs.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        devs.setText("Developed By");
        devs.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        devs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                devsMouseClicked(evt);
            }
        });
        getContentPane().add(devs, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 380, -1, -1));

        sellbtn.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        sellbtn.setText("Sellings");
        sellbtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sellbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sellbtnMouseClicked(evt);
            }
        });
        getContentPane().add(sellbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 150, -1));

        menu.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        menu.setText("Main Menu");
        menu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuMouseClicked(evt);
            }
        });
        getContentPane().add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 130, 30));

        med.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        med.setText("Medicine");
        med.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        med.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                medMouseClicked(evt);
            }
        });
        getContentPane().add(med, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 150, -1));

        galleryz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pms/zewd.png"))); // NOI18N
        galleryz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                galleryzMouseClicked(evt);
            }
        });
        getContentPane().add(galleryz, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 200, 140));
        getContentPane().add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseClicked
         new main().setVisible(true);
         this.dispose();
    }//GEN-LAST:event_menuMouseClicked

    private void medMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medMouseClicked
         new Medicine().setVisible(true);
         this.dispose();
    }//GEN-LAST:event_medMouseClicked

    private void compMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_compMouseClicked
         new manufacturer().setVisible(true);
         this.dispose();
    }//GEN-LAST:event_compMouseClicked

    private void agentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agentMouseClicked
         new agent().setVisible(true);
         this.dispose();
    }//GEN-LAST:event_agentMouseClicked

    private void zewdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zewdMouseClicked
        new slider().setVisible(true);
         this.dispose();
    }//GEN-LAST:event_zewdMouseClicked

    private void devsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_devsMouseClicked
         new DevsID().setVisible(true);
         this.dispose();
    }//GEN-LAST:event_devsMouseClicked

    private void sellbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtnMouseClicked
         new selling().setVisible(true);
         this.dispose();
    }//GEN-LAST:event_sellbtnMouseClicked

    private void exiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exiMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exiMouseClicked

    private void galleryzMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_galleryzMouseClicked
         new slider().setVisible(true);
         this.dispose();
    }//GEN-LAST:event_galleryzMouseClicked

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel agent;
    private javax.swing.JLabel comp;
    private javax.swing.JLabel devs;
    private javax.swing.JLabel exi;
    private javax.swing.JLabel galleryz;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel med;
    private javax.swing.JLabel menu;
    private javax.swing.JLabel sellbtn;
    private javax.swing.JLabel zewd;
    // End of variables declaration//GEN-END:variables
}
