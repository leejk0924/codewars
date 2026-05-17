package algorithm;

import java.util.*;

public class DfsExample {
    static List<List<Integer>> graph = new ArrayList<>();
    static boolean[] visited;

    public static void main(String[] args) {
        int v = 5;
        visited = new boolean[v];

        for (int i = 0; i < v; i++) {
            graph.add(new ArrayList<>());
        }

        addEdge(0, 1);
        addEdge(0, 2);
        addEdge(1, 3);
        addEdge(1, 4);

        // 재귀를 이용한 dfs
        System.out.println("== 재귀를 이용한 DFS ==");
        dfsRecursion(0);

        Arrays.fill(visited, false);
        System.out.println("== 스택을 이용한 DFS ==");
        dfsStack(0);
    }

    private static void dfsRecursion(int node) {
        visited[node] = true;
        System.out.println(node + " ");
        for (int next : graph.get(node)) {
            if (!visited[next]) {
                dfsRecursion(next);
            }
        }
    }

    private static void dfsStack(int start) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(start);

        while (!stack.isEmpty()) {
            int curr = stack.pop();

            if (!visited[curr]) {
                visited[curr] = true;
                System.out.println(curr + " ");

                List<Integer> neighbors = graph.get(curr);
                for (int i = neighbors.size() - 1; i >= 0; i--) {
                    int next = neighbors.get(i);
                    if (!visited[next]) {
                        stack.push(next);
                    }
                }
            }
        }
    }

    static void addEdge(int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u);
    }
}
