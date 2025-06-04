package parking_lot.entidades;

public class Veiculo {
    private String matricula;
    private String modelo;
    private String marca;
    private int id;


    public Veiculo(String matricula, String modelo,String marca, int id){
        this.matricula = matricula;
        this.modelo = modelo;
        this.marca =  marca;
        this.id = id;
    }
    public Veiculo(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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



    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }



    public String toString(){
        return "Matricula: " + matricula + " Modelo: " + modelo + " Marca: " + marca;
    }

}

