package parking_lot.entidades;

import java.time.LocalDateTime;

public class Vaga {
    private Veiculo veiculo;
    private LocalDateTime timestamp;
    private int id;

    public Vaga(){

    }
    public Vaga(Veiculo veiculo, LocalDateTime timestamp, int id) {
        this.veiculo = veiculo;
        this.timestamp = timestamp;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
