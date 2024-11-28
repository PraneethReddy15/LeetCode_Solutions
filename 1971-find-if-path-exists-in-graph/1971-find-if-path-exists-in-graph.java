class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        // Edge case: if source and destination are the same
        if (source == destination) return true;

        // Create an adjacency list from the edge list
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adjList.get(edge[0]).add(edge[1]);
            adjList.get(edge[1]).add(edge[0]);
        }

        // Perform DFS to check for a valid path
        boolean[] visited = new boolean[n];
        return dfs(source, destination, adjList, visited);
    }

    private boolean dfs(int node, int destination, ArrayList<ArrayList<Integer>> adjList, boolean[] visited) {
        if (node == destination) return true; // Path found
        visited[node] = true;

        for (int neighbor : adjList.get(node)) {
            if (!visited[neighbor]) {
                if (dfs(neighbor, destination, adjList, visited)) {
                    return true;
                }
            }
        }
        return false;
    }
}
