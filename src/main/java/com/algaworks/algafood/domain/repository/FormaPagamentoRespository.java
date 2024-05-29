package com.algaworks.algafood.domain.repository;

import com.algaworks.algafood.domain.model.FormaPagamento;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FormaPagamentoRespository {

    List<FormaPagamento> listar();

    FormaPagamento buscar(Long id);

    void salvar(FormaPagamento estado);

    void deletar(FormaPagamento estado);
}
