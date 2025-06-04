package parking_lot.app;

import parking_lot.entidades.Park;

import java.util.Scanner;

public class Menu {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("""
                1. Registar um veiculo
                2. Listar veiculos
                3. Apagar veiculo
                0. Sair
                """);
        int option = Integer.parseInt(sc.nextLine());

        while (option != 0) {
            switch (option) {
                case 1 -> Park.registrarVeiculo();
                case 2 -> {
                    System.out.println("Veiculos registrados: \n");
                    Park.listarVeiculos();
                }
                case 3 -> {
                    Park.listarVeiculos();
                    System.out.println("Insira o id do veiculo que deseja apagar");
                    int id = Integer.parseInt(sc.nextLine());
                    Park.removerVeiculo(id);
                }
            }
            System.out.println("""
                    1. Registar um veiculo
                    2. Listar veiculos
                    3. Apagar veiculo
                    0. Sair
                    """);
            option = Integer.parseInt(sc.nextLine());

        }
    }
}
