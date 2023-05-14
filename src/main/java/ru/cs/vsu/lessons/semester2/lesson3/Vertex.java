package ru.cs.vsu.lessons.semester2.lesson3;

import java.util.Objects;

public class Vertex {

    public String label;

    public Vertex(String lab) {
        label = lab;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (getClass() != o.getClass()) {
            return false;
        }
        Vertex vertex = (Vertex) o;
        return label == vertex.label;
    }

    @Override
    public int hashCode() {
        return Objects.hash(label);
    }
}
