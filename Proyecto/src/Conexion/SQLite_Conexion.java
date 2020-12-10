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
    private String db = "C:\\Users\\osval\\Documents\\NetBeansProjects\\ProyectoFinalNetbeansJava\\Hotel.db";

    //Constructor de clase que se conecta a la base de datos SQLite 
    public SQLite_Conexion() {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:" + this.db);
            System.out.println("Conectado a la base de datos SQLite [ " + this.db + "]");
        } catch (Exception e) {
            System.out.println(e);
        }

    }
    
    //USUARIO---------------------------->
    public boolean agregarUsuario(Usuarios a) {
        boolean res = false;
        //Se arma la consulta
        String q = "insert into Usuarios Values('" + a.getNombreUsuario() + "','" + a.getNombre() + "','" + a.getApellidoP() + "','" + a.getApellidoM() + "','" + a.getContraseña() + "')";
        //se ejecuta la consulta
        try {
            PreparedStatement pstm = connection.prepareStatement(q);
            pstm.execute();
            pstm.close();
            res = true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return res;
    }
    public boolean eliminarUsuario(String userName) {
        boolean res = false;
        String sql = "Delete From Usuarios where NombreUsuario = '" + userName + "'";
        try {
            PreparedStatement pstm = connection.prepareStatement(sql);
            pstm.execute();
            pstm.close();
            res = true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return res;
    }
    public String buscarUsuario(String userName) {
        String res = "";
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * From Usuarios where NombreUsuario = '" + userName + "'");
            while (resultSet.next()) {
                res += resultSet.getString("NombreUsuario") + " | " + resultSet.getString("Nombre") + " | " + resultSet.getString("ApellidoP") + " | " + resultSet.getString("ApellidoM") + " | " + resultSet.getString("Contraseña") + " \n ";
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return res;
    }
    public String buscarUsuario(String userName,String Contraseña) {
        String res = "";
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * From Usuarios where NombreUsuario = '" + userName + "' AND " + "Contraseña = '" + Contraseña + "'");
            while (resultSet.next()) {
                res += resultSet.getString("NombreUsuario") + " | " + resultSet.getString("Nombre") + " | " + resultSet.getString("ApellidoP") + " | " + resultSet.getString("ApellidoM") + " | " + resultSet.getString("Contraseña") + " \n ";
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return res;
    }
    public boolean modificarUsuario(Usuarios a) {
        boolean res = false;
        //Se arma la consulta
        String sql = "Update Usuarios Set NombreUsuario = '"+a.getNombreUsuario()+"'"
				+ ", Nombre = '"+ a.getNombre()+"'"
				+ ", ApellidoP = '"+a.getApellidoP()+"'"
				+ ", ApellidoM = '"+a.getApellidoM()+"'"
				+ ", Contraseña = '"+a.getContraseña()
                                + "' WHERE NombreUsuario ='"+a.getNombreUsuario()+"'";
        //se ejecuta la consulta
        try {
            PreparedStatement pstm = connection.prepareStatement(sql);
            pstm.execute();
            pstm.close();
            res = true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return res;
    }
    
    //CLIENTES---------------------------->
    public boolean agregarCliente(Clientes a) {
        boolean res = false;
        //Se arma la consulta
        String q = "insert into Usuarios Values('" + a.getIdClientes() + "','" + a.getNombre() + "','" + a.getApellidoA() + "','" + a.getApellidoM() + "','" + a.getTelefono() + "','" + a.getDireccion() + "')";
        //se ejecuta la consulta
        try {
            PreparedStatement pstm = connection.prepareStatement(q);
            pstm.execute();
            pstm.close();
            res = true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return res;
    }
    public boolean eliminarCliente(int idCliente) {
        boolean res = false;
        String sql = "Delete From Clientes where idClientes = '" + idCliente + "'";
        try {
            PreparedStatement pstm = connection.prepareStatement(sql);
            pstm.execute();
            pstm.close();
            res = true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return res;
    }
    public String buscarCliente(int idCliente) {
        String res = "";
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * From Clientes where idClientes = '" + idCliente + "'");
            while (resultSet.next()) {
                res += resultSet.getString("idClientes") + " | " + resultSet.getString("Nombre") + " | " + resultSet.getString("ApellidoPaterno") + " | " + resultSet.getString("ApellidoMaterno") + " | " + resultSet.getString("Telefono") + " | " + resultSet.getString("Direccion") + " \n ";
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return res;
    }
    
    //HABITACIONES---------------------------->
    public boolean agregarHabitacion(Habitaciones a) {
        boolean res = false;
        //Se arma la consulta
        String sql = "insert into Habitaciones Values('" + a.getIdHabitacion() + "','" + a.getNumPersonas() + "','" + a.getPrecio() + "','" + a.getTipoHabitacion() + "')";
        //se ejecuta la consulta
        try {
            PreparedStatement pstm = connection.prepareStatement(sql);
            pstm.execute();
            pstm.close();
            res = true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return res;
    }
    public boolean eliminarHabitacion(int idHabitacion) {
        boolean res = false;
        String sql = "Delete From Habitaciones where idHabitacion = '" + idHabitacion + "'";
        try {
            PreparedStatement pstm = connection.prepareStatement(sql);
            pstm.execute();
            pstm.close();
            res = true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return res;
    }
    
    //RESERVACIONES
    public boolean agregarRes(Reservaciones a) {
        boolean res = false;
        //Se arma la consulta
        String q = "insert into Reservaciones Values('" + a.getIdReservaciones() + "','" + a.getFechaEntrega() + "','" + a.getFechaSalida() + "','" + a.getNombreUsuario() + "','" + a.getIdCliente() + "','" + a.getIdHabitacion() + "')";
        //se ejecuta la consulta
        try {
            PreparedStatement pstm = connection.prepareStatement(q);
            pstm.execute();
            pstm.close();
            res = true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return res;
    }
    public boolean eliminarRes(int idReservacion) {
        boolean res = false;
        String sql = "Delete From Reservaciones where idReservacion = '" + idReservacion + "'";
        try {
            PreparedStatement pstm = connection.prepareStatement(sql);
            pstm.execute();
            pstm.close();
            res = true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return res;
    }
    public String buscarRes(int idReservacion) {
        String res = "";
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * From Reservaciones where idReservacion = '" + idReservacion + "'");
            while (resultSet.next()) {
                res += resultSet.getString("idReservacion") + " | " + resultSet.getString("FechaEntrada") + " | " + resultSet.getString("FechaSalida") + " | " + resultSet.getString("NombreUsuarioR") + " | " + resultSet.getString("idClienteR") + " | " + resultSet.getString("idHabitacionR") +" \n ";
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return res;
    }
    public boolean modificarRes(Reservaciones a) {
        boolean res = false;
        //Se arma la consulta
        String sql = "Update Reservaciones Set idReservacion = '"+a.getIdReservaciones()+"'"
				+ ", FechaEntrada = '"+ a.getFechaEntrega()+"'"
				+ ", FechaSalida = '"+a.getFechaSalida()+"'"
				+ ", NombreUsuarioR = '"+a.getNombreUsuario()+"'"
				+ ", idClienteR = '"+a.getIdCliente()
                                + "' WHERE idReservacion ='"+a.getIdReservaciones()+"'";
        //se ejecuta la consulta
        try {
            PreparedStatement pstm = connection.prepareStatement(sql);
            pstm.execute();
            pstm.close();
            res = true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return res;
    }
    
    /* METODO PARA REALIZAR UNA CONSULTA A LA BASE DE DATOS
 * INPUT:
 * OUTPUT: String con los datos concatenados
     */
    public String select() {
       // String res = " NombreUsuario | Nombre | ApellidoP | ApellidoM | Contraseña \n ";
       String res = "";
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM Usuarios; ");
            while (resultSet.next()) {
                res += resultSet.getString("NombreUsuario") + " | " + resultSet.getString("Nombre") + " | " + resultSet.getString("ApellidoP") + " | " + resultSet.getString("ApellidoM") + " | " + resultSet.getString("Contraseña") + " \n ";
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return res;
    }

    public void desconectar() {
        try {
            resultSet.close();
            statement.close();
            connection.close();
            System.out.println("Desconectado de la base de datos [ " + this.db + "]");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

}
