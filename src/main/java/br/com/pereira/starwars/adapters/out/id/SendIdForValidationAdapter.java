package br.com.pereira.starwars.adapters.out.id;

import br.com.pereira.starwars.application.ports.out.SendIdForValidationOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class SendIdForValidationAdapter implements SendIdForValidationOutputPort {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Override
    public void send(Integer id, String topic) {
        kafkaTemplate.send(topic, id.toString());
    }
}
