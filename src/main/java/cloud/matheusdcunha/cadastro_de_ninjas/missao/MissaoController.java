package cloud.matheusdcunha.cadastro_de_ninjas.missao;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/missao")
public class MissaoController {

    @PostMapping()
    public String criarMissao() {
        return "Missão criada com sucesso";
    }

    @PutMapping("/id")
    public String atualizarMissao(){
        return "Missao atualizada com sucesso";
    }

    @GetMapping()
    public String listarMissoes(){
        return "Missões listadas com sucesso";
    }

    @GetMapping("/id")
    public String procurarMissao(){
        return "Missão achada com sucesso";
    }

    @DeleteMapping("/id")
    public String deletarMissao(){
        return "Missão deletada com sucesso";
    }


}
