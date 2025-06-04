package parking_lot.feramentas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Repository {
    public static Connection getConnection() {
        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/parking_lot";
        String user = "root";
        String password = "lanx3ry";
        try{
            con = DriverManager.getConnection(url, user, password);
            con.close();
        }catch (SQLException e){
            System.out.println("Erro ao conectar: " + e.getMessage());;
        }
        return con;
    }


}
