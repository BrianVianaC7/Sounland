package BasesDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class IngresarPartidas {
    
    private ConexionBD conecta;
    
    public void Ingresar(int ID_U,String ID_P,String fecha,String tiempo,int puntaje,String dificultad){
        conecta = new ConexionBD();
        Connection cn=conecta.conectar();
        try{
            PreparedStatement pst=cn.prepareStatement("INSERT INTO PARTIDA(ID_Usuario,ID_Partida,"+
                    "Fecha_Partida,Tiempo_Partida,Puntaje,Nivel_Dificultad) VALUES(?,?,?,?,?,?)");
            pst.setInt(1, ID_U);
            pst.setString(2, ID_P);
            pst.setString(3, fecha);
            pst.setString(4, tiempo);
            pst.setInt(5, puntaje);
            pst.setString(6, dificultad);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Partida con ID "+ID_P+" guardado");
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Partida no guardada\n"+ex.getMessage());
        }
    }
    
}
