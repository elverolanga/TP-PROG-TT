package parking_lot.entidades;

public class Veiculo {
    private String matricula;
    private String modelo;
    private int id;

    public Veiculo(String matricula, String modelo, int id){
        this.matricula = matricula;
        this.id = id;
        this.modelo = modelo;
    }
    public Veiculo(){}

    public String toString(){
        return "Matricula: " + matricula + " Modelo: " + modelo + " ID: " + id;
    }

}

