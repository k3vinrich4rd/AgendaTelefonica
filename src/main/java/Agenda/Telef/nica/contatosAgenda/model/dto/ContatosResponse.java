package Agenda.Telef.nica.contatosAgenda.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ContatosResponse {
    private String nomeDoContato;
    private UUID id;

}
