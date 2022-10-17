package Agenda.Telef.nica.contatosAgenda.repository;

import Agenda.Telef.nica.contatosAgenda.model.ContatosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IContatosRepository extends JpaRepository<ContatosModel, UUID> {
}
