package parking_lot.feramentas;

import parking_lot.entidades.Vaga;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

public class Repository {
    private static final String filePath = "parking_lot/ficheiros/clientes.txt";

    public static void writeToFile(List<Vaga> vagas) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {

        }
    }
}
