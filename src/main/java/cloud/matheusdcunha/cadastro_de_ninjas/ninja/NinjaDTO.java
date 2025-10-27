package cloud.matheusdcunha.cadastro_de_ninjas.ninja;


import cloud.matheusdcunha.cadastro_de_ninjas.missao.MissaoModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class NinjaDTO {

    private Long id;
    private String nome;
    private int idade;
    private String rank;
    private String email;
    private MissaoModel missao;

}

