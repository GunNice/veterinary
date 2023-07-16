package br.com.tech4me.veterinary.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import br.com.tech4me.veterinary.shared.PetListagemDto;

@Document ("Dogs")
public class Pet {
    @Id
    private String id;
    private String nome;
     private List <String> procedimentos;
    private String raca;
    private int anoNascimento;
    private Vacinado vacinado;
    
   

    public Pet() {}

    /**
     * @param Dto
     */
    public Pet(PetListagemDto Dto){
        this.id =Dto.id();
        this.nome=Dto.nome();
        this.procedimentos=Dto.procedimentos();
        this.anoNascimento=Dto.anoNascimento();
        this.raca=Dto.raca();
        this.vacinado=Dto.vacinado();
    }
    public Vacinado getVacinado() {
        return vacinado;
    }

    public void setVacinado(Vacinado vacinado) {
        this.vacinado = vacinado;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
    public int getAnoNascimento() {
        return anoNascimento;
    }
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    
    public List<String> getProcedimentos() {
        return procedimentos;
    }
    public void setProcedimentos(List<String> procedimentos) {
        this.procedimentos = procedimentos;
    }


    
}
