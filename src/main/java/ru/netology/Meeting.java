package ru.netology;

import lombok.Getter;

@Getter
public class Meeting extends Task {
    protected String topic;
    protected String project;
    protected String start;

    public Meeting(int id, String topic, String project, String start) {
        super(id); // вызов родительского конструктора
        this.topic = topic; // тема обсуждения
        this.project = project; // название проекта
        this.start = start; // дата и время старта текстом
    }

    public boolean matches(String query) {
        if (topic.contains(query)) {
            return true;
        }
        if (project.contains(query)) {
            return true;
        }
        return start.contains(query);
    }
}
