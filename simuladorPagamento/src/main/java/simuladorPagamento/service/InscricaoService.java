package simuladorPagamento.service;

import java.util.Date;
import java.util.Optional;

import org.springframework.stereotype.Service;

import simuladorPagamento.entity.Inscricao;
import simuladorPagamento.repository.InscricaoRepository;

@Service
public class InscricaoService {
    
    private final InscricaoRepository inscricaoRepository;

    public InscricaoService(InscricaoRepository inscricaoRepository) {
        this.inscricaoRepository = inscricaoRepository;
    }

    public void atualizarInscricao(Long id, Inscricao inscricaoAtualizada) {
        Optional<Inscricao> optionalInscricao = inscricaoRepository.findById(id);
        if (optionalInscricao.isPresent()) {
            Inscricao inscricao = optionalInscricao.get();
            inscricao.setCursoId(inscricaoAtualizada.getCursoId());
            inscricao.setAlunoId(inscricaoAtualizada.getAlunoId());
            inscricao.setDataCadastro(inscricaoAtualizada.getDataCadastro());
            inscricao.setStatusPagamentoId(inscricaoAtualizada.getStatusPagamentoId());
            inscricao.setMetodoPagamentoId(inscricaoAtualizada.getMetodoPagamentoId());
            inscricao.setDataAlteracao(new Date());
            inscricao.setStatus(inscricaoAtualizada.getStatus());
            inscricaoRepository.save(inscricao);
        } else {
            throw new RuntimeException("Inscrição não encontrada com o ID: " + id);
        }
    }
}