package proyecto;

import Conexion.SQLite_Conexion;




public class Proyecto {

    public static void main(String[] args) {
       
        //Se crea instancia a objeto y se conecta a SQLite
        SQLite_Conexion fbc = new SQLite_Conexion();
        //Se insertan algunos datos
        fbc.insert("persona", " nombre, apellido ", " 'Charly', 'Manson' ");
        fbc.insert("persona", " nombre, apellido ", " 'Marilyn' , 'Garcia' ");
        fbc.insert("persona", " nombre, apellido ", " 'Marcelo', 'Chamboneti' ");
        //Se imprimen los datos de la tabla
        System.out.println( fbc.select() );
        fbc.desconectar();
        
    }
    
}
