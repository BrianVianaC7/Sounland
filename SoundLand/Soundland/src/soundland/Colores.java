package soundland;

import java.awt.Color;
import java.util.Random;
import javax.swing.JPanel;

public class Colores extends Thread{
    
    private Random rand = new Random();
    private JPanel j=new JPanel();
    private Color co;
    
    @Override
    public void run(){
        for(int i=0; i<=1000000000;i++){
            float r=(float) (rand.nextFloat()/2f + 0.5),g=(float) (rand.nextFloat()/2f + 0.5),
                    b=(float) (rand.nextFloat()/2f + 0.5);
            co=new Color(r,g,b);
            j.setBackground(co);
            try{
                    sleep(1500);
                }
                catch(InterruptedException e){
                    break;
                }
        }
    }
    
    public void setColor(JPanel c){
        j=c;
    }
    
}
