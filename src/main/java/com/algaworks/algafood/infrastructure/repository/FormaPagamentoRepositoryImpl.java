package com.algaworks.algafood.infrastructure.repository;

import com.algaworks.algafood.domain.model.FormaPagamento;
import com.algaworks.algafood.domain.repository.FormaPagamentoRespository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class FormaPagamentoRepositoryImpl implements FormaPagamentoRespository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public FormaPagamento buscar(Long id) {
        return entityManager.find(FormaPagamento.class, id);
    }

    @Override
    public List<FormaPagamento> listar() {
        return entityManager.createQuery("from FormaPagamento", FormaPagamento.class)
                .getResultList();
    }

    @Transactional
    @Override
    public void salvar(FormaPagamento formaPagamento) {
        entityManager.merge(formaPagamento);
    }

    @Transactional
    @Override
    public void deletar(FormaPagamento formaPagamento) {
        formaPagamento = buscar(formaPagamento.getId());
        entityManager.remove(formaPagamento);
    }
}
