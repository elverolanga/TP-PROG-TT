package parking_lot.feramentas;

import parking_lot.entidades.Vaga;
import parking_lot.entidades.Veiculo;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Repository {
    public static Connection getConnection(){
        try {
            Class<?> driver =  Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/parking_lot";
        String user = "root";
        String password = "lanx3ry";
        try{
            con = DriverManager.getConnection(url, user, password);
        }catch (SQLException e){
            System.out.println("Erro ao conectar: " + e.getMessage());;
        }
        return con;
    }

    public static void create(Vaga vaga){

        String insertQuery = "INSERT INTRO vaga (marca, modelo, matricula, timestamp) VALUES (?, ?, ?)";

        try(
                Connection con = getConnection();
                PreparedStatement ps = con.prepareStatement(insertQuery)){
            //ps.setInt(1, vaga.getId());
            //ps.setInt(2, vaga.getVeiculo().getId());
            ps.setString(1, vaga.getVeiculo().getMarca());
            ps.setString(2, vaga.getVeiculo().getModelo());
            ps.setString(3, vaga.getTimestamp().toString());
            ps.executeUpdate();
        }catch (SQLException e){
            System.out.println("Erro ao inserir: " + e.getMessage());
        }

    }

    public static List<Vaga> readAll(){
        String selectQuery = "SELECT id, id_veiculo, marca, modelo, matricula, ts" + " FROM VAGA";
        List<Vaga> vagas = new ArrayList<>();

        try(Connection connection = getConnection();
            PreparedStatement ps = connection.prepareStatement(selectQuery);
        ResultSet rs = ps.executeQuery();
        ){
            while (rs.next()){
                Veiculo veiculo = new Veiculo();
                veiculo.setId(rs.getInt(2));
                veiculo.setMarca(rs.getString(3));
                veiculo.setModelo(rs.getString(4));
                veiculo.setMatricula(rs.getString(5));
                LocalDateTime timestamp = LocalDateTime.parse(rs.getString(6));
                Vaga vaga = new Vaga(rs.getInt(1), veiculo, timestamp);
                vagas.add(vaga);
            }
       }catch(SQLException e){
            System.out.println("erro ao ler, " + e.getMessage());
        }
        return vagas;
    }

    public static void delete(int id){
        String selectQuery = "SELECT id_veiculo FROM vaga WHERE id - ?";
        String deleteVaga = "DELETE FROM vaga WHERE id = ?";

        Connection con = getConnection();
        try(PreparedStatement ps = con.prepareStatement(selectQuery)){
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int idVeiculo = rs.getInt("id_veiculo");
            }else{
                System.out.println("Erro ao selecionar veiculo");
                return;
            }

            try (PreparedStatement pstDeleteVaga = con.prepareStatement(deleteVaga)) {
                pstDeleteVaga.setInt(1, id);
                pstDeleteVaga.executeUpdate();
            }

        }catch (Exception e){
            System.out.println("Erro ao selecionar veiculo" + e.getMessage());
        }
    }

    public void update(int id, Vaga vaga) {
        String sqlVaga = "UPDATE vaga SET marca = ?, modelo = ?, matricula = ? WHERE id = ? ";

        try (Connection conn = getConnection()) {
            conn.setAutoCommit(false); // Início da transação

            try (PreparedStatement pstVeiculo = conn.prepareStatement(sqlVaga)) {
                pstVeiculo.setString(1, vaga.getVeiculo().getMarca());
                pstVeiculo.setString(2, vaga.getVeiculo().getModelo());
                pstVeiculo.setString(3, vaga.getVeiculo().getMatricula());
                pstVeiculo.setInt(4, id);
            }

            conn.commit(); // Final da transação
        }catch (SQLException e){
            System.out.println("Erro ao atualizar: " + e.getMessage());
        }
    }

}
