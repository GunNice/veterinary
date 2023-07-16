package br.com.tech4me.veterinary.shared;

import java.util.List;

public record PetDto(String id,String raca,String nome,Enum Vacinado, List<String> procedimentos) {

}
