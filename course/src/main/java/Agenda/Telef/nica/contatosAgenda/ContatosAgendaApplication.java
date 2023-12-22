package Agenda.Telef.nica.contatosAgenda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EntityScan({"academy.devdojo.core.model"})
@EnableJpaRepositories({"academy.devdojo.core.repository"})
public class ContatosAgendaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ContatosAgendaApplication.class, args);
    }

}
