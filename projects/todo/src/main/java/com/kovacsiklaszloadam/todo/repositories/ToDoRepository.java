package com.kovacsiklaszloadam.todo.repositories;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.kovacsiklaszloadam.todo.models.ToDo;
import com.kovacsiklaszloadam.todo.models.ToDoStatus;

public interface ToDoRepository extends CrudRepository<ToDo, Long>{
    
    @Modifying
    @Transactional
    @Query("UPDATE ToDo t SET t.status = :status WHERE t.id = :id")
    void updateTodoStatus(@Param("id") Long Id, @Param("status") ToDoStatus status);
}
