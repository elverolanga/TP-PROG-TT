package parking_lot.entidades;

public class Veiculo {
    private String matricula;
    private String modelo;
    private String marca;


    public Veiculo(String matricula, String modelo,String marca){
        this.matricula = matricula;
        this.modelo = modelo;
        this.marca =  marca;
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

