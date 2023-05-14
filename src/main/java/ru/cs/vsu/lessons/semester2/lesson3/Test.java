package ru.cs.vsu.lessons.semester2.lesson3;

public class Test {

    public static void main(String[] args) {
        // неориентированный граф
        Graph theGraph = new Graph();
        theGraph.addVertex("A");
        theGraph.addVertex("B");
        theGraph.addVertex("C");
        theGraph.addVertex("D");
        theGraph.addVertex("E");
        theGraph.addEdge(0, 1); // AB
        theGraph.addEdge(1, 2); // BC
        theGraph.addEdge(0, 3); // AD
        theGraph.addEdge(3, 4); // DE
        System.out.print("Visits: ");
        theGraph.dfs(); // Обход в глубину
        System.out.println();
    }


}
