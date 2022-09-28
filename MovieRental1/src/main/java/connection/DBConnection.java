
package connection;

import java.sql.Connection;
import java.sql.DriverManager;



public class DBConnection {
    Connection connection;
    static String db = "railway";
    static String port = "7974";   /* El puerto de la base de datos 3307 */
    static String login = "root";
    static String password = "vLJQl9awvewNTcx9mzNl";
    static String ip = "containers-us-west-70.railway.app";
    

    public DBConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://"+this.ip+":"+this.port+ "/"+this.db;
            
            connection = DriverManager.getConnection(url, this.login, this.password);
            System.out.println("Conexion exitosa");
            
        
        } catch (Exception ex) {
            System.out.println("Error en la conexion " + ex);
        }
    }

    public Connection getConnection() {
        return connection;
    }
    
    public void desconectar(){
        connection = null;
    }
    
    
}
