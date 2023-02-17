package soundland;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class HiloCancionesNivelFacil extends Thread{
    private VentanaReproductor rep;
    private int pos;
    private JButton boton;

    public HiloCancionesNivelFacil(int pos) {
        rep=new VentanaReproductor();
        this.pos = pos;
        boton=new JButton();
    }
    
    @Override
    public void run(){
        try{
            switch(pos){
                case 0:
                    boton.setEnabled(false);
                    VentanaReproductor.zombie.setPos(1536000);
                    VentanaReproductor.zombie.continuar();
                    sleep(22500);
                    VentanaReproductor.zombie.Stop();
                    boton.setEnabled(true);
                break;
                
                case 1:
                    boton.setEnabled(false);
                    VentanaReproductor.woman.setPos(1296000);
                    VentanaReproductor.woman.continuar();
                    sleep(22000);
                    VentanaReproductor.woman.Stop();
                    boton.setEnabled(true);
                break;
                
                case 2:
                    boton.setEnabled(false);
                    VentanaReproductor.hey.setPos(648000);
                    VentanaReproductor.hey.continuar();
                    sleep(12100);
                    VentanaReproductor.hey.Stop();
                    boton.setEnabled(true);
                break;
                
                case 3:
                    boton.setEnabled(false);
                    VentanaReproductor.Play.setPos(324000);
                    VentanaReproductor.Play.continuar();
                    sleep(24000);
                    VentanaReproductor.Play.Stop();
                    boton.setEnabled(true);
                break;
                
                case 4:
                    boton.setEnabled(false);
                    VentanaReproductor.genius.setPos(405000);
                    VentanaReproductor.genius.continuar();
                    sleep(12150);
                    VentanaReproductor.genius.Stop();
                    boton.setEnabled(true);
                break;
                
                case 5:
                    boton.setEnabled(false);
                    VentanaReproductor.zombie.setPos(5216000);
                    VentanaReproductor.zombie.continuar();
                    sleep(12000);
                    VentanaReproductor.zombie.Stop();
                    boton.setEnabled(true);
                break;
                
                case 6:
                    boton.setEnabled(false);
                    VentanaReproductor.woman.setPos(4158000);
                    VentanaReproductor.woman.continuar();
                    sleep(22000);
                    VentanaReproductor.woman.Stop();
                    boton.setEnabled(true);
                break;
                
                case 7:
                    boton.setEnabled(false);
                    VentanaReproductor.hey.setPos(6114405);
                    VentanaReproductor.hey.continuar();
                    sleep(16000);
                    VentanaReproductor.hey.Stop();
                    boton.setEnabled(true);
                break;
                
                case 8:
                    boton.setEnabled(false);
                    VentanaReproductor.Play.setPos(5646858);
                    VentanaReproductor.Play.continuar();
                    sleep(11500);
                    VentanaReproductor.Play.Stop();
                    boton.setEnabled(true);
                break;
                
                case 9:
                    boton.setEnabled(false);
                    VentanaReproductor.genius.setPos(4353750);
                    VentanaReproductor.genius.continuar();
                    sleep(11000);
                    VentanaReproductor.genius.Stop();
                    boton.setEnabled(true);
                break;
            }
        }
        catch(InterruptedException e){
            JOptionPane.showMessageDialog(null,"Canción detenida inesperadamente");
        }
    }

    public void setBoton(JButton boton) {
        this.boton = boton;
    }
    
}
