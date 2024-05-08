package simuladorPagamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import simuladorPagamento.entity.Inscricao;

@Repository
public interface InscricaoRepository extends JpaRepository<Inscricao, Long> {
  
}