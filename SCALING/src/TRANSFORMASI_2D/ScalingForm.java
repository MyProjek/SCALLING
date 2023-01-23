package TRANSFORMASI_2D;

/**
 * @author AISYAH
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ScalingForm extends javax.swing.JFrame {

    int width = 800;
    int height = 600;
    int x0 = width/2;
    int y0 = height/2;
    Graphics g;
    double pX, pY, sx, sy, stepSx, stepSy;
    int l, t, lAwal, tAwal;
    double[][] oBy = new double[4][2];
    double[][] sC = new double[4][4];
    
    public ScalingForm() {
        initComponents();
        setSize(width, height);
        setLocationRelativeTo(null);
        setTitle("MODUL PRAKTIKUM SCALING");
        jPanel1.setBackground(Color.lightGray);
    }

    @Override
    public void paint(Graphics grphcs) {
        super.paint(grphcs); //To change body of generated methods, choose Tools | Templates.
        g = (Graphics) jPanel1.getGraphics();
        g.drawString("Sumbu X", 2 * x0 - 55, y0 + 15);
        g.drawString("Sumbu Y", x0 + 5, y0 +15);
        g.drawString("(0,0)", x0 -10, y0 + 15);
        g.setColor(Color.red);
        g.drawLine(0, y0, width, y0);
        g.setColor(Color.blue);
        g.drawLine(x0,0, x0, height);
    }
    
    public double[][] Objek2D(double[][] oBy){
        pX = Double.parseDouble(Nilaipx.getText());
        pY = Double.parseDouble(Nilaipy.getText());
        oBy[1][1] = pX;
        oBy[2][1] = pY;
        oBy[3][1] = 1;
        this.oBy = oBy;
        return oBy; 
    }
    
    public void GambarAwal2D(){
        g = (Graphics) jPanel1.getGraphics();
        pX = Double.parseDouble(Nilaipx.getText());
        pY = Double.parseDouble(Nilaipy.getText());
        l = Integer.parseInt(NilaiL.getText());
        t = Integer.parseInt(NilaiT.getText());
        g.drawRect((int) (x0+pX), (int) (y0-pY), l, t);
        
    }
    
    public void GambarObjek2D(){
        g.drawRect((int) (x0+oBy[1][1]), (int) (y0-oBy[2][1]), l, t);
    }
    
    public double[][] MtrkTransforOby2D(double[][] oBy, double[][] tR){
        double[][] hasil = new double[4][2];
        for (int i = 1; i <= 3; i++){
            hasil[i][1]=0;
            for (int j = 1; j <= 3; j++){
                hasil[i][1] += tR[i][j] * oBy[j][1];
            }
        }
        this.oBy = hasil;
        return this.oBy;
    }
    
    public double[][] MtrkScaling2D(double[][] sC, double sx, double sy){
        sC[1][1] = sx;
        sC[1][2] = 0;
        sC[1][3] = 0;
        sC[2][1] = 0;
        sC[2][2] = sy;
        sC[2][3] = 0;
        sC[3][1] = 0;
        sC[3][2] = 0;
        sC[3][3] = 1;
        return this.sC;
    }

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Nilaipx = new javax.swing.JTextField();
        Nilaipy = new javax.swing.JTextField();
        NilaiL = new javax.swing.JTextField();
        NilaiT = new javax.swing.JTextField();
        Nilaisx = new javax.swing.JTextField();
        Nilaisy = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Objek_Awal = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        Scaling_Cepat = new javax.swing.JMenuItem();
        Scaling_Lambat = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        Reset = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        Exit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Kordinat px, py");

        jLabel2.setText("Ukuran L, T");

        jLabel3.setText("Scaling sx,sy");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Nilaipx, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Nilaipy, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Nilaisx, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NilaiL, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NilaiT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Nilaisy, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(483, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Nilaipx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nilaipy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(NilaiL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NilaiT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Nilaisx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nilaisy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(365, Short.MAX_VALUE))
        );

        jMenu1.setText("Obyek Awal");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        Objek_Awal.setText("Kotak Kosong");
        Objek_Awal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Objek_AwalActionPerformed(evt);
            }
        });
        jMenu1.add(Objek_Awal);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Scaling");

        Scaling_Cepat.setText("Scaling Cepat");
        Scaling_Cepat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Scaling_CepatActionPerformed(evt);
            }
        });
        jMenu2.add(Scaling_Cepat);

        Scaling_Lambat.setText("Scaling Lambat");
        Scaling_Lambat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Scaling_LambatActionPerformed(evt);
            }
        });
        jMenu2.add(Scaling_Lambat);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Reset");

        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });
        jMenu3.add(Reset);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Exit");

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jMenu4.add(Exit);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Objek_AwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Objek_AwalActionPerformed
        // TODO add your handling code here:
        GambarAwal2D();
    }//GEN-LAST:event_Objek_AwalActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        // TODO add your handling code here:
        repaint();
        Nilaipx.setText(null);
        Nilaipy.setText(null);
        NilaiL.setText(null);
        NilaiT.setText(null);
        Nilaisx.setText(null);
        Nilaisy.setText(null);
    }//GEN-LAST:event_ResetActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_ExitActionPerformed

    private void Scaling_CepatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Scaling_CepatActionPerformed
        // TODO add your handling code here:
        g = (Graphics) jPanel1.getGraphics();
        g.setColor(Color.red);
        l = Integer.parseInt(NilaiL.getText());
        t = Integer.parseInt(NilaiT.getText());
        sx = Double.parseDouble(Nilaisx.getText());
        sy = Double.parseDouble(Nilaisy.getText());
        Objek2D(oBy);
        MtrkScaling2D(sC, sx, sy);
        MtrkTransforOby2D(oBy, sC);
        l = (int) (sx * l);
        t = (int) (sy * t);
        GambarObjek2D();
        GambarAwal2D();
    }//GEN-LAST:event_Scaling_CepatActionPerformed

    private void Scaling_LambatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Scaling_LambatActionPerformed
        // TODO add your handling code here:
        g = (Graphics) jPanel1.getGraphics();
        g.setColor(Color.red);
        l = Integer.parseInt(NilaiL.getText());
        t = Integer.parseInt(NilaiT.getText());
        sx = Double.parseDouble(Nilaisx.getText());
        sy = Double.parseDouble(Nilaisy.getText());
        Objek2D(oBy);
        lAwal =l;tAwal =t;
        double[][] oByAwal = oBy;
        stepSx = sx / Math.abs(sx);stepSy = sy / Math.abs(sy);
        while (Math.abs(stepSx) <= Math.abs(sx)) {
            stepSx += (sx - 1) / 50;
            stepSy += (sy - 1) / 50;
            oBy = oByAwal;
            MtrkScaling2D(sC, stepSx, stepSy);
            MtrkTransforOby2D(oBy, sC);
            g.setColor(Color.red);
            l = (int) (stepSx * l);
            t = (int) (stepSy * t);
            GambarObjek2D();
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(ScalingForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            g.setColor(Color.white);
            GambarObjek2D();
        }
        g.setColor(Color.red);
        GambarObjek2D();
        GambarAwal2D();
    }//GEN-LAST:event_Scaling_LambatActionPerformed

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
            java.util.logging.Logger.getLogger(ScalingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScalingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScalingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScalingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScalingForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Exit;
    private javax.swing.JTextField NilaiL;
    private javax.swing.JTextField NilaiT;
    private javax.swing.JTextField Nilaipx;
    private javax.swing.JTextField Nilaipy;
    private javax.swing.JTextField Nilaisx;
    private javax.swing.JTextField Nilaisy;
    private javax.swing.JMenuItem Objek_Awal;
    private javax.swing.JMenuItem Reset;
    private javax.swing.JMenuItem Scaling_Cepat;
    private javax.swing.JMenuItem Scaling_Lambat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
