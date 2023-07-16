package br.com.tech4me.veterinary.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.tech4me.veterinary.model.Pet;

public interface PetRepository extends MongoRepository <Pet, String>{
      
}
