package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LimiteUltrapassadoException extends Exception {
    String dataHora;

    public LimiteUltrapassadoException(String msg) {
        // Chama o construtor da classe mae (Exception)
        super(msg);

        this.dataHora= LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
    }
}
