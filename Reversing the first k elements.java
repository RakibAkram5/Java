import java.util.*;
class GFG {
    static Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        if (q.size() < k || k <= 0) {
            System.out.println("Invalid k or queue size is smaller than k");
            return q;
        }
        solve(q, k);
        int s = q.size() - k;
        while (s-- > 0) {
            int x = q.poll();
            q.add(x);
        }
        return q;
    }

    static void solve(Queue<Integer> q, int k) {
        if (k == 0) {
            return;
        }
        int e = q.poll();
        solve(q, k - 1);
        q.add(e);
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);
        queue.add(70);
        queue.add(80);
        queue.add(90);
        queue.add(100);

        int k = 5;
        queue = reverseFirstK(queue, k);

        // Print the entire queue without modifying it
        for (int num : queue) {
            System.out.print(num + " ");
        }
    }
}
