package br.com.todolist.mb;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.todolist.model.ListaTarefa;
import br.com.todolist.model.StatusTarefa;
import br.com.todolist.repositories.ListaTarefaRepository;

@Named
@ViewScoped
public class ListaTarefaBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
    private ListaTarefaRepository repository;

    private List<ListaTarefa> listaTarefas;
    
    private ListaTarefa novaTarefa;

    public void consultar() {
        listaTarefas = repository.listarTudo();
    }
    
    public void criarNovaTarefa() {
    	novaTarefa = new ListaTarefa();
    }
    
    public void salvarNovaTarefa() {
    	repository.salvar(novaTarefa);
    	consultar();
    }

    public List<ListaTarefa> getListaTarefas() {
        return listaTarefas;
    }

	public ListaTarefa getNovaTarefa() {
		return novaTarefa;
	}
	
	public StatusTarefa[] getStatusTarefas() {
		return StatusTarefa.values();
	}
}
