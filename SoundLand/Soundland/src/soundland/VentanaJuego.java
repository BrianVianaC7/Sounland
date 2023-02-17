
package soundland;

import BasesDatos.BuscarUsuarios;
import BasesDatos.IngresarPartidas;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import java.time.LocalDate;

public class VentanaJuego extends javax.swing.JFrame {

   private HiloImagen h;
   private Colores c1,c2;
   private HiloCronometro c;
   private HiloCancionesNivelFacil hCan;
   private HiloCancionesNivelDificil hCan1;
   private VentanaPrincipal v;
   private int posicion,cont,puntaje,C;
   private RespuestasNivelFacil f;
   private PreguntasNivelFacil fp;
   private RespuestasNivelDificil d;
   private PreguntasNivelDificil dp;
   public static boolean estado;
   private Object[] seleccion={"","","","","","","","","",""};
   private LocalDate fecha;
   private IngresarPartidas in;
   private BuscarUsuarios usuario,ID;
   private String dificultad;
   private VentanaTablaRondas tabla;
    
    public VentanaJuego() {
        initComponents();
        this.setLocationRelativeTo(null);
        h=new HiloImagen();
        estado=true;
        h.setTxt(lbFondo);
        h.start();
        c1=new Colores(); c2=new Colores();
        c1.setColor(jPanel1); c2.setColor(jPanel2);
        c1.start(); c2.start();
        lbPregunta.setVisible(false);
        lbR1.setVisible(false); lbR2.setVisible(false); lbR3.setVisible(false); lbR4.setVisible(false);
        f=new RespuestasNivelFacil();
        fp=new PreguntasNivelFacil();
        d=new RespuestasNivelDificil();
        dp=new PreguntasNivelDificil();
        c=new HiloCronometro();
        c.setLbTiempo(lbTiempo);
    }
    
    public void MusicaNivelFacil(int posicion){
        this.posicion=posicion;
        hCan=new HiloCancionesNivelFacil(posicion);
        hCan.setBoton(botonRepetir);
        hCan.start();
    }
    
    public void MusicaNivelDificil(int posicion){
        this.posicion=posicion;
        hCan1=new HiloCancionesNivelDificil(posicion);
        hCan1.setBoton(botonRepetir);
        hCan1.start();
    }
    
    public void NivelFacil(){
        lbPregunta.setText(fp.getPreguntas(posicion));
        String[] a=f.setRespuestas(posicion);
        GrupoRespuestas.clearSelection();
        lbR1.setText(a[0]); lbR2.setText(a[1]); lbR3.setText(a[2]); lbR4.setText(a[3]);
        lbR1.requestFocus();
    }
    
