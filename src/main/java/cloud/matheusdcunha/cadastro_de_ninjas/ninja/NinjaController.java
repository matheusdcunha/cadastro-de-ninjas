package cloud.matheusdcunha.cadastro_de_ninjas.ninja;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<NinjaDTO> criarNinja(@RequestBody NinjaDTO ninja){
        ninja = ninjaService.criarNinja(ninja);
        return ResponseEntity.status(HttpStatus.CREATED).body(ninja);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<?> atualizarNinja(@PathVariable Long id, @RequestBody NinjaDTO ninja){

        NinjaDTO ninjaAtualizado = this.ninjaService.atualizarNinja(id, ninja);

        if(ninja == null){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok().body(ninjaAtualizado);

   }

    @GetMapping()
    public ResponseEntity<List<NinjaDTO>> listarNinjas(){
        List<NinjaDTO> ninjas = this.ninjaService.listarNinjas();

        return ResponseEntity.ok(ninjas);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarNinjaPorId( @PathVariable Long id){

        NinjaDTO ninja = this.ninjaService.buscarNinjaPorId(id);

        if(ninja == null){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok().body(ninja);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarNinja(@PathVariable Long id){

        if(this.ninjaService.buscarNinjaPorId(id) !=null){
            this.ninjaService.deletarNinja(id);
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.notFound().build();

    }


}
