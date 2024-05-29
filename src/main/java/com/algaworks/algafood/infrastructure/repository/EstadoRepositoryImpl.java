package com.algaworks.algafood.infrastructure.repository;

import com.algaworks.algafood.domain.model.Estado;
import com.algaworks.algafood.domain.repository.EstadoRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class EstadoRepositoryImpl implements EstadoRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Estado buscar(Long id) {
        return entityManager.find(Estado.class, id);
    }

    @Override
    public List<Estado> listar() {
        return entityManager.createQuery("from Estado", Estado.class)
                .getResultList();
    }

    @Transactional
    @Override
    public void salvar(Estado estado) {
        entityManager.merge(estado);
    }

    @Transactional
    @Override
    public void deletar(Estado estado) {
        estado = buscar(estado.getId());
        entityManager.remove(estado);
    }
}
