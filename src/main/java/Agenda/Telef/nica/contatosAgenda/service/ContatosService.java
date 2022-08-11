package Agenda.Telef.nica.contatosAgenda.service;

import Agenda.Telef.nica.contatosAgenda.model.ContatosModel;
import Agenda.Telef.nica.contatosAgenda.repository.ContatosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContatosService {

    @Autowired
    private ContatosRepository contatosRepository;

    public List<ContatosModel> exibirTodosContatos() {
        return contatosRepository.findAll();
    }

    public Optional<ContatosModel> exibirViaID(Long codigo) {
        return contatosRepository.findById(codigo);
    }

    public ContatosModel cadastrarContatos(ContatosModel contatosModel) {
        contatosModel.getCodigoDoContato();
        contatosModel.getNomeDoContato();
        contatosModel.getDdDoContato();
        contatosModel.getNumeroDoContato();


        return contatosRepository.save(contatosModel);
    }

    public ContatosModel alterarContatos(ContatosModel contatosModel) {
        contatosModel.getCodigoDoContato();
        contatosModel.getNomeDoContato();
        contatosModel.getDdDoContato();
        contatosModel.getNumeroDoContato();


        return contatosRepository.save(contatosModel);
    }

    public void deletarContatos(Long codigo) {
        contatosRepository.deleteById(codigo);
    }
}
