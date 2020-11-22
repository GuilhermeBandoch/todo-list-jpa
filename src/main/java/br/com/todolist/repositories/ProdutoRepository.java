package br.com.todolist.repositories;

import java.io.Serializable;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.todolist.model.ProdutoModel;
import br.com.todolist.util.Transacional;

public class ProdutoRepository implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private EntityManager entityManager;

	@Transacional
	public void salvar(ProdutoModel produtomodel) {
		entityManager.merge(produtomodel);
	}

}
