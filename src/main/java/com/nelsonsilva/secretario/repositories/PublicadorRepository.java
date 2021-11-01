package com.nelsonsilva.secretario.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nelsonsilva.secretario.domain.Publicador;

@Repository
public interface PublicadorRepository extends JpaRepository<Publicador, Integer> {

}
