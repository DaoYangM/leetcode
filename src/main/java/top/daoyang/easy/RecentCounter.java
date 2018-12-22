package top.daoyang.easy;

import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {
    
    Queue<Integer> q=null;
    public RecentCounter() {
        q = new LinkedList<Integer>();
    }
    
    public int ping(int t) {
        q.offer(t);
        while(q.peek()<t-3000)
            q.poll();
        return q.size();
    }

    public static void main(String[] args) {
        RecentCounter recentCounter = new RecentCounter();
        System.out.println(recentCounter.ping(3001));
    }
}