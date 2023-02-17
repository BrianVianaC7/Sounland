package BasesDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class IngresarDatos {
    
    private ConexionBD conecta;
    
    public void Ingresar(int ID, String n, String a1, String a2, String user, String correo, String pass){
        int desicion=JOptionPane.showConfirmDialog(null, "¿Estás seguro de registrar los datos?\nUna vez "+
            "ingresados no se podrá modificar", "Desición",JOptionPane.YES_NO_OPTION);
        if(desicion==JOptionPane.YES_OPTION){
            conecta = new ConexionBD();
            Connection cn=conecta.conectar();
            try{
                PreparedStatement pst=cn.prepareStatement("INSERT INTO DATOS_USUARIO(ID_Usuario,Nombre_Usuario,"+
                    "A_Paterno_Usuario,A_Materno_Usuario) VALUES(?,?,?,?)");
                pst.setInt(1, ID);
                pst.setString(2, n);
                pst.setString(3, a1);
                pst.setString(4, a2);
                pst.executeUpdate();
                PreparedStatement pst2=cn.prepareStatement("INSERT INTO DETALLES_USUARIOS(ID_Usuarios,User_Name,"+
                    "Correo,Contraseña) VALUES(?,?,?,?)");
                pst2.setInt(1, ID);
                pst2.setString(2, user);
                pst2.setString(3, correo);
                pst2.setString(4, pass);
                pst2.executeUpdate();
                JOptionPane.showMessageDialog(null, "Usuario con ID "+ID+" guardado");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Usuario no guardado");
            }

        }else{
            JOptionPane.showMessageDialog(null, "Acción cancelada");
        }
    }
}
