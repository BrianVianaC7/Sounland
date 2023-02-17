package soundland;

import java.awt.Image;
import static java.lang.Thread.sleep;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class HiloImagen extends Thread{
    
    private JLabel lbFondo=new JLabel();
    
    @Override
    public void run(){
        for(int i=1; i<=9;i++){
            cargaImagenL("./src/Imagenes/"+i+".png");
            //cargaTiempo();//
                try{
                    sleep(4500);
                }
                catch(InterruptedException e){
                    JOptionPane.showMessageDialog(null,"Hilo "+getName()+" interrumpido :(");
                    break;
                }
                if(i==9){
                    i=0;
                }
            }
    }
    
    public void setTxt(JLabel lbFondo) {
        this.lbFondo = lbFondo;
    }
    
    
    
    public void cargaImagenL(String im){
        ImageIcon imagen; 
            imagen = new ImageIcon(im) ;
            Image imescala = imagen.getImage();
            imescala = imescala.getScaledInstance(lbFondo.getWidth() , lbFondo.getHeight(), Image.SCALE_DEFAULT);
            imagen = new ImageIcon(imescala);
            lbFondo.setIcon(imagen);
    }
    
}
    
