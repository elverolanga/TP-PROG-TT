package parking_lot.app;

import parking_lot.entidades.Park;

import java.util.Scanner;

public class Menu {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(" => Bem-Vindo ao Parque de Estacionamento <= ");

        switch(option){
            case 1  -> Park.registrarVeiculo();
            case 2 -> Park.listarVeiculos();
            case 3 -> {
                Park.listarVeiculos();
                System.out.println("Insira o id do veiculo que deseja apagar");
                int id = Integer.parseInt(sc.nextLine());
                Park.removerVeiculo(id);
            }
        }
    }
}
