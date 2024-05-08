package simuladorPagamento.service;

import java.util.Date;

import org.springframework.stereotype.Service;

import simuladorPagamento.entity.CancelamentoAluno;
import simuladorPagamento.repository.CancelamentoAlunoRepository;

@Service
public class CancelamentoAlunoService {
    
    private final CancelamentoAlunoRepository cancelamentoAlunoRepository;

    public CancelamentoAlunoService(CancelamentoAlunoRepository cancelamentoAlunoRepository) {
        this.cancelamentoAlunoRepository = cancelamentoAlunoRepository;
    }

    public void inserirCancelamentoAluno(CancelamentoAluno cancelamentoAluno) {
        cancelamentoAluno.setDataalteracao(new Date());
        cancelamentoAlunoRepository.save(cancelamentoAluno);
    }
}
