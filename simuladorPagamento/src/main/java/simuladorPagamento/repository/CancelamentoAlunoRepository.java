package simuladorPagamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import simuladorPagamento.entity.CancelamentoAluno;

@Repository
public interface CancelamentoAlunoRepository extends JpaRepository<CancelamentoAluno, Long> {
    
}