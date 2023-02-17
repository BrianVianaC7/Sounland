package soundland;

import static java.lang.Thread.sleep;
import java.text.DecimalFormat;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class HiloCronometro extends Thread{
    private JLabel lbTiempo=new JLabel();
    private int mil,seg,min,ho;
    private DecimalFormat f;
    
    @Override
    public void run(){
        for(;;){
            if(VentanaJuego.estado==true){
                try{
                    mil=1000;
                    f=new DecimalFormat("00");
                    sleep(mil);
                    if(mil>=1000){
                        mil=0;
                        seg++;
                    }
                    if(seg>=60){
                        mil=0;
                        seg=0;
                        min++;
                    }
                    if(min>=60){
                        mil=0;
                        seg=0;
                        min=0;
                        ho++;
                    }
                    lbTiempo.setText(f.format(ho)+":"+f.format(min)+":"+f.format(seg));
                    mil++;
                }
                catch(InterruptedException e){
                    System.out.println("Tiempo detenido");
                    break;
                }
            }
        }
        
        
    }
    
    public void setLbTiempo(JLabel lbTiempo) {
        this.lbTiempo = lbTiempo;
    }
    
    
  }
    
      

