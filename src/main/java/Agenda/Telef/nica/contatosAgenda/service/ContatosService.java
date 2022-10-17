package Agenda.Telef.nica.contatosAgenda.service;

import Agenda.Telef.nica.contatosAgenda.model.ContatosModel;
import Agenda.Telef.nica.contatosAgenda.model.dto.ContatosRequest;
import Agenda.Telef.nica.contatosAgenda.model.dto.ContatosResponse;
import Agenda.Telef.nica.contatosAgenda.repository.IContatosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class ContatosService {

    @Autowired
    private IContatosRepository iContatosRepository;

    public ContatosResponse cadastrarContatos(ContatosRequest contatosRequest) {
        ContatosModel contatosModel = new ContatosModel(contatosRequest.getId(),
                contatosRequest.getNomeDoContato(),
                contatosRequest.getDdDoContato(),
                contatosRequest.getNumeroDoContato(),
                contatosRequest.getEstadoDoContato());
        iContatosRepository.save(contatosModel);

        return new ContatosResponse(contatosRequest.getNomeDoContato(), contatosRequest.getId());
    }

    public List<ContatosResponse> exibirTodosContatos() {
        List<ContatosModel> contatosModelList = iContatosRepository.findAll();
        return contatosModelList.stream().map(obj -> new ContatosResponse(obj.getNomeDoContato(), obj.getId()))
                .collect(Collectors.toList());

    }

    public Optional<ContatosModel> exibirViaID(UUID id) {
        return iContatosRepository.findById(id);
    }

    public ContatosModel alterarContatos(ContatosModel contatosModel) {
        return iContatosRepository.save(contatosModel);
    }

    public void deletarContatos(UUID id) {
        iContatosRepository.deleteById(id);
    }
}
