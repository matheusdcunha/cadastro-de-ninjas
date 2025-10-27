package cloud.matheusdcunha.cadastro_de_ninjas.ninja;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ninja")
public class NinjaController {

    @PostMapping()
    public String criarNinja(){
        return "Ninja criado";
    }

    @PutMapping("/id")
    public String atualizarNinja(){
        return "Ninja atualizado";
    }

    @GetMapping()
    public String listarNinjas(){
        return "Ninjas listado";
    }

    @GetMapping("/id")
    public String procurarNinja(){
        return "Ninja achado";
    }

    @DeleteMapping("/id")
    public String deletarNinja(){
        return "Ninja deletado";
    }


}
