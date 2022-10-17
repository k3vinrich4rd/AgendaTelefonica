package Agenda.Telef.nica.contatosAgenda.model;

import lombok.*;

import javax.persistence.*;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "agenda_telefonica")
public class ContatosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(length = 100, nullable = false)
    private String nomeDoContato;

    @Column(length = 100, nullable = false)
    private String ddDoContato;

    @Column(length = 100, nullable = false)
    private String numeroDoContato;

    @Column(length = 100, nullable = false)
    private String estadoDoContato;

}
