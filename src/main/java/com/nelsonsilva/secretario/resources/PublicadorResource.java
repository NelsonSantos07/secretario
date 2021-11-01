package com.nelsonsilva.secretario.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nelsonsilva.secretario.domain.Publicador;
import com.nelsonsilva.secretario.services.PublicadorService;

@RestController
@RequestMapping(value="/publicadores")
public class PublicadorResource {
	
	@Autowired
	private PublicadorService service;

	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> findOne(@PathVariable Integer id) {
		Publicador obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
	}

}
