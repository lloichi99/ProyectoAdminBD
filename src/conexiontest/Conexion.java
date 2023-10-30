/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conexiontest;
import java.sql.*;
import javax.swing.JOptionPane;



/**
 * @version 1.0 14/09/2023
 * @author javier morales
 */
public class Conexion {
    Connection con;
    
    public Conexion(){
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
          
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba2", "root", "123456");
            //JOptionPane.showMessageDialog(null,"Conexion exitosa","Conexion",JOptionPane.INFORMATION_MESSAGE);
            
        }catch(Exception e){            
            System.out.print("No se pudo establecer conexion"+e);
            
        }
        
    }
    
    public Connection getConnection(){
        return con;
    }
    
     public void desconectar()throws Exception{
        try {
            if (con!=null) {
                if (con.isClosed()==false) {
                    con.close();
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    
 
}