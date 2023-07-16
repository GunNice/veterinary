package br.com.tech4me.veterinary.service;

import java.util.List;
import java.util.Optional;

import br.com.tech4me.veterinary.shared.PetDto;
import br.com.tech4me.veterinary.shared.PetListagemDto;

public interface PetService {
   List <PetDto> obterTodos();
   Optional <PetListagemDto> obterPorId(String id);
    PetListagemDto cadastrar (PetListagemDto dto);
    PetListagemDto atualizarPorId (String id, PetListagemDto dto);
    void excluir(String id);
   

   }
    