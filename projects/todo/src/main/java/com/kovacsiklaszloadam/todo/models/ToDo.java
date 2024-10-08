package com.kovacsiklaszloadam.todo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "to_do")
@Getter
@Setter
@NoArgsConstructor
public class ToDo {
    
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    @Enumerated(EnumType.ORDINAL)
    private ToDoStatus status = ToDoStatus.PENDING;

    public ToDo(String title) {
        this.title = title;
    }
}
