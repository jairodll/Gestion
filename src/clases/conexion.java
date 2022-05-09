package clases;
import java.sql.*;
import javax.swing.JOptionPane;

public class conexion {
    //Conexion Local
    public static Connection conectar(){
     String BD = "jdbc:postgresql://localhost:5432/recursosc";
     String usuario = "postgres";
     String contra = "admin";
     
        try {
            Connection cn = DriverManager.getConnection(BD, usuario, contra);
            return cn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectar"+e);
        }
        return (null);
        } 
    /* public static void main(String[] args){
        String BD ="jdbc:postgresql://127.0.0.1:5432/recursosc";
        String usuario = "postgres";
        String contra ="admin";
        
        try {
            Connection conectar = DriverManager.getConnection(BD,usuario,contra);
            JOptionPane.showMessageDialog(null, "BD Conectada con exito");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectar"+e);
 
        }
    }   */    
    
    
}
 