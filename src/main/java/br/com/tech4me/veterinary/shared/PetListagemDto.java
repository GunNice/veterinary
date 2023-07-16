package br.com.tech4me.veterinary.shared;

import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import br.com.tech4me.veterinary.model.Vacinado;

public record PetListagemDto(String id,

@NotEmpty(message="Nome do Dog não pode ficar em branco!")
String nome,
@NotEmpty(message="Informe ao menos um procedimento.")
List<String> procedimentos,

@Positive(message="Informe o ano de nascimento")
@Size(min=4,max=4,message="No formato: xxxx")
int anoNascimento,
@NotEmpty(message="Informe a raça!")
String raca,
@NotNull(message="Informe no padrão: SIM  ou NAO.")
Vacinado vacinado

)

 {

   





 
   
    
}
