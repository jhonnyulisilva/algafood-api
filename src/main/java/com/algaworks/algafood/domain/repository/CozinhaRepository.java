package com.algaworks.algafood.domain.repository;

import com.algaworks.algafood.domain.model.Cozinha;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CozinhaRepository {

    List<Cozinha> listar();
    Cozinha buscar(Long id);
    void salvar(Cozinha cozinha);
    void deletar(Cozinha cozinha);

}