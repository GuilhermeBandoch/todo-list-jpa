package br.com.todolist.mb;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.todolist.model.ProdutoModel;
import br.com.todolist.repositories.ProdutoRepository;

@Named
@ViewScoped
public class ProdutoBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private ProdutoRepository repository;

	private ProdutoModel novoProduto;

	public ProdutoBean() {
		novoProduto = new ProdutoModel();
	}

	public void salvarRegistro() {
		repository.salvar(novoProduto);
	}

	public ProdutoModel getNovoTeste() {
		return novoProduto;
	}

}

