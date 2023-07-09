package Agenda.Telef.nica.contatosAgenda.controller;

import Agenda.Telef.nica.contatosAgenda.model.ContatosModel;
import Agenda.Telef.nica.contatosAgenda.model.dto.ContatosRequest;
import Agenda.Telef.nica.contatosAgenda.model.dto.ContatosResponse;
import Agenda.Telef.nica.contatosAgenda.service.ContatosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@Validated
@RequestMapping(path = "/contatos")
public class ContatosController {
    @Autowired
    private ContatosService contatosService;

    @PostMapping
    public ResponseEntity<ContatosResponse> cadastrarContatos(@Valid @RequestBody ContatosRequest contatosRequest) {
        return ResponseEntity.status(HttpStatus.CREATED).body(contatosService.cadastrarContatos(contatosRequest));
    }

    @GetMapping
    public ResponseEntity<List<ContatosResponse>> mostrarContatos() {
        return ResponseEntity.ok().body(contatosService.exibirTodosContatos());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Optional<ContatosModel>> exibirTodosContatosViaId(@PathVariable UUID id){
        return ResponseEntity.ok(contatosService.exibirViaID(id));
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<ContatosModel> alterarProduto(@Valid @RequestBody ContatosModel contatosModel) {
        return ResponseEntity.ok(contatosService.alterarContatos(contatosModel));
    }

    @DeleteMapping(path = "/{id}")
    public void deletarContato(@PathVariable UUID id) {
        contatosService.deletarContatos(id);
    }
}
