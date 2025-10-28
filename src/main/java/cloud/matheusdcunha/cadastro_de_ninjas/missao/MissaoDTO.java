package cloud.matheusdcunha.cadastro_de_ninjas.missao;

import cloud.matheusdcunha.cadastro_de_ninjas.ninja.NinjaModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MissaoDTO {

    private Long id;
    private String nome;
    private String dificuldade;

    private List<NinjaModel> ninjas;
}
