package com.example.boardmanager.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "columns")
public class Column {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany
    private List<Task> listOfTasks;
    @OneToOne
    private Board board;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Task> getListOfTasks() {
        return listOfTasks;
    }

    public void setListOfTasks(List<Task> listOfTasks) {
        this.listOfTasks = listOfTasks;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    @Override
    public String toString() {
        return "Column{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", listOfTasks=" + listOfTasks +
                ", board=" + board +
                '}';
    }
}
