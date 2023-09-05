package br.csi.avaliadordeprojetos.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {

    private String complemento;
    @NotBlank
    private String bairro;
    private String cep;
    @NotBlank
    private String numero;
    @NotBlank
    private String cidade;
    @NotBlank
    @Size(max = 2)
    private String uf;

}
