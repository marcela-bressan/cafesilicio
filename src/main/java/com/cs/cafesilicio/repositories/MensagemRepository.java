package com.cs.cafesilicio.repositories;

import org.springframework.data.repository.CrudRepository;

import com.cs.cafesilicio.models.Mensagem;

public interface MensagemRepository extends CrudRepository <Mensagem, String> {
		Mensagem findById(long id);

}
