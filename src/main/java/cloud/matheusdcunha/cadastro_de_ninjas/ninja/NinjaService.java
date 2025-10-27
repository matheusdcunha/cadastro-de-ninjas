package cloud.matheusdcunha.cadastro_de_ninjas.ninja;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NinjaService {

    private final NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    public List<NinjaModel> listarNinjas(){
        return this.ninjaRepository.findAll();
    }

    public NinjaModel buscarNinjaPorId(Long id){
        return this.ninjaRepository.findById(id).orElse(null);
    }

    public NinjaModel criarNinja(NinjaModel ninja){
        return this.ninjaRepository.save(ninja);
    }

    public void deletarNinja(Long id){
        this.ninjaRepository.deleteById(id);
    }

    public NinjaModel atualizarNinja(Long id, NinjaModel ninja){
        if(this.ninjaRepository.existsById(id)){
            ninja.setId(id);
            return this.ninjaRepository.save(ninja);
        }

        return null;
    }

}
