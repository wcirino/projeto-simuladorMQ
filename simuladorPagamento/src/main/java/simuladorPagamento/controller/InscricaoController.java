package simuladorPagamento.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import simuladorPagamento.entity.Inscricao;
import simuladorPagamento.service.InscricaoService;

@RestController
@RequestMapping("/inscricoes")
public class InscricaoController {

    private final InscricaoService inscricaoService;

    public InscricaoController(InscricaoService inscricaoService) {
        this.inscricaoService = inscricaoService;
    }

    @PutMapping("atualizar/{id}")
    public ResponseEntity<String> atualizarInscricao(@PathVariable Long id, @RequestBody Inscricao inscricao) {
        inscricaoService.atualizarInscricao(id, inscricao);
        return ResponseEntity.ok("Inscrição atualizada com sucesso!");
    }
}