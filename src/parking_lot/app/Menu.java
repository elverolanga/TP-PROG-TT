package parking_lot.app;

import parking_lot.entidades.Park;

import java.sql.SQLOutput;
import java.util.Scanner;


public class Menu {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int option, totVagas = 42;
        do{
            System.out.println(" ==> Aramib Park \uD83D\uDE97 <== ");
            System.out.println(" 1: Adicionar um veiculo; ");
            System.out.println(" 2: Listar Veiculos; ");
            System.out.println(" 3: Remover Veiculo; ");
            System.out.println(" 0: Sair do Parque; ");
            System.out.println(" Vagas Disponiveis: " + totVagas);
            System.out.println(" => Escolha Uma opcao: <= ");
            option = Integer.parseInt(sc.nextLine());

        switch(option){
            case 1:
                Park.registrarVeiculo();
                totVagas--;
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
                totVagas++;
                break;
            case 0:
                sair();
                break;
            default:
                System.out.println("ERROR, Insira um numero na lista");
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
        System.out.println("Parque Fechado.");
        System.exit(0);
    }
}
