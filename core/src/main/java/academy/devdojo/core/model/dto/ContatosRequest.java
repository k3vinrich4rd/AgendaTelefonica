package academy.devdojo.core.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Validated
public class ContatosRequest {

    private UUID id;

    @NotBlank(message = "Erro, campo 'nomeDoContato' não foi informado")
    private String nomeDoContato;

    @NotBlank(message = "Erro, campo ddDoContato' não foi informado")
    private String ddDoContato;

    @NotBlank(message = "Erro, campo 'numeroDoContato' não foi informado")
    private String numeroDoContato;

    @NotBlank(message = "Erro, campo 'estadoDoContato' não foi informado")
    private String estadoDoContato;

}
