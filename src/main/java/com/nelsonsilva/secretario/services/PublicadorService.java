package com.nelsonsilva.secretario.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelsonsilva.secretario.domain.Publicador;
import com.nelsonsilva.secretario.exceptions.ObjectNotFoundException;
import com.nelsonsilva.secretario.repositories.PublicadorRepository;

@Service
public class PublicadorService {
	
	@Autowired
	private PublicadorRepository repo;
	
	public Publicador buscar(Integer id) {
		Optional<Publicador> obj = repo.findById(id);		
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Publicador.class.getName()));
	}

}
