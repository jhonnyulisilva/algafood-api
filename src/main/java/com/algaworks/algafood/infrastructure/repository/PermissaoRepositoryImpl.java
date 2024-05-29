package com.algaworks.algafood.infrastructure.repository;

import com.algaworks.algafood.domain.model.Permissao;
import com.algaworks.algafood.domain.repository.PermissaoRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class PermissaoRepositoryImpl implements PermissaoRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Permissao buscar(Long id) {
        return entityManager.find(Permissao.class, id);
    }

    @Override
    public List<Permissao> listar() {
        return entityManager.createQuery("from Permissao", Permissao.class)
                .getResultList();
    }

    @Transactional
    @Override
    public void salvar(Permissao permissao) {
        entityManager.merge(permissao);
    }

    @Transactional
    @Override
    public void deletar(Permissao permissao) {
        permissao = buscar(permissao.getId());
        entityManager.remove(permissao);
    }
}
