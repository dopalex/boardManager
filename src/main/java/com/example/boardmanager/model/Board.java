package com.example.boardmanager.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "boards")
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String path;
    @OneToMany
    private List<Column> listOfColumns;

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

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public List<Column> getListOfColumns() {
        return listOfColumns;
    }

    public void setListOfColumns(List<Column> listOfColumns) {
        this.listOfColumns = listOfColumns;
    }

    @Override
    public String toString() {
        return "Board{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", path='" + path + '\'' +
                ", listOfColumns=" + listOfColumns +
                '}';
    }
}
