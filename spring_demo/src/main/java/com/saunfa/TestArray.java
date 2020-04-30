package com.saunfa;

import java.util.*;

public class TestArray {
    //给定若干个区间，对重叠的区间进行合并。如[1,3],[2,6],[8,10],[15,18]，合并后的区间为[1,6],[8,10],[15,18]
    static class Interval {
        int start;
        int end;

        Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public static List<Interval> mergeList(List<Interval> list) {
        Collections.sort(list, (Interval a, Interval b) -> (a.start - b.start));
        int i = 1;
        while (i < list.size()) {
            if (list.get(i).start <= list.get(i - 1).end) {
                list.get(i - 1).end = Math.max(list.get(i).end, list.get(i - 1).end);
                list.remove(i);
            } else {
                i++;
            }
        }
        return list;
    }


    public static List<Interval> mergeList1(List<Interval> intervals) {
        // sort start&end
        int n = intervals.size();
        int[] starts = new int[n];
        int[] ends = new int[n];
        for (int i = 0; i < n; i++) {
            starts[i] = intervals.get(i).start;
            ends[i] = intervals.get(i).end;
        }
        Arrays.sort(starts);
        Arrays.sort(ends);
        // loop through
        List<Interval> res = new ArrayList<Interval>();

        for (int i = 1; i < n; i++) {
            if (starts[i] <= ends[i - 1]) {
                res.add(new Interval(starts[i - 1], ends[i]));
            } else {
                res.add(new Interval(starts[i], ends[i]));
            }
        }
        return res;
    }


    public static void add(int m) {
        int a = 1;
        int b = 1;
        int total = 1;
        if (m <= 2) {
            System.out.println(1);
        }
        for (int i = 2; i < m; i++) {
            total = a + b;
            a = b;
            b = total;
        }
        System.out.println(total);
    }

    public static int add1(int m) {
        if (m <= 2) {
            return 1;
        }
        return add1(m - 1) + add1(m - 2);
    }

    public static void two_sum() {
        int a[] = {2, 7, 11, 15};
        int target = 9;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            int tmp = target - a[i];
            if (map.containsKey(tmp)) {
                System.out.println(Arrays.toString(new int[]{map.get(tmp), i}));
            } else {
                map.put(a[i], i);
            }
        }
    }


    public static void hannuota(int n, char from, char mid, char to) {
        if (n == 1) {
            System.out.println("第一个盘子从" + from + "移动到" + to);
        } else {
            //无论多少个都当成2个，上面所有的和最下面的一个
            hannuota(n - 1, from, to, mid);//先移动到中间
            System.out.println("第" + n + "个盘子从" + from + "移动到" + to);
            hannuota(n - 1, mid, from, to);//从中间到目标
        }
    }


    public static void main(String[] args) {
//        List<Interval> list = new ArrayList<>();
//        list.add(new Interval(1, 3));
//        list.add(new Interval(2, 6));
//        list.add(new Interval(8, 10));
//        list.add(new Interval(15, 18));
//        List<Interval> list1 = mergeList1(list);
//        System.out.println(list1.get(0).end);
//        two_sum();
        hannuota(2, 'A', 'B', 'C');
    }
}
