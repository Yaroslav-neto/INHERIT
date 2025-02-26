package ru.netology;

import lombok.Getter;

import java.util.Objects;

@Getter

public class Task {

    protected int id;

    public Task(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return id == task.id;
    }

    public boolean matches(String query) {
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
