package com.algaworks.algafood.infrastructure.repository;

import com.algaworks.algafood.domain.model.Cozinha;
import com.algaworks.algafood.domain.repository.CozinhaRepository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class CozinhaRespositoryImpl implements CozinhaRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Cozinha buscar(Long id) {
        return entityManager.find(Cozinha.class, id);
    }

    @Override
    public List<Cozinha> listar() {
        return entityManager.createQuery("from Cozinha", Cozinha.class)
                .getResultList();
    }


    @Transactional
    @Override
    public void salvar(Cozinha cozinha) {
        entityManager.merge(cozinha);
    }

    @Transactional
    @Override
    public void deletar(Cozinha cozinha) {
        cozinha = buscar(cozinha.getId());
        entityManager.remove(cozinha);
    }
}