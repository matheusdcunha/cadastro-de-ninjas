package cloud.matheusdcunha.cadastro_de_ninjas.ninja;

import cloud.matheusdcunha.cadastro_de_ninjas.missao.MissaoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class NinjaService {

    private final NinjaRepository ninjaRepository;
    private final NinjaMapper ninjaMapper;

    public NinjaService(NinjaRepository ninjaRepository, NinjaMapper ninjaMapper) {
        this.ninjaRepository = ninjaRepository;
        this.ninjaMapper = ninjaMapper;
    }

    public List<NinjaDTO> listarNinjas(){
        List<NinjaModel> ninjas = ninjaRepository.findAll();

        return ninjas.stream().map(ninjaMapper::map).collect(Collectors.toList());
    }

    public NinjaDTO buscarNinjaPorId(Long id){
        Optional<NinjaModel> ninja = ninjaRepository.findById(id);

        return ninja.map(ninjaMapper::map).orElse(null);
    }

    public NinjaDTO criarNinja(NinjaDTO ninjaDTO){
        NinjaModel ninja = this.ninjaMapper.map(ninjaDTO);
        ninja = this.ninjaRepository.save(ninja);

        return this.ninjaMapper.map(ninja);
    }

    public void deletarNinja(Long id){
        this.ninjaRepository.deleteById(id);
    }

    public NinjaDTO atualizarNinja(Long id, NinjaDTO ninja){

        Optional<NinjaModel> ninjaExistente = this.ninjaRepository.findById(id);

        if(ninjaExistente.isPresent()){
            NinjaModel ninjaAtualizado = ninjaMapper.map(ninja);

            ninjaAtualizado.setId(id);
            ninjaAtualizado = this.ninjaRepository.save(ninjaAtualizado);

            return this.ninjaMapper.map(ninjaAtualizado);
        }

        return null;
    }

}
