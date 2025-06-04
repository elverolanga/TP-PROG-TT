package parking_lot.app;

import parking_lot.entidades.Park;
import java.util.Scanner;


public class Menu {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int option;
        System.out.println(" => Bem-Vindo ao Parque de Estacionamento <= ");
        do{
            System.out.println(" 1: Adicionar um veiculo; ");
            System.out.println(" 2: Listar Veiculos; ");
            System.out.println(" 3: Remover Veiculo; ");
            System.out.println(" 0: Sair do Parque; ");
            System.out.println(" => Escolha Uma opcao: <= ");
             option = sc.nextInt();

            switch(option){
                case 1:
                    Park.registrarVeiculo();
                case 2:
                    Park.listarVeiculos();
                case 3:
                    // Deve conter metodo para calcular o dinheiro a pagar no estacionamento, com base no tempo que ficou
                {
                    Park.listarVeiculos();
                    System.out.println("Insira o id do veiculo que deseja remover");
                    int id = Integer.parseInt(sc.nextLine());
                    Park.removerVeiculo(id);
                }
                case 0:
                    System.exit(0);// Melhorar este aspecto!
                default:
                    System.out.println("ERROR.");
            }

        }while(option != 0);

    }
}
