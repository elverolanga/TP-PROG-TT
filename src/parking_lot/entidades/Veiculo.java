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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString(){
        return "Matricula: " + matricula + " Modelo: " + modelo + " ID: " + id;
    }

}

