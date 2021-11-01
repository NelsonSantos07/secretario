package com.nelsonsilva.secretario;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nelsonsilva.secretario.domain.Publicador;
import com.nelsonsilva.secretario.repositories.PublicadorRepository;

@SpringBootApplication
public class SecretarioApplication implements CommandLineRunner {

	@Autowired
	private PublicadorRepository repo;
	
	public static void main(String[] args) {
		SpringApplication.run(SecretarioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Publicador plub1 = new Publicador(null, "Nelson");
		Publicador plub2 = new Publicador(null, "Laís");
		Publicador plub3 = new Publicador(null, "Ana");
		
		repo.saveAll(Arrays.asList(plub1,plub2,plub3));
		
	}

}
