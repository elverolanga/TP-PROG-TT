package parking_lot.app;

import parking_lot.entidades.Park;

import java.util.Scanner;


public class Menu {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int option = 0;
        do{
            System.out.println(" 1: Adicionar um veiculo; ");
            System.out.println(" 2: Listar Veiculos; ");
            System.out.println(" 3: Remover Veiculo; ");
            System.out.println(" 0: Sair do Parque; ");
            System.out.println(" => Escolha Uma opcao: <= ");
            option = Integer.parseInt(sc.nextLine());

        switch(option){
            case 1:
                Park.registrarVeiculo();
                break;
            case 2:
                Park.listarVeiculos();
                break;
            case 3:
                {
                Park.listarVeiculos();
                System.out.println("Insira o id do veiculo que deseja remover");
                int id = Integer.parseInt(sc.nextLine());
                Park.removerVeiculo(id);
                }
                break;
            case 0:
                sair();
                break;

            default:
                System.out.println("ERROR.");
                break;
            }

        }while(option != 0);


    }
    public static void sair(){
        String msg = "Saindo do Parque...";
        for(char c : msg.toCharArray()){
            System.out.print(c);
            System.out.flush();
            try{
                Thread.sleep(150);
            }catch (InterruptedException e ){
                Thread.currentThread().interrupt();
            }
        }
        System.out.println();
        System.exit(0);
    }
}
