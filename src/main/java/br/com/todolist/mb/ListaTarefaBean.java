package br.com.todolist.mb;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.todolist.model.ListaTarefa;
import br.com.todolist.repositories.ListaTarefaRepository;

@Named
@ViewScoped
public class ListaTarefaBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
    private ListaTarefaRepository repository;

    private List<ListaTarefa> listaTarefas;

    public void Consultar() {
        listaTarefas = repository.listarTudo();
    }

    public List<ListaTarefa> getListaTarefas() {
        return listaTarefas;
    }
}
