package parking_lot.entidades;
import parking_lot.feramentas.Repository;

import java.util.ArrayList;
import java.util.List;


public class Park {

    public static void eliminarCliente(int id){
        Repository.delete(id);
    }

    public static void main(String[] args) {

        Veiculo v1 = new Veiculo("toyota", "corolla", "amc 100 mp");
        Vaga vaga = new Vaga(v1);

        Repository.create(vaga);

        List<Vaga> vvv = Repository.readAll();

        for(Vaga v : vvv){
            System.out.println(v.toString());
        }
    }
}
