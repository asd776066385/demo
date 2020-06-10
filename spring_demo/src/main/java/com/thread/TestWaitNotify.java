package com.thread;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestWaitNotify {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1, 3, 5, 10, 19, 45);
        List<Integer> listb = Arrays.asList(2, 3, 5, 5, 5, 19);
        List<Integer> listA = lista.stream().distinct().sorted().collect(Collectors.toList());
        List<Integer> listB = listb.stream().distinct().sorted().collect(Collectors.toList());
        for (int i = 0; i < listA.size(); i++) {
            for (int j = 0; j < listB.size(); j++) {
                if (listA.get(i) == listB.get(j)) {
                    System.out.println(listA.get(i));
                    break;
                }
            }
        }


    }

}
