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
        System.out.println();
        BFS(graph1, 1);

        Map<Integer, List<Integer>> graph2 = Map.of(
                0, List.of(8, 1, 5),
                1, List.of(0),
                5, List.of(0, 8),
                8, List.of(0, 5),
                2, List.of(3, 4),
                3, List.of(2, 4),
                4, List.of(3, 2),
                10, new LinkedList<>()
        );
        System.out.println();
        System.out.println("Connected component " + connectedComponentsCount(graph2));
        System.out.println(hasPath(graph2, 0, 5, new HashSet<>()));
        System.out.println(hasPath(graph2, 0, 4, new HashSet<>()));

        System.out.println();

        List<List<Integer>> edges = List.of(
                List.of(2, 3),
                List.of(3, 4),
                List.of(5, 4),
                List.of(5, 1),
                List.of(2, 1)
        );

        Map<Integer, List<Integer>> graph3 = graph(edges);
        System.out.println("Edges= " + edges);
        System.out.println("Graph= " + graph3);

        System.out.println();
        System.out.println("Shortest Path 1-2 is :" + shortestPath(graph3, 1, 2));
        System.out.println("Shortest Path 1-3 is :" + shortestPath(graph3, 1, 3));
        System.out.println("Shortest Path 1-4 is :" + shortestPath(graph3, 1, 4));
        System.out.println("Shortest Path 1-5 is :" + shortestPath(graph3, 1, 5));
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

        for (int key : graph.keySet()) {
            if (isConnected(graph, key, visited)) {
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

        for (int neighbour : graph.get(start)) {
            isConnected(graph, neighbour, visisted);
        }

        return true;
    }

    public static boolean hasPath(Map<Integer, List<Integer>> graph, int start, int target, Set<Integer> visisted) {
        Stack<Integer> stack = new Stack<>();

        stack.push(start);

        while (!stack.isEmpty()) {
            int current = stack.pop();

            if (current == target)
                return true;

            visisted.add(current);

            for (int neighbour : graph.get(current)) {
                if (!visisted.contains(neighbour)) {
                    stack.push(neighbour);
                }
            }

        }

        return false;

    }


    public static int shortestPath(Map<Integer, List<Integer>> graph, int start, int destination) {
        class Node {
            int vertex;
            int distance;

            Node(int vertex, int distance) {
                this.vertex = vertex;
                this.distance = distance;
            }
        }

        int distance = 0;


        Set<Integer> visited = new HashSet<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(start, distance));

        while (!queue.isEmpty()) {
            Node current = queue.remove();

            if (!visited.contains(current.vertex)) {
                visited.add(current.vertex);
            } else {
                continue;
            }

            if (current.vertex == destination) {
                return current.distance;
            }

            for (int neighbour : graph.get(current.vertex))
                queue.add(new Node(neighbour, current.distance + 1));
        }

        return distance;
    }

	/*
		{
            {'w', 'x'},
            {'x', 'y'},
            {'z', 'y'},
            {'z', 'v'},
            {'w', 'v'}
		}

	*/

    public static Map<Integer, List<Integer>> graph(List<List<Integer>> edges) {
        Map<Integer, List<Integer>> graph = new HashMap<>();

        for (List<Integer> edge : edges) {
            int vertex_0 = edge.get(0);
            int vertex_1 = edge.get(1);
            if (!graph.containsKey(vertex_0)) {
                graph.put(vertex_0, new LinkedList<>());
            }

            if (!graph.containsKey(vertex_1)) {
                graph.put(vertex_1, new LinkedList<>());
            }

            List<Integer> neighbours_of_vertex_0 = graph.get(vertex_0);
            neighbours_of_vertex_0.add(vertex_1);
            graph.put(vertex_0, neighbours_of_vertex_0);

            List<Integer> neighbours_of_vertex_1 = graph.get(vertex_1);
            neighbours_of_vertex_1.add(vertex_0);
            graph.put(vertex_1, neighbours_of_vertex_1);
        }

        return graph;
    }

}

