package soundland;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class HiloCancionesNivelDificil extends Thread{
    private VentanaReproductor rep;
    private int pos;
    private JButton boton;

    public HiloCancionesNivelDificil(int pos) {
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
                    VentanaReproductor.fat.setPos(1376021);
                    VentanaReproductor.fat.continuar();
                    sleep(10150);
                    VentanaReproductor.fat.Stop();
                    boton.setEnabled(true);
                break;
                
                case 1:
                    boton.setEnabled(false);
                    VentanaReproductor.dynamite.setPos(0);
                    VentanaReproductor.dynamite.continuar();
                    sleep(17000);
                    VentanaReproductor.dynamite.Stop();
                    boton.setEnabled(true);
                break;
                
                case 2:
                    boton.setEnabled(false);
                    VentanaReproductor.blood.setPos(711735);
                    VentanaReproductor.blood.continuar();
                    sleep(19000);
                    VentanaReproductor.blood.Stop();
                    boton.setEnabled(true);
                break;
                
                case 3:
                    boton.setEnabled(false);
                    VentanaReproductor.fat.setPos(3392604);
                    VentanaReproductor.fat.continuar();
                    sleep(9500);
                    VentanaReproductor.fat.Stop();
                    boton.setEnabled(true);
                break;
                
                case 4:
                    boton.setEnabled(false);
                    VentanaReproductor.dynamite.setPos(2859481);
                    VentanaReproductor.dynamite.continuar();
                    sleep(12500);
                    VentanaReproductor.dynamite.Stop();
                    boton.setEnabled(true);
                break;
                
                case 5:
                    boton.setEnabled(false);
                    VentanaReproductor.blood.setPos(0);
                    VentanaReproductor.blood.continuar();
                    sleep(14000);
                    VentanaReproductor.blood.Stop();
                    boton.setEnabled(true);
                break;
                
                case 6:
                    boton.setEnabled(false);
                    VentanaReproductor.what.setPos(1114713);
                    VentanaReproductor.what.continuar();
                    sleep(13000);
                    VentanaReproductor.what.Stop();
                    boton.setEnabled(true);
                break;
                
                case 7:
                    boton.setEnabled(false);
                    VentanaReproductor.let.setPos(1290110);
                    VentanaReproductor.let.continuar();
                    sleep(14000);
                    VentanaReproductor.let.Stop();
                    boton.setEnabled(true);
                break;
                
                case 8:
                    boton.setEnabled(false);
                    VentanaReproductor.what.setPos(4604248);
                    VentanaReproductor.what.continuar();
                    sleep(10500);
                    VentanaReproductor.what.Stop();
                    boton.setEnabled(true);
                break;
                
                case 9:
                    boton.setEnabled(false);
                    VentanaReproductor.let.setPos(7439496);
                    VentanaReproductor.let.continuar();
                    sleep(8100);
                    VentanaReproductor.let.Stop();
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
