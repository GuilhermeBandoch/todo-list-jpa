package br.com.todolist.mb;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.todolist.model.Teste;
import br.com.todolist.repositories.TesteRepository;

@Named
@ViewScoped
public class TesteBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private TesteRepository repository;

	private Teste novoTeste;

	public TesteBean() {
		novoTeste = new Teste();
	}

	public void salvarRegistro() {
		repository.salvar(novoTeste);
	}

	public Teste getNovoTeste() {
		return novoTeste;
	}

}
