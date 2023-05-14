package ru.cs.vsu.lessons.semester2.lesson3;

import java.util.Stack;

public class Graph {

    private final int MAX_VERTS = 20;
    private int currentVertexCount = 0;
    private Vertex[] vertices = new Vertex[MAX_VERTS]; // Вершины
    private boolean[][] edges = new boolean[MAX_VERTS][MAX_VERTS]; // Матрица смежности

    public void addVertex(String vertex) {
        if (currentVertexCount >= MAX_VERTS) {
            throw new IllegalArgumentException("Превышено максимальное количество вершин");
        }
        vertices[currentVertexCount++] = new Vertex(vertex);
    }

    public void addEdge(int ind1, int ind2) {
        edges[ind1][ind2] = true;
        edges[ind2][ind1] = true;
    }

    // Метод возвращает непосещенную вершину, смежную по отношению к v
    public int getUnvisitedVertex(int v, boolean[] visited) {
        for (int j = 0; j < currentVertexCount; j++) {
            if (edges[v][j] && !visited[j]) {
                return j; // Возвращает первую найденную вершину
            }
        }
        return -1;
    }

    // Обход в глубину
    //1) проверяется элемент на вершине стека методом peek();
    //2) делается попытка найти непосещенного соседа этой вершины;
    //3) если поиск окажется неудачным, элемент извлекается из стека;
    //4) если вершина будет найдена, алгоритм посещает ее и заносит в стек.
    public final void dfs() {
        // Алгоритм начинает с вершины 0
        boolean[] visited = new boolean[currentVertexCount];
        visited[0] = true;
        displayVertex(0);
        Stack<Integer> theStack = new Stack<>();
        theStack.push(0);
        while (!theStack.isEmpty()) {
            // Получение непосещенной вершины, смежной к текущей
            int v = getUnvisitedVertex(theStack.peek(), visited);
            if (v == -1) {
                // Если такой вершины нет,
                theStack.pop();
            } else {
                // Если вершина найдена
                visited[v] = true;
                displayVertex(v);
                theStack.push(v);
            }
        }
    }

    public void displayVertex(int v) {
        System.out.print(vertices[v].label);
    }
}
