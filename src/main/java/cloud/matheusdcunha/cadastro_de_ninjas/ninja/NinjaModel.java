package cloud.matheusdcunha.cadastro_de_ninjas.ninja;

import cloud.matheusdcunha.cadastro_de_ninjas.missao.MissaoModel;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "ninjas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;

    @ManyToOne
    private MissaoModel missao;
}
