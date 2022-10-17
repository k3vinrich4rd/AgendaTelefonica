package Agenda.Telef.nica.contatosAgenda.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ContatosResponse {
    private UUID id;
    private String nomeDoContato;


}
