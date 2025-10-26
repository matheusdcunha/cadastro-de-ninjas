package cloud.matheusdcunha.cadastro_de_ninjas.ninja;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boas-vindas")
    public String boasVindas(){
        return "Olá, boas vindas a essa rota";
    }

}
