package br.com.pereira.starwars.application.ports.out;

public interface SendIdForValidationOutputPort {

    void send(Integer id, String topic);

}
