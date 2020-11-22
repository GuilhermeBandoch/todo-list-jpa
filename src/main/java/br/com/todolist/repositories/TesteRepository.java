package br.com.todolist.repositories;

import java.io.Serializable;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.todolist.model.Teste;
import br.com.todolist.util.Transacional;

public class TesteRepository implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private EntityManager entityManager;

	@Transacional
	public void salvar(Teste teste) {
		entityManager.merge(teste);
	}

}

