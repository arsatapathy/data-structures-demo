package com.arsatapathy.graph;

import java.util.*;

public class MyGraph {

    public static void main(String... args) {

        Map<Integer, List<Integer>> graph = Map.of(
                1, List.of(2, 3),
                2, List.of(4),
                3, List.of(5),
                4, List.of(6),
                5, new LinkedList<>(),
                6, new LinkedList<>()
		);

        DFS(graph, 1, new HashSet<>());

        System.out.println();

        BFS(graph, 1);
    }


    public static void DFS(Map<Integer, List<Integer>> graph, int start, Set<Integer> visited) {

        System.out.print(start + " ");
        visited.add(start);

        for (int neighbour : graph.get(start)) {
            if (!visited.contains(neighbour)) {
                DFS(graph, neighbour, visited);
            }
        }

    }

    public static void BFS(Map<Integer, List<Integer>> graph, int start) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        queue.add(start);

        while (!queue.isEmpty()) {
            int current = queue.remove();
            System.out.print(current + " ");
            visited.add(current);
            for (int neighbour : graph.get(current)) {
                if (!visited.contains(neighbour)) {
                    queue.add(neighbour);
                }
            }
        }

    }


}

