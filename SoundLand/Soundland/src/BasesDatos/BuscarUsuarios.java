package BasesDatos;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class BuscarUsuarios {
    
    ConexionBD conecta;
    private String[] datos;
    public static String user,userID,passw;
    
    public void Buscar(String user_correo, String pass){
        conecta = new ConexionBD();
        Connection cn=conecta.conectar();
        datos=new String[4];
        try{
            java.sql.Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery("SELECT * FROM DETALLES_USUARIOS "+
                    "WHERE(Correo='"+user_correo+"' OR User_Name='"+user_correo+"' AND Contraseña='"+pass+"')");
            while(rs.next()){
                datos[0]=rs.getString(2);
                datos[1]=rs.getString(3);
                datos[2]=rs.getString(4);
                datos[3]=rs.getString(1);
                if((user_correo.equals(datos[0]) || user_correo.equals(datos[1])) && pass.equals(datos[2])){
                    JOptionPane.showMessageDialog(null, "Bienvenido "+datos[0]);
                    user=datos[0];
                    userID=datos[3];
                    passw=datos[2];
                }else{
                    JOptionPane.showMessageDialog(null, "Error al ingresar\nUsuario no encontrado");
                }
                
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ingresar");
            if(ex.getMessage().contains("java.sql.SQLException")){
                JOptionPane.showMessageDialog(null, "Usuario no encontrado");
            }
        }
    }
}
