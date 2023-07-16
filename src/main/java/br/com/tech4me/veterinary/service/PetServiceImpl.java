package br.com.tech4me.veterinary.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tech4me.veterinary.model.Pet;
import br.com.tech4me.veterinary.repository.PetRepository;
import br.com.tech4me.veterinary.shared.PetDto;
import br.com.tech4me.veterinary.shared.PetListagemDto;
@Service
public class PetServiceImpl implements PetService {
  @Autowired
    private PetRepository repositorio;
   
    @Override
    public List<PetDto> obterTodos() {
       return repositorio.findAll()
       .stream()
       .map(p -> new PetDto(p.getId(),p.getRaca(),p.getNome(),p.getVacinado(),p.getProcedimentos()))
       .toList();
    }
    @Override
    public Optional<PetListagemDto> obterPorId(String id) {
       Optional<Pet> pets=repositorio.findById(id);
       if(pets.isPresent()){
        return Optional.of(new PetListagemDto(pets.get().getId(), pets.get().getNome() ,pets.get().getProcedimentos(), pets.get().getAnoNascimento(), pets.get().getRaca(),pets.get().getVacinado()));
       }else{
        return Optional.empty();
       }
    }

    @Override
    public PetListagemDto cadastrar (PetListagemDto dto) {
        Pet pets= new Pet(dto);
         repositorio.save(pets);
         return new PetListagemDto (pets.getId(),
         pets.getNome(),
         pets.getProcedimentos(),
         pets.getAnoNascimento(), 
         pets.getRaca(),
         pets.getVacinado()
         );
    }

    @Override
    public PetListagemDto atualizarPorId (String id, PetListagemDto dto) {
        Pet pets = repositorio.findById(id).orElse(null);
        if(pets!=null){
            Pet novopet=new Pet(dto);
            novopet.setId(id);
            repositorio.save(novopet);
            return new PetListagemDto(novopet.getId(),
            novopet.getNome(),
            novopet.getProcedimentos(),
            novopet.getAnoNascimento(),
            novopet.getRaca(),
            novopet.getVacinado());
    }
        return dto;
}


    @Override
    public void excluir(String id) {
        repositorio.deleteById(id);
    }

    
    }

