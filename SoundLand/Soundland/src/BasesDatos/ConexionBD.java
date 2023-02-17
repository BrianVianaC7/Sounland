package BasesDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    private String bd, url,user,password,driver;
    private Connection cx;
    
    public ConexionBD(){
        bd="BD_Soundland?zeroDateTimeBehavior=CONVERT_TO_NULL";
        url="jdbc:mysql://127.0.0.1:3306/";
        user="root";
        password=""; //CONTRASEÑA LOCAL DE MySQL del root
        driver="com.mysql.cj.jdbc.Driver";
    }
    
    public Connection conectar(){
        try {
            Class.forName(driver);
            cx=DriverManager.getConnection(url+bd, user, password);
            System.out.println("SE CONECTÓ LA BASE DE DATOS");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("NO SE CONECTÓ LA BASE DE DATOS");
        }
        return cx;
    }
    
    public void desconectar(){
        try {
            cx.close();
        } catch (SQLException ex) {
            System.out.println("NO SE ACCEDIÓ LA BASE DE DATOS");
        }
    }
    
}
 