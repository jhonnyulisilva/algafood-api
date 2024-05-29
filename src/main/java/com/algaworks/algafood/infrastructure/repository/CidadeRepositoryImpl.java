package com.algaworks.algafood.infrastructure.repository;

import com.algaworks.algafood.domain.model.Cidade;
import com.algaworks.algafood.domain.repository.CidadeRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class CidadeRepositoryImpl implements CidadeRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Cidade buscar(Long id) {
        return entityManager.find(Cidade.class, id);
    }

    @Override
    public List<Cidade> listar() {
        return entityManager.createQuery("from Cidade", Cidade.class)
                .getResultList();
    }

    @Transactional
    @Override
    public void salvar(Cidade cidade) {
        entityManager.merge(cidade);
    }

    @Transactional
    @Override
    public void deletar(Cidade cidade) {
        cidade = buscar(cidade.getId());
        entityManager.remove(cidade);
    }
}
