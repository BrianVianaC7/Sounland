package soundland;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class VentanaReproductor extends javax.swing.JFrame {

    public static Musica zombie,woman,fat,what,dynamite,let,hey,Play,genius,blood;
    private int opc;
    private HiloImagen h;
    private VentanaPrincipal v;
    
    public VentanaReproductor() {
        initComponents();
        this.setLocationRelativeTo(null);
        zombie=new Musica("./src/Musica/Zombie.wav"); //facil
        woman=new Musica("./src/Musica/29 - Woman (Ultimate Mix).wav"); //facil
        fat=new Musica("./src/Musica/fat-lip.wav"); //dificil
        what=new Musica("./src/Musica/blink-182-whats-my-age-again.wav"); //dificil
        dynamite=new Musica("./src/Musica/bts-dynamite-official-audio.wav"); //dificil
        let=new Musica("./src/Musica/ariana-grande-let-me-love-you.wav"); //dificil
        hey=new Musica("./src/Musica/hey.wav"); //facil
        Play=new Musica("./src/Musica/play-with-fire-feat-yacht-money.wav"); //facil
        genius=new Musica("./src/Musica/lsd-genius.wav"); //facil
        blood=new Musica("./src/Musica/grandson-blood-water-official-audio.wav"); //dificil
        h=new HiloImagen();
        h.setTxt(lbFondo);
        h.start();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        botonStop = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        PlayList = new javax.swing.JList<>();
        BotonPlay = new javax.swing.JButton();
        BotonPause = new javax.swing.JButton();
        botonRegresar = new javax.swing.JButton();
        lbFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonStop.setBackground(new java.awt.Color(0, 0, 0));
        botonStop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/stop.png"))); // NOI18N
        botonStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonStopActionPerformed(evt);
            }
        });
        jPanel2.add(botonStop, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 70, 70));

        PlayList.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        PlayList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Fat Lip - Sum 41", "Zombie - The Cranberries", "What's My Age Again? - Blink 182", "Woman - John Lennon", "Dynamite - BTS", "Let Me Love You - Ariana Grande", "Hey - Pixies", "Play with Fire - Sam Tinnes", "Genius - LSD", "Blood Water-Grandson" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        PlayList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PlayListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(PlayList);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 220, 200));

        BotonPlay.setBackground(new java.awt.Color(0, 0, 0));
        BotonPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/play.png"))); // NOI18N
        BotonPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPlayActionPerformed(evt);
            }
        });
        jPanel2.add(BotonPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 80, 70));

        BotonPause.setBackground(new java.awt.Color(0, 0, 0));
        BotonPause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pause.png"))); // NOI18N
        BotonPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPauseActionPerformed(evt);
            }
        });
        jPanel2.add(BotonPause, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 70, 70));

        botonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha2.png"))); // NOI18N
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });
        jPanel2.add(botonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, 40));
        jPanel2.add(lbFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 380));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPauseActionPerformed
       opc=PlayList.getSelectedIndex();
        switch(opc){
            case 0:
                fat.pause(); zombie.Stop(); what.Stop(); woman.Stop(); dynamite.Stop();
                let.Stop(); hey.Stop(); Play.Stop(); genius.Stop(); blood.Stop();
            break;
            
            case 1:
                fat.Stop(); zombie.pause(); what.Stop(); woman.Stop(); dynamite.Stop();
                let.Stop(); hey.Stop(); Play.Stop(); genius.Stop(); blood.Stop();
            break;
            
            case 2:
                fat.Stop(); zombie.Stop(); what.pause(); woman.Stop(); dynamite.Stop();
                let.Stop(); hey.Stop(); Play.Stop(); genius.Stop(); blood.Stop();
            break;
            
            case 3:
                fat.Stop(); zombie.Stop(); what.Stop(); woman.pause(); dynamite.Stop();
                let.Stop(); hey.Stop(); Play.Stop(); genius.Stop(); blood.Stop();
            break;
            
            case 4:
                fat.Stop(); zombie.Stop(); what.Stop(); woman.Stop(); dynamite.pause();
                let.Stop(); hey.Stop(); Play.Stop(); genius.Stop(); blood.Stop();
            break;
            
            case 5:
                fat.Stop(); zombie.Stop(); what.Stop(); woman.Stop(); dynamite.Stop();
                let.pause(); hey.Stop(); Play.Stop(); genius.Stop(); blood.Stop();
            break;
            
            case 6:
                fat.Stop(); zombie.Stop(); what.Stop(); woman.Stop(); dynamite.Stop();
                let.Stop(); hey.pause(); Play.Stop(); genius.Stop(); blood.Stop();
            break;
            
            case 7:
                fat.Stop(); zombie.Stop(); what.Stop(); woman.Stop(); dynamite.Stop();
                let.Stop(); hey.Stop(); Play.pause(); genius.Stop(); blood.Stop();
            break;
            
            case 8:
                fat.Stop(); zombie.Stop(); what.Stop(); woman.Stop(); dynamite.Stop();
                let.Stop(); hey.Stop(); Play.Stop(); genius.pause(); blood.Stop();
            break;
            
            case 9:
                fat.Stop(); zombie.Stop(); what.Stop(); woman.Stop(); dynamite.Stop();
                let.Stop(); hey.Stop(); Play.Stop(); genius.Stop(); blood.pause();
            break;
        }
    }//GEN-LAST:event_BotonPauseActionPerformed

    private void BotonPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPlayActionPerformed
        opc=PlayList.getSelectedIndex();
        switch(opc){
            case 0:
                fat.continuar(); zombie.Stop(); what.Stop(); woman.Stop(); dynamite.Stop();
                let.Stop(); hey.Stop(); Play.Stop(); genius.Stop(); blood.Stop();
            break;
            
            case 1:
                fat.Stop(); zombie.continuar(); what.Stop(); woman.Stop(); dynamite.Stop();
                let.Stop(); hey.Stop(); Play.Stop(); genius.Stop(); blood.Stop();
            break;
            
            case 2:
                fat.Stop(); zombie.Stop(); what.continuar(); woman.Stop(); dynamite.Stop();
                let.Stop(); hey.Stop(); Play.Stop(); genius.Stop(); blood.Stop();
            break;
            
            case 3:
                fat.Stop(); zombie.Stop(); what.Stop(); woman.continuar(); dynamite.Stop();
                let.Stop(); hey.Stop(); Play.Stop(); genius.Stop(); blood.Stop();
            break;
            
            case 4:
                fat.Stop(); zombie.Stop(); what.Stop(); woman.Stop(); dynamite.continuar();
                let.Stop(); hey.Stop(); Play.Stop(); genius.Stop(); blood.Stop();
            break;
            
            case 5:
                fat.Stop(); zombie.Stop(); what.Stop(); woman.Stop(); dynamite.Stop();
                let.continuar(); hey.Stop(); Play.Stop(); genius.Stop(); blood.Stop();
            break;
            
            case 6:
                fat.Stop(); zombie.Stop(); what.Stop(); woman.Stop(); dynamite.Stop();
                let.Stop(); hey.continuar(); Play.Stop(); genius.Stop(); blood.Stop();
            break;
            
            case 7:
                fat.Stop(); zombie.Stop(); what.Stop(); woman.Stop(); dynamite.Stop();
                let.Stop(); hey.Stop(); Play.continuar(); genius.Stop(); blood.Stop();
            break;
            
            case 8:
                fat.Stop(); zombie.Stop(); what.Stop(); woman.Stop(); dynamite.Stop();
                let.Stop(); hey.Stop(); Play.Stop(); genius.continuar(); blood.Stop();
            break;
            
            case 9:
                fat.Stop(); zombie.Stop(); what.Stop(); woman.Stop(); dynamite.Stop();
                let.Stop(); hey.Stop(); Play.Stop(); genius.Stop(); blood.continuar();
            break;
        }
    }//GEN-LAST:event_BotonPlayActionPerformed

    private void botonStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonStopActionPerformed
        opc=PlayList.getSelectedIndex();
        switch(opc){
            case 0:
                fat.Stop(); zombie.Stop(); what.Stop(); woman.Stop(); dynamite.Stop();
                let.Stop(); hey.Stop(); Play.Stop(); genius.Stop(); blood.Stop();
                fat.setPos(0);
            break;
            
            case 1:
                fat.Stop(); zombie.Stop(); what.Stop(); woman.Stop(); dynamite.Stop();
                let.Stop(); hey.Stop(); Play.Stop(); genius.Stop(); blood.Stop();
                zombie.setPos(0);
            break;
            
            case 2:
                fat.Stop(); zombie.Stop(); what.Stop(); woman.Stop(); dynamite.Stop();
                let.Stop(); hey.Stop(); Play.Stop(); genius.Stop(); blood.Stop();
                what.setPos(0);
            break;
            
            case 3:
                fat.Stop(); zombie.Stop(); what.Stop(); woman.Stop(); dynamite.Stop();
                let.Stop(); hey.Stop(); Play.Stop(); genius.Stop(); blood.Stop();
                woman.setPos(0);
            break;
            
            case 4:
                fat.Stop(); zombie.Stop(); what.Stop(); woman.Stop(); dynamite.Stop();
                let.Stop(); hey.Stop(); Play.Stop(); genius.Stop(); blood.Stop();
                dynamite.setPos(0);
            break;
            
            case 5:
                fat.Stop(); zombie.Stop(); what.Stop(); woman.Stop(); dynamite.Stop();
                let.Stop(); hey.Stop(); Play.Stop(); genius.Stop(); blood.Stop();
                let.setPos(0);
            break;
            
            case 6:
                fat.Stop(); zombie.Stop(); what.Stop(); woman.Stop(); dynamite.Stop();
                let.Stop(); hey.Stop(); Play.Stop(); genius.Stop(); blood.Stop();
                hey.setPos(0);
            break;
            
            case 7:
                fat.Stop(); zombie.Stop(); what.Stop(); woman.Stop(); dynamite.Stop();
                let.Stop(); hey.Stop(); Play.Stop(); genius.Stop(); blood.Stop();
                Play.setPos(0);
            break;
            
            case 8:
                fat.Stop(); zombie.Stop(); what.Stop(); woman.Stop(); dynamite.Stop();
                let.Stop(); hey.Stop(); Play.Stop(); genius.Stop(); blood.Stop();
                genius.setPos(0);
            break;
            
            case 9:
                fat.Stop(); zombie.Stop(); what.Stop(); woman.Stop(); dynamite.Stop();
                let.Stop(); hey.Stop(); Play.Stop(); genius.Stop(); blood.Stop();
                blood.setPos(0);
            break;
        }
    }//GEN-LAST:event_botonStopActionPerformed

    private void PlayListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlayListMouseClicked
        opc=PlayList.getSelectedIndex();
        switch(opc){
            case 0:
                fat.play(); zombie.Stop(); what.Stop(); woman.Stop(); dynamite.Stop();
                let.Stop(); hey.Stop(); Play.Stop(); genius.Stop(); blood.Stop();
            break;
            
            case 1:
                fat.Stop(); zombie.play(); what.Stop(); woman.Stop(); dynamite.Stop();
                let.Stop(); hey.Stop(); Play.Stop(); genius.Stop(); blood.Stop();
            break;
            
            case 2:
                fat.Stop(); zombie.Stop(); what.play(); woman.Stop(); dynamite.Stop();
                let.Stop(); hey.Stop(); Play.Stop(); genius.Stop(); blood.Stop();
            break;
            
            case 3:
                fat.Stop(); zombie.Stop(); what.Stop(); woman.play(); dynamite.Stop();
                let.Stop(); hey.Stop(); Play.Stop(); genius.Stop(); blood.Stop();
            break;
            
            case 4:
                fat.Stop(); zombie.Stop(); what.Stop(); woman.Stop(); dynamite.play();
                let.Stop(); hey.Stop(); Play.Stop(); genius.Stop(); blood.Stop();
            break;
            
            case 5:
                fat.Stop(); zombie.Stop(); what.Stop(); woman.Stop(); dynamite.Stop();
                let.play(); hey.Stop(); Play.Stop(); genius.Stop(); blood.Stop();
            break;
            
            case 6:
                fat.Stop(); zombie.Stop(); what.Stop(); woman.Stop(); dynamite.Stop();
                let.Stop(); hey.play(); Play.Stop(); genius.Stop(); blood.Stop();
            break;
            
            case 7:
                fat.Stop(); zombie.Stop(); what.Stop(); woman.Stop(); dynamite.Stop();
                let.Stop(); hey.Stop(); Play.play(); genius.Stop(); blood.Stop();
            break;
            
            case 8:
                fat.Stop(); zombie.Stop(); what.Stop(); woman.Stop(); dynamite.Stop();
                let.Stop(); hey.Stop(); Play.Stop(); genius.play(); blood.Stop();
            break;
            
            case 9:
                fat.Stop(); zombie.Stop(); what.Stop(); woman.Stop(); dynamite.Stop();
                let.Stop(); hey.Stop(); Play.Stop(); genius.Stop(); blood.play();
            break;
        }
    }//GEN-LAST:event_PlayListMouseClicked

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        v=new VentanaPrincipal();
        this.setVisible(false);
        fat.Stop(); zombie.Stop(); what.Stop(); woman.Stop(); dynamite.Stop();
        let.Stop(); hey.Stop(); Play.Stop(); genius.Stop(); blood.Stop();
        v.setVisible(true);
    }//GEN-LAST:event_botonRegresarActionPerformed

    
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
        getImage(ClassLoader.getSystemResource("Imagenes/logo.png"));
        return retValue;
}
    
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
            java.util.logging.Logger.getLogger(VentanaReproductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaReproductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaReproductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaReproductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaReproductor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonPause;
    private javax.swing.JButton BotonPlay;
    private javax.swing.JList<String> PlayList;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JButton botonStop;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbFondo;
    // End of variables declaration//GEN-END:variables
}
