package simuladorEmail.simuladorEmail.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmailDTO {
    
    private String nome;
    
    private String titulo;
    
    private String assunto;
    
    private String corpo;

    private String emailRemetente;


}
