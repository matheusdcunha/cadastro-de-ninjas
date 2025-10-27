package cloud.matheusdcunha.cadastro_de_ninjas.missao;

import cloud.matheusdcunha.cadastro_de_ninjas.ninja.NinjaModel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name="missoes")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MissaoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;

    @OneToMany(mappedBy = "missao")
    @JsonIgnore
    private List<NinjaModel> ninjas;

}
