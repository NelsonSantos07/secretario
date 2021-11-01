package com.nelsonsilva.secretario.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/publicadores")
public class PublicadorResource {

	@RequestMapping(method=RequestMethod.GET)
	public String listar() {
		return "Aplicação funcionando";
	}

}
