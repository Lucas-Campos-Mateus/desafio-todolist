package br.com.testebackendjunior.desafiotodolist.service;

import br.com.testebackendjunior.desafiotodolist.model.Todo;
import br.com.testebackendjunior.desafiotodolist.repository.TodoRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class TodoService { // 3 - Crio a classe de serviços para as regras de negócio

    private TodoRepository todoRepository;

    public List<Todo> create(Todo todo){
    todoRepository.save(todo);
    return list();
    }
    public List<Todo> list(){
        Sort sort = Sort.by("prioridade").descending().and(Sort.by("nome").ascending()); // Para ordenar a lista
       return todoRepository.findAll(sort);
    }
    public List<Todo> update(Todo todo){
        todoRepository.save(todo);
        return list();
    }
    public List<Todo> delete(Long id){
        todoRepository.deleteById(id);
        return list();
    }
}
