/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp;
import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Lamia Muntaha
 */
public class javaconnect {
    public static java.sql.Connection ConnecrDb(){
  try{
     
     return DriverManager.getConnection("jdbc:mysql://localhost/isp", "root", "");
  } catch(SQLException e){
      
  }
        return null;
}
}
