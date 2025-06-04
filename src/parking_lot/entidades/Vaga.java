package parking_lot.entidades;

import java.time.LocalDateTime;

public class Vaga {
    private int id;
    private Veiculo veiculo;
    private LocalDateTime ts;

    public Vaga(){

    }
    public Vaga(Veiculo veiculo) {
        this.id = id;
        this.veiculo = veiculo;
        this.ts = LocalDateTime.now();
    }


    public Vaga(Veiculo veiculo, LocalDateTime timestamp) {
        this.veiculo = veiculo;
        this.ts = timestamp;
    }
    public Vaga(int id, Veiculo veiculo, LocalDateTime timestamp) {
        this.id = id;
        this.veiculo = veiculo;
        this.ts = timestamp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public LocalDateTime getTimestamp() {
        return ts;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.ts = timestamp;
    }
}
