package cloud.matheusdcunha.cadastro_de_ninjas.ninja;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninja")
public class NinjaController {

    private final NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @PostMapping()
    public String criarNinja(){
        return "Ninja criado";
    }

    @PutMapping("/id")
    public String atualizarNinja(){
        return "Ninja atualizado";
    }

    @GetMapping()
    public List<NinjaModel> listarNinjas(){
        return this.ninjaService.listarNinjas();
    }

    @GetMapping("/{id}")
    public NinjaModel buscarNinjaPorId( @PathVariable Long id){
        return this.ninjaService.buscarNinjaPorId(id);
    }

    @DeleteMapping("/id")
    public String deletarNinja(){
        return "Ninja deletado";
    }


}
