package parking_lot.feramentas;

import parking_lot.entidades.Vaga;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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

    public static void create(Vaga vaga) throws SQLException {
        Connection con = getConnection();
        String insertQuery = "INSERT INTRO vaga (id, id_veiculo, marca, modelo, matricula, timestamp)";

        try(PreparedStatement ps = con.prepareStatement(insertQuery)){
            ps.setInt(1, vaga.getId());
        }

    }
}
