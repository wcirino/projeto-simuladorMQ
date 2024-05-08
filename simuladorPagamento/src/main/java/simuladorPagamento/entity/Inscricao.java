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
@Table(name = "Inscricoes_Pagamento")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Inscricao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cursoID")
    private Long cursoId;

    @Column(name = "alunoID")
    private Long alunoId;
    
    @Column(name = "nome_aluno")
    private String nome_aluno;

    @Column(name = "titulo_curso")
    private String titulo_curso;
    
    @Column(name = "data_cadastro")
    private Date dataCadastro;

    @Column(name = "status_pagamentoID")
    private Integer statusPagamentoId;

    @Column(name = "metodo_pagamentoID")
    private Integer metodoPagamentoId;
    
    @Column(name = "data_alteracao")
    private Date dataAlteracao;
    
    @Column(name = "status")
    private int status;

}