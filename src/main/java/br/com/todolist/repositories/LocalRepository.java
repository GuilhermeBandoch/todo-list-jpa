package br.com.todolist.repositories;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.todolist.model.Local;

public class LocalRepository implements Serializable {

	private static final long serialVersionUID = 1L;

	
	@Inject
	private EntityManager entityManager;

	public List<Local> listarTudo() {
		return entityManager.createQuery("from Local", Local.class).getResultList();
	}

}

