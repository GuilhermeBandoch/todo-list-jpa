package br.com.todolist.repositories;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;


import br.com.todolist.model.ListaTarefa;

public class ListaTarefaRepository implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private EntityManager entityManager;

	public List<ListaTarefa> listarTudo() {
		return entityManager.createQuery("from lista_tarefa", ListaTarefa.class).getResultList();
	}

}
