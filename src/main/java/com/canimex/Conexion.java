package com.canimex;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// CONCLUSION DE LA CLASE Conexion

// esta clase es la encargada de establecer la conexion con la bd 'canimex' en localhost, en su constructor se cargan dinamicamente en el driver de MySQL y se establece la conexión con la bd 'canimex' en localhost. Ademas, tiene un metodo para obtener la conexion(getConnection) y otro para cerrar la conexión. En caso de no encontrar el driver o problemas con la conexion a la bd se imprime el error correspondiente

public class Conexion {
    // este es un atributo de mi clase conexion pero el tipo de dato de este atributo es Connection
    // que es una clase del paquete java.sql y la clase se llama Connection
    private Connection connection; // objeto Connection para manejar la conexion a la bd

    // Constructor de la clase Conexión
    public Conexion() {
        try {
            //Paso 1: cargar dinamicamente el driver MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            // paso 2: establecer la conexion con la bd 'canimex' en localhost
            this.connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/canimex", // URL de conexion JDBC para MySQL
                "root",
                "");
        } catch (ClassNotFoundException e) {
            e.printStackTrace(); // Imprimir el error en caso de no encontrar el driver
        } catch (SQLException e) {
            e.printStackTrace(); // imprimir el error en caso de problemas con la conexion a la bd
        }
    }

    // metodo para obtener la conexion GETTER

    public Connection getConnection() {
        return connection; // devuelve el objeto Connection establecido
    }
    // metodo para cerrar la conexion
    public void close() {
        try {
            // verificar si la conexion no es nula y está abierta, entonces cerrarla
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace(); //imprimir el erorr en caso de problemas al cerrar la conexion
        }
    }
}
