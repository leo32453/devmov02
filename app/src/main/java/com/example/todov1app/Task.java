package com.example.todov1app;

import java.io.Serializable;

public class Task implements Serializable {
    String name, description;
    Integer prio;

    public Task(String name, String description, Integer prio) {
        this.name = name;
        this.description = description;
        this.prio = prio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrio() {
        return prio;
    }

    public void setPrio(Integer prio) {
        this.prio = prio;
    }

    @Override
    public String toString() {
        return getName();
    }
}
