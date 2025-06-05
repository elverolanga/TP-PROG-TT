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
        System.out.println("Veiculo:" + matricula + " Adicionado ao Parque.");
        System.out.println("Hora de Entrada: " + LocalDateTime.now().getHour() +":"+LocalDateTime.now().getMinute());
    }

    public static void listarVeiculos(){
        System.out.println(" => Viaturas parqueadas:");
        for(Vaga v : Repository.readAll()){
            System.out.println(v.toString());
        }
    }

    public static void removerVeiculo(int id){
        LocalDateTime horaEntrada = null;
        for(Vaga v : Repository.readAll()){
            if(v.getId() == id){
                horaEntrada = v.getTimestamp();
            }
        }

        double valor = (((LocalDateTime.now().getHour() * 3600) + (LocalDateTime.now().getMinute() * 60)) - ((horaEntrada.getHour() * 3600) + (horaEntrada.getMinute() * 60))) * 0.3;
        System.out.println("O veiculo ficou das: " + horaEntrada.getHour() + ":" +  horaEntrada.getMinute() + " até as: " + LocalDateTime.now().getHour() + ":" + LocalDateTime.now().getMinute() + " e devera pagar: " + valor);
        Repository.delete(id);
    }


}
