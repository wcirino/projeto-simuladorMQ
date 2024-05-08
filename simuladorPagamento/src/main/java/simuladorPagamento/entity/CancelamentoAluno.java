package simuladorPagamento.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Cancelamento_Aluno"
		+ "")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CancelamentoAluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "id_inscricao")
    private Long idInscricao;

    @Column(name = "nome_aluno")
    private String nomeAluno;
    
    @Column(name = "curso_titulo")
    private String curso_titulo;

    @Column(name = "data_alteracao")
    private Date dataalteracao;
    
}
