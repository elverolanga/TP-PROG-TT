package parking_lot.entidades;

import java.time.LocalDateTime;

public class Vaga {
    private Veiculo veiculo;
    private LocalDateTime timestamp;

    public Vaga(){

    }
    public Vaga(Veiculo veiculo, LocalDateTime timestamp) {
        this.veiculo = veiculo;
        this.timestamp = timestamp;
    }

    public Veiculo getVeiculo() {
        return veiculo;
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
