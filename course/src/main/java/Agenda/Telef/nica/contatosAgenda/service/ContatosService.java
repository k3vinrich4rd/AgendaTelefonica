package Agenda.Telef.nica.contatosAgenda.service;



import academy.devdojo.core.model.ContatosModel;
import academy.devdojo.core.model.dto.ContatosRequest;
import academy.devdojo.core.model.dto.ContatosResponse;
import academy.devdojo.core.repository.IContatosRepository;
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

        return new ContatosResponse(contatosRequest.getId(), contatosRequest.getNomeDoContato());
    }

    public List<ContatosResponse> exibirTodosContatos() {
        List<ContatosModel> contatosModelList = iContatosRepository.findAll();
        return contatosModelList.stream().map(obj -> new ContatosResponse(obj.getId(), obj.getNomeDoContato()))
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
