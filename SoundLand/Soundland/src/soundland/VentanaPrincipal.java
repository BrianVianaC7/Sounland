package soundland;

import BasesDatos.BuscarUsuarios;
import BasesDatos.EscritorioPrincipal;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * @author Equipo 3
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    
    private BuscarUsuarios usuario,ID;
    private EscritorioPrincipal e;
    private VentanaReproductor vr;
    private VentanaJuego juego;
    
    public VentanaPrincipal() {
        initComponents();
         this.setLocationRelativeTo(null);
         //setExtendedState(MAXIMIZED_BOTH);
         this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         CargaFondo();
         usuario=new BuscarUsuarios();
         ID=new BuscarUsuarios();
         e=new EscritorioPrincipal();
        lbUsuario.setText(BuscarUsuarios.user);
    }

    private void CargaFondo(){
         ImageIcon imagen; //sabe leer de archivo y se muestra en un label
        imagen = new ImageIcon("./src/Imagenes/fondo2.png") ;
        Image imescala = imagen.getImage();
        imescala = imescala.getScaledInstance(lbFondo.getWidth() , lbFondo.getHeight(), Image.SCALE_DEFAULT);
        imagen = new ImageIcon(imescala);
        lbFondo.setIcon(imagen);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbUsuario = new javax.swing.JLabel();
        BotonCreditos = new javax.swing.JButton();
        BotonSalir = new javax.swing.JButton();
        botonJuego = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        botonReproductor = new javax.swing.JButton();
        lbFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("USER:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, -1, -1));

        lbUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 130, 40));

        BotonCreditos.setBackground(new java.awt.Color(153, 255, 153));
        BotonCreditos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BotonCreditos.setText("Créditos");
        BotonCreditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCreditosActionPerformed(evt);
            }
        });
        jPanel1.add(BotonCreditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, -1, -1));

        BotonSalir.setBackground(new java.awt.Color(255, 51, 51));
        BotonSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BotonSalir.setForeground(new java.awt.Color(255, 255, 255));
        BotonSalir.setText("CERRAR SESIÓN");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });
        jPanel1.add(BotonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        botonJuego.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botonJuego.setText("MiniJuego");
        botonJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonJuegoActionPerformed(evt);
            }
        });
        jPanel1.add(botonJuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 170, 70));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        Titulo.setFont(new java.awt.Font("Alien Encounters", 1, 52)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("SOUNDLAND");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 360, 50));

        botonReproductor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botonReproductor.setText("Reproductor");
        botonReproductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReproductorActionPerformed(evt);
            }
        });
        jPanel1.add(botonReproductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 170, 70));
        jPanel1.add(lbFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonCreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCreditosActionPerformed
        JOptionPane.showMessageDialog(null,"AUTORES:\nIsrael E. Gutiérrez Rabelo, Brian A. Viana Clavijo,\n"
            +"Daniela M. Jiménez Aguilar, Ana E. Ortiz Salinas.\n\nSOUNDLAND\nEs un proyecto enfocado al reforzamiento"+
            " del idioma 'Ingles' \npor medio de una lista de canciones preestablecidas en un \nreproductor digital."
            + "con el fin de estimular la comprensión auditiva\ny practicar el vocabulario de dicho idioma.\n\n"+
            "INSTITUCIÓN\nUniversidad del Valle de México Campus Coyoacán\n                                 UVM");
    }//GEN-LAST:event_BotonCreditosActionPerformed

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        int desicion=JOptionPane.showConfirmDialog(null, "¿Estás seguro de cerrar la sesión?", 
                "Desición",JOptionPane.YES_NO_OPTION);
        if(desicion==JOptionPane.YES_OPTION){
        this.setVisible(false);
        e.setVisible(true);
        }
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void botonReproductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReproductorActionPerformed
        vr=new VentanaReproductor();
        this.setVisible(false);
        vr.setVisible(true);
    }//GEN-LAST:event_botonReproductorActionPerformed

    private void botonJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonJuegoActionPerformed
        juego=new VentanaJuego();
        this.setVisible(false);
        juego.setVisible(true);
    }//GEN-LAST:event_botonJuegoActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCreditos;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton botonJuego;
    private javax.swing.JButton botonReproductor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbFondo;
    private javax.swing.JLabel lbUsuario;
    // End of variables declaration//GEN-END:variables
}
