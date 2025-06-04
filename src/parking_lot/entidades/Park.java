package parking_lot.entidades;
import parking_lot.feramentas.Repository;

import java.util.ArrayList;
import java.util.*;

public class Park {
    static Scanner sc = new Scanner(System.in);
    private ArrayList<Vaga> vagas;

    // Metodo Adicionar Veiculo
    public static void adicionarVeiculo(){
        String matricula = sc.next();
        String marca = sc.next();
        String modelo = sc.next();
        Veiculo v = new Veiculo(matricula,modelo,marca);
        Vaga vaga = new Vaga(v);
        Repository.create(vaga);
    }

    // Metodo Listar Veiculo
    public static void listarVeiculos(){
        // Chamar Repository.findAll()
    }


}