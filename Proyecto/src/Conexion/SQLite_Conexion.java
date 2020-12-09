package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Modelos.*;

public class SQLite_Conexion {

    private Connection connection = null;
    private ResultSet resultSet = null;
    private Statement statement = null;
    private String db= "C:\\Users\\osval\\Documents\\NetBeansProjects\\ProyectoFinalNetbeansJava\\Hotel.db";    

//Constructor de clase que se conecta a la base de datos SQLite 
    public SQLite_Conexion()
    {
      try{
         Class.forName("org.sqlite.JDBC");
         connection = DriverManager.getConnection("jdbc:sqlite:" + this.db );
         System.out.println("Conectado a la base de datos SQLite [ " + this.db + "]");
      }catch(Exception e){
         System.out.println(e);
      }

    }

 /*METODO PARA INSERTAR UN REGISTRO EN LA BASE DE DATOS*/
    
 public boolean insertUsuario(Usuarios a){
        boolean res=false;
        //Se arma la consulta
        String q = "insert into Usuarios Values('"+a.getNombreUsuario()+"','"+a.getNombre()+"','"+a.getApellidoP()+"','"+a.getApellidoM()+"','"+a.getContraseña()+"')";
        //se ejecuta la consulta
        try {
            PreparedStatement pstm = connection.prepareStatement(q);
            pstm.execute();
            pstm.close();
            res=true;
         }catch(Exception e){
            System.out.println(e);
        }
      return res;
    }
 

 /* METODO PARA REALIZAR UNA CONSULTA A LA BASE DE DATOS
 * INPUT:
 * OUTPUT: String con los datos concatenados
*/
 public String select(){
    String res=" NombreUsuario | Nombre | ApellidoP | ApellidoM | Contraseña \n ";
    try {
      statement = connection.createStatement();
      resultSet = statement.executeQuery("SELECT * FROM Usuarios ; ");
      while (resultSet.next())
      {
        res+=resultSet.getString("NombreUsuario") + " | " + resultSet.getString("Nombre") + " | " +  resultSet.getString("ApellidoP") + " | " + resultSet.getString("ApellidoM") + " | " + resultSet.getString("Contraseña") +" \n ";
      }
     }
     catch (SQLException ex) {
        System.out.println(ex);
     }
    return res;
 }

  public void desconectar()
    {
        try {
            resultSet.close();
            statement.close();
            connection.close();
            System.out.println("Desconectado de la base de datos [ " + this.db + "]");
        }
        catch (SQLException ex) {
            System.out.println(ex);
        }
    }

}
    

