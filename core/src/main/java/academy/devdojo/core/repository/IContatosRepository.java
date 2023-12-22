package academy.devdojo.core.repository;


import academy.devdojo.core.model.ContatosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IContatosRepository extends JpaRepository<ContatosModel, UUID> {
}
