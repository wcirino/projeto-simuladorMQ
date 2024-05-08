package simuladorEmail.simuladorEmail.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmailDTO {
    
    private String nome;
    
    private String titulo;
    
    private String assunto;
    
    private String corpo;

    private String emailRemetente;


}
