package parking_lot.entidades;
import parking_lot.feramentas.Repository;

import java.util.ArrayList;
import java.util.List;


public class Park {

    public static void eliminarCliente(int id){
        Repository.delete(id);
    }

    public static void main(String[] args) {

        Veiculo v1 = new Veiculo("toyota", "corolla", "toyo");
        Vaga vaga = new Vaga();
    }
}
