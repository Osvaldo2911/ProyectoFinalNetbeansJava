package proyecto;

import Conexion.SQLite_Conexion;
import Modelos.Usuarios;




public class Proyecto {

    public static void main(String[] args) {
       
        //Se crea instancia a objeto y se conecta a SQLite
        SQLite_Conexion fbc = new SQLite_Conexion();
        //Se insertan algunos datos
        //fbc.insertUsuario(new Usuarios("Ekobozz9", "Osvaldo", "De la Torre", "Ortiz", "1234gt"));
        //Se imprimen los datos de la tabla
        System.out.println( fbc.select() );
        fbc.desconectar();
        
    }
    
}
