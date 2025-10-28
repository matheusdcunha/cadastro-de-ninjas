package cloud.matheusdcunha.cadastro_de_ninjas.missao;

import org.springframework.stereotype.Component;

@Component
public class MissaoMapper {

    public MissaoDTO map(MissaoModel missao) {
        MissaoDTO missaoDTO = new MissaoDTO();
        missaoDTO.setNome(missao.getNome());
        missaoDTO.setDificuldade(missao.getDificuldade());
        missaoDTO.setNinjas(missao.getNinjas());

        return missaoDTO;
    }


    public MissaoModel map(MissaoDTO missaoDTO) {
        MissaoModel missaoModel = new MissaoModel();
        missaoModel.setNome(missaoDTO.getNome());
        missaoModel.setDificuldade(missaoDTO.getDificuldade());
        missaoModel.setNinjas(missaoDTO.getNinjas());

        return missaoModel;
    }

}
