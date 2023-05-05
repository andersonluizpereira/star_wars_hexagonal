package br.com.pereira.starwars.config.kafka;

import br.com.pereira.starwars.adapters.in.consumer.message.PeopleMessage;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;

import java.util.HashMap;
import java.util.Map;

import static org.apache.kafka.clients.consumer.ConsumerConfig.*;

@EnableKafka
@Configuration
public class KafkaPeopleConfig {

    @Bean
    public ConsumerFactory<String, PeopleMessage> consumerFactory() {
        Map<String, Object> props = new HashMap<>();
        props.put(BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        props.put(GROUP_ID_CONFIG, "pereira");
        props.put(KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        props.put(VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
        props.put(AUTO_OFFSET_RESET_CONFIG, "earliest");
        return new DefaultKafkaConsumerFactory<>(props, new StringDeserializer(), new JsonDeserializer<>(PeopleMessage.class));
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, PeopleMessage> kafkaListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, PeopleMessage> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(consumerFactory());
        return factory;
    }

}

