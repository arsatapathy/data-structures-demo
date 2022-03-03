package com.arsatapathy.graph;

import java.util.*;

public class MyGraph {

    public static void main(String... args) {

        Map<Integer, List<Integer>> graph1 = Map.of(
                1, List.of(2, 3),
                2, List.of(4),
                3, List.of(5),
                4, List.of(6),
                5, new LinkedList<>(),
                6, new LinkedList<>()
        );

        DFS(graph1, 1, new HashSet<>());

        Map<Integer, List<Integer>> graph2 = Map.of(
                0, List.of(8, 1, 5),
                1, List.of(0),
                5, List.of(0,8),
                8, List.of(0,5),
                2, List.of(3,4),
                3, List.of(2,4),
                4, List.of(3,2),
                10, new LinkedList<>()
        );
        System.out.println();
        System.out.println("Connected component " + connectedComponentsCount(graph2));
        System.out.println(hasPath(graph2, 0, 5, new HashSet<>()));
        System.out.println(hasPath(graph2, 0, 4, new HashSet<>()));
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

    public static int connectedComponentsCount(Map<Integer, List<Integer>> graph) {
        int count = 0;

        Set<Integer> visited = new HashSet<>();

        for (int key :graph.keySet()) {
            if (isConnected(graph, key, visited)){
                count += 1;
            }
        }

        return count;
    }

    public static boolean isConnected(Map<Integer, List<Integer>> graph, int start, Set<Integer> visisted) {
        if (visisted.contains(start)) {
            return false;
        } else {
            visisted.add(start);
        }

        for(int neighbour :graph.get(start)) {
            isConnected(graph, neighbour, visisted);
        }

        return true;
    }

    public static boolean hasPath(Map<Integer, List<Integer>> graph, int start, int target, Set<Integer> visisted) {
        Stack<Integer> stack = new Stack<>();

        stack.push(start);

        while(!stack.isEmpty()) {
            int current = stack.pop();

            if (current == target)
                return true;

            visisted.add(current);

            for(int neighbour:graph.get(current)) {
                if (!visisted.contains(neighbour)) {
                    stack.push(neighbour);
                }
            }

        }

        return false;

    }


}

