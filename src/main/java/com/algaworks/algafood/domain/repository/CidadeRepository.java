package com.algaworks.algafood.domain.repository;

import com.algaworks.algafood.domain.model.Cidade;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CidadeRepository {

    List<Cidade> listar();

    Cidade buscar(Long id);

    void salvar(Cidade estado);

    void deletar(Cidade estado);
}
