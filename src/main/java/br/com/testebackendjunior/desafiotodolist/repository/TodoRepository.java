package br.com.testebackendjunior.desafiotodolist.repository;

import br.com.testebackendjunior.desafiotodolist.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> { // 2 - depois os repositorios que se conectam com o banco de dados
}
