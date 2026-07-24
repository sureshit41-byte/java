package DAY26;

public class CourseShedule {
    public int[] findOrder(int numCourses, int[][] prerequisites) {

        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < numCourses; i++)
            graph.add(new ArrayList<>());

        int[] indegree = new int[numCourses];

        for (int[] p : prerequisites) {
            graph.get(p[1]).add(p[0]);
            indegree[p[0]]++;
        }

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0)
                q.offer(i);
        }

        int[] ans = new int[numCourses];
        int index = 0;

        while (!q.isEmpty()) {

            int curr = q.poll();
            ans[index++] = curr;

            for (int next : graph.get(curr)) {
                indegree[next]--;

                if (indegree[next] == 0)
                    q.offer(next);
            }
        }

        if (index == numCourses)
            return ans;

        return new int[0];
    }
}