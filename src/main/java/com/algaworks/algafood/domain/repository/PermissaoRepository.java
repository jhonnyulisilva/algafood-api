package com.algaworks.algafood.domain.repository;

import com.algaworks.algafood.domain.model.Permissao;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PermissaoRepository {

    List<Permissao> listar();

    Permissao buscar(Long id);

    void salvar(Permissao estado);

    void deletar(Permissao estado);

}