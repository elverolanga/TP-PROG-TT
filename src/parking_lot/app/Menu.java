package parking_lot.app;

import parking_lot.entidades.Park;
import java.util.Scanner;
import java.util.Scanner;

public class Menu {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println(" => Bem-Vindo ao Parque de Estacionamento <= ");
        System.out.println(" 1: Adicionar um veiculo; ");
        System.out.println(" 2: Listar Veiculos; ");
        System.out.println(" 3: Remover Veiculo; ");
        System.out.println(" 0: Sair do Parque; ");
        System.out.println(" => Escolha Uma opcao: <= ");
        int option = sc.nextInt();


        switch(option){
            case 1:
                Park.registrarVeiculo();
            case 2:
                Park.listarVeiculos();
            case 3:
                {
                Park.listarVeiculos();
                System.out.println("Insira o id do veiculo que deseja remover");
                int id = Integer.parseInt(sc.nextLine());
                Park.removerVeiculo(id);
                }
            case 0:
                // Comando pra sair
            default:
                System.out.println("ERROR.");
        }
    }
}
