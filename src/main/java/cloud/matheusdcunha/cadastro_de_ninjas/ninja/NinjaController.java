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
    public NinjaDTO criarNinja(@RequestBody NinjaDTO ninja){
        return ninjaService.criarNinja(ninja);
    }

    @PatchMapping("/{id}")
    public NinjaDTO atualizarNinja(@PathVariable Long id, @RequestBody NinjaDTO ninja){

        return this.ninjaService.atualizarNinja(id, ninja);    }

    @GetMapping()
    public List<NinjaDTO> listarNinjas(){
        return this.ninjaService.listarNinjas();
    }

    @GetMapping("/{id}")
    public NinjaDTO buscarNinjaPorId( @PathVariable Long id){
        return this.ninjaService.buscarNinjaPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletarNinja(@PathVariable Long id){
        this.ninjaService.deletarNinja(id);
    }


}
