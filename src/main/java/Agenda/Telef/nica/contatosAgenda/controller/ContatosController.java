package Agenda.Telef.nica.contatosAgenda.controller;

import Agenda.Telef.nica.contatosAgenda.model.ContatosModel;
import Agenda.Telef.nica.contatosAgenda.service.ContatosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ContatosController {

    @Autowired
    private ContatosService contatosService;

    @GetMapping(path = "/contatos")
    public List<ContatosModel> mostrarContatos() {
        return contatosService.exibirTodosContatos();
    }

    @GetMapping(path = "/contatos/{codigo}")
    public Optional<ContatosModel> exibirId(@PathVariable Long codigo) {
        return contatosService.exibirViaID(codigo);
    }

    @PostMapping(path = "/contatos")
    @ResponseStatus(HttpStatus.CREATED)
    public ContatosModel cadastrarContatos(@RequestBody ContatosModel contatosModel) {
        return contatosService.cadastrarContatos(contatosModel);
    }

    @PutMapping(path = "/contatos/{codigo}")
    public ContatosModel alterarProduto(@RequestBody ContatosModel contatosModel) {
        return contatosService.alterarContatos(contatosModel);
    }

    @DeleteMapping(path = "/contatos/{codigo}")
    public void deletarContato(@PathVariable Long codigo) {
        contatosService.deletarContatos(codigo);
    }
}
