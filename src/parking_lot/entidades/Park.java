package parking_lot.entidades;
import parking_lot.feramentas.Repository;
import java.time.Duration;
import java.time.LocalDateTime;

import java.util.Scanner;


public class Park {

    static Scanner sc = new Scanner(System.in);
    LocalDateTime horaDeEntrada = LocalDateTime.now(); // Vincular a base de dados!
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
        Repository.delete(id);
    }


    LocalDateTime horaDeSaida = LocalDateTime.now();
    Duration duracao = Duration.between(horaDeEntrada,horaDeSaida);
    Long minutos = duracao.toMinutes();
    Long segundos = duracao.getSeconds();



}
