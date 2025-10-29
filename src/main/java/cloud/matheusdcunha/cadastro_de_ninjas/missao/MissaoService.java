package cloud.matheusdcunha.cadastro_de_ninjas.missao;

import cloud.matheusdcunha.cadastro_de_ninjas.ninja.NinjaDTO;
import cloud.matheusdcunha.cadastro_de_ninjas.ninja.NinjaModel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MissaoService {

    private MissaoRepository missaoRepository;
    private MissaoMapper missaoMapper;
    public MissaoService(MissaoRepository missaoRepository, MissaoMapper missaoMapper) {
        this.missaoRepository = missaoRepository;
        this.missaoMapper = missaoMapper;
    }

    public MissaoDTO criarMissao(MissaoDTO missaoDTO) {
        MissaoModel missao = this.missaoMapper.map(missaoDTO);
        missao = this.missaoRepository.save(missao);

        return this.missaoMapper.map(missao);
    }

    public MissaoDTO atualizarMissao(Long id,MissaoDTO missaoDTO) {

        Optional<MissaoModel> missaoExistente = this.missaoRepository.findById(missaoDTO.getId());

        if (missaoExistente.isPresent()) {
            MissaoModel missao = this.missaoMapper.map(missaoDTO);

            missao.setId(id);

            missao = this.missaoRepository.save(missao);

            return missaoMapper.map(missao);
        }
        return null;
    }

    public void deletarMissao(Long id){
        this.missaoRepository.deleteById(id);
    }

    public List<MissaoDTO> listarMissao(){
        List<MissaoModel> missao = this.missaoRepository.findAll();

        return missao.stream().map(missaoMapper::map).collect(Collectors.toList());
    }

    public MissaoDTO buscarMissaoPorId(Long id){
        Optional<MissaoModel> missao = this.missaoRepository.findById(id);

        return missao.map(missaoMapper::map).orElse(null);
    }

}
