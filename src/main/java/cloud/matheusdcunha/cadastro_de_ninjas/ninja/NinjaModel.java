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
    private int idade;
    private String rank;

    @Column(unique = true)
    private String email;

    @ManyToOne
    @JoinColumn(name = "missao_id")
    private MissaoModel missao;
}
