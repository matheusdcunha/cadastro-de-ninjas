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
    public NinjaModel criarNinja(@RequestBody NinjaModel ninja){
        return ninjaService.criarNinja(ninja);
    }

    @PutMapping("/id")
    public String atualizarNinja(@Request){
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

    @DeleteMapping("/{id}")
    public void deletarNinja(@PathVariable Long id){
        this.ninjaService.deletarNinja(id);
    }


}
