package parking_lot.entidades;
import parking_lot.feramentas.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Park {

    static Scanner sc = new Scanner(System.in);
    public static void registrarVeiculo(){
        System.out.println("Insira a marca do veiculo");
        String marca = sc.nextLine();

        System.out.println("Insira o modelo do veiculo");
        String modelo = sc.nextLine();

        System.out.println("Insira a matricula do veiculo");
        String matricula = sc.nextLine();

        Veiculo v = new Veiculo(marca, modelo, matricula);
        Vaga vaga = new Vaga(v);

        Repository.create(vaga);
    }

    public static void listarVeiculos(){
        for(Vaga v : Repository.readAll()){
            System.out.println(v.toString());
        }
    }

    public static void removerVeiculo(int id){
        LocalDateTime dt = null;
        for(Vaga v : Repository.readAll()){
            if(v.getId() == id){
                dt = v.getTimestamp();
            }
        }
        System.out.println("Veiculo apagado com sucesso!");
        System.out.println("O veiculo permaneceu das: " + dt.toString() + " até as: " + LocalDateTime.now().toString());
        Repository.delete(id);
    }

}