    public void NivelDificil(){
        lbPregunta.setText(dp.getPreguntas(posicion));
        String[] a=d.setRespuestas(posicion);
        GrupoRespuestas.clearSelection();
        lbR1.setText(a[0]); lbR2.setText(a[1]); lbR3.setText(a[2]); lbR4.setText(a[3]);
        lbR1.requestFocus();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoRespuestas = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botonNivelFacil = new javax.swing.JButton();
        botonNivelDificil = new javax.swing.JButton();
        botonInstrucciones = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lbR1 = new javax.swing.JRadioButton();
        lbR2 = new javax.swing.JRadioButton();
        lbR3 = new javax.swing.JRadioButton();
        lbR4 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        lbTiempo = new javax.swing.JLabel();
        botonRepetir = new javax.swing.JButton();
        botonFin = new javax.swing.JButton();
        botonSig = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lbPregunta = new javax.swing.JTextArea();
        botonAnt = new javax.swing.JButton();
        botonTablaPartidas = new javax.swing.JButton();
        botonRegresar = new javax.swing.JButton();
        lbFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SELECCIONA EL NIVEL DE DIFICULTAD DESEADO:");

        botonNivelFacil.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botonNivelFacil.setText("FÁCIL");
        botonNivelFacil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNivelFacilActionPerformed(evt);
            }
        });

        botonNivelDificil.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botonNivelDificil.setText("DIFÍCIL");
        botonNivelDificil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNivelDificilActionPerformed(evt);
            }
        });

        botonInstrucciones.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botonInstrucciones.setText("INSTRUCCIONES");
        botonInstrucciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInstruccionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonNivelFacil)
                .addGap(40, 40, 40)
                .addComponent(botonNivelDificil)
                .addGap(59, 59, 59))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(botonInstrucciones)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonNivelFacil)
                    .addComponent(botonNivelDificil))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonInstrucciones)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 300, 110));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lbR1.setBackground(new java.awt.Color(255, 255, 255));
        GrupoRespuestas.add(lbR1);
        lbR1.setText("jRadioButton6");
        lbR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbR1ActionPerformed(evt);
            }
        });

        lbR2.setBackground(new java.awt.Color(255, 255, 255));
        GrupoRespuestas.add(lbR2);
        lbR2.setText("jRadioButton7");
        lbR2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbR2ActionPerformed(evt);
            }
        });

        lbR3.setBackground(new java.awt.Color(255, 255, 255));
        GrupoRespuestas.add(lbR3);
        lbR3.setText("jRadioButton8");
        lbR3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbR3ActionPerformed(evt);
            }
        });

        lbR4.setBackground(new java.awt.Color(255, 255, 255));
        GrupoRespuestas.add(lbR4);
        lbR4.setText("jRadioButton9");
        lbR4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbR4ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Tiempo: ");

        lbTiempo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbTiempo.setText("00:00:00");

        botonRepetir.setText("REPRODUCIR CANCIÓN");
        botonRepetir.setEnabled(false);
        botonRepetir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRepetirActionPerformed(evt);
            }
        });

        botonFin.setText("Finalizar");
        botonFin.setEnabled(false);
        botonFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFinActionPerformed(evt);
            }
        });

        botonSig.setText("Siguiente");
        botonSig.setEnabled(false);
        botonSig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSigActionPerformed(evt);
            }
        });

        lbPregunta.setEditable(false);
        lbPregunta.setColumns(20);
        lbPregunta.setFont(new java.awt.Font("Monospaced", 1, 11)); // NOI18N
        lbPregunta.setRows(5);
        jScrollPane1.setViewportView(lbPregunta);

        botonAnt.setText("Anterior");
        botonAnt.setEnabled(false);
        botonAnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAntActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel2)
                        .addGap(27, 27, 27)
                        .addComponent(lbTiempo))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(botonAnt)
                        .addGap(18, 18, 18)
                        .addComponent(botonSig)
                        .addGap(18, 18, 18)
                        .addComponent(botonFin)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbR1)
                            .addComponent(lbR2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbR3)
                            .addComponent(lbR4))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(botonRepetir)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(botonRepetir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbR1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbR2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbR3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbR4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonFin)
                    .addComponent(botonSig)
                    .addComponent(botonAnt))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lbTiempo))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 460, 360));

        botonTablaPartidas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botonTablaPartidas.setText("VER PARTIDAS");
        botonTablaPartidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTablaPartidasActionPerformed(evt);
            }
        });
        getContentPane().add(botonTablaPartidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 120, -1));

        botonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha2.png"))); // NOI18N
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, -1, 40));
        getContentPane().add(lbFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        v=new VentanaPrincipal();
        this.setVisible(false);
        v.setVisible(true);
    }//GEN-LAST:event_botonRegresarActionPerformed

    private void botonNivelFacilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNivelFacilActionPerformed
        dificultad="Fácil";
        cont=1;
        lbPregunta.setVisible(true);
        lbR1.setVisible(true); lbR2.setVisible(true); lbR3.setVisible(true); lbR4.setVisible(true);
        botonRepetir.setEnabled(true); botonSig.setEnabled(true);
        //MusicaNivelFacil(posicion);
        c.start();
        NivelFacil();
        botonFin.setEnabled(false);
    }//GEN-LAST:event_botonNivelFacilActionPerformed

    private void botonSigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSigActionPerformed
        if(cont==1){
            C=0;
            botonRepetir.setText("REPRODUCIR CANCIÓN");
            try{
                if(posicion==8){
                    botonSig.setEnabled(false);
                    botonFin.setEnabled(true);
                }
                if(posicion<10){
                    posicion++;
                    botonAnt.setEnabled(true);
                    //MusicaNivelFacil(posicion);
                    NivelFacil();
                }
            }
            catch(ArrayIndexOutOfBoundsException e){
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(this, "Ya no hay preguntas");
            }
        }else{
            C=0;
            botonRepetir.setText("REPRODUCIR CANCIÓN");
            try{
                if(posicion==8){
                    botonSig.setEnabled(false);
                    botonFin.setEnabled(true);
                }
                if(posicion<10){
                    posicion++;
                    botonAnt.setEnabled(true);
                    //MusicaNivelFacil(posicion);
                    NivelDificil();
                }
            }
            catch(ArrayIndexOutOfBoundsException e){
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(this, "Ya no hay preguntas");
            }
        }
        
    }//GEN-LAST:event_botonSigActionPerformed

    private void botonFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFinActionPerformed
        puntaje=0;
        if(cont==1){
            for(int i=0;i<10;i++){
                if(seleccion[i].equals(f.getRespuestaC(i))){
                    puntaje=puntaje+100;
                }
            }
            c.interrupt();
            JOptionPane.showMessageDialog(this, "Obtuviste "+puntaje+" puntos");
            
        }else if(cont==2){
            for(int i=0;i<10;i++){
                if(seleccion[i].equals(d.getRespuestaC(i))){
                    puntaje=puntaje+100;
                }
            }
            c.interrupt();
            JOptionPane.showMessageDialog(this, "Obtuviste "+puntaje+" puntos");
        }
        
        fecha=LocalDate.now();
        String fechaString=fecha.toString();
        int min_val = 100;
        int max_val = 10000;
        int ID_partida = (int)(Math.random() * ( max_val - min_val ));
        in=new IngresarPartidas();
        in.Ingresar(Integer.parseInt(BuscarUsuarios.userID), String.valueOf(ID_partida), fechaString, 
                lbTiempo.getText(), puntaje,dificultad);
    }//GEN-LAST:event_botonFinActionPerformed

    private void lbR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbR1ActionPerformed
        seleccion[posicion]=lbR1.getText();
    }//GEN-LAST:event_lbR1ActionPerformed

    private void lbR2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbR2ActionPerformed
        seleccion[posicion]=lbR2.getText();
    }//GEN-LAST:event_lbR2ActionPerformed

    private void lbR3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbR3ActionPerformed
        seleccion[posicion]=lbR3.getText();
    }//GEN-LAST:event_lbR3ActionPerformed

    private void lbR4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbR4ActionPerformed
        seleccion[posicion]=lbR4.getText();
    }//GEN-LAST:event_lbR4ActionPerformed

    private void botonRepetirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRepetirActionPerformed
        C++;
        if(cont==1){
            MusicaNivelFacil(posicion);
            if(C>=1){
                botonRepetir.setText("REPETIR CANCIÓN");
            }
        }else{
            MusicaNivelDificil(posicion);
            if(C>=1){
                botonRepetir.setText("REPETIR CANCIÓN");
            }
        }
        
    }//GEN-LAST:event_botonRepetirActionPerformed

    private void botonAntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAntActionPerformed
        if(cont==1){
            C=0;
            botonRepetir.setText("REPRODUCIR CANCIÓN");
            if(posicion>-1){
                posicion--;
            }
            if(posicion==0){
                botonAnt.setEnabled(false);
            }
            if(posicion>-1){
                botonSig.setEnabled(true);
                NivelFacil();
            }else{
                Toolkit.getDefaultToolkit().beep();
            }
        }else if(cont==2){
            C=0;
            botonRepetir.setText("REPRODUCIR CANCIÓN");
            if(posicion>-1){
                posicion--;
            }
            if(posicion==0){
                botonAnt.setEnabled(false);
            }
            if(posicion>-1){
                botonSig.setEnabled(true);
                NivelDificil();
            }else{
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }//GEN-LAST:event_botonAntActionPerformed

    private void botonNivelDificilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNivelDificilActionPerformed
        dificultad="Dificil";
        cont=2;
        lbPregunta.setVisible(true);
        lbR1.setVisible(true); lbR2.setVisible(true); lbR3.setVisible(true); lbR4.setVisible(true);
        botonRepetir.setEnabled(true); botonSig.setEnabled(true);
        //MusicaNivelFacil(posicion);
        c.start();
        NivelDificil();
        botonFin.setEnabled(false);
    }//GEN-LAST:event_botonNivelDificilActionPerformed

    private void botonTablaPartidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTablaPartidasActionPerformed
        tabla=new VentanaTablaRondas();
        tabla.setVisible(true);
    }//GEN-LAST:event_botonTablaPartidasActionPerformed

    private void botonInstruccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInstruccionesActionPerformed
        JOptionPane.showMessageDialog(this, "                                              \"SOUNDLAND\"\n"
            +"Mini juego interactivo en el cual podrás"
            + " practicar tu vocabulario de Inglés\nmendiante las diferentes canciones que contiene Soundland. "
            + "Tendrás que\nseleccionar la opción que creas correspondiente de acuerdo a lo que dice\nla canción."
            + "El mini juego cuenta con dos niveles de dificultad: \"Fácil\" y \"Dificil\".\nCada nivel tiene 5 canciones repartidas en 10 preguntas.\n\n"
            + "                                            \"IMPORTANTE\"\n"
            + "- Por cada pregunta se reproducirá un fragmento de cada canción.\n"
            + "- Por cada respuesta correcta, tendrás 100 puntos.\n"
            + "- Todos los puntos acumulados se guardarán en un registro.\n"
            + "- Se guardará un registro del tiempo empleado y el nivel de dificultad jugado.\n\n");
    }//GEN-LAST:event_botonInstruccionesActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaJuego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoRespuestas;
    private javax.swing.JButton botonAnt;
    private javax.swing.JButton botonFin;
    private javax.swing.JButton botonInstrucciones;
    private javax.swing.JButton botonNivelDificil;
    private javax.swing.JButton botonNivelFacil;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JButton botonRepetir;
    private javax.swing.JButton botonSig;
    private javax.swing.JButton botonTablaPartidas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbFondo;
    private javax.swing.JTextArea lbPregunta;
    private javax.swing.JRadioButton lbR1;
    private javax.swing.JRadioButton lbR2;
    private javax.swing.JRadioButton lbR3;
    private javax.swing.JRadioButton lbR4;
    private javax.swing.JLabel lbTiempo;
    // End of variables declaration//GEN-END:variables
}
