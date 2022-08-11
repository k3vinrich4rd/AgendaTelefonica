package Agenda.Telef.nica.contatosAgenda.repository;

import Agenda.Telef.nica.contatosAgenda.model.ContatosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContatosRepository extends JpaRepository<ContatosModel, Long> {
}
