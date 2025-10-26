package cloud.matheusdcunha.cadastro_de_ninjas.ninja;

import cloud.matheusdcunha.cadastro_de_ninjas.missao.MissaoModel;
import jakarta.persistence.*;

@Entity
@Table(name = "ninjas")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;

    @ManyToOne
    private MissaoModel missao;

    public NinjaModel() {}

    public NinjaModel(Long id, String nome, String email, int idade) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

}
